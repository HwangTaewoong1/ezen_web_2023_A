package java1.day13.Ex1;

// 클래스 : 설계도 목적
// 설계도 : 1. 데이터의 모델링 2. 기능패턴 구분 
public class Board {
	// -------- 객체 -------------//
	/*
	 
	  클래스/개발자 ------ new -------> 인스턴스
	  [ 개발자 작성 ]    인스턴스화
	 */
	
	// ------- 클래스 구성멤버 --------- //
	
	// 1. 필드 	: 객체의 데이터 저장하는 곳 
		/*
		  	- 필드 종류
		 		- 인스턴스 필드		: 객체 생성시 객체 안에 저장되어 있는 필드
		 		- 정적 필드			: [static] 프로그램 실행시 우선 할당되고 객체없이 저장되어 있는 필드-사용
		 	
		 	- 필드 타입
		 		- 기본 타입			: boolean char byte short int long float double 8가지
		 		- 참조 타입 			: 클래스[객체] , 인터페이스 , 배열 , 열거타입 등등
		 	
		 	- 필드 접근 권한
		 		- 접근제한자			: 외부에서 해당 필드를 접근할 수 있는 제한/권한
		 			public			: 프로젝트 내 모든곳
		 			private			: 현재 클래스에서만
		 			default			: [생략] 동일한 패키지내에서만
		 	
		 	- 기타 키워드	
		 		- 상수(final)		: [최종적] 수정불가 필드 만들기
		 		- static final  	: 프로그램 전체에서 상수 만들기
		 		
		 	- 싱글톤					: 프로그램 내 1개만 존재하는 객체
		 		1. private static 사용하는 싱글톤 객체 선언 
		 		2. public static getInstance() 싱글톤 객체 반환해주는 함수
		 		3. private 생성자()	외부로부터 생성자 사용 금지
		 	
		 */
	// 2. 생성자	: 객체 초기화 할 때 사용
		/*
		 	- 생성자 사용되는 경우 : 객체 선언할 때
		 		클래스명 객체변수명 = new 생성자명();
		 		
		 	- 생성자 선언
		 		접근제한자 클래스명( 타입 매개변수 , 타입 매개변수 ) {    }
		 		
		 	- 생성자 역할
		 		- 1. 객체 생성시 매개변수를 받아서 필드에 저장
		 		- 2. 유효성 검사 할 때 / 계산식이 필요한 값을 필드에 저장할 때
		 		
		 	- 생성자 종류 [ 오버로딩 으로 인해 다양하게 가능 ]
		 		- 오버로딩 : 매개변수의 개수 , 순서 , 타입에 따라서 식별 가능한 것
		 	
		 	- 접근제한 private , public , default
		 	
		 	- 기타 키워드
		 		- this				: ( 생략가능 ) 현재 클래스의 구성멤버 식별할 때 사용
		 			- this.필드명  	: 	외부로부터 들어온 매개변수명과 현재 클래스내 필드명과 같을때 필드 식별할 때
		 			- this( )  	 	: 	현재 클래스의 생성자 호출
		 			- this.메소드명() :	현재 클래스의 메소드 호출 
		 */
	
	// 3. 메소드	: 객체의 행동/동작 수행할 때 사용
	/*
	 	- 메소드 종류
	 		- 인스턴스 메소드 	: 객체 생성시 사용 가능한 메소드
	 		- 정적 메소드 		: (static) 객체 없이 사용 가능한 메소드
	 		
	 	- 메소드 선언
	 		접근제한자 리턴타입 메소드명 ( 타입 매개변수 , 타입매개변수 ) { } 
	 		- 접근 제한자 : public , private , default , protected
	  		- 리턴타입	: 메소드 종료시 호출했던 곳으로 반환해주는 값의 타입
			- 매개변수	: 메소드 호출시 메소드안으로 들어오는 변수
			- { } 		: 메소드 실행코드
			- return 	: (void 일 때 생략가능) 리턴타입에 맞는 값을 리턴후 메소드 종료
	  
	  	- 메소드 사용목적
	  		- 1. 객체간의 상호작용 : 서로 다른 객체간의 데이터 이용
	  		- 2. 재활용 : 코드 줄이기 / 클린 코딩
	  		- 3. 매개변수에 따른 서로 다른 실행/결과 반환 할 수 있다.
	  	
	  	- 외부객체에서 메소드를 호출하는 방법
	  	 	1. 객체를 이용한 메소드 호출
	  	 		클래스명 객체변수명 = new 생성자명();
	  	 		객체변수명.메소드명();
	  	 	2. 객체없이 정적[static] 메소드 호출
	  			클래스명.메소드명();
	  		3. 싱글톤/객체 내 인스턴스 메소드 호출 
	  			클래스명.getInstance().메소드명();
	 */
	
	// ---------------------------------// 
	
	/*
	 
	 	- 필드 , 생성자 , 메소드를 이용한 프로그램 개발
	 	- MVC 디자인 패턴 : 기능역할에 따른 구분
	 		V : 입출력 담당
	 			- HTML , JS 언어 사용되는 자리
	 			- console 역할 - 임시로 대체해서 사용
	 		C : 제어/로직 = 기능처리 / 유효성검사 등등 담당
	 			- 객체를 여러개 가질 필요가 없어.. 회원가입기능 1개만 있어도 가능하니까.
	 			- 동일한 메소드를 갖는 객체가 있어도 되지만 필요없다. -> 싱글톤 권장
	 			
	 		M : 데이터 모델과 실제 데이터
	 			DTO : 데이터 이동 객체	[ 서로 다른 레이어간 이동할 때 객체사용 ]
	 				1. 이동목적
	 					1. 여러개 서로 다른 타입을 이동하면 불편해....
	 						- int int Stirng double float
	 					2. 하나의 객체로 만들어서 이동
	 						- DTO
	 				2. DTO 가독성
	 					member		: ???? 회원객체인데 회원 무슨객체??
	 					memberDto	: 회원객체인데 .. 이동객체 이구나 파악할 수 있다.			
	 			DAO : 데이터 접근 객체	[ 실제 원본 데이터(DB) 접근 만 ]
	 
	 */
}
