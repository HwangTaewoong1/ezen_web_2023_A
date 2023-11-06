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
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- 썸머노트 css 적용 - 부트스트랩v5 -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/summernote-lite.min.css"
	rel="stylesheet">

<!-- css 링크 연결  -->
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

						<!-- 글쓰기 본문 -->
						<div class="container">
							<input class="form-control my-3 title" type="text"
								placeholder="제목">
							<textarea id="summernote" class="form-control  my-3" rows="10"></textarea>
							<input class="form-control  my-3" type="file" />

							<div class="row justify-content-md-center g-3">
								<div class="col-1" style="margin-right: 800px;">
									<input onclick="onWrite()" class="form-control btn btn-dark"
										type="button" onclick="onWrite()" value="등록">
								</div>
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
	
	<!-- 푸터 출력 -->
						<%@include file="../Footer/Footer.jsp"%>
	
	
	<!-- 부트스트랩에서 만든 JS 적용 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

	<!-- jquery : js 최신 라이브러리  -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>

	<!-- 썸머노트 js 적용 -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/summernote-lite.min.js"></script>

	<!-- 썸머노트 한글적용  -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.20/lang/summernote-ko-KR.min.js"></script>

	<!-- JS 호출 -->
	<script src="writeNotice.js" type="text/javascript"></script>

</body>
</html>









