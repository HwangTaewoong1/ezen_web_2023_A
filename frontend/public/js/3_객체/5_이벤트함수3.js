

// 1. select 목록상자에서 변경될 때 선택된 value 가져오기
let selectbox = document.querySelector('.selectbox');

	// * 이벤트 등록[ addEventListener vs <select onchange=""> ]
selectbox.addEventListener( 'change' , ()=> {
	console.log('목록상자가 변경 되었네요.')
	console.log( selectbox.value ) // 입력값
});

// 2. input 체크상자에서 체크 여부 가져오기
let checkbox = document.querySelector('.checkbox');

	// * 이벤트 등록
checkbox.addEventListener('change' , ()=>{
	console.log('체크상자가 변경되었네요.')
	console.log( checkbox.checked ) //체크여부 (true or false)
})

// 3. 타이머 예제
	// 1. 해당 태그 호출
let timer = document.querySelector('.timer');
let timerbox = document.querySelector('.timerbox');

	// 2. 시간 함수에 필요한 변수
let time = 0 ; // 타이머 시간을 저장하는 변수
let timeId = 0; // 타이머 함수가 저장되는 변수	
	// * 이벤트 등록
timer.addEventListener( 'change' , ()=>{
	
	// 만약에 체크박스에 체크가 되어 있으면
	if( timer.checked ){	
		
		timeId = setInterval( ( )=>{ 
			time++; // 시간증가 // 변수 1씩 증가 
			timerbox.innerHTML = `${time} 초`; // 시간 출력			
		} , 1000 ) // 1000 밀리초 => 1초	//1초마다 { }실행
		
	}else{ // 체크가 없으면
		clearInterval( timeId )	
	}
	
})

/* 
	setInterval() : 특정시간마다 함수 재호출 함수 
		1. setInterval( 함수 , 시간 ) : Interval[ 간격/주기 뜻 ]
		함수
			1. 기존함수명			function 함수명( ){ }
			2. () => { }		( )=>{ }
			3. function (){ }	function 함수명( ){ }
		
		시간 : 밀리초[  1초/1000초]
			1000 => 1초
			100 => 0.1초
			10 => 0.01초
			1 => 0.001초
		2. clearInterval( )	

*/
