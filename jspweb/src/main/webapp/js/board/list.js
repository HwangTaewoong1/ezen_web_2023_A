
// 1. 글쓰기 버튼을 클릭하면
function onWrite(){
	if( loginState ){// - 로그인이면
		
	location.href="/jspweb/board/write.jsp";
	}else{// - 만약에 비 로그인이면
		alert('로그인 후 글쓰기 가능합니다.')
		location.href="/jspweb/member/login.jsp";
	}
	
	
	
}
