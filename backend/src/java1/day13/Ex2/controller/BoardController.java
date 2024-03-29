package java1.day13.Ex2.controller;


import java1.day13.Ex2.model.dao.BoardDao;
import java1.day13.Ex2.model.dto.BoardDto;

public class BoardController {

	// 싱글톤 (공유) O : 게시물마다 가 아닌 모든 게시물이 동일한 기능을 수행
		// 1. 현재 클래스안에 현재클래스로 객체 선언 [ private static ]
		private static BoardController boardController = new BoardController();
		// 2. 외부로부터 간접적으로 싱글톤이 호출되도록 하는 함수
		public static BoardController getInstance() { return boardController; }
		// 3. 외부로부터 객체 생성 차단하는 생성자 선언
		private BoardController() {}
		
	// 글등록 처리 기능함수 [ C ]
		public boolean writeLogic( String content , String writer) {
			
			// 1. 매개변수로 부터 전달받은 content , writer 를 하나의 객체로 선언
			BoardDto boardDto = new BoardDto ( content , writer );
			// 2. 객체를 배열에 저장 [ 빈공간 찾아서 빈공간 저장 ]
			for ( int i = 0; i<BoardDao.getInstance().boardDtoArray.length; i++) {
				if( BoardDao.getInstance().boardDtoArray[i] == null ) {
					BoardDao.getInstance().boardDtoArray[i] = boardDto;
				}
			} // f e
			
			// 2. 객체를 리스트에 저장
			BoardDao.getInstance().boardDtoList.add(boardDto);
			
			// 성공[true] 또는 실패[false]
			return true;
		}
	// 글출력 처리 기능함수 [ R ]
		public BoardDto printLogic( int index ) {
		
			// 1. 리스트안에 있는 객체 호출 .get( 인덱스 ) : 해당 인덱스의 객체를 호출
			BoardDto boardDto = BoardDao.getInstance().boardDtoList.get(index);
			// 2. 호출된 dto 리턴하기
			return boardDto;
		}
	// 글수정 처리 기능함수 [ U ] : 수정할 게시물 인덱스 , 수정할 내용 , 수정할 작성자
		public boolean updateLogic( int index , String content , String writer) {
			
			// 1. 입력받은 인덱스의 게시물을 호출해서 새로운 입력받은 값으로 대입/저장/수정 = set , 호출/불러오기 = get
			BoardDao.getInstance().boardDtoList.get(index).setContent(content);
				// BoardDao.getInstance().boardDtoList.get(index) = content  // * DTO 필드의 직접접근X -> Set , get 간접접근O
			BoardDao.getInstance().boardDtoList.get(index).setWriter(writer);
			return true;
		}
	
	// 글삭제 처리 기능함수 [ D ] : 삭제할 게시물 인덱스
		public boolean deleteLogic( int index ) {
			// 1. 리스트 안에 있는 객체 삭제.remove(인덱스) : 해당 인덱스 호출
			BoardDao.getInstance().boardDtoList.remove(index);
			// 2. 삭제 여부 반환
			return true;
		}	
	
}
