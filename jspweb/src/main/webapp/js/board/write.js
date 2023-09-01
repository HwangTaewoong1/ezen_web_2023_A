
// write , update , delete : js 내장함수들 존재하기 때문에 이름충돌

function bwrite(){
	
	// 1. form 가져오기
	let writeForm = document.querySelectorAll('.writeForm')[0];
	console.log( writeForm );
	
	// 2. form 객체화 하기
	let writeData = new FormData( writeForm ); // 첨부파일 [ 대용량 ] 시 필수..
				console.log( writeData );
	// 3. ajax로 대용량 form 전송하기
	$.ajax({
					url : "/jspweb/BoardInfoController" , 
					method: "post" ,			// form 객체 [ 대용량 ] 전송은 무조건 post 방식 
					data : writeData ,			// FormData 객체를 전송 
					contentType : false ,		// form 객체 [ 대용량 ]  전송타입 		
					processData : false ,
					success : r => { 
						if( r ){ // 글쓰기 성공 [ 1.알린다 2.페이지전환]
							alert('글 등록 성공');
							location.href = '/jspweb/board/list.jsp';
						}
						else{ // 회원가입실패
							alert('글 등록 실패[관리자문의]');
						}
					} ,
					error : e => { console.log(e) } ,
			})
} // f e