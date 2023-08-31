let checkList = [ false , false , false , false , false ]

// 사진유효성
function preimg( o ){ console.log('사진 선택 변경');
	console.log( o ); // 이벤트 발생시킨 태그의 DOM객체를 인수로 받음
	// 1. input태그의 속성 [ type,class,onchange,name,value 등등 ] type="file" 이면 추가적인 속성 
		// .files : input type="file" 에 선택한 파일 정보를 리스트로 받음 
	console.log( o.files );		console.log( o.files[0] ); // 리스트중에서 하나의 파일만 가져오기 
	// --- 해당 파일을 바이트코드 변환 
	// 2. JS 파일읽기 클래스 선언 
	let file = new FileReader(); // 파일 읽기 클래스 이용한 파일읽기객체 선언 
	// 3. 파일 읽어오기 함수 제공 
	file.readAsDataURL( o.files[0] ); // input 에 등록된 파일리스트(o.files) 중 1개를 파일객체로 읽어오기 
		console.log( file );
	// document.querySelector('.preimg').src = file.result; // img src속성에 대입 // 오류 
	// 4. 읽어온 파일을 해당 html img태그에 load 
	file.onload = e => { // onload() : 읽어온 파일의 바이트코드를 불러오는 함수 구현 
		
		document.querySelector('.preimg').src = e.target.result; // img src속성에 대입 
		
		if(('.preimg').src !="" ){ checkList[0] = true};
		if(('.preimg').src == ""){checkList[0] = false};
	} 
	
} // f end 
// 1. 이름 유효성검사.
function idcheck(){ /* 실행조건 : 아이디 입력창에 입력할때마다 */
let hname = document.querySelector('.hname').value; 
	if( hname == null ) checkList[1] = false; 
	if( hname != null ) checkList[1] = true;
}

// 2. 전화번호 유효성
function phonecheck(){
	let phonecheckbox = document.querySelector('.phonecheckbox');
	// 1. 입력된 값 호출 
	let hphone = document.querySelector('.hphone').value 
	// 2. 전화번호 정규표현식 [  영대소문자,숫자,_-  @  ]
	let memailj = /^\d{2,3}-\d{3,4}-\d{4}$/ 
	// 3. 유효성검사 
	if( memailj.test( hphone   ) ) {
		phonecheckbox.innerHTML =`등록가능한 전화번호입니다.`; 
					checkList[2] = true;
		/*
		$.ajax({
			url : "/jspweb/HrmController" , 
			method : "get" , 
			data :  { hphone : hphone }, 
			success : r => {  
				if( r ){
					phonecheckbox.innerHTML =`이미 목록에 존재하는 전화번호 입니다.`;
					checkList[2] = false;
				}else{
					phonecheckbox.innerHTML =`등록가능한 전화번호입니다.`; 
					checkList[2] = true;
				}
			} ,
			error : r => { console.log(r); } 
		})*/
	}else{
		phonecheckbox.innerHTML = `000-0000-0000 형식으로 입력해주세요.`;
		checkList[2] = false;
	}
} // f end 

let hrankValue =``;
// 직급 유효성
function rankcheck(){ 
let hrank = document.getElementById("hrank");
hrankValue = hrank.value; 
console.log ( hrankValue )
	if( hrankValue == "선택" ) checkList[3] = false; 
	if( hrankValue == null ) checkList[3] = false; 
	if( hrankValue != null ) checkList[3] = true;
}

// 등록일 유효성
function datecheck(){ 
	let hdate = document.querySelector('.hdate').value; 
	let datecheckbox = document.querySelector('.datecheckbox');
	
	let midj = /^(\d{4})-(\d{2})-(\d{2})$/;
	
	if( midj.test(hdate) ){
		datecheckbox.innerHTML = '올바른 입력입니다.'; checkList[4] = true;
	}else{
		datecheckbox.innerHTML = 'YYYY-MM-DD 형식으로 입력해주세요.'; checkList[4] = false;
	}	
}

