/*

	반복문 : 어디서부터 어디까지
		1. 	
			for( 1.초기값 ; 2.조건문 ; 4.증감식 ){
				3. 실행코드;
			}
			1. 초기값 : 반복의 처음값 
 				; : 구역부분
			2. 조건문 : 조건이 true이면 {}실행 아니면 {}실행 안함
				; 
			3. 실행문 : 반복시 실행될 코드
			4. 증감식 : 반복변수 증가/감소 단위 
		
		2. for 중첩 
		 
			for( let i = 0 ; i<=10 ; i++ ){
				
				for( let j = 0 ; j<=20 ; j++ ){ }
				
				for( let k = 0 ; k<=20 ; k++) { }
				
			}
			
		ex) 1부터 10까지 1씩증가 반복 
			for( let i = 1 ; i<=10 ; i++ ){ }
		ex) 1부터 100까지 홀수만 반복
			for( let i = 1 ; i<=100 ; i+=2 ){ }
*/

// 1. 
	// let i = 0 ;	// 1. 초기값 ( i는 반복시 사용되는 증감변수 = 임의변수명 )
	// i<10		;	// 2. 조건문 ( 조건결과가 true이면 {} 실행되는 조건  )
	// i++			// 3. 증감식 ( {} 실행후 다음으로 증감변수 계산식 )
for( let i = 0 ; i<3 ; i++ ){ // for s 
	// i는 0부터 10미만까지 1씩증가 반복
	console.log('반복횟수 : ' + i );
	/* 
		순서도 = 알고리즘 != 자료구조
			// * 1.생활속 순서도 2.백준 3.프로그램개발 순서
		1. let i = 0			=> i = 0
		2. i<3					=> true => { }
		3. console.log( );		=> 0 출력 
		--------
		4. i++					=> i = 1		
		5. i<3					=> true => { }
		6. console.log( );		=> 1 출력 
		--------
		7. i++					=> i = 2
		8. i<3					=> true => { }
		9. console.log( );		=> 2 출력 
		--------
		10. i++					=> i = 3 
		11.  i<3				=> false => 못 들어감
		12. 반복문 종료 
	*/
} // for end 

// 2. 배열( 인덱스 )과 반복문
let 상자 = ['사과','포도','딸기']
	// 1.반복문 없을때 [ 인덱스 다수일때 힘듬 ]
console.log( 상자[0] );
console.log( 상자[1] );
console.log( 상자[2] );

	// 2.반복문 사용할때 [ i반복변수를 인덱스 대신 사용 ]
for( let i = 0 ; i<상자.length ; i++ ){ // for s
	console.log( 상자[i] )
} // for end 

// 예제1) i는 1부터 10이하까지 1씩 증가 반복 [ 한줄씩 표시 ]
console.log('---------- ex1 ------------- ');
for( let i = 1 ; i<=10 ; i++ ){
	console.log( i )
} // for end 

// 예제2) i는 1부터 10이하까지 1씩 증가 반복 [ 한줄에 표시 ]
console.log('---------- ex2 ------------- ');
let output = ``	// 문자열을 누적으로 저장할 output변수 선언  
for( let i = 1 ; i<=10 ; i++ ){ // for s
	output += `${i}  `	// (+=) i변수를 output변수에 추가 
} // for end
console.log( output )	

// 예제3) i는 1부터 10이하까지 1씩 증가 반복 [ HTML 표시 ]
console.log('---------- ex3 ------------- ');
output = `` // 위에서 선언된 output변수를 재선언하지 않고 공백으로 대입(초기화)
for( let i = 1 ; i<=10 ; i++ ){
	output += `<p> ${i} </p>`
} // for end 
document.write( output )

