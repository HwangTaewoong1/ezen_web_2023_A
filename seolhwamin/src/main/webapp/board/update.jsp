<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 썸머노트 위한 부트스트랩css,썸머노트css -->
		<!-- 부트스트랩에서 만든 CSS 적용 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<!-- 썸머노트 css 적용 - 부트스트랩v5 -->
	<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/summernote-lite.min.css" rel="stylesheet">
	<link href="/seolhwamin/css/board/write.css" rel="stylesheet"/>
</head>
<body>

	<%@include file = "../header.jsp" %>
	<div class="webcontainer">
		<h3 style="border-bottom: solid 2px #C7CBFF; padding-bottom: 10px;"> 자유게시판 </h3>
		<form class="writeForm"> <!-- 쓰기 입력 구역 -->
			<div style="display:flex;">
		<p class="categorytext">카테고리</p>
			<div class="selectbox"></div>	
			</div>
			
			<input type="text" name="btitle" class="btitle" placeholder="제목을 입력해 주세요." > <br/>
			
			<textarea id="summernote" name="bcontent" class="bcontent"></textarea> <br/>
			<div style="display:flex;">
			<p class="filetext">첨부파일</p>
			<input type="file" name="bfile" class="bfile"> <br/>
			</div>
			
			<button class="bottom" onclick="onUpdate()" type="button">글수정</button> 
			<a href="list.jsp"><button class="bottom" type="button"> 목록보기</button> </a>
		</form>
	</div>
	
		<!-- 부트스트랩에서 만든 JS 적용 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
	<!-- 썸머노트 js 적용 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/summernote-lite.min.js"></script>
	<!-- 썸머노트 한글적용  -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/lang/summernote-ko-KR.min.js"></script>

	<script src="../js/board/update.js" type="text/javascript"></script>

	<%@include file = "../footer.jsp" %>
</body>
</html>