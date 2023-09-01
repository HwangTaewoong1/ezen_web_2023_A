
// 1. 글쓰기 버튼을 클릭하면
function onWrite(){
	if( loginState ){// - 로그인이면
		
	location.href="/jspweb/board/write.jsp";
	}else{// - 만약에 비 로그인이면
		alert('로그인 후 글쓰기 가능합니다.')
		location.href="/jspweb/member/login.jsp";
	}
		
}


// 2. 모든 글 조회 [ js열렸을때 1회 자동실행 ]
getList()
function getList(){
	
	$.ajax({
		url : "/jspweb/BoardInfoController" ,
		method : "get" ,
		data : {} ,
		success : r =>{ console.log(r) 
			
			// 1. 출력할 위치 
			let boardTable = document.querySelector('.boardTable');
			
			// 2. 출력할 내용 구성
			let html = `<tr> <th> 번호 </th> <th> 카테고리 </th>
						<th> 제목 </th> <th> 작성자 </th>
						<th> 조회수 </th> <th> 작성일 </th> </tr>`
				// * 서블릿으로 부터 전달받은 내용[배열] 반복해서 html 구성
				// 배열명.forEach // java -> ,  js =>  
				r.forEach( b => {
					console.log(b);
					html += `<tr> 
								<th> ${ b.bno } </th> 
								<th> ${ b.bcname } </th>
								<th> ${ b.btilte } </th> 
							 	<th> ${ b.bmid } </th>
							 	<th> ${ b.bview } </th> 
							 	<th> ${ b.bdate } </th> 
							 </tr>`
				} ); // f e		
			// 3. 구성된 html내용을 출력 
			boardTable.innerHTML = html;
		} ,
		error : e => {} 
	})
}