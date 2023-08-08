package 과제.과제11.model.dao;

import 과제.과제11.model.dto.MemberDto;

public class MemberDao extends Dao {

	// 0. 싱글톤 객체
	private static MemberDao memberDao = new MemberDao();
	public static MemberDao getInstance() { return memberDao; }
	private MemberDao() {}
	
	// 1. 회원정보 Check SQL : int type=1 아이디중복체크 type=2 전화번호중복체크 // vs String 필드명 
	public boolean infoCheck( String 검색할필드명 , String 검색할값 ) {
		try {
			String sql = "select * from member where " + 검색할필드명+" = ?"; System.out.println( sql ); // 매개변수 와일드카드 = ?
			ps = conn.prepareStatement(sql);
			ps.setString( 1, 검색할값 );
			rs = ps.executeQuery();
			if( rs.next() ) { return true; }
		}catch (Exception e) { System.out.println(e);}
		return false;
	}
	
	// 2. 회원가입SQL 
	public boolean signupSQL( MemberDto dto ) {
		System.out.println("--- signupSQL 다오 도착 ");
		System.out.println( dto );
		// 1. 회원가입 필요한 SQL을 문자열에 작성해서 저장
			// 테이블에 레코드 삽입 : insert into 테이블명 ( 필드명 , 필드명 , 필드명 ) values ( 매개변수1 , 매개변수2 , 매개변수3);
		String sql = "insert into member( mid , mpw , mname , mphone ) values( ? , ? , ? , ?)";
		
		try {
		// 2. 위에서 작성한 SQL를 DB연동객체에 대입	
		// 3. 대입한 SQL 조작하기위해 반환된prepareStatement를 ps대입
		ps = conn.prepareStatement(sql); // db연동객체.prepareStatement( 조작할SQL 문자열 )
		// conn , ps 필드를 Dao 부모클래스에게 물려받음
		
		// 4. SQL에서 작성한 매개변수(?) 에 대해 값 대입 ps.set타입 
		ps.setString( 1 , dto.getMid() );
		ps.setString( 2, dto.getMpw() );
		ps.setString( 3 , dto.getMname() );
		ps.setString( 4, dto.getMphone() );
		
		// 5. SQL 실행
		ps.executeUpdate();
		// 6. 리턴 [ 회원가입 성공 = true / 회원가입 실패 = false ]
		return true;
		}catch ( Exception e) {System.out.println("경고] 회원가입 실패 사유 : " + e);}
		return false;
	}
	// 3. 로그인SQL
	public int loginSQL( String id , String pw ) {
		try {
			// 1단계 : SQL 작성한다. [ 추천 : MYSQL 워크벤치에서 임의의값으로 테스트하고 ]
			String sql = "select * from member where mid = ? and mpw = ?";
			// 2단계 : SQL 조작할 수 있는 객체 PreparedStatement 반환받기
			ps = conn.prepareStatement(sql);
			// 3단계 : SQL 조작 [ SQL 안에 있는 매개변수[?] 에 값 대입 ]
			ps.setString( 1 , id );
			ps.setString( 2 , pw );
			// 4단계 : SQL 실행해서 그 결과객체를 rs객체에 대입 [ * ps는 결과를 조작할 수 없다. ] 
			   // [ insert/update/delete : ps.executeUpdate(); / select : ps.executeQuery(); ]
			rs = ps.executeQuery();
			// 5단계 : SQL 실행 결과 조작	[ re.next() : 결과중에서 다음 레코드객체 호출 ]
				// 만약에 결과의 레코드 3개가정 [  rs = null -> 레코드1객체 -> 레코드2객체 -> 레코드3객체 ]
				// 									 	.next()	 	.next()		  .next()
			if( rs.next() ) { // 로그인SQL 결과레코드는 1개 또는 0개 이므로 if 사용해서 .next() 1번 호출
									// next() 다음레코드가 존재하면 true / false -> 기본값 null 인데 , 로그인 서치로 값을 찾았다면 넘어가짐. 
				return rs.getInt(1);	// 검색된 회원번호를 반환
			} 	
		}catch ( Exception e ) { System.out.println(e);}
		return 0; // 로그인 실패
	}
	
