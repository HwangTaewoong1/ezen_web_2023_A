<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="../img/눈송이.ico">
	<meta charset="UTF-8">
	<title>화민이의 1000일을 축하합니다!</title>
	
	<!-- css import -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="1000Day.css" rel="stylesheet" />
	
</head>
<body>

	<%@include file = "../header.jsp" %>
	
	<!-- CRUD 기반의 비회원 게시판/방문록 구현 -->
	<div class="visitwrap"> <!-- 전체구역 -->
	
		<div class="visit_Top"> <!-- 쓰기 구역  -->
			
			<textarea class="vcontent" placeholder="화민이의 1000일을 축하해주세요!"></textarea>
			<button onclick="vwrite()" type="button">등록</button>
			
		</div>
	
		<div class="visit_Bottom"> <!-- 출력 구역  -->
			<!-- js가 출력해주는 구역 -->
			
			
		</div>
	
	</div>
	
	<!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- js import -->
	<script src="1000Day.js" type="text/javascript"></script>
	
	<%@include file ="../footer.jsp" %>
</body>
</html>