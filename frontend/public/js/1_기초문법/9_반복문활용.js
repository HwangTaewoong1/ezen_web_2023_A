 /*
 // 문제1) 입력받은 수 만큼 * 출력 
// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
// 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*
**         
***      
****   
*****
// 문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
*****
****
***
**
*
// 문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *
   **
  ***
 ****
*****
// 문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*****
 ****
  ***
   **
    *
// 문제7) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *
   ***
  *****
 *******
*********
// 문제8) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*********
 *******
  *****
   ***
    *
// 문제9) 입력받은 줄 수 만큼 * 출력  [ ex) 10 ]
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
// 문제10) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*          *
  *      *
    *  *
      *
    *  *
  *      *
*          *

 */

let output = '';
 // 문제1) 입력받은 수 만큼 * 출력 
  let value1 = prompt('문제1 :')
 for(let i =1; i<= value1; i++) { // i는 
    output += '*'
 }
 console.log(output)
 
 // 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
 output = '';
 let value2 = prompt('문제2 :')
 for(let i = 1; i<=value2; i++) {
    output +='*'
    // 만약에 i의 값이 3배수 (값%3==0) 이면
    if(i%3 ==0){
       output += `\n` }
   // \ : 제어문자(이스케이프문자) \t : 들여쓰기 \n : 줄바꿈
    
 }
  console.log(output)
 
 // 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
 output = '';
 let line1 = prompt('문제3 :')
    for(let i =1 ; i <=line1; i++) {
       for(let s=1; s<=i; s++ ) {
         output += '*' 
       } output += `\n`;
    }
 console.log(output)
 
 // 문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
 output = '';
 let line2 = prompt('문제4 :')
    for(let i =1 ; i <=line2; i++) {
		//[별찍기]
		for(let s = 1 ; s<=line2-i +1 ; s++) {output += `*`}
		//[줄바꿈]
		output += `\n`
}// for end
 console.log( output )
 
 // 문제5) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
 output = '';
 let line3 = prompt('문제5 :')
    for(let i =1 ; i <=line3; i++) {
		// 2. [공백 출력]
		for(let b = 1; b<=line3-i ; b++){ output += ` ` } // 스페이스바 한번 = 공백1개
      	// 3. [별 출력]
       for(let s=1; s<=i; s++ ) { output += '*' } 
       output += `\n`;
    }
 console.log(output)
 
  // 문제6) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
output = '';
 let line4 = prompt('문제6 :')
    for(let i =1 ; i <=line4; i++) {
       for(let b=1; b<=i-1; b++ ) {output += ' ' }
       for(let s = 1 ; s<=line4-i +1 ; s++) {output += `*`} 
       output += `\n`;
    }
 console.log(output)
 
 // 문제7) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
output = '';
 let line5 = prompt('문제7 :')
    for(let i =1 ; i <=line5; i++) {
		// 2. [공백 출력]
		for(let b = 1; b<=line5-i ; b++){ output += ` ` } // 스페이스바 한번 = 공백1개
      	// 3. [별 출력]
       for(let s=1; s<=(2*i)-1; s++ ) { output += '*' } 
       output += `\n`;
    }
 console.log(output)
 
  // 문제8) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
output = '';
 let line6 = prompt('문제8 :')
    for(let i =1 ; i <=line6; i++) {
       for(let b=1; b<=i-1; b++ ) {output += ' ' }
       for(let s = 1 ; s<=2*line6-2*i+1 ; s++) {output += `*`} 
       output += `\n`;
    }
 console.log(output)
 
 // 문제9) 입력받은 줄 수 만큼 * 출력 [ ex) 5]
 output = '';
 let line7 = prompt('문제9 :')/2
    for(let i =1 ; i <=line7; i++) {
		// 2. [공백 출력]
		for(let b = 1; b<=line7-i ; b++){ output += ` ` } // 스페이스바 한번 = 공백1개
      	// 3. [별 출력]
       for(let s=1; s<=(2*i)-1; s++ ) { output += '*' } 
       output += `\n`;
}
    for(let i =1 ; i <=line7; i++) {
       for(let b=1; b<=i-1; b++ ) {output += ' ' }
       for(let s = 1 ; s<=2*line7-2*i+1 ; s++) {output += `*`} 
       output += `\n`;
}
  console.log(output)
  
 // 문제10) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ] 
  output = '';
 let line8 = prompt('문제10 :')
    for(let i =0 ; i <line8; i++) {
       for(let b=0; b<line8; b++ ) {
		   if(i==b || (i+b==line8-1))
		   output += '*';
		   else
		   output += ' ' }
      
       output += `\n`;
    }
 console.log(output)
 
 // 문제 11) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
 output = '';  /*변수 값 초기화*/
 let line9 = prompt('문제11 :') 

    for(let i =1 ; i <line9/2; i++) {/* 가운데 한줄 별 기준으로 위쪽 모양 */
		for(let s=0; s<i; s++){output += `*`}
       	for(let b=0; b<line9-2*i; b++ ){ output += ' '}
		for(let s=0; s<i; s++) {output += `*`}
		   output += `\n`;
	   } 
	   
	for(let s=0; s<line9; s++){output += `*` /* 가운데 한 줄 별 모양 */
	} output += `\n`;
	
	   
    for(let i =1; i <line9/2; i++) { /* 가운데 한줄 별 기준으로 아래쪽 모양 */
		for(let s=0; s<line9/2-i; s++) { output += '*'}
		for(let b=0; b<i*2-1; b++){ output += ` ` } 
       	for(let s=0; s<line9/2-i; s++) { output += '*' } 
       output += `\n`;
    }
		 console.log(output) /*출력*/

// 문제 12)		 
 output = ''; /*변수 값 초기화*/
 
 let line10 = prompt('문제12 :') 
 
    for(let i =1 ; i <line10/2; i++) { /* 가운데 별 하나 기준으로 위쪽 모양 */
		for(let s=0; s<i; s++){output += ' '}
       	for(let b=0; b<line10-2*i+2; b++ ){ output += `*`}
		for(let s=0; s<i; s++) {output += ' '}
		   output += `\n`;
	   }
	   
	   for(let b=0; b<line10/2; b++){output += ` ` /* 가운데 별 하나 모양 */
	} output += '*'; 
	output += `\n`;
	
	    
    for(let i =1; i <line10/2; i++) { /* 가운데 별 하나 기준으로 아래쪽 모양 */
		for(let s=0; s<line10/2-i; s++) { output += ` ` }
		for(let b=0; b<i*2+1; b++){ output += '*' } 
       	for(let s=0; s<line10/2-i; s++) { output += ` ` } 
       output += `\n`;
    }
     console.log(output)
  