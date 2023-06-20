/*
	- 연산자 [ 연산/계산 시 사용되는 특수문자 ]
		1. 산술연산자 : 결과값으로 출력
			 + 더하기  -빼기  *곱하기  /나누기   %나머지
		
		2. 연결연산자 :	+ 연결연산자
				숫자 + 숫자 [ + 더하기 ]				변수1 + 변수2 [만약에 두 변수모두 숫자가 저장되어 있으면 더하기]
				숫자 +'문자' [ + 연결연산자 ]
				'문자' + '문자' [ + 연결연산자 ]	
		
		3. 비교연산자 :	 true 혹은 false 출력
				> 초과/크다 			< 미만/작다
				>= 이상/크거나같다 		<=이하/작거나 같다
				==같다[데이터비교]		===같다[데이터형/데이터 비교]
				!=같지않다/아니다		!==같지않다/아니다
		
		4. 관계연산자 : 주로 비교연산자 2개이상일때 사용 , true 혹은 false 출력
				&& 이면서 면서 이고 모두 그리고 and조건		초등학생이 사탕이면서 초콜릿 먹을래 [ 모두 참true이면 참true]
				|| 이거나 거나 또는 하나라도 or조건			초등학생이 사탕이거나 초콜릿 먹을래 [ 하나라도 참true이면 참true]
				!  반대 부정 not조건					!true => false 	/ !false => true
		
		5. 대입연산자  
				= 대입  [ 오른쪽 데이터를 왼쪽 대입 ]
				+=	[ 오른쪽 데이터를 왼쪽에 더한후에 왼쪽에 대입 ]
					 1.변수 = 10
					 2.변수 += 30		[+= 1. 더하기를 한다 ( 30 + 10 => 40 )2. 대입한다. ]
					 3. console.log( 변수 )
				-= *= /= %=		
		6. 증감연산자 
				++ 1증가 [ 선위증가 : ++변수 / 후위증가 : 변수++]
				-- 1감소 [ 선위감소 : --변수 / 후위감소 : 변수--]
		
		7. 삼항연산자 : 항이 3개 존재하는 연산자 , 참true or 거짓false 출력
				조건 ? 참true : 거짓false
				- 만약에 조건이 true 이면 참 실행 
				- 만약에 조건이 false 이면 거짓 실행
				-- 중첩가능
				조건1 ? 참1 : 조건2 ? 참2 : 거짓
 */

// 1. 산술연산자
console.log('더하기 : ' + 10 + 3) 	// 103
console.log('더하기 : ' + (10 + 3)) 	// 13
console.log('빼기 : ' + (10 - 3)) 	// 7
console.log('곱하기 : ' + (10 * 3))	// 30
console.log('나누기 : ' + (10 / 3))	// 3.333333~
console.log('나머지 : ' + (10 % 3)) 	// 1

//문제
/*
   	-문제1 : prompt 함수 로 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점 출력 , 평균 출력
 	-문제2 : prompt 함수 로 반지름 입력받아서 원넓이[ 반지름*반지름*3.14 ] 출력
  	-문제3 : prompt 함수 로 두 실수를 입력받아서 앞실수의 값이 뒤실수의 값의 몇%인지 출력
*/

// 문제1 :
	// 1. 세 과목 입력받기 
let 국어 = Number (prompt('국어 점수 : '))	 	// 입력후에 변수에 저장 안하면 사라지니까 변수에 저장/대입
let 영어 = Number (prompt('영어 점수 : '))	//Number('300') => 300
let 수학 = Number (prompt('수학 점수 : '))	//Number('숫자') => 숫자
	// 2. 세 과목 총점 연산
let 총점 = 국어 + 영어 + 수학
let 평균 = 총점 / 3 
	// 3. 연산 결과 출력
console.log('총점 : ' + 총점 )
console.log('평균 : ' + 평균 )

// 문제2 :
	// 1. 반지름 입력 받기
let 반지름 = prompt('반지름 : ')
	// 2. 연산
let 원넓이 = 반지름 * 반지름 * 3.14
	// 3. 연산 결과 출력
console.log('원 넓이 : ' + 원넓이 )

// 문자 연산 예시
console.log( 10*3 )
console.log('10'*3) ///?????
 
// 문제3 :
let 실수1 = prompt('실수1 : ')
let 실수2 = prompt('실수2 : ')
let 백분율 = (실수1/실수2) * 100
console.log('두 실수간의 비율 : ' + 백분율 +"%")

// 2. 비교연산자
console.log('초과 : ' + (10>3) ) //true
console.log('미만 : ' + (10<3) ) //false
console.log('이상 : ' + (10>=3) ) //true
console.log('이하 : ' + (10<=3) ) //false
console.log('같다 : ' + (10==3) ) //false
console.log('같지않다 : ' + (10!=3) ) //true

