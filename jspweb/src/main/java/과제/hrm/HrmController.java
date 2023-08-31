package 과제.hrm;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.MemberDao;
import model.dto.MemberDto;
import 과제.Accountbook.AccountbookDao;
import 과제.Accountbook.AccountbookDto;

/**
 * Servlet implementation class HrmController
 */
@WebServlet("/HrmController")
public class HrmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HrmController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
       		String uploadpath = request.getServletContext().getRealPath("과제/hrm/img");
       	
       		System.out.println( "과제 폴더 hrm 폴더 img 폴더 실제(서버) 경로 : " + uploadpath ); 
       		
       			MultipartRequest multi = new MultipartRequest(
       					request , 		// 1. HttpServletRequest 요청방식 
       					uploadpath , 	// 2. 첨부파일을 저장할 폴더 경로 
       					1024*1024*10,	// 3. 첨부파일 용량 허용 범위 [ 바이트단위 ] 10MB
       					"UTF-8" , 		// 4. 한글인코딩타입 
       					new DefaultFileRenamePolicy()	// 5. [파일명중복제거] 만약에 서버내 첨부파일의 동일한 이름이 있을때 이름뒤에 숫자를 자동으로 붙이기 
       					);
       			
       		// ----------------------------------------------- DB처리 : 업로드된 파일명  --------------------------------------------- //	
       			// 2. form 안에 있는 각 데이터 호출 
       		String himg =  multi.getFilesystemName("himg");		System.out.println("himg : "  + himg);
       		String hname =  multi.getParameter("hname");			System.out.println("hname : "  + hname);
       		String hphone =  multi.getParameter("hphone");		System.out.println("hphone : "  + hphone);
       		String hrank =  multi.getParameter("hrank");	System.out.println("hrank : "  + hrank);
       		String hdate =  multi.getParameter("hdate");	System.out.println("hdate : "  + hdate);
       		
       		
       		
       		// *만약에 사진업로드 안했으면 기본프로필 사용하도록 변경 = default.webp
       		if( himg == null ) { System.out.println("사진을 넣어주세요."); }
       		
       		// 2. (선택) 객체화.
       		HrmDto hrmDto = new HrmDto(himg, hname, hphone, hrank , hdate );
       		// 2. (선택) 유효성검사.
       		
       		// 3. Dao 에게 전달하고 결과 받는다.
       		boolean result = HrmDao.getInstance().signup(hrmDto);
       		
       		// 4. AJAX 통신으로 결과 데이터를 응답을 보낸다. [ response ]
       		response.setContentType("application/json;charset=UTF-8");
       		response.getWriter().print(result);
       		
       	}
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 3. DAO 
		ArrayList<HrmDto> result = HrmDao.getInstance().hread();
			// * JS는 ArrayList타입을 사용할수 없으므로 ArrayList타입 JSON배열로 변환해서 전달하자. [ 라이브러리 : jackson ]
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray = objectMapper.writeValueAsString( result ); // JSON타입으로 변환은 불가능하지만 JSON형식의 문자열타입 로 변환 
			System.out.println( jsonArray );
		// 4. 응답 
		// response.getWriter().print(result); // 응답은 가능하나... js가  ArrayList타입 사용이 불가능 [ 문제발생 ]
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print( jsonArray );
	}


	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
