package 과제;

import java.util.ArrayList;
import 과제.AccountbookDto;


public class AccountbookDao extends Dao {
	
	// 0. 싱글톤
	private static AccountbookDao accountbookDao = new AccountbookDao();
	private AccountbookDao() {}
	public static AccountbookDao getInstance() { return accountbookDao; }
	
	// 1. 저장 [ 인수 : 저장할내용이 담긴 DTO , 리턴 : 성공/실패(boolean)=true/false ]
	public boolean vwrite( AccountbookDto accountbookDto ) {
		// 0. try{} catch(){}
		try {
			String sql = "insert into accountbook( vcontent , vmoney , vdate ) values( ? , ? , ? )"; // 1. SQL 작성  
			ps = conn.prepareStatement(sql); // 2. SQL 연결 
			ps.setString( 1 , accountbookDto.getVcontent() );  // 3. SQL 매개변수 대입 
			ps.setString( 2 , accountbookDto.getVmoney() ); ps.setString( 3 , accountbookDto.getVdate() ); 
			ps.executeUpdate();// 4. SQL 실행 
			return true; // 5. 결과 반환
		}catch (Exception e) {System.out.println(e);}

		return false; 
	}
	
	// 2. 호출 [ 인수 : x , 리턴 : 여러개(ArrayList)의 방문록DTO = 모든 레코드 가져오기 ]
	public ArrayList<AccountbookDto> vread() { 
		ArrayList<AccountbookDto> list = new ArrayList<>(); // 여러개 dto를 담을 리스트 객체 
		try {
			String sql = "select * from accountbook order by vdate desc ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // s->q , i/d/u -> u ,
			while( rs.next() ) { // rs.next() : select 검색결과중 다음레코드 이동 =존재하면 true / 존재하지 않으면 false 
				// * 하나 레코드/하나 줄/ 하나 행/ 하나 방문록 / 하나 DTO
				// 레코드 --> DTO 변환 ( 레코드마다 각 필드 호출 = rs.get타입(필드순서번호) vs  rs.get타입("필드명") ) 
				AccountbookDto accountbookbookDto = new AccountbookDto( rs.getInt( 1 ), rs.getString( 2 ), rs.getString( 3 ), rs.getString( 4 ) );
				
				// ** 여러개 dto를 저장할 리스트에 저장 
				list.add(accountbookbookDto);
			}
		}catch (Exception e) {System.out.println(e);}
		return list;  // 리스트 반환 
	}
	// 3. 수정 [ 인수 : 수정할방문록번호(int)/수정할방문록내용(String)/비밀번호검토(String)  , 리턴 : 성공/실패(boolean)=true/false ]
	public boolean vupdate( int vno , String vcontent , String vmoney , String vdate ) { 
		try {
			String sql ="update accountbook set vcontent = ? , vmoney = ? , vdate = ? where vno = ?"; // 1. SQL 작성 
			ps = conn.prepareStatement(sql);	// 2. SQL 연결
			ps.setInt( 4, vno ); ps.setString( 1, vcontent ); ps.setString( 2 , vmoney ); ps.setString( 3, vdate );// ? 순번 
			int row = ps.executeUpdate();
			if( row == 1) return true;
			return false;
		}catch (Exception e) { System.out.println( e );}
		return false; 
		
	}
	// 4. 삭제 [ 인수 : 삭제할방문록번호(int) , 리턴 : 성공/실패(boolean)=true/false ] 
	public boolean vdelete( int vno) {
		try {
			String sql ="delete from accountbook where vno = ?"; // 1. SQL 작성 
			ps = conn.prepareStatement(sql);	// 2. SQL 연결
			ps.setInt(1, vno);	// 3. SQL 매개변수 대입
			int row = ps.executeUpdate();	// 4. SQL 실행
			if ( row ==1 ) return true; // 5. SQL 실행 결과 따른 제어
			return false; 
		}catch (Exception e) { System.out.println(e); }
		
		return false; 
		
	}
}