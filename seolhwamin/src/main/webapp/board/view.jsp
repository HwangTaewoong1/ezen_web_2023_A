<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="../img/눈송이.ico">
<meta charset="UTF-8">
<title>눈송이들 놀이터</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="/seolhwamin/css/board/view.css" rel="stylesheet"/>
</head>
<body>

	<!-- JSP파일안에 다른 JSP 파일 import 하기 -->
	<%@include file = "../header.jsp" %>
	
	<div class="webcontainer">
		<h3 style="border-bottom: solid 2px #C7CBFF; padding-bottom: 10px;"> 자유게시판 </h3>
		<div class="boardBox"></div>
		<div class="commentcontainer">
		<div class="totalcomment"></div>
		<div class="commentBox"></div>
			   <div class="idbox">
				     <input type="text" maxlength="255" class="commentinput" placeholder="댓글 내용 작성">
				     <button class="commentbtn" type="button">작성</button>
			  </div>
		</div>
		<div class="bottomBox"></div>
	</div>
	
	<!-- JSP파일안에 다른 JSP 파일 import 하기 -->
	<%@include file = "../footer.jsp" %>
	
	<script src="/seolhwamin/js/board/view.js" type="text/javascript"></script>


</body>
</html>