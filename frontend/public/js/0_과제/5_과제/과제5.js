
// 누구를~ : 
// 1. 조작/제어할 HTML 태그호출 dom객체 호출
	// 1.입력 2.출력 3.이동
let userbox = document.querySelector('.userbox');
// 유저 위치 = x 좌표	// 기본값 50
let u_left = 50;

// 어떻게~ : 페이지전체(body) 키보드를 누를때
	// dom객체명.addEventListener('이벤트명' , ()=>{ })
document.body.addEventListener( 'keydown' , ( e )=>{
	console.log('키 눌림 ');
	// 1. 눌린 키 상태 확인 e.keyCode
	console.log( e );  // keydown 이벤트 상태 객체
	// 2. 만약에 왼쪽/ 오른쪽 키를 눌렀을 때 css left 변경
	if(e.keyCode == 37){
		console.log("왼쪽으로 이동");
		u_left -= 10;	// 10 차감
		// * 유효성검사 [ 배경 밖을 못나가게]
		if(u_left < 0 ){ u_left = 0}; // 만약에 위치가 0보다 작아지면 0으로 고정
		
	}else if(e.keyCode == 39){
		console.log("오른쪽으로 이동");
		u_left += 10;	// 10 증가
		if(u_left > 900 ){ u_left = 900}; // 만약에 위치가 900보다 커지면 900으로 고정
		
		userbox.style.backgroundImage = `url(img/캐릭터2_이동.png)`; //배경변경 // 이동 이미지 출력
		
	}else if ( e.keyCode == 65){ // a 키를 눌렀을 때 
		console.log('공격');
		userbox.style.backgroundImage = `url(img/캐릭터3_공격.png)`;  // 공격 이미지 출력
	}
	
	//3. 현재 위치값을 대입 
	userbox.style.left = `${u_left}px`
	//확인
	console.log( userbox.style.left);
}) // f end

// 2. 키 누르고 떼었을 때 = key up
document.body.addEventListener( 'keyup' , ( e ) =>{
	// 원래 기본 이미지 변경
	userbox.style.backgroundImage = `url(img/캐릭터1.png)`;
})
