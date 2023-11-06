// 1. 쿠키에 있는 배열 호출 [ 페이지[JS] 열리면 ]
let boardList = JSON.parse( localStorage.getItem('boardList') );
	/* 쿠키/세션에 저장된 객체/배열 호출시 JSON.parse( )
	 쿠키/세션에 저장된 객체/배열 저장시 JSON.stringify( ) */
if(boardList == null) boardList= [  ] // 만약에 쿠키가 비어 있으면 비어있는 배열 생성

boardPrint();
// 1. 게시물 출력 함수 [ 페이지[JS] 열리면 ]
function boardPrint(){
	// 1. 어디에
	let tcontent= document.querySelector('.tcontent')
	// 2. 무엇을
	let html = 
	
	
	tcontent.innerHTML;
		// HTML 구성 : 쿠키에서 꺼내온 배열을 반복문 해서 HTML 누적 더하기
		for ( let i = 0; i<boardList.length; i++){
			let board = boardList[i]; 	// i번쨰 게시물 호출
			html += ` <tr>
					<td class="td_num2"> ${ board.no } </td> 
					<td class="td_subject" style="padding-left: 0px" 
						onclick="onViewLoad( ${ board.no } )">
							<div class="bo_tit">
							<a href="viewNotice.jsp">
						 	${ board.title }
							</a>
							<i class="fa fa-heart" aria-hidden="true"></i>
							</div>
					</td> 
					<td class="td_name sv_use"> <span class="sv_member"> ${ board.writer } </span></td>
					<td class="td_num"> ${ board.view } </td>
					<td class="td_datetime">${(new Date(board.date).getMonth() + 1).toString().padStart(2, '0')}-${new Date(board.date).getDate().toString().padStart(2, '0')}</td> 
				</tr>`
		}
	// 3. 대입
	tcontent.innerHTML = html;
}

// 2. 상세 페이지로 이동 [ 실행조건 : 클릭한 게시물 제목 ]
function onViewLoad( no ){ // 인수 : 클릭한 제목(게시물)의 번호
	console.log( ' 현재 클릭된 제목(게시물)의 번호  : ' + no);
	// 클릭된 결과를 다른페이지로 옮기는 방법
		// JS는 페이지가 전환/새로고침 초기화 -> // 세션/쿠키
	// 1. 클릭된 게시물 번호 세션에 저장
	sessionStorage.setItem( 'no' , no ) 
	 //* 조회수 증가 함수 호출
	increaseView( no )
	// 2. 페이지 이동
	location.href = "viewNotice.jsp";	
}

// 3. 조회수 증가함수 [ 실행조건 : 제목 클릭 후 페이지 전환 전에]
function increaseView( no ){
	// 1. 클릭된 게시물번호의 게시물찾기
	for( let i = 0; i<boardList.length; i++){
		if( boardList[i].no == no){ // 찾았다
			// 조회수 1 증가
			boardList[i].view++;
			// * 만약에 세션/쿠키를 사용중이라면 업데이트
			localStorage.setItem( 'boardList' , JSON.stringify( boardList ) )
			break;			
		}
	}
}// f end