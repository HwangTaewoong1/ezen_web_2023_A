/*JS 메모리/저장 사용방법
	1. 변수/상수 : 데이터 1개 저장
		let 변수명 = 데이터1

	2. 배열 : 데이터 여러개 저장 
		let 배열명 = [ 데이터1 , 데이터2 , 데이터3 ]
		- 선언시 [ ] 
		- 호출시 배열명[인덱스번호]
		- 식별 : 인덱스 = 데이터 저장하는 순서번호 
		- 단점 : 서로 다른 데이터유형들을 한 배열에 저장하면 관리 힘듬 
			
	3. 객체 : 데이터 여러개 저장 
		let 객체명 = { 속성명 : 데이터1 , 속성명 : 데이터2 , 속성명 : 데이터3 , 속성명 : [ 데이터4,데이터5 ] } 
		- 선언시 { }
		- 호출시 객체명.속성명
		- 식별 : 속성명 = 저장된 데이터의 상태이름
		- 단점 : 동일한 구조의 객체 다수일때 배열과 같이 사용 

	4. 배열과 객체 관계/구조 
		1.   [   { }  ,  {  }  ,   {  }  ]
		2.  { 속성명 : [  ]  , 속성명 : [  ]  }

------------------------------------------------------------------------

과제4
	메모리 설계
	1. 저장
		누가 작성했는지 = 작성자											let writer 
		무엇 작성했는지 = 제목 , 내용 									let title , let content
		게시판 작성자 식별방법 = 비밀번호  [ 작성자 동명이인 있을수 있기 떄문에 ] 	let password
		* 언제작성되고 몇명이 조회했는지 = 작성일 / 조회수 					let date , let view
	
	2. 무엇 입력 요구 할껀지 
		작성자 , 제목 , 내용 , 비밀번호 
	
	3. 기능 상태 데이터 저장 
		1. 작성일=등록기능이 실행된 시간상태 저장 
		2. 조회수=해당 게시물 조회 기능 실행된 상태 저장 
	
	4. 데이터 구조 구성 = JS
		변수 , 배열 , 객체 
		1. 여러개 데이터 저장하기 위해 ( 배열 vs 객체 )
			[ '유재석' , '제목1' , '내용' , '1234' , '2023-06-29' , 0 ]
			{ 작성자 : '유재석' , 제목 : '제목1' , 내용 : '내용' , 비밀번호 : '1234' , 작성일 : '2023-06-29' , 조회수 :  0 }
			
		2. 게시물1개 = 객체  => 게시물(객체)여러개 저장 공간 => 배열 저장 
			let boardlist = [ ] 
			let board = { } 
			
	기능 설계 
		1. 글등록 기능 = 함수/행동		= onWrite()		: Create	C
		2. 글 전체 출력 기능 = 함수/행동	= onPrint()		: Reading	R
		3. 글 개별 출력 기능 = 함수/행동	= onView()		: Reading	R
			-수정										: Update	U
		4. 글 삭제 기능 = 함수/행동 		= onDelete()	: Delete	D
	
----------------------------------------------------------------------------------------------------------

--------------- 작업 순서 

1. onWrite()
	1. 등록 에 필요한 데이터 입력받은 html 구성 [ 작성자 , 비밀번호 , 제목, 내용 ]
	2. 입력받은 데이터를 등록했을때 이벤트 구성 
		1. 언제 이벤트 실행???? -> 버튼 클릭했을떄 ---> 버튼 필요 -> 버튼 만들기
			<button onclick="onWrite()">글쓰기</button>
		2. 이벤트 상세 정보 --> 함수 정의 --->
			function onWrite(){}
	3. 함수 정의
		1. 사용자에게 입력받은 데이터( input value ) 호출
			document.querySelector(식별자).value
		2. 게시물1개당 = 객체1개 선언/만들기  = 각 input로 입력받은 값들을 각 속성명별로 대입해서 객체 생성 
			{ }
		3. // 3. 현재 { } 안에서 선언된 board 는 } 끝나면 사라짐[지역변수] --> 전역변수/배열에 저장하자.
			push
			
	 
	

























	
	

	
	
	
	
	
	
	
		
		
*/






// * 배열  = 여러개 객체(게시물)을 저장하는 배열  
let boardlist = [ ]

// * JS 열렸을때 최초 1번 함수 실행 
onPrint()

