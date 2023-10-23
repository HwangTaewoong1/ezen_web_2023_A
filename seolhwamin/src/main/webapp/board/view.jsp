<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- JSP파일안에 다른 JSP 파일 import 하기 -->
	<%@include file = "../header.jsp" %>
	
	<div class="webcontainer">
		<h3> 글 상세 페이지 </h3>
		<div class="boardBox">
		</div>
	</div>
	
	<!-- JSP파일안에 다른 JSP 파일 import 하기 -->
	<%@include file = "../footer.jsp" %>
	
	<script src="/seolhwamin/js/board/view.js" type="text/javascript"></script>


</body>
</html>