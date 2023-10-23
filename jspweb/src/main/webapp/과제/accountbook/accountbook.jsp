<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<!-- css import -->
	<link href="accountbook.css" rel="stylesheet" />
	
</head>
<body>
	<h1 class="title">황태웅 가계부</h1>
	<div class="bookwrap"> <!-- 전체구역 -->
		<div class="book_Top"> <!-- 쓰기 구역  -->
			<div class="book_Inputs">
				<input class="vcontent" type="text" placeholder="항목내용">
				<input class="vmoney" type="text" placeholder="금액">
				<input class="vdate" placeholder="날짜"></textarea>
			</div>
			<button onclick="vwrite()" type="button">등록</button>
		</div>
		<div class="book_bottombar">
		<div> 항목내용 </div> <div> 금액 </div> <div> 날짜</div>
		</div>
		<div class="book_Bottom"> <!-- 출력 구역  -->
		
			<!-- js가 출력해주는 구역 -->
			
			
		</div>
	
	</div>
	
	<!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- js import -->
	<script src="accountbook.js" type="text/javascript"></script>
	
	
</body>
</html>