// 예제4) i는 1부터 10이하까지 1씩 증가 반복 ( 누적합계 )
console.log('---------- ex4 ------------- ');
let sum = 0;	// 1부터10까지 누적으로 더한 값을 저장할 변수 
for( let i = 1 ; i<=10 ; i++ ){ // for start
	// 1. sum = sum+i 
	// 2. sum += i
	sum += i // (+=)  sum변수에 i를 더한값을 sum변수 에 대입 
} // for end 
console.log( sum )
/* 예제4 순서도 
	초기값 i = 1 	/ sum = 0
	for 시작 
		i			조건			실행			누계 			증감
		i = 1		1<=10 T		sum+=1		0+1=>1		i++
		i = 2		2<=10 T		sum+=2		1+2=>3		i++
		i = 3		3<=10 T		sum+=3		3+3=>6		i++
		i = 4		4<=10 T		sum+=4		6+4=>10		i++
		i = 5		5<=10 T		sum+=5		10+5=>15	i++
		i = 6		6<=10 T		sum+=6		15+6=>21	i++
		i = 7		7<=10 T		sum+=7		21+7=>28	i++
		i = 8		8<=10 T		sum+=8		28+8=>36	i++
		i = 9		9<=10 T 	sun+=9		36+9=>45	i++
		i = 10		10<=10 T	sum+=10		45+10=>55 	i++
		i = 11		11<=10 F	반복문 종료 
*/

// 예5) i는 1부터 100까지 7배수 누적합계 
console.log('---------- ex5 ------------- ');
	// 1. 7씩 증가방식 
sum = 0;
for( let i = 0 ; i<=100 ; i += 7 ){ sum += i }
console.log( sum )
	
	// 2. if( 값%7 == 0 )
sum = 0;
for( let i = 1 ; i<=100 ; i++ ){
	if( i % 7 == 0 ){ sum+=i }
	else{}
}
console.log( sum )

// 예6 )  [구구단] 2단 	( 단 : 2[고정]  곱 : 1~9[증가변수] )
console.log('---------- ex6 ------------- ');
console.log( `2 * 1 = ${ 2*1 }` )
console.log( `2 * 2 = ${ 2*2 }` )
console.log( `2 * 3 = ${ 2*3 }` )
console.log( `2 * 4 = ${ 2*4 }` )
console.log( `2 * 5 = ${ 2*5 }` )
console.log( `2 * 6 = ${ 2*6 }` )
console.log( `2 * 7 = ${ 2*7 }` )
console.log( `2 * 8 = ${ 2*8 }` )
console.log( `2 * 9 = ${ 2*9 }` )
// -------------- //
const 단2 = 2;
for( let 곱 = 1 ; 곱<=9 ; 곱++ ){ 				// 변수는 문자처리X  
	console.log( `${단2} x ${ 곱 } = ${ 단2*곱 }`)	// `문자열${변수}`
	console.log( 단2 +' x '+  곱  +' = '+  단2*곱 ) // '문자열'+변수
} // for end 

// 예7 ) 구구단 (2단~9단) ( 1곱~9곱 )
	// 1단계 : 단 만들기 ( 2부터 9까지 1씩증가 )
for( let 단 = 2 ; 단<=9 ; 단++ ){
	console.log( "단 : "+ 단)
}
	// 2단계 : 곱 만들기 ( 1부터 9까지 1씩증까 )
for( let 곱 = 1 ; 곱<=9 ; 곱++ ){
	console.log( '곱 : ' + 곱)
}
	// 3단계 : 1/2단계 합치기 ( 단 1회 반복시 곱은 9회 반복 )
for( let 단 = 2 ; 단<=9 ; 단++ ){			// 첫번째 for 반복횟수 => 8회;
	for( let 곱 = 1 ; 곱<=9 ; 곱++ ){		// 두번째 for 반복횟수 => 72회 [ 상위반복문(8)*현재반복문(9) ]
		console.log( `${단} X ${곱} = ${ 단*곱 }` );
	} // 곱 FOR END 
} // 단 FOR END 
	
/*
2단
	2*1
	~~
	2*9
3단
	3*1
	~~
	3*9
4단
	4*1
	~~
	4*9
*/
















