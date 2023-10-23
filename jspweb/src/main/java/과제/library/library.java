package 과제.library;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import 과제.library.libraryDao;
import 과제.library.libraryDto;


@WebServlet("/library")
public class library extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public library() { super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 3. DAO 
				ArrayList<libraryDto> result = libraryDao.getInstance().lread(Integer.parseInt(request.getParameter("lno") ));
					// * JS는 ArrayList타입을 사용할수 없으므로 ArrayList타입 JSON배열로 변환해서 전달하자. [ 라이브러리 : jackson ]
				ObjectMapper objectMapper = new ObjectMapper();
				String jsonArray = objectMapper.writeValueAsString( result ); // JSON타입으로 변환은 불가능하지만 JSON형식의 문자열타입 로 변환 
					System.out.println( jsonArray );
				// 4. 응답 
				// response.getWriter().print(result); // 응답은 가능하나... js가  ArrayList타입 사용이 불가능 [ 문제발생 ]
				response.setContentType("application/json;charset=UTF-8");
				response.getWriter().print( jsonArray );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      int lno = Integer.parseInt(request.getParameter("lno")); System.out.println(lno);
	      String name = request.getParameter("name"); System.out.println(name);
	      String phone = request.getParameter("phone"); System.out.println(phone);
	      
	      
	      libraryDto dto = new libraryDto(lno,name,phone);
	      
	      boolean result = libraryDao.getInstance().lwriter(dto);
	      
	      response.setContentType("text/html;charset=UTF-8");
	      response.getWriter().print(result);
	      
	   }

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 1. AJAX data 데이터 요청한다.
				int lno = Integer.parseInt(request.getParameter("lno"));
				// 2. (데이터 많으면)객체화
				// 3. Dao에게 전달후 SQL결과를 받는다.
				boolean result = libraryDao.getInstance().ldelete(lno);
				// 4. 결과를 AJAX에게 전달한다.
				 response.setContentType("application/json; charset=UTF-8");
				 response.getWriter().print(result);
	}

}
