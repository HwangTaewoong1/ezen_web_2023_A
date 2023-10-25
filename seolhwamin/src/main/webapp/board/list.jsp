<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="../img/눈송이.ico">
<meta charset="UTF-8">
<title>눈송이들 놀이터</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="/seolhwamin/css/board/list.css" rel="stylesheet"/>

</head>
<body>

	<%@include file = "../header.jsp" %>
	
	<div class="webcontainer">
	
		<!-- 1. 상단( 페이지 제목 ) -->
		<div class="boardtop">
			<h2> 자유 게시판 </h2>
			<div style="display:flex; justify-content: center; ">
			<img class="listimg" src="/seolhwamin/img/눈꽃.png">
			<p> 눈송이들 놀이터 </p>
			<img class="listimg" src="/seolhwamin/img/눈꽃.png">
			</div>
		</div>
		
		<!-- 2. 상단 부가 버튼 -->
		<div class="boardtopetc">
			<div>
				<select class="bbtn listsize" onchange="onListSize()">	<!-- 하나의 페이지에 표시할 최대 게시물수 -->
					<option value="10">10</option>
					<option value="15">15</option> 
					<option value="20">20</option>
				</select>
				<span class="boardcount"> 전체 게시물수 : 13 </span> <!-- 전체 게시물 수 -->
			</div>
			<button class="bbtn" onclick="onWrite()" type="button">글쓰기</button>
		</div>
		
		<!-- 3. 카테고리 구역  -->
		<div class="boardcategorybox">
			<button onclick="onCategory(0)" class="bbtn" type="button"> 전체보기 </button>
			<button onclick="onCategory(1)" class="bbtn" type="button"> 공지사항 </button>
			<button onclick="onCategory(2)" class="bbtn" type="button"> 자유게시판 </button>
			<button onclick="onCategory(3)" class="bbtn" type="button"> 노하우/팁 </button>
		</div>
		
		<!-- 4. 테이블 구역  -->
		<table class="boardTable"> </table>
		
		<div class="boardbottom">
		
			<!-- 5. 페이징처리 구역 -->
			<div class="pagebox"> </div>
			
			<!-- 6. 검색 구역 -->
			<select class="bbtn key">	<!-- 검색할 필드명 -->
				<!-- value="SQL에서 사용할 필드명 기준" -->
				<option value="b.btitle" >제목</option>
				<option value="b.bcontent" >내용</option>
				<option value="m.mnickname">작성자</option>
			</select>
			<input class="keyword" type="text"> <!-- 검색 내용 -->
			<button onclick="onSearch()" class="bbtn" type="button">검색</button>
			
		</div>
		
	</div>
	
	<script src="../js/board/list.js" type="text/javascript"></script>
	<%@include file = "../footer.jsp" %>
</body>
</html>