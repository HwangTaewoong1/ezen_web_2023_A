package java1.day13.Ex2.view;

import java.util.Scanner;

import java1.day13.Ex2.controller.BoardController;
import java1.day13.Ex2.model.dao.BoardDao;
import java1.day13.Ex2.model.dto.BoardDto;

public class MainPage {
	// 싱글톤 (공유) O : 게시물마다 가 아닌 모든 게시물이 동일한 기능을 수행
		// 1. 현재 클래스안에 현재클래스로 객체 선언 [ private static ]
		private static MainPage mainPage = new MainPage();
		// 2. 외부로부터 간접적으로 싱글톤이 호출되도록 하는 함수
		public static MainPage getInstance() { return mainPage; }
		// 3. 외부로부터 객체 생성 차단하는 생성자 선언
		private MainPage() {}
	//---------------------------------------------------//
	
	// 입력객체 필드
	private Scanner sc = new Scanner(System.in);
		
	// 메인페이지 입출력 함수
	public void mainView() {
		while (true) {
			System.out.println("확인용] " + BoardDao.getInstance().boardDtoList);
			System.out.println("\n\n >>>>>> 방문록 프로그램 >>>>>>");
			System.out.print("1.글등록 2.글보기 3.글수정 4.글삭제 선택>");
			int ch = sc.nextInt();
			if ( ch == 1 ) { writeView(); }
			if ( ch == 2 ) { printView(); }
			if ( ch == 3 ) { updateView(); }
			if ( ch == 4 ) { deleteView(); }
		} // w e
	} // f e
		
	// 글등록 페이지 입출력 함수
	public void writeView() {
		System.out.println("안내] 방문록 등록 페이지 ");
		// 1. 내용(띄어쓰기O)과 작성자(띄어쓰기x) 입력받아 변수 저장
		sc.nextLine(); // nextLine() 함수 실행전 nextInt() 실행되므로 오류발생 방지.
		System.out.print("방문록 : "); String content = sc.nextLine(); // 띄어쓰기 nextLine() 앞뒤로 다른 next()가 있을때 하나의 입력으로 인식[오류]
		System.out.print("작성자 : "); String writer = sc.next();
		// 2. 입력받은 변수를 컨트롤에게 전달
		// 현재위치도 java 컨트롤도 java 이므로 메소드 이용한다.
		// 전달 보내기 = 매개변수 / 전달 받기 = 리턴
		
		// View에서 Controller 함수 호출하기
		boolean result = BoardController.getInstance().writeLogic( content , writer ); // 문자열 2개 매개변수로 전달하고 종료 후 boolean 값 1개 리턴반응
		// 3. 컨트롤에게 전달 받은 내용 제어하기
		if ( result ) { System.out.println("안내] 글 등록 성공"); }
		else { System.out.println("안내] 글 등록 실패"); }
	}	
	// 글출력 페이지 입출력 함수
	public void printView() {
		// 1. 보고자하는 게시물의 인덱스 입력받아서 저장
		System.out.println("안내] 출력할 방문록의 인덱스 "); int index = sc.nextInt();
		// 2. view에서 컨트롤에게 입력받은 인덱스 전달보내고 선택한 인덱스의 게시물1개 리턴 받음
		BoardDto result = BoardController.getInstance().printLogic( index );
		// 3. 전달받은 결과를 출력
		System.out.println("안내] 검색한 방문록 정보 ");
		System.out.println(" [작성자] : " + result.getWriter() + " [내용] : " + result.getContent() );
	}
	// 글수정 페이지 입출력 함수
	public void updateView() {
		System.out.println("안내] 방문록 수정 페이지 ");
		// 1. 입출력
		System.out.println("안내] 수정할 방문록의 인덱스 번호 :  "); int index = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 내용 : "); String content = sc.nextLine(); 
		System.out.print("수정할 작성자 : "); String writer = sc.next();
		// 2. 입력받은 변수를 컨트롤러에 전달보내고 결과를 리턴받음
		boolean result = BoardController.getInstance().updateLogic( index , content , writer );
		// 3. 결과에 다른 제어
		if (result) { System.out.println("안내] 수정 성공");
		}else { System.out.println("안내] 수정 실패 ");}
	}
	// 글삭제 페이지 입출력 함수
	public void deleteView() {
		// 1. 삭제하는 게시물의 인덱스 입력받아서 저장
		System.out.println("안내] 삭제할 방문록의 인덱스 "); int index = sc.nextInt();
		// 2. view 에서 컨트롤에게 입력받은 인덱스 전달 보내고 삭제 결과여부 리턴받음
		boolean result = BoardController.getInstance().deleteLogic( index );
		// 3. 리턴 결과에 따른 제어
		if ( result ) { System.out.println("안내] 삭제 성공 ");}
		else {System.out.println("안내] 삭제 실패 ");}
	}	
	
}
