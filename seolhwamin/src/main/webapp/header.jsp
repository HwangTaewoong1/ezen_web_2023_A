<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="./img/눈송이.ico">
<meta charset="UTF-8">
<title>눈송이 월드 헤더</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="/seolhwamin/css/member/header.css" rel="stylesheet">
</head>
<body>
	<!-- 헤더 -->
	<div id="header">	
		
		<div class=mainlogo> <!-- 로고 -->
			<a href="/seolhwamin/seolhwaminS2.jsp">
				<img alt="" src="/seolhwamin/img/눈송이월드.png" />
			</a>
		</div>
		<ul class="mainmenu"> 	<!-- 본메뉴 -->
			<li> <a href="/seolhwamin/noticeboard/noticelist.jsp">공지사항</a> </li>
			<li> <a href="/seolhwamin/1000Day/1000Day.jsp"> 화민이의 1000일을 축하합니다!</a> </li>
			<li> <a href="/seolhwamin/board/list.jsp">자유 게시판</a> </li>

		</ul>
		<!-- 서브메뉴 : js에서 로그인상태에 따라 html 구성 대입 -->
		<ul class="submenu"> </ul>
		
	</div>
	
	<!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script  src="/seolhwamin/js/member/header.js"></script>
	
</body>
</html>

<!-- 
	헤더는 많은 페이지에서 참조하는 페이지 이므로 공통적인 코드 
	1. 라이브러리 
		1. JQUERY : <script  src="http://code.jquery.com/jquery-latest.min.js"></script>  
 -->

<!-- 404 : 경로문제 [ 1.그 경로/파일 없거나 , 2.있는데 경로에 오타 ] -->
<!-- 
	../ : 상위 경로 1번 이동 

	상대경로 : 현위치 기준으로 경로 작성.
		visitlog/visitlog.jsp
	절대경로 : 모든 경로 작성.
		http://localhost/jspweb/visitlog/visitlog.jsp
		- 헤더파일은 불특정 페이지 경로에서 사용되므로 절대경로 링크 권장 
		(생략가능)/jspweb/visitlog/visitlog.jsp
 -->