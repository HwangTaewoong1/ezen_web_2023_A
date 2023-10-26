vread();
function vread() {
  $.ajax({
    url: "/seolhwamin/VisitLogController",
    method: "get",
    data: "",
    success: function f(r) {
      console.log(r);

      // - 응답 받은 객체를 HTML에 출력
      // 1. [어디에] 출력할 구역의 객체 호출
      let output = document.querySelector('.dayul');

      // 2. [무엇을] 반복문 이용한 데이터를 HTML 형식으로 만들기
      let html = ``; // ` 백틱

      // 리스트내 모든 데이터를
      for (let i = 0; i < 8 && i < r.length; i++) {
        // 리스트내 모든 객체의 데이터를 HTML 형식으로 HTML변수에 누적 더하기
        html += `<div class="visitbox">
			          	<a class="vcontent" href="/seolhwamin/1000Day/1000Day.jsp">${r[i].vcontent}</a>	 
			            <div class="visitdate"> ${r[i].vdate} </div>
          		</div>`;
      }

      // 3. [대입] 출력객체 HTML형식 대입
      output.innerHTML = html;
    },
    error: function f(r) {}
  });
}

let pageOject = { 
	type : 1 , bcno : 1  , listsize : 8 ,  // * type : 1:전체조회 , 2:개별조회 // * bcno : 조회할 카테고리 번호 [ 기본값은 전체보기 ] // * listsize : 하나의 페이지에 최대표시할 게시물수 [ 기본값은 10개 ]
	page : 1 , key : '' , keyword : ''  
	// * page : 조회할 페이지번호  // key : 검색할 기준 필드명 // keyword : 검색할 데이터
}
getList();
function getList(){
	$.ajax({
		url : "/seolhwamin/NoticeBoardInfoController" , 
		metdod : "get" ,
		data : pageOject , 
		success : pageDto => { console.log( pageDto ); 

			// 1. 출력할 위치 
			let boardTable = document.querySelector('.noticeul');
			// 2. 출력할 내용 구성
			let html = ``; 
				// * 서블릿으로부터 전달받은 내용[배열] 반복해서 html 구성
				// 배열명.forEach( 반복변수명 => { 실행코드 } )			 // java ->  ,  js =>
				pageDto.noticeboardList.forEach( b => {
					html += `<div class="visitbox">	
								<a class="vcontent" href="/seolhwamin/noticeboard/noticeview.jsp?bno=${ b.bno }"> ${ b.btitle } </a>
								<div class="visitdate">${ b.bdate } </div>
							</div>`
				} ); // for end 
			// 3. 구성된 html내용을 출력 
			boardTable.innerHTML = html;
		}, 
		error : e => {}
	})
}
let pageOject2 = { 
	type : 1 , bcno : 2  , listsize : 8 ,  // * type : 1:전체조회 , 2:개별조회 // * bcno : 조회할 카테고리 번호 [ 기본값은 전체보기 ] // * listsize : 하나의 페이지에 최대표시할 게시물수 [ 기본값은 10개 ]
	page : 1 , key : '' , keyword : ''  
	// * page : 조회할 페이지번호  // key : 검색할 기준 필드명 // keyword : 검색할 데이터
}
getList2();
function getList2(){
	$.ajax({
		url : "/seolhwamin/BoardInfoController" , 
		metdod : "get" ,
		data : pageOject2 , 
		success : pageDto => { console.log( pageDto ); 

			// 1. 출력할 위치 
			let boardTable = document.querySelector('.freeul');
			// 2. 출력할 내용 구성
			let html = ``; 
				// * 서블릿으로부터 전달받은 내용[배열] 반복해서 html 구성
				// 배열명.forEach( 반복변수명 => { 실행코드 } )			 // java ->  ,  js =>
				pageDto.boardList.forEach( b => {
					html += `<div class="visitbox">	
								<a class="vcontent" href="/seolhwamin/board/view.jsp?bno=${ b.bno }"> ${ b.btitle } </a>
								<div class="visitdate">${ b.bdate } </div>
							</div>`
				} ); // for end 
			// 3. 구성된 html내용을 출력 
			boardTable.innerHTML = html;
		}, 
		error : e => {}
	})
}