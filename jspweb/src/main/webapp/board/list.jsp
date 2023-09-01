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
			
		<div> <!-- 카테고리 구역 -->
			<div>공지사항</div>
			<div>자유게시판</div>
			<div>노하우</div>
		</div>	<!-- 카테고리 구역 end -->
		<div>
			<thead>
				<tr>
					<th scope="col" class="th_num2">게시물번호</th>
					<th scope="col" class="th_subject">제목</th>
					<th scope="col" class="th_name">글쓴이</th>
					<th scope="col" class="th_num">조회</th>
					<th scope="col" class="th_datetime">날짜</th>
				</tr>
			</thead>
		</div>
		<div> <!-- js 게시물이 출력될 구역 -->
		
		</div>
			
			
	</div>	<!-- 전체 웹 end -->
	<!-- jquery 최신 라이브러리 호출 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/board/list.js" type="text/javascript"></script>
</body>
</html>