	//4.
	public String findById( String name , String phone) {
		
		try {// try{} 안에 예외가 발생할 것 같은 , 일반예외 : JDBC , 파일처리 함수
			// 1단계 : sql 작성.
			String sql = "select * from member where mname = ? and mphone = ?";
			// 2단계 : 작성된 sql를 조작할 PreparedStatement 객체를 연동객체로 부터 반환
			ps = conn.prepareStatement(sql);
			// 3단계 : sql 조작 [ 매개변수 대입]
			ps.setString( 1 , name ); // 1. sql문에 있는 첫번째 ? 에 name 변수 대입
			ps.setString( 2, phone ); // 2. sql문에 있는 두번째 ? 에 phone 변수 대입
			// select mid from where mname = 입력된 name  and mphone = 입력된phone 
			// 4단계 : sql 조작 [ sql 실행 ( select = executeQuery() , insert , update , delete = executeUpdate() )
			// 5단계 : sql 조작 할 ResultSet 객체를 executeQuery 메소드 부터 반환
			rs = ps.executeQuery();
			// 6단계 : sql 결과 조작 
				// rs.next() : 검색된 레코드 중 다음레코드 이동 ]
				// re.get타입( 검색필드순서번호 )
					// rs.getString(검색필드순서번호) : 현재 위치한 레코드의 필드값 문자열 호출
					// re.getInt(검색필드순서번호) 	  : 현재 위치한 레코드의 필드값 정수 호출
			if ( rs.next() ) { return rs.getString(2); } // 검색된 레코드중 2번째 필드인 id값을 반환
			
		}catch ( Exception e) {System.out.println(e);}
		
		return null; // 실패
	}
	
	// 5. 
	public String findByPw( String id , String phone ) {
		
		try {
			String sql = "select mpw from member where mid = ? and mphone = ?";
			ps = conn.prepareStatement(sql);
		
			ps.setString( 1 , id ); 
			ps.setString( 2, phone ); 
			rs = ps.executeQuery();
			
			if ( rs.next() ) { return rs.getString(1); } // 검색된 레코드중 2번째 필드인 id값을 반환
		}catch ( Exception e) {System.out.println(e);}
		
		return null; // 실패
	}
	// 6. 회원번호를 가지고 회원정보 찾기 .. 회원정보가 존재하는 레코드 찾기 
	public MemberDto info( int mno ) {
			try {
				String sql = "select * from member where mno =? "; // 1. SQL작성
				ps = conn.prepareStatement(sql); // 2. SQL조작할 객체
				ps.setInt( 1, mno ); // 3. SQL조작
				rs = ps.executeQuery(); // 4. sql 실행 // 5. sql 결과 조작 객체
				
				if( rs.next() ) { // 6. sql결과 조작 // 만약에 다음레코드가 존재하면
					//  * 현재 레코드를 DTO로 만들기 [ 필드순서 1.회원번호 2.아이디 3.비밀번호 4.이름 5.전화번호 ]
					MemberDto dto = new MemberDto( rs.getInt( 1 ) , rs.getString( 2 ) ,
							rs.getString( 3 ) , rs.getString( 4 ), 
							rs.getString( 5 ) );
					return dto;
				}
			}
			catch (Exception e) {System.out.println(e);}
			
			return null; //실패
			
		}
	// 7.
	public boolean infoUpdate ( String newPw , int mno ) {
		try {
			String sql = "update member set mpw = ? where mno = ? "; // 1.SQL작성한다.
			ps = conn.prepareStatement(sql);	// 2. 작성한 SQL 조작할 객체 반환
			ps.setString(mno, sql); // 3. SQL 조작 
			int row = ps.executeUpdate(); // 4.SQL 실행
			if( row ==1 ) return true; // 성공
		}catch (Exception e) { System.out.println( e );}	
		return false;	
	}
		
	// 8.
	public boolean infoDelete (int mno) {
try {
	String sql = "delete from member where mno = ? ";
	ps = conn.prepareStatement(sql);	// 2. 작성한 SQL 조작할 객체 반환
	ps.setInt(1, mno);
	int row = ps.executeUpdate(); // 4.SQL 실행
	if( row ==1 ) return true; // 성공
		}catch (Exception e) { System.out.println( e ); }	
		return false;
	}
	
	
	
}


















