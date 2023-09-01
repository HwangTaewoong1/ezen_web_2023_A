<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/board/list.css" rel="stylesheet">
</head>
<body>
	<!-- HEADER -->
	<%@include file="../header.jsp"%>
		
	<div class="webcontainer"> <!-- 전체 웹구역 -->
		
			<button onclick="onWrite()" type="button" class="btn">글쓰기</button>
			
	</div>	<!-- 전체 웹 end -->
	<!-- jquery 최신 라이브러리 호출 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/board/list.js" type="text/javascript"></script>
</body>
</html>