package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.dto.MemberDto;


public class MemberDao extends Dao {
	// 0. 싱글톤
	private static MemberDao memberDao = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() { return memberDao; }
	
	// 1. 회원가입
	public boolean signup( MemberDto dto ) {
		try {
			String sql = "insert into member( mid , mpwd , memail , mimg , mnickname ) values( ? , ? , ? , ? , ? )";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , dto.getMid() );
			ps.setString( 2 , dto.getMpwd() );
			ps.setString( 3 , dto.getMemail() );
			ps.setString( 4 , dto.getMimg() );
			ps.setString(5 , dto.getMnickname());
			int row = ps.executeUpdate();
			if( row == 1 )return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	// 2. 로그인 
	public boolean login( String mid , String mpwd ) {
		try {
			String sql ="select * from member where mid =  ? and mpwd = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , mid ); ps.setString( 2 , mpwd );
			rs = ps.executeQuery();
			if( rs.next() ) return true;
		}catch (Exception e) { System.out.println(e);}
		return false;
	}
	// 3. 아이디찾기
	public String findId(String memail , String mnickname) {
 		String foundId = null;
        try {
            String sql = "SELECT mid FROM member WHERE memail = ? and mnickname = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, memail);
            ps.setString(2, mnickname);
            rs = ps.executeQuery();

            if (rs.next()) {
                foundId = rs.getString("mid");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	System.out.println("Dao foundId : " + foundId);
        }
        return foundId;
    }
	// 4. 비밀번호찾기 임시비밀번호 업데이트 
	public boolean resetPw(String mid, String memail, String newPassword) {
	    boolean updated = false;
	    try {
	        // 데이터베이스에서 비밀번호 업데이트 로직을 구현합니다.
	        String sql = "UPDATE member SET mpwd = ? WHERE mid = ? AND memail = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setString(1, newPassword);
	        ps.setString(2, mid);
	        ps.setString(3, memail);
	        int rowsUpdated = ps.executeUpdate();

	        if (rowsUpdated > 0) {
	            updated = true;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // 리소스를 닫습니다.
	    }
	    return updated;
	}
	// 5. 내정보 호출 
	public MemberDto info( String mid ) {
		try {
			String sql ="select mno , mid , memail , mimg , mnickname , mpwd from member where mid = ?";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , mid );
			rs = ps.executeQuery();
			if( rs.next() ) {
				MemberDto memberDto = new MemberDto( 
						LocalDateTime.now().toString() , 
						// LocalDateTime.now().toString() : 현재 날짜/시간 문자열 반환 함수 
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5) , rs.getString(6));
				return memberDto;
			}
		}catch (Exception e) { System.out.println(e ); }
		return null;
	}
	
	// 6. 아이디/이메일 중복검사 [ 인수 : 검사할아이디 / 반환 : true(중복있어) , false(중복없어) 
		// - type(mid,memail) : 필드명 / data(입력받은mid,memail) : 필드에서 찾을 값 
	public boolean findIdOrEmail( String type , String data ) {
		try {
			String sql = "select * from member where "+type+" = ?";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , data );
			rs = ps.executeQuery();
			// [ while : 결과 레코드 여러개 검사 vs if : 결과 레코드 한개 검사 ]
			if( rs.next() ) return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	// 7. 회원수정
	public boolean mupdate( int mno , String mimg , String mpwd ) {
		try {
			String sql = "update member set mimg = ? , mpwd = ? where mno = ?";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , mimg ); ps.setString( 2, mpwd); ps.setInt( 3 , mno); 
			int count = ps.executeUpdate();
			if( count == 1 ) return true ;
		}catch (Exception e) {System.out.println(e);	}
		return false;
	}
	
	// 8. 회원탈퇴 [ 삭제할회원번호 , 검증할패스워드 ]
	public boolean mdelete( int mno , String mpwd ) {
		try {
			String sql ="delete from member where mno = ? and mpwd = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt( 1 , mno); ps.setString(2, mpwd);
			int count = ps.executeUpdate();
			if( count == 1 ) return true; // 삭제성공 => 회원탈퇴
		}catch (Exception e) {System.out.println(e);}
		return false; // 회원번호 또는 입력받은 패스워드 일치하지 않거나
	}
	
	

}
