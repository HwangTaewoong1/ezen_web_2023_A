/*
      조건 : 반복문X 입력:prompt 출력 : console 
       문제 1 : 2개의 정수 를 입력받아서 가장 큰수를 출력 
       문제 2 : 3개의 정수 를 입력받아서 가장 큰수를 출력     [ max 함수 x ]
       문제 3 : 4개의 정수 를 입력받아서 가장 큰수를 출력    [ max 함수 x ]
       
       문제 4 : 3개의 정수 를 입력받아서 오름차순 / 내림차순 출력 
       문제 5 : 4개의 정수 를 입력받아서 오름차순 / 내림차순 출력 
       
       문제 6 : 점수를 입력받아 점수 90점이상 합격 출력 아니면 탈락 출력 
       문제 7 : 점수를 입력받아 점수 90점이상 A등급 출력 
                            80점이상 B등급 출력 
                            70점이상 C등급 출력  
                            그외 재시험
       문제 8 : 아이디와 비밀번호 입력받기 
             회원아이디가 admin 이고 비밀번호가 1234 이면 로그인 성공 출력 
                                     아니면 로그인실패 출력
*/
// 문제 1 : 2개의 정수 를 입력받아서 가장 큰수를 출력
	// 1. 입력받아 변수에 저장 
		// 1.첫번째 값을 입력받기
		// 2.입력받은 값을 변수에 저장 value1
		// 3.두번째 값을 입력받기
		// 4.입력받은 값을 변수에 저장 value2
		// 5.가장큰수?? 비교/논리/조건/판단  => 연산자
		// 6.>= <= > < 연산자 선택
		// 7.if 이용한 출력
	
let value1 = Number ( prompt('정수1 : ') );
let value2 = Number ( prompt('정수2 : ') );
	// 2. if 이용한 논리제어
if( value1 > value2 ) { console.log(value1) }
else{ console.log(value2) }

// 문제 2 : 3개의 정수 를 입력받아서 가장 큰수를 출력
let value3 = Number ( prompt('정수3 : ') );
let value4 = Number ( prompt('정수4 : ') );
let value5 = Number ( prompt('정수5 : ') );
if( value3 > value4 && value3 > value5  ) { console.log(value3); }
else if(value4 > value3 && value4 > value5) {console.log(value4);}
else{ console.log(value5) }	

// 문제 3 : 4개의 정수 를 입력받아서 가장 큰수를 출력
let value6 = Number ( prompt('정수6 : ') );
let value7 = Number ( prompt('정수7 : ') );
let value8 = Number ( prompt('정수8 : ') );
let value9 = Number ( prompt('정수9 : ') );
if( value6 > value7 && value6 > value8 && value6 > value9  ) { console.log(value6); }
else if(value7 > value6 && value7 > value8 && value7 > value9) {console.log(value7);}
else if(value8 > value6 && value8 > value7 && value8 > value9) {console.log(value8);}
else{ console.log(value9) }

// 문제 4 : 3개의 정수 를 입력받아서 오름차순 / 내림차순 출력
let int1 = Number ( prompt('정수1 : ') );			//3
let int2 = Number ( prompt('정수2 : ') );			//5
let int3 = Number ( prompt('정수3 : ') );			//7
// 정렬 = 하나씩 비교해서 자리 교체
	// 만약에 첫번째 값이 두번째 값보다 크면
if( int1 > int2 ){ // 조건 1 : 	> 오름차순  < 내림차순
	// *스왑/교체
	let temp = int1; // 1. 임시변수에 3저장
	int1 = int2;	// 2. 3있던 변수에 5저장
	int2 = temp; 	// 3. 5있던 변수에 3저장
}
if( int1 > int3 ){	// 조건2
	let temp = int1; 
	int1 = int3;	
	int3 = temp; 	
}
if( int2 > int3 ){
	let temp = int2; 
	int2 = int3;	
	int3 = temp; 	
}
console.log(int1+' '+int2+' '+int3)

// 문제 5 : 4개의 정수 를 입력받아서 오름차순 / 내림차순 출력
let int4 = Number ( prompt('정수4 : ') );			//3
let int5 = Number ( prompt('정수5 : ') );			//5
let int6 = Number ( prompt('정수6 : ') );			//7
let int7 = Number ( prompt('정수7 : ') );	
// 정렬 = 하나씩 비교해서 자리 교체
	// 만약에 첫번째 값이 두번째 값보다 크면
if( int4 > int5 ){ // 조건 1 : 	> 오름차순  < 내림차순
	// *스왑/교체
	let temp = int4; // 1. 임시변수에 3저장
	int4 = int5;	// 2. 3있던 변수에 5저장
	int5 = temp; 	// 3. 5있던 변수에 3저장
}
if( int4 > int6 ){	// 조건2
	let temp = int4; 
	int4 = int6;	
	int6 = temp; 	
}
if( int4 > int7 ){	// 조건2
	let temp = int4; 
	int4 = int7;	
	int7 = temp; 	
}
if( int5 > int6 ){
	let temp = int5; 
	int5 = int6;	
	int6 = temp; 	
}
if( int5 > int7 ){
	let temp = int5; 
	int5 = int7;	
	int7 = temp; 	
}
if( int6 > int7){
	let temp = int6;
	int6 = int7;
	int7 = temp;
}
console.log(int4+' '+int5+' '+int6+' '+int7)

// 문제 6 : 점수를 입력받아 점수 90점이상 합격 출력 아니면 탈락 출력
let score = Number ( prompt('점수 : ') );	
if(score>=90){ console.log('합격') }
else{ console.log('탈락') }

// 문제 7 : 점수를 입력받아 점수 90점이상 A등급 출력 80점이상 B등급 출력 70점이상 C등급 출력  그외 재시험
let score2 = Number ( prompt('점수 : ') );	
if( score2>=90 ){ console.log('A등급') }
else if( score2>=80 ){ console.log('B등급') }
else if( score2>=70 ){ console.log('C등급') }
else{ console.log('재시험') }

//문제 8 : 아이디와 비밀번호 입력받기 회원아이디가 admin 이고 비밀번호가 1234 이면 로그인 성공 출력 아니면 로그인실패 출력
let id = ( prompt('아이디 : ') );
let pw = ( prompt('비밀번호 : ') );

if(id === 'admin' && pw ==='1234'){ console.log('로그인 성공') }
else{ console.log('로그인 실패')}		