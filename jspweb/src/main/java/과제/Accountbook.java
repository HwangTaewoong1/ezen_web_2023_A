package 과제;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet("/Accountbook")
public class Accountbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Accountbook() { super();}
    // 1. 저장
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//request.getParameter("객체의속성명");
    	String vcontent = request.getParameter("vcontent");	System.out.println( "vcontent : " + vcontent);
    	String vmoney = request.getParameter("vmoney");		System.out.println( "vmoney : " + vmoney);
    	String vdate = request.getParameter("vdate");		System.out.println( "vdate : " + vdate);
    	// 2. 객체화 
    	AccountbookDto accountbookDto = new AccountbookDto(vcontent, vmoney, vdate);	System.out.println("AccountbookDto : " + accountbookDto);
    	// 3. DAO 객체 전달후 결과 응답받고 
    	boolean result = AccountbookDao.getInstance().vwrite(accountbookDto);
    	// 4. 결과를 AJAX에게 응답한다. 
    	// response.getWriter().print("응답할데이터");
    	// response.setContentType("text/html;charset=UTF-8"); // (생략시 기본값) js에서 "true"
    	response.setContentType("application/json;charset=UTF-8"); //  js에서 true
    	response.getWriter().print(result);
	}
    // 2. 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 3. DAO 
		ArrayList<AccountbookDto> result = AccountbookDao.getInstance().vread();
			// * JS는 ArrayList타입을 사용할수 없으므로 ArrayList타입 JSON배열로 변환해서 전달하자. [ 라이브러리 : jackson ]
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray = objectMapper.writeValueAsString( result ); // JSON타입으로 변환은 불가능하지만 JSON형식의 문자열타입 로 변환 
			System.out.println( jsonArray );
		// 4. 응답 
		// response.getWriter().print(result); // 응답은 가능하나... js가  ArrayList타입 사용이 불가능 [ 문제발생 ]
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print( jsonArray );
	}

	// 3. 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. AJAX data 데이터 요청한다.
			// request.getParameter("속성명"); String 변환
		int vno = Integer.parseInt(request.getParameter("vno")); System.out.println( "vno : " + vno );
		String vcontent = request.getParameter("vcontent");	System.out.println( "vcontent : " + vcontent);
		String vmoney = request.getParameter("vmoney");		System.out.println( "vmoney : " + vmoney);
    	String vdate = request.getParameter("vdate");		System.out.println( "vdate : " + vdate);
		// 2. (데이터 많으면)객체화
		// 3. Dao에게 전달후 SQL결과를 받는다.
		boolean result = AccountbookDao.getInstance().vupdate(vno, vcontent, vmoney , vdate);
		// 4. 결과를 AJAX에게 전달한다.
		response.setContentType("application/json; charset=UTF-8");
		response.getWriter().print(result);
	}

	
	// 4.삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. AJAX data 데이터 요청한다.
		int vno = Integer.parseInt(request.getParameter("vno"));
		// 2. (데이터 많으면)객체화
		// 3. Dao에게 전달후 SQL결과를 받는다.
		boolean result = AccountbookDao.getInstance().vdelete(vno);
		// 4. 결과를 AJAX에게 전달한다.
		response.setContentType("application/json; charset=UTF-8");
		response.getWriter().print(result);	
	}

}
