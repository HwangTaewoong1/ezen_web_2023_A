package 과제.hrm;

import java.util.ArrayList;

import 과제.Accountbook.AccountbookDto;
import 과제.hrm.HrmDto;

public class HrmDao extends Dao {
	// 0. 싱글톤
		private static HrmDao hrmDao = new HrmDao();
		private HrmDao() {}
		public static HrmDao getInstance() { return hrmDao; }
	
	
	// 1. 직원등록
		public boolean signup( HrmDto dto ) {
			try {
				String sql = "insert into hrm( himg , hname , hphone , hrank , hdate ) values( ? , ? , ? , ? ,?)";
				ps = conn.prepareStatement(sql);
				ps.setString( 1 , dto.getHimg() );
				ps.setString( 2 , dto.getHname() );
				ps.setString( 3 , dto.getHphone() );
				ps.setString( 4 , dto.getHrank() );
				ps.setString( 5 , dto.getHdate() );
				int row = ps.executeUpdate();
				if( row == 1 )return true;
			}catch (Exception e) {System.out.println(e);}
			return false;
		}
	
	// 2. 전화번호 중복검사 [ 인수 : 검사할전화번호 / 반환 : true(중복있어) , false(중복없어) 
				// - type(mid,memail) : 필드명 / data(입력받은mid,memail) : 필드에서 찾을 값 
			public boolean findPhone( String hphone ) {
				try {
					String sql = "select * from member where "+hphone+" = ?";
					ps = conn.prepareStatement(sql);
					ps.setString( 1 , hphone );
					rs = ps.executeQuery();
					// [ while : 결과 레코드 여러개 검사 vs if : 결과 레코드 한개 검사 ]
					if( rs.next() ) return true;
				}catch (Exception e) {System.out.println(e);}
				return false;
			}	
			public ArrayList<HrmDto> hread() { 
				ArrayList<HrmDto> list = new ArrayList<>(); // 여러개 dto를 담을 리스트 객체 
				try {
					String sql = "select * from hrm";
					ps = conn.prepareStatement(sql);
					rs = ps.executeQuery(); // s->q , i/d/u -> u ,
					while( rs.next() ) { // rs.next() : select 검색결과중 다음레코드 이동 =존재하면 true / 존재하지 않으면 false 
						// * 하나 레코드/하나 줄/ 하나 행/ 하나 방문록 / 하나 DTO
						// 레코드 --> DTO 변환 ( 레코드마다 각 필드 호출 = rs.get타입(필드순서번호) vs  rs.get타입("필드명") ) 
						HrmDto hrmDto = new HrmDto( rs.getInt( 1 ), rs.getString( 2 ), rs.getString( 3 ), rs.getString( 4 ), rs.getString( 5 ) , rs.getString( 6 ) );
						
						// ** 여러개 dto를 저장할 리스트에 저장 
						list.add(hrmDto);
					}
				}catch (Exception e) {System.out.println(e);}
				return list;  // 리스트 반환 
			}
}
