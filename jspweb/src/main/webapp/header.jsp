<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/jspweb/css/member/header.css" rel="stylesheet">
</head>
<body>

	<!-- 헤더 -->
	<div id="header">
		<div class="mainlogo"> 
			<a href="/jspweb/index.jsp">
				<img alt="" src="/jspweb/img/ezenlogo.png">
			</a>
		</div>
		<ul class="mainmenu"> <!-- 본메뉴 -->
			<li> <a href="/jspweb/visitlog/visitlog.jsp">방문록</a> </li>
			<li> <a href="/jspweb/board/list.jsp">게시판</a> </li>
			<li> <a href="/jspweb/datago/datago.jsp">공공데이터</a> </li>
			<li> <a href="/jspweb/chatting/chatting.jsp">채팅</a> </li>
			<li> <a href="/jspweb/과제/accountbook/accountbook.jsp">과제1:가계부</a> </li>
			<li> <a href="/jspweb/과제/library/library.jsp">과제2:열람실</a> </li>
			<li> <a href="/jspweb/과제/hrm/hrm.jsp">과제3:인사관리</a> </li>
		</ul>
		<ul class="submenu"> <!-- 서브메뉴 -->
			<li> <a href="/jspweb/member/signup.jsp">회원가입</a> </li>
			<li> <a href="/jspweb/member/login.jsp">로그인</a> </li>
			<li> <a href="">로그아웃</a> </li>
			<li> <a href="">마이페이지</a> </li>
			<li><img class="hmimg" src="img/default.webp"> </li>
		</ul>
	</div>
	
	<!-- 최신 jquery import ajax사용 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/jspweb/js/member/header.js" type="text/javascript"></script>
</body>
</html>