// 8. 회원가입 메소드 
function signup(){
	// 1. 아이디/비밀번호/이메일 유효성검사 통과 여부 체크 
		console.log( checkList )
	if( checkList[0] && checkList[1] && checkList[2] && checkList[3] && checkList[4] ){ // checkList 에 저장된 논리가 모두 true 이면 
		console.log('회원가입 진행가능');
		
		// 2. 입력받은 데이터를 한번에 가져오기 form 태그 이용 
			// <form> 각종 input/button </from>
			// 1. form 객체 호출  document.querySelectorAll( 폼태그식별자 )
			let signupForm = document.querySelectorAll('.signupForm')[0];
				console.log( signupForm );
			// 2. form 데이터 객체화
				// 일반객체로 첨부파일 전송X -> FormData객체 이용시 첨부파일 전송 가능 
			let signupData = new FormData( signupForm ); // 첨부파일 [ 대용량 ] 시 필수..
				console.log( signupData );
				signupData.append("hrank" , hrankValue);
			// 3. AJAX 에게 첨부파일[대용량] 전송 하기 
				// 2. 첨부파일 있을때. [ 기존 json형식의 전송x form객체 전송 타입으로 변환 ]
				$.ajax({
					url : "/jspweb/HrmController" , 
					method: "post" ,			// form 객체 [ 대용량 ] 전송은 무조건 post 방식 
					data : signupData ,			// FormData 객체를 전송 
					contentType : false ,		// form 객체 [ 대용량 ]  전송타입 		
					processData : false ,
					success : r => { 
						if( r ){ // 회원가입성공 [ 1.알린다 2.페이지전환]
							alert('회원가입성공');
							hread();
						}
						else{ // 회원가입실패
							alert('회원가입실패[관리자문의]');
						}
					} ,
					error : e => { console.log(e) } ,
				})
	}else{
		alert('정상적으로 입력 안된 내용이 있습니다.');
	}
} // f end

// 출력 기능
// 2. Read ( 호출 ) : 방문록 호출 함수 = vread
hread(); // JS 열릴때 1번 실행
function hread() { // 실행조건 : JS 열릴때 1번 실행 , 등록성공했을때 , 수정성공했을때 , 삭제성공했을때 => 최신화[화면 새로고침]
	$.ajax({
		url : "/jspweb/HrmController" , 
		method : "get" ,
		data : "" ,
		success : function f(r){ console.log(r); 
			
			// - 응답 받은 객체를 HTML에 출력
			// 1. [어디에] 출력할 구역의 객체 호출
			let output = document.querySelector('.hlist');
			
			// 2. [무엇을] 반복문 이용한 데이터를 HTML 형식으로 만들기
			let html = ``; // ` 백틱
			
				// 리스트내 모든 데이터를
				for( let i = 0; i< r.length; i++ ){
					// 리스트내 모든 객체의 데이터를 HTML 형식으로 HTML변수에 누적 더하기 
					html += `<div class="hlistbox"><!-- 방문록 1개의 표시구역 -->
								<div class="hlist_top">
									<div> ${ r[i].hno +" | " } </div>
									<img class="box_himg" src="/jspweb/과제/hrm/img/${r[i].himg}">
									<div> ${ " | "+ r[i].hname +" | " } </div>
									<div> ${ r[i].hphone +" | " } </div>
									<div> ${ r[i].hrank +" | "} </div>
									<div> ${ r[i].hdate  } </div>
								</div>	
								<div class="bookbox_bottom">
									<button onclick="hupdate( ${ r[i].hno })" type="button">수정</button>
									<button onclick="hdelete( ${ r[i].hno })" type="button">삭제</button>
								</div>
							</div>`
				}
			// 3. [대입] 출력객체 HTML형식 대입 
			output.innerHTML = html;
		
		},
		error : function f(r){}
	})
} // f e
