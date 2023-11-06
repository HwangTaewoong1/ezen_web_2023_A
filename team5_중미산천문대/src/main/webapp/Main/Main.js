console.log('Main.js')


// 1. 광고이미지 변경
	// 1. 광고이미지 파일명 을 여러개 저장하고 있는 공간  = 배열 
let jimgList = [ 'right1.jpg' , 'right2.jpg' , 'right3.jpg' ]
// 2. 특정시간마다 이미지의 src 변경 하기 
      // - setInterval( 함수/기능 , 밀리초 ) 함수 : 1/1000초 
      // 1. function 함수(){}   2. function (){}     3. () => {} 
         // setInterval( ()=>{ 실행코드 } , 2000  ); // 2초마다 실행코드가 주기적으로 실행 
let viewjimg = 0; // 현재 출력중인 광고이미지 인덱스 저장하고 있는 변수 
setInterval( ()=>{
   // 1. 해당 이미지 태그 객체 호출   
   let jimg = document.querySelector('.jimg');
   // 2. 호출된 객체 에서 src 속성 대입/바꿔치기  // 배열내 이미지 하나씩 바꿔가져서 대입  
      viewjimg++; // 인덱스 증가시킴 [ 다음 이미지로 변경 ] 
      if( viewjimg >= jimgList.length ){ viewjimg = 0; }   // 만약에 마지막인덱스 다음이면[끝] 처음인덱스[0] 이동
   jimg.src = `../img/${ jimgList[viewjimg] }`;
} , 3000 );