// 1. 등록 이벤트 함수 [ 실행조건 : 등록 버튼을 클릭했을때 ]
function onWrite(){ console.log('onWrite()함수')

	// 1. 입력받은 데이터 호출 
		// 1. document.querySelector(식별자).value
	let writerValue = document.querySelector('#writer').value;
	let passwordValue = document.querySelector('#password').value;
	let titleValue = document.querySelector('#title').value;
	let contentValue = document.querySelector('#content').value;
		
		// 날짜 모양으로 출력
		let now = new Date();
		let year = now.getFullYear();
		let months =currentTime.getMonth();
  		let day = currentTime.getDay();
    	let hour = currentTime.getHours();
    	let minute = currentTime.getMinutes();
   		let second = currentTime.getSeconds();

	// 2. 게시물1개당 = 객체1개 선언/만들기  = 각 input로 입력받은 값들을 각 속성명별로 대입해서 객체 생성 
	let board = { 
					writer : writerValue ,
				 	password : passwordValue ,
				  	title : titleValue ,
				   	content : contentValue  ,
				   	date : new Date() ,
				   	view : 0 
   				}
	console.log( board ) ;	// board 생성 확인 
	// --------- 등록전에 유효성검사 --------------------//
		
	// ---------------------------------------------//
	
	// 3. 현재 { } 안에서 선언된 board 는 } 끝나면 사라짐[지역변수] --> 전역변수/배열에 저장하자.
	boardlist.push( board );	console.log( boardlist ) ;	// 배열  확인 
	
	// * 새로운 게시물이 등록 되었으니까 게시물 출력 화면 업데이트
	onPrint()

} // F END 

// 2. 출력 함수 [ 실행조건 : 1.JS열렸을때 2.등록했을때 3.삭제했을때 4.수정했을때 5.조회수증가했을때]
function onPrint(){ console.log('onPrint()함수');
	// 1. 어디에 출력할껀지 ????  테이블 
	let boardTable = document.querySelector('#boardTable')
	// 2. 테이블 무엇을 대입/출력 할껀지 ??? 객체에 정보들을 객체 1개당 한줄씩<tr> 출력
	let html = `<tr> <th> 번호 </th> <th>제목</th> <th>작성일 </th> <th>조회수</th> </tr>`
		// 배열내 순차적으로 하나씩 열어보자 
		for( let i = 0 ; i<boardlist.length ; i++ ){
			
			let board = boardlist[i];	// i번째 배열 인덱스의 객체 호출 
			// 로그인=비교=if		// HTML출력 => HTML 구성 
			html += `<tr>
						<td> ${ i+1 } </td> 
						<td onclick="onView( ${ i } )"> ${ board.title } </td> 
						<td> ${ board.date } </td> 
						<td> ${ board.view } </td>
					</tr>`
		} // for end 
	// 3. 대입 
	boardTable.innerHTML = html 
} // f end 

// 3. 
function onView( index ){ console.log('onView() 함수' + index); 
	// 1. 어디에 ~~~
	let viewbox = document.querySelector('#viewbox')
	// 2. 무엇을 ~~~ 
	let board = boardlist[index] // 인수로 전달받은 인덱스의 객체를 1개 꺼내기 
	
	let html = `<div> 제목 : ${ board.title } </div>
				<div> 내용 : ${ board.content } </div>
				<div> 작성자 : ${ board.writer } </div>
				<button onclick="onDelete( ${ index } )">삭제</button>
				<button>수정</button>`
	// 3. 대입
	viewbox.innerHTML = html 
	// 조회수 증가(JS변경) 하고 화면 새로고침(HTML변경)  
	board.view++; onPrint();
	
} // f end 

// 4. 삭제함수 
function onDelete( index ){ console.log('onDelete()함수' + index )
	
	// 1. 배열내 삭제할 인덱스의 해당하는 객체 호출 
	let board = boardlist[index];
	
	// 2. prompt() 함수로 입력받은 값을 password 변수 에 저장 
	let passowrd = prompt('비밀번호 : ')
	
	// 3. 비교 [ 삭제할 객체내 비밀번호와 입력받은 비밀번호와 일치하면 삭제 성공 ] 
	if( board.password == passowrd ){
		// 4. 배열내 해당 객체 삭제 
		boardlist.splice( index , 1 ); // 삭제할 인덱스번호부터 1개 삭제 
		// 5. 화면 새로고침 
		onPrint(); // 전체 게시물 출력 화면 새로고침 
		document.querySelector('#viewbox').innerHTML = `` // 현재 삭제된 개별 게시물 출력 화면 없애기 
		alert('[삭제성공] 게시물이 삭제 되었습니다.')
	}else{ // 일치하지 않으면 
		alert('[삭제실패] 비밀번호가 틀렸습니다. ')
	}
}


































































