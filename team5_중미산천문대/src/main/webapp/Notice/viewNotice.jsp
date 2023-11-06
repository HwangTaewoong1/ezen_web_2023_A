<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중미산 천문대</title>

<!-- 뷰포트 : 반응형 동작 코드  -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 부트스트랩에서 만든 CSS 적용 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">

<link href="http://www.astrocafe.co.kr/css/default.css?ver=171222"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700&amp;subset=korean"
	rel="stylesheet" type="text/css">
<link href="../Headerfont-awesome.min.css" rel="stylesheet">
<link href="../Headerslick.css" rel="stylesheet">
<link href="../Header/style.css" rel="stylesheet">
<link href="../Header/default.css" rel="stylesheet">
<link href="Notice.css" rel="stylesheet">
<link href="viewNotice.css" rel="stylesheet"> 

</head>
<body>

	<div id="wrap">
		<a href="#skipcon" class="skip">본문 바로가기</a>

		<!-- HEADER -->
		<%@include file="../Header/Header.jsp"%>

		<div id="sub">

			<%@include file="../Header_bar/Header_bar.jsp"%>

			<div id="skipcon">
				<div id="sub_contents">

					<!-- SUB MENU -->
					<div class="sub_lnbwrap">
						<h3>공지사항</h3>
						<div class="m_menu">
							<h3 class="hide">하위메뉴보기</h3>
							<a href="#none"> 공지사항 </a> <span></span>
						</div>
						<ul class="sub_lnb">
							<li><a href="Notice.jsp">공지사항</a></li>
							<li><a href="">관측대상</a></li>
							<li><a href="">이벤트</a></li>

						</ul>
						<div class="minbanner">
							<a href="https://talk.naver.com/ct/wc3wsn" target="_blank">
								<h2>중미산천문대</h2> <span>네이버톡톡 문의하기</span>
							</a>
						</div>
					</div>

					<!-- SUB CONTENTS AREA -->
					<div class="sub_conwrap">
						<div class="subtit">
							<h3>공지사항</h3>

							<div class="breadcrumb">
								<img style="width : 17px; height : 14px" src="../img/ico_home.png" alt=""><strong>HOME
									<span>&gt;</span> 공지사항
								</strong>
							</div>
						</div>

						<div class="container">
							<!-- 부트스트랩 적용 -->
							<h5 class="title">게시물 제목 출력 구역</h5>
							<p class="writerdate">작성자와 작성일 출력되는 구역</p>
							<div class="row justify-content-md-center">
								<div class="content" style="min-height: 200px; height: auto !important;">게시물
									내용이 출력되는 구역</div>
							</div>
						</div>

						<div style="display : flex; align-items: center">
							<div class="col-1">
								<input onclick="onDelete()" class="form-control btn btn-dark"
									type="button" value="삭제하기">
							</div>
							<div class="col-1" style="margin-left : 650px; height: 40px;">
								<a href="Notice.jsp"><input class="form-control"
									type="button" value="목록보기"></a>
							</div>
						</div>
						
					</div>
					<!-- sub_conwrap end-->
				</div>
				<!-- sub_contents end-->
			</div>
			<!-- skipcon end -->
		</div>
		<!-- sub end -->
	</div>
	<!--Wrap end -->
	<!-- Footer 삽입 -->
						<%@include file="../Footer/Footer.jsp"%>

	<!-- 부트스트랩에서 만든 JS 적용 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
	<script src="viewNotice.js" type="text/javascript"></script>

</body>
</html>