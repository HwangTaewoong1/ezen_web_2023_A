let pageOject = { 
	listsize : 5 , page : 1 
}

// 1. list.jsp에서 클릭된 제목의 bno를 전달받아 게시물 1개 가져오기
getBoard(1);
function getBoard( page ){
	
	pageOject.page = page;
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
		data : { type : 2 , bno : bno , listsize: pageOject.listsize , page : pageOject.page } , 
		success : r => {  console.log(r);
			// 1. 
			let boardBox = document.querySelector('.boardBox')
			let commentBox = document.querySelector('.commentBox')
			let bottomBox = document.querySelector('.bottomBox')
			let totalcomment = document.querySelector('.totalcomment')
			let fileLink = r.boardDto.bfile ? `<a href="/seolhwamin/FileDownLoad?filename=${r.boardDto.bfile}">${r.boardDto.bfile}</a>` : '첨부 파일 없음';
			// 2. HTML 구성 
			let html = `<div class="content_top">
							<div class="content_top2"> 
								<div class="btitle"> ${ r.boardDto.btitle } </div>
								<div class="top_left">
									<div class="top_left2">
									<div style="display:flex;">
									<img src="/seolhwamin/member/img/${ r.boardDto.mimg }" width="25px" /> 
									<div style="margin-right:5px;"> ${ r.boardDto.mnickname } </div>
									</div>
									<span style="color:#CCC"> | </span>
									<div style="margin-left:5px;"> ${ r.boardDto.bdate }  </div>
									</div>
									<div> 조회 ${ r.boardDto.bview }  </div>
								</div>
							</div> 
							
						</div>
						<div class="content">${r.boardDto.bcontent }</div>
						<div class="filebox">
						<p style="margin: 0px 0px; !important">원본 첨부파일</p>
						<div class="bfilebox">${fileLink}</div>
						</div>
						
						
						
						`
						/* <a href=" HTTP get메소드방식 "> </a> */
				boardBox.innerHTML = html;
				// ------------------------------------- 댓글 구역 --------------------------
				html = ``;
					html += `<div>총 댓글 수 : ${r.commentList.length}</div>`
				totalcomment.innerHTML = html;
				
				html= ``;	
					
				r.commentList.forEach(b => {
					html += `<div class="commentarea">
								<div class="commentnicknamebox"> 
									<div class="commentprofile">
										<img class="mimg" src="/seolhwamin/member/img/${ b.mimg }">
										<div class="mnickname"> ${b.mnickname} </div>
									</div>
									<div class="commentcontent">
										<div class="cmcontent"> ${b.cmcontent} </div>
										<div class="cmdate"> ${b.cmdate} </div>
									</div>
								</div>
							</div>`
				});
				commentBox.innerHTML += html;
				//----------------------------------페이징 처리 구역 ----------
				html = ``;
				// 페이지 개수만큼 페이징번호 구성 
				// page : 조회한 페이지번호 [ 현재 보고 있는 페이지번호 ]
				// 이전 버튼 [ page <= 1 ? page : page-1   만약에 1페이지에서 이전버튼 클릭시 1페이지로 고정 하고 아니면 1차감 ]
				html += `<button onclick="getBoard(${ r.page <= 1 ? r.page : r.page-1 })" type="button"> < </button>`
				
				// 페이지번호 버튼 [ * 마지막 페이지 까지 반복 ]
				for( let i = r.startbtn ; i<= r.endbtn ; i++ ){
					// class="${ page == i ? 'selectpage' : '' }"
					// 만약에 현재페이지(page) 와 i 같으면 버튼태그에 class="selectpage" 추가  
					html += `<button class="${ r.page == i ? 'selectpage' : '' }" onclick="getBoard(${i})" type="button"> ${i} </button>`
				}
				
				// 다음 버튼 [ page >= pageDto.totalpage ? page : page+1  만약에 현재페이지가 마지막페이지이면 고정 아니면 1증가 ]
				html += `<button onclick="getBoard(${ r.page >= r.totalpage ? r.page : r.page+1 })" type="button"> > </button>`;
						
				commentBox.innerHTML += html;
				// ----------------------------- 하단 목록/수정/삭제 버튼 ----------------------
				html = ``; //초기화
				
				html += '<a href="list.jsp"><button class="bottom" type="button">목록보기</button></a>';
				//. 3. 만약에 본인글 인지 제어 [ 본인글이면 수정/삭제 표시함 / 아니면 표시안함]
				if( r.ishost || loginMid == "seolhwamin" ){
					html += `
						<button  class="bottom" onclick="ondelete(${ r.bno })" type="button">삭제</button>
						<button  class="bottom" onclick="onUpdate(${ r.bno })" type="button">수정</button>
						`
				}
			// 3.
				bottomBox.innerHTML = html;
				html=``;
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