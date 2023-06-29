/* 메모리 설계
  1.
  	누가 작성했는지 = 작성자					let writer
  	무엇 작성했는지 = 제목 , 내용				let title , let content
  	게시판 작성자 식별방법 = 비밀번호 [ 작성자 동명이인 있을 수 있기 때문에 ] let password
  	* 언제 작성되고 몇명이 조회했는지 작성일 / 조회수 let date , let view
  	
  2. 무엇 입력 요구 할껀지 
	작성자 , 제목 , 내용 , 비밀번호
	
  3. 기능 상태 데이터 저장
  	  1. 작성일 = 등록기능이 실행된 시간상태 저장
  	  2. 조회수 = 해당 게시물 조회 기능 실행된 상태 저장 	
  
  4. 데이터 구조 구성 = JS
	  변수 , 배열 , 객체 
	  1. 여러개 데이터 저장하기 위해 ( 배열 VS 객체 )
		  [ '유재석' , '제목1' , '내용' , '1234' '2023-06-29' , 0 ]
		  [ '유재석' , '제목1' , '내용' , '1234' '2023-06-29' , 0 , '유재석' , '제목1' , '내용' , '1234' '2023-06-29' , 0 ]
		  
		  { 작성자: '유재석' , 제목: '제목1' , 내용 : '내용' , 비밀번호: '1234' , 작성일: '2023-06-29' , 조회수: 0 }	
		  { 작성자: '유재석' , 제목: '제목1' , 내용 : '내용' , 비밀번호: '1234' , 작성일: '2023-06-29' , 조회수: 0 }
		  { 작성자: '유재석' , 제목: '제목1' , 내용 : '내용' , 비밀번호: '1234' , 작성일: '2023-06-29' , 조회수: 0 }
	  2. 게시물1개 = 객체 => 게시물(객체)여러개 저장 공간 => 배열 저장


  5. 기능 설계
      1. 글등록 기능 = 함수/행동      = onWrite()      : Create    C
      2. 글 전체 출력 기능 = 함수/행동   = onPrint()      : Reading    R
      3. 글 개별 출력 기능 = 함수/행동   = onView()      : Update    U
      4. 글 삭제 기능 = 함수/행동      = onDelete()   : Delete    D
   
------------------------------작업순서--------------------------------

1. onWrite()
   1. 등록에 필요한 데이터 입력받은 html 구성 [작성자, 비밀번호, 제목, 내용]
   2. 입력받은 데이터를 등록했을때 이벤트 구성 
   		1. 언제 이벤트 실행??? 
   		<button onclick="onWrite()"글쓰기</button>
	 
*/



// * 배열  = 여러개 객체(게시물)을 저장하는 배열  
let boardlist = [ ]

// 1. 등록 이벤트 함수 [ 실행조건 : 등록 버튼을 클릭했을때 ]
function onWrite(){ console.log('onWrite()함수')

	// 1. 입력받은 데이터 호출 
		// 1. document.querySelector(식별자).value
	let writerValue = document.querySelector('#writer').value;
	let passwordValue = document.querySelector('#password').value;
	let titleValue = document.querySelector('#title').value;
	let contentValue = document.querySelector('#content').value;
	
	// 2. 게시물1개당 = 객체1개 선언/만들기  = 각 input로 입력받은 값들을 각 속성명별로 대입해서 객체 생성 
	let board = { 
					writer : writerValue ,
				 	password : passwordValue ,
				  	title : titleValue ,
				   	content : contentValue    
   				}
	console.log( board ) ;	// board 생성 확인 
	// --------- 등록전에 유효성검사 --------------------//
		
	// ---------------------------------------------//
	
	// 3. 현재 { } 안에서 선언된 board 는 } 끝나면 사라짐[지역변수] --> 전역변수/배열에 저장하자.
	boardlist.push( board );	console.log( boardlist ) ;	// 배열  확인 

}