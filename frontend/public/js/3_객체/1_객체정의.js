/*

	JS: 객체 지향 언어[ OOP : Object Oriednted Programming]
		
		클래스 = 사전적인 정의 / 
		객체 = 실제 존재하는 것 / 토대로 메모리에 할당된 것
		?????????????????????
		세상 모든 형태들을 코드화 = 객체
		대량화/자동화 ===> 객체지향 프로그래밍 적합하다.
		 	=> 미리 설계(클래스)하고 컴퓨터 설계 주입해서 설계기반으로 형태(객체) 생성
		ex)
			·현대 소나타
				공장 생성 => 소나타 생성 설계 기준
				A소나타 = 객체 , B소나타 = 객체
			·붕어빵
				붕어빵틀 = 클래스
				붕어방1 = 객체 , 붕어빵2 = 객체
			·OO아파트 30평 아파트
				아파트도면도 = 클래스
				우리집 = 객체 , 옆집 = 객체
			·23년 신형 LG냉장고
				냉장고설계도 = 클래스
				냉장고 = 객체
			- 우리집(객체[냉장고(객체)])	 	
		
		JS 객체 = JSON
			1. JS 메모리
				1. 변수	= 데이터
				2. 상수	= 데이터
				3. 배열	= [ 데이터1 , 데이터2 , 데이터3 ]
						 - 배열 단점 : 서로 다른 정보유형들을 하나의 배열에 관리 어렵다!!!
						  	  ex) 유재석/강호동/신동엽 3명의 회원(정보:아이디,비밀번호,이름,주소 등) 등록
						  	  	  1.방법 : 정보유형 분류 [ 데이터 유형이 아이디인지 비밀번호인지 식별 ]
						  	  	   	   아이디배열 = [ ]
						  	  	   	   비밀번호배열 = [ ]
						  	  	   	   이름배열 = [ ]
						  	  	   	   주소배열 = [ ]
						  	  	  2.방법 : 인덱스 기준 배열
						  	  	  	  회원배열 [ 'qwe' , 'qwe' , '유재석' , '안산' , 'asd' , '강호동' ]
						  	  	  3.방법 : 객체유형
						  	  	  	let 회원1 = { 아이디 : 'qwe' , 비밀번호 : 'qwe' , 이름 : '유재석' , 주소 : '안산'} 	
						  	  	  	let 회원2 = { 아이디 : 'asd' , 비밀번호 : 'asd' , 이름 : '강호동' , 주소 : '성남'} 	
						  	  	  	let 회원3 = { 아이디 : 'zxc' , 비밀번호 : 'zxc' , 이름 : '신동엽' , 주소 : '수원'} 	  
						  	  	  	 	   
				4. 객체 = { }
					-1. 사용목적 : 서로 다른 데이터유형(속성) 들을 한곳에 저장 / 묶음
					
					-2. 형태
						let 객체명 = { 속성명 : 데이터 , 속성명 : 데이터 , 속성명 : 데이터 }
						
					-3. 선언
						키워드 객체명 = {
									 속성명 : 데이터 ,
									 속성명 : 변수 ,
									 속성명 : 상수 ,
									 속성명 : 배열 ,
									 속성명 : 함수 
									} // 마지막에는 , 생략
				5. 객체 호출
						1. 객체 전체 : 객체명
						2. 객체내 특정 속성 호출 : 
							. 접근연산자[ 객체내 속성 접근(호출)해서 데이터 호출 ]
							
				6. 객체 속성 값 변경
						객체명.속성명 = 새로운 값
				
				7. 객체 내 속성 추가
						객체명.새로운속성명 = 데이터
						
				8. 객체 내 속성 삭제	
					delete 객체명.속성명
					
				9. 여러개 객체 => 관리( 배열/ 리스트 이용 )
					회원객체1 , 1번게시물객체 , 회원객체2 , 2번게시물객체	
					let 회원객체배열 = [ 회원객체1 , 회원객체2 ]
					let 게시판객체배열 = [ 1번게시물객체, 2번게시물객체 ]									
 */

// 1. 객체 선언
let 객체1 = { 아이디 :'qwe' , 비밀번호 : '123' , 이름 : '유재석' }
 	// vs
let 배열1 = [ 'qwe' , '123' , '유재석' ]
 
// 2. 객체 호출
console.log( 객체1 ) 			// 객체1 의 모든 정보 호출
console.log('아이디 속성 호출 : ' + 객체1.아이디 ) 			// 객체1 의 특정(아이디) 정보 호출
console.log('비밀번호 속성 호출 :' + 객체1.비밀번호 )			// 객체내 속성 알고있으면 데이터 호출 가능하다.
 	//console : 내장객체		-> console객체에서 log( )함수 호출
 	//document : 내장객체		-> document객체에서 qeuerySeletor() 함수 호출
 	// vs
console.log( 배열1[0] )
// 3. 객체의 속성 내 데이터 변경
객체1.비밀번호 = '123456' 		// [변경]객체내 비밀번호 속성 호출해서 새로운 데이터 대입

// 4. 객체 내 속성추가 	
객체1.주소 = '안산';			// [추가]객체 내 주소 속성이 없으므로 호출이 아닌 추가되서 값 대입
console.log( 객체1 )

// 5. 객체 내 속성 삭제	 
delete 객체1.주소;				// [삭제]객체 내 속성이 삭제되면 데이터도 삭제
console.log( 객체1 )

// 6. 여러개의 동일한 객체유형( 속성명 )을 하나의 배열 저장
let 객체2 = { 아이디 :'asd' , 비밀번호 : '123' , 이름 : '강호동' }
let 객체3 = { 아이디 :'zxc' , 비밀번호 : '123' , 이름 : '신동엽' }

let 회원객체배열 = [ 객체1 , 객체2 , 객체3]
console.log( 회원객체배열 )

// !!!!!! : JSON -------------> 서로 ( 웹/앱 관련 )언어들 간의 데이터 구조를 표준화한 형태