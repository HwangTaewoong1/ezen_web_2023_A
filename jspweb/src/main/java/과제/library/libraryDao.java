package 과제.library;

import java.util.ArrayList;



public class libraryDao extends Dao {
	
	// 0. 싱글톤
	private static libraryDao libraryDao = new libraryDao();
	private libraryDao() {}
	public static libraryDao getInstance() { return libraryDao; }
	
	public boolean lwriter(libraryDto dto) {
        try {
           
           String sql="insert into library(lno,lname,lphone) values(?,?,?)";
           ps = conn.prepareStatement(sql);
           ps.setInt(1, dto.getLno());
           ps.setString(2, dto.getLname());
           ps.setString(3, dto.getLphone());
           int rs = ps.executeUpdate();
           if(rs==1) {return true;}
           return false;
           
        }catch (Exception e) {System.out.println(e);}
        return false;
     }

	// 2. 특정 lno 값의 레코드 전체 호출
	public ArrayList<libraryDto> lread(int lno) { 
	    ArrayList<libraryDto> list = new ArrayList<>(); // 여러 개의 dto를 담을 리스트 객체 
	    try {
	        String sql = "SELECT * FROM library WHERE lno = ?";
	        ps = conn.prepareStatement(sql);
	        ps.setInt(1, lno); // ?에 값을 설정

	        rs = ps.executeQuery(); 
	        while (rs.next()) {
	            libraryDto libraryDto = new libraryDto(rs.getInt(1), rs.getString(2), rs.getString(3));
	            list.add(libraryDto);
	            System.out.println(list);
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return list;  // 리스트 반환 
	}
	
	// 3. 삭제 [ 인수 : 삭제할방문록번호(int) , 리턴 : 성공/실패(boolean)=true/false ] 
	public boolean ldelete( int lno) {
		try {
			String sql ="delete from library where lno = ?"; // 1. SQL 작성 
			ps = conn.prepareStatement(sql);	// 2. SQL 연결
			ps.setInt(1, lno);	// 3. SQL 매개변수 대입
			int row = ps.executeUpdate();	// 4. SQL 실행
			if ( row ==1 ) return true; // 5. SQL 실행 결과 따른 제어
			return false; 
		}catch (Exception e) { System.out.println(e); }
		
		return false; 
		
	}

}
