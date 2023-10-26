

// 1. list.jsp에서 클릭된 제목의 bno를 전달받아 게시물 1개 가져오기
getBoard();
function getBoard(){
	// 1. URL에 있는 매개변수(쿼리스트링) 가져오기
		// 1. 현재 주소(url)상 매개변수 가져오기 
	let urlParams = new URL(location.href).searchParams
		console.log( urlParams );
	let bno = urlParams.get("bno"); // rul주소에서 bno의 데이터 가져오기 
		// new URL(location.href).searchParams.get("매개변수명")
		console.log( bno );
	
	// 2. AJAX 이용한 bno 전달해서 게시물의 상세 정보 모두 가져오기
	$.ajax({
		url : "/seolhwamin/BoardInfoController" ,
		method: "get" , 
		data : { type : 2 , bno : bno } , 
		success : r => {  console.log(r);
			// 1. 
			let boardBox = document.querySelector('.boardBox')
			let fileLink = r.bfile ? `<a href="/seolhwamin/FileDownLoad?filename=${r.bfile}">${r.bfile}</a>` : '첨부 파일 없음';
			// 2. HTML 구성 
			let html = `<div class="content_top">
							<div class="content_top2"> 
								<div class="btitle"> ${ r.btitle } </div>
								<div class="top_left">
									<div class="top_left2">
									<div style="display:flex;">
									<img src="/seolhwamin/member/img/${ r.mimg }" width="25px" /> 
									<div style="margin-right:5px;"> ${ r.mnickname } </div>
									</div>
									<span style="color:#CCC"> | </span>
									<div style="margin-left:5px;"> ${ r.bdate }  </div>
									</div>
									<div> 조회 ${ r.bview }  </div>
								</div>
							</div> 
							
						</div>
						<div class="content">${ r.bcontent }</div>
						<div class="filebox">
						<p style="margin: 0px 0px; !important">원본 첨부파일</p>
						<div class="bfilebox">${fileLink}</div>
						</div>
						`
						/* <a href=" HTTP get메소드방식 "> </a> */
				
				html += '<a href="list.jsp"><button class="bottom" type="button">목록보기</button></a>';
				//. 3. 만약에 본인글 인지 제어 [ 본인글이면 수정/삭제 표시함 / 아니면 표시안함]
				if( r.ishost || loginMid == "seolhwamin" ){
					html += `
						<button  class="bottom" onclick="ondelete(${ r.bno })" type="button">삭제</button>
						<button  class="bottom" onclick="onUpdate(${ r.bno })" type="button">수정</button>
						`
				}
			// 3.
			boardBox.innerHTML = html;
		} , 
		error : e => { console.log(e) }
	})
} // f end 
// 2. 게시물 삭제 -> 레코드 삭제 -> 레코드 식별 -> pk
function ondelete( bno ){
	$.ajax({
		url : "/seolhwamin/BoardInfoController" ,
		method: "delete" , 
		data : { bno : bno } , 
		success : r => { console.log(r); 
			if( r ){
				alert('삭제 성공');
				location.href="/seolhwamin/board/list.jsp";
			}else{ alert('삭제 실패'); }
		} , 
		error : e => { console.log(e); }
	})
} // f end 
// 3. 게시물 수정 페이지로 이동 
function onUpdate( bno ){
	// 1. 수정페이지로 이동
	location.href=`/seolhwamin/board/update.jsp?bno=${ bno }`;
} // f end 