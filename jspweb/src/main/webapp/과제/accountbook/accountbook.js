console.log('accountbook.js 열림');

// 1. Create ( 저장 ) : 방문록 등록 함수 = vwrite
function vwrite() {
	
	// 1. HTML input 태그 객체 호출 
		// document.querySelector('.vwriter')
	let vcontentInput = document.querySelector('.vcontent');	console.log( 'vcontentInput:' + vcontentInput );
	let vmoneyInput = document.querySelector('.vmoney');		console.log( 'vmoney:' + vmoneyInput );
	let vdateInput = document.querySelector('.vdate'); 			console.log( 'vdate:' + vdateInput );
	// 2. 객체화 
		// let 변수명 = { 속성명 : 데이터 , 속성명 : 데이터 }
	let info = {
		vcontent : vcontentInput.value , 
		vmoney : vmoneyInput.value , 
		vdate : vdateInput.value , 
	}; console.log( info );
	// 3. *유효성검사
	// 4. AJAX ( HTML에 JQUERY 라이브러리 필수로 호출 )
	$.ajax({
		url : "/jspweb/Accountbook",
		method : "post",
		data : info ,
		success : function f( r ){ console.log( r ); 
			if( r == true ){ 
				alert('등록성공');  vread();
				// 등록 성공시 HTML에서 작성한 INPUT 내용들 공백으로 초기화
				vcontentInput.value = '';  vmoneyInput.value = '';  vdateInput.value = '';
			}
			else{ alert('등록실패');}
		} ,
		error : function f(r){}
	})
		// 5. 결과에 따른 코드 
		
} // f e

// 2. Read ( 호출 ) : 방문록 호출 함수 = vread
vread(); // JS 열릴때 1번 실행
function vread() { // 실행조건 : JS 열릴때 1번 실행 , 등록성공했을때 , 수정성공했을때 , 삭제성공했을때 => 최신화[화면 새로고침]
	$.ajax({
		url : "/jspweb/Accountbook" , 
		method : "get" ,
		data : "" ,
		success : function f(r){ console.log(r); 
			
			// - 응답 받은 객체를 HTML에 출력
			// 1. [어디에] 출력할 구역의 객체 호출
			let output = document.querySelector('.book_Bottom');
			
			// 2. [무엇을] 반복문 이용한 데이터를 HTML 형식으로 만들기
			let html = ``; // ` 백틱
			
				// 리스트내 모든 데이터를
				for( let i = 0; i< r.length; i++ ){
					// 리스트내 모든 객체의 데이터를 HTML 형식으로 HTML변수에 누적 더하기 
					html += `<div class="bookbox"><!-- 방문록 1개의 표시구역 -->
								<div class="bookbox_top">
									<div> ${r[i].vcontent} </div>
									<div> ${r[i].vmoney} </div>
									<div> ${r[i].vdate} </div>
								</div>	
								<div class="bookbox_bottom">
									<button onclick="vupdate( ${ r[i].vno })" type="button">수정</button>
									<button onclick="vdelete( ${ r[i].vno })" type="button">삭제</button>
								</div>
							</div>`
				}
			// 3. [대입] 출력객체 HTML형식 대입 
			output.innerHTML = html;
		
		},
		error : function f(r){}
	})
} // f e


// 3. update ( 수정 ) : 방문록 수정 함수 = vupdate
	// 누구를(클릭된방문록vno) 어떻게(새롭게 입력받아vcontent) 수정할껀지
function vupdate( vno ) { console.log('vupdate() open: ' + vno)
	
	// 1. 수정할 내용 입력
	let vcontent = prompt('수정할 항목내용: ');  // alert(): 확인 알림창  confirm(): 확인/취소 알림창 prompt(): 알림창에서 입력받기
	let vmoney = prompt('수정할 금액 : ');
	let vdate = prompt('수정할 날짜 : ')
	// 수정 준비물 : vno(누구를) , vcontent(어떤내용으로)
	$.ajax({
		url: "/jspweb/Accountbook" , // 통신할 백엔드(컨트롤러 서블릿 주소) 
		method : "put",
		data: { vno : vno , vcontent : vcontent , vmoney : vmoney  , vdate : vdate },
		success : function f(r){ console.log("doPut통신성공"); 
		
		if( r == true ){ alert('수정 성공');  vread();}
			else{ alert('수정 실패');}
		
		} ,
		error : function f(r){ console.log(r); } 
	})
	
} // f e 


// 4. delete ( 삭제 ) : 방문록 삭제 함수 = vdelete
function vdelete( vno ) {  console.log('vdelete() open: ' + vno)
	
	$.ajax({
		url: "/jspweb/Accountbook" ,
		method : "delete",
		data: { vno : vno },
		success : function f(r){ console.log("doDelete통신성공"); 
			if( r == true ){ alert('삭제 성공');  vread();}
			else{ alert('삭제 실패]비밀번호가 일치하지 않습니다.');}
		
		} ,
		error : function f(r){ console.log(r); } 
	})
	
} // f e 