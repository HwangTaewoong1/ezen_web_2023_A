console.log('visitlog.js 열림');

let vwriterInput=``;

// 1.로그인된 회원의정보 호출
getInfo();
function getInfo(){
	$.ajax({
		url : "/seolhwamin/MemberInfoController" , 
		method : "get" , 
		data : { type : "info" } ,
		success : r => { console.log(r)
			if( r == null ){ // 비로그인 상태 -> 페이지 차단
				alert('눈송이 전용 페이지입니다. [로그인] 페이지로 이동 ');
				location.href="/seolhwamin/member/login.jsp";
			}else{ // 로그인 상태 -> 마이페이지 구역에 정보 넣어주기 
				vwriterInput = r.mnickname;
			}
		}
	});
} // f end 
// 1. Create ( 저장 ) : 방문록 등록 함수 = vwrite
function vwrite() {
	
	// 1. HTML input 태그 객체 호출 
		// document.querySelector('.vwriter')
	let vcontentInput = document.querySelector('.vcontent');console.log( 'vwriterInput:' + vcontentInput );
	// 2. 객체화 
		// let 변수명 = { 속성명 : 데이터 , 속성명 : 데이터 }
	let info = {
		vwriter : vwriterInput , 
		vcontent : vcontentInput.value 
	}; console.log( info );
	// 3. *유효성검사
	// 4. AJAX ( HTML에 JQUERY 라이브러리 필수로 호출 )
	$.ajax({
		url : "/seolhwamin/VisitLogController",
		method : "post",
		data : info ,
		success : function f( r ){ console.log( r ); 
			if( r == true ){ 
				alert('등록성공');  vread();
				// 등록 성공시 HTML에서 작성한 INPUT 내용들 공백으로 초기화
 				 vcontentInput.value = '';
			}
			else{ alert('등록실패');
			
			}
		} ,
		error : function f(r){}
	})
		// 5. 결과에 따른 코드 
		
} // f e

// 2. Read ( 호출 ) : 방문록 호출 함수 = vread
vread(); // JS 열릴때 1번 실행
function vread() {
  $.ajax({
    url: "/seolhwamin/VisitLogController",
    method: "get",
    data: "",
    success: function f(r) {
      console.log(r);

      // - 응답 받은 객체를 HTML에 출력
      // 1. [어디에] 출력할 구역의 객체 호출
      let output = document.querySelector('.visit_Bottom');

      // 2. [무엇을] 반복문 이용한 데이터를 HTML 형식으로 만들기
      let html = ``; // ` 백틱

      // 리스트내 모든 데이터를
      for (let i = 0; i < r.length; i++) {
        // 리스트내 모든 객체의 데이터를 HTML 형식으로 HTML변수에 누적 더하기
        html += `<div class="visitbox"><!-- 방문록 1개의 표시구역 -->
          <div class="visitbox_top">
           	<div style="display:flex; align-items: center;">
            	<img class="vimg" src="/seolhwamin/member/img/${ r[i].vimg }">
            	<div class="vwriter" style="margin-left:10px; font-size:20px;"> ${r[i].vwriter} </div>
            </div>
            <div class="visitdate"> ${r[i].vdate} </div>
          </div>
          <div class="visitbox_center">${r[i].vcontent.replace(/\n/g, '<br>')}</div>
          <div class="visitbox_bottom">
          `;

        // 작성자와 게시물 작성자가 같을 때만 수정 및 삭제 버튼 추가
        if (vwriterInput == r[i].vwriter || loginMid == "seolhwamin" ) {
          html += `
            <button onclick="vupdate(${r[i].vno})" type="button">수정</button>
            <button onclick="vdelete(${r[i].vno})" type="button">삭제</button>
          `;
        }

        // 닫는 div 추가
        html += `</div></div>`;
      }

      // 3. [대입] 출력객체 HTML형식 대입
      output.innerHTML = html;
    },
    error: function f(r) {}
  });
}



// 3. update ( 수정 ) : 방문록 수정 함수 = vupdate
	// 누구를(클릭된방문록vno) 어떻게(새롭게 입력받아vcontent) 수정할껀지
function vupdate( vno ) { console.log('vupdate() open: ' + vno)
	
	// 1. 수정할 내용 입력
	let vcontent = prompt('수정할 방문록내용: ');  // alert(): 확인 알림창  confirm(): 확인/취소 알림창 prompt(): 알림창에서 입력받기
	// 수정 준비물 : vno(누구를) , vcontent(어떤내용으로) , vpwd(조건용:비밀번호 일치여부)
	$.ajax({
		url: "/seolhwamin/VisitLogController" , // 통신할 백엔드(컨트롤러 서블릿 주소) 
		method : "put",
		data: { vno : vno , vcontent : vcontent },
		success : function f(r){ console.log("doPut통신성공"); 
		
		if( r == true ){ alert('수정 성공');  vread();}
			else{ alert('수정 실패]비밀번호가 일치하지 않습니다.');}
		
		} ,
		error : function f(r){ console.log(r); } 
	})
	
} // f e 


// 4. delete ( 삭제 ) : 방문록 삭제 함수 = vdelete
function vdelete( vno ) {  console.log('vdelete() open: ' + vno)
	
	// 삭제 준비물 : vno(누구를) , vpwd(조건용:비밀번호 일치여부)
	$.ajax({
		url: "/seolhwamin/VisitLogController" ,
		method : "delete",
		data: { vno : vno },
		success : function f(r){ console.log("doDelete통신성공"); 
			if( r == true ){ alert('삭제 성공');  vread();}
			else{ alert('삭제 실패]비밀번호가 일치하지 않습니다.');}
		
		} ,
		error : function f(r){ console.log(r); } 
	})
	
} // f e 