package controller.board;

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

import model.dao.BoardDao;
import model.dto.BoardDto;
import model.dto.MemberDto;


@WebServlet("/BoardInfoController")
public class BoardInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BoardInfoController() {
        super();
        
    }
    // 쓰기 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 0. 첨부파일 업로드 [ cos.jar -> MultipartRequest 클래스]
			MultipartRequest multi = new MultipartRequest(
					request , 													// 1. HttpServletRequest 요청방식 
					request.getServletContext().getRealPath("/board/upload") , 	// 2. 첨부파일을 저장할 폴더 경로 
					1024*1024*1024,												// 3. 허용 첨부파일 용량 1GB
					"UTF-8" , 													// 4. 한글인코딩타입 
					new DefaultFileRenamePolicy()	// 5. [파일명중복제거] 만약에 서버내 첨부파일의 동일한 이름이 있을때 이름뒤에 숫자를 자동으로 붙이기 
					);
		// * 업로드가 잘 되었는지 확인하기 위한 업로드 서버경로 확인
			System.out.println(request.getServletContext().getRealPath("/board/upload"));
			
		// ----------------------------------------------- DB처리 : 업로드된 파일명  --------------------------------------------- //	
			// 2. form 안에 있는 각 데이터 호출 
		// 일반input : multi.getParameter("form객체전송시input name");		
		// 첨부파일input : multi.getFilesystemName( );
		String btitle =  multi.getParameter("btitle");			System.out.println("btitle : "  + btitle);
		String bcontent =  multi.getParameter("bcontent");		System.out.println("bcontent : "  + bcontent);
		String bfile =  multi.getFilesystemName("bfile");		System.out.println("bfile : "  + bfile);
			// - 작성자(MNO) 는 입력x / mno는 세션에 저장 되어있는 상태
		int mno =( (MemberDto)request.getSession().getAttribute("loginDto")).getMno();
		int bcno = Integer.parseInt( multi.getParameter("bcno") );
		// 2. (선택) 객체화.
		BoardDto boardDto = new BoardDto(btitle, bcontent, bfile, mno, bcno); System.out.println(boardDto);
		// 2. (선택) 유효성검사.
		
		// 3. Dao 에게 전달하고 결과 받는다.
		boolean result = BoardDao.getInstance().bwrite(boardDto);
		
		// 4. AJAX 통신으로 결과 데이터를 응답을 보낸다. [ response ]
		response.setContentType("application/json; charset=UTF-8");
		response.getWriter().print(result);
		
	}
    // 전체조회 , 개별조회
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청
		String type = request.getParameter("type");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json ="";
		
		if( type.equals("1") ) { // 전체 조회 로직
			
			ArrayList<BoardDto> result = BoardDao.getInstance().getList();
			// * java 객체 --> js 객체[JSON] 형식의 문자열으로 변환
			json = objectMapper.writeValueAsString( result );
			
		
		}else if ( type.equals("2") ) { // 개별 조회 로직 
			// 1. 매개변수 요청
			int bno = Integer.parseInt(request.getParameter("bno"));
			// 2. DAO 처리
			BoardDto result = BoardDao.getInstance().getBoard( bno );
				
				// 3. 만약에 ( 로그인 혹은 비로그인 ) 요청한 사람과 게시물 작성한 사람과 동일하면 
			Object object = request.getSession().getAttribute("loginDto");
			
			if ( object == null) { // 비로그인
				result.setIshost(false); // 남이 쓴글 
			}else { // 로그인 
				
				MemberDto login = (MemberDto)object;
				// 내가 쓴 글
				if( login.getMno() == result.getMno() ) { result.setIshost(true); }
				// 남이 쓴글
				else { result.setIshost(false); } 
				
			}
			json = objectMapper.writeValueAsString( result );
			
		}
		// 공통 로직 // 1. 전체조회 , 개별조회 하던 응답 로직 공통
		
		response.setContentType("application/json; charset=UTF-8");
		response.getWriter().print( json );
	}
	// 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	// 삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