//3. 관계연산자
console.log('이면서 : ' + (10>3 && 20>15 ) ) // 10은 3보다 크면서 20은 15보다 크다. //true
console.log('이면서 : ' + (10>3 && 20>30 ) ) // 10은 3보다 크면서 20은 30보다 크다. //false
console.log('이거나 : ' + (10>3 || 20>15 ) ) // 10은 3보다 크거나 20은 15보다 크다. //true
console.log('이거나 : ' + (10>3 || 20>30 ) ) // 10은 3보다 크거나 20은 30보다 크다. //true
console.log('부정 : ' + !(10>3) )  // 10은 3보다 크다를 부정. //true => false.

/*
   -문제4 : prompt 함수 로 정수를 입력받아 홀수[true] / 짝수[false] 여부 출력
   		홀수 : 수%2 == 1
   			어떤 수의 나누기 2을 했을때 나머지가 1이면 그 수는 홀수이다.
   		짝수 : 수%2 == 0
   			어떤 수의 나누기 2을 했을때 나머지가 0이면 그 수는 짝수이다.	
   -문제5 : prompt 함수 로 정수를 입력받아 7배수이면 true / 아니면 false 출력
   		배수 : 수%값 == 0
   			어떤 수의 나누기 값을 했을 때 나머지가 0이면 해당 값은 그 수의 배수
   			
   -문제6 : prompt 함수 로 십만원 단위의 금액을 입력받아 지폐 개수 세기 
         356789      결과 : 십만원3장 만원5장 천원6장 
   -문제7 : prompt 함수 로 아이디와 비밀번호를 입력받아 아이디가 admin 이고 비밀번호가 1234 와 일치하면 
         결과 : true 출력 아니면 false 출력 
   -문제8 : prompt 함수로 정수를 입력받아 홀수 이면서 7배수이면 true 아니면 false 출력
*/

// 문제4 
let 정수1 = prompt(' 정수1 : '); console.log('입력받은 정수1 : ' + ( 정수1%2 == 1 ) );

// 문제5 
let 정수2 = prompt(' 정수2 : '); console.log('입력받은 정수2 : ' + ( 정수2%7 == 0 ) );

// 문제6
let 금액 = prompt(' 금액 : '); console.log('입력받은 금액 : ' + 금액 );
	// 1. 십만원권 검사
let 십만원 = parseInt(금액 / 100000) ;  								console.log('십만원권 : ' + 십만원 + "장" ); //3.56789	
	// 금액/100000 => 3.56789
	// parseInt( 금액/100000 ) => 3
	
	// 2. 만원권 검사 [ 원금에서 십만원권 제외한 ] 356789 - 300000 => 56789
let 만원 = parseInt( 금액 - (십만원*100000)  / 10000);  					console.log('만원권 : ' + 만원 + "장");
	// 3. 천원권 검사 [ 원금에서 십만원권과 만원 제외한 ]
let 천원 = parseInt( 금액 - (십만원*100000) - (만원 * 10000) / 1000 );    console.log('천원권 : ' + 천원 + "장");

// 문제7
let 아이디 = prompt('아이디 : ')
let 비밀번호 = prompt('비밀번호 : ')
console.log('로그인상태 : ' + ( 아이디 == 'admin' && 비밀번호 == 1234) ) // == 데이터만 비교
console.log('로그인상태 : ' + ( 아이디 == 'admin' && 비밀번호 === '1234') ) // === 데이터와 자료형(형식)

// 문제8
let 정수3 = prompt(' 정수3 : '); console.log('결과 : ' + (정수3%2==1 && 정수3%7==0));
	
// 3. 대입연산자
let 데이터1 = 10  // let키워드(변수)로 '데이터1' 이라는 변수명에 10을 저장한다.
console.log( 데이터1 )	//10
데이터1 += 10 	// 1. 10 + 10 => 20 ,  	20대입
console.log( 데이터1 )	//20
데이터1 -= 5		// 20 + 5  => 15	,	15대입
console.log( 데이터1 )	//15
데이터1 *= 2		// 15 * 2 => 30 	, 	30대입
console.log( 데이터1 ) // 30
// *= %= 생략하지만 가능하다.

	//예제1
	let html = '<h3> JS에서 작성된 HTML 입니다.</h3>'		//html언어를 문자열 안에서 작성한다.
	html += '<p> 문단 추가 했습니다. </p>'
	// html [ <h3> JS에서 작성된 HTML 입니다.</h3> <p> 문단 추가 했습니다.</p> ]
	document.write( html );  //document.write() //document:html문서 , write:쓰다



