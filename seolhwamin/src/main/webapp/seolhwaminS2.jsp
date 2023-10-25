<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="./img/눈송이.ico">
<meta charset="UTF-8">
<title>눈송이 월드</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="css/index.css" rel="stylesheet">
</head>
<body>
	
	<!-- 헤더 include-->
	<%@include file ="header.jsp" %>
	
	<!-- 메인 배너 -->
	<video src="/seolhwamin/img/main.mp4" style="margin-left : 500px;
    width: 711px !important;" muted autoplay loop></video>
    
	<!--
		캐러셀(bs) : 이미지 슬라이드
	<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel" >
	  <div class="carousel-indicators">
	    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
	    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
	  </div>
	  <div class="carousel-inner">
	    <div class="carousel-item active" data-bs-interval="10000" >
	      <video src="/seolhwamin/img/main.mp4" style="margin-left : 500px;
    width: 711px !important;" muted autoplay loop></video>
	    </div>
	  </div>
	  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Previous</span>
	  </button>
	  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Next</span>
	  </button>
	</div> -->
	<div class="webcontainer">
		<div class="top_list">
			<div class="listbox">
				<h4>
					<a href="/seolhwamin/noticeboard/noticelist.jsp">Notice</a>
					<img class="listimg" src="/seolhwamin/img/확성기2.png">
				</h4>
				<ul class="noticeul ullist"></ul>
			</div>
			<div class="listbox">
				<h4>
					<a href="/seolhwamin/board/list.jsp">FREE</a>
					<img class="listimg" src="/seolhwamin/img/눈꽃.png">
				</h4>
				<ul class="freeul ullist"></ul>
			</div>
		</div>
		<div class="bottom_list">
			<div class="listbox">
				<h4>
					<a href="/seolhwamin/1000Day/1000Day.jsp">1000일 축하게시판</a>
					<img class="listimg" src="/seolhwamin/img/폭죽.png">
				</h4>
				<ul class="dayul ullist "></ul>
			</div>
			<div class="listbox">
				<h4>
					<a href="https://www.youtube.com/channel/UCqVE5TTq9FXIw3g52rotCUQ" target="_blank" rel="nopener noreferrer">YOUTUBE</a>
					<img class="listimg" src="/seolhwamin/img/유튜브.png">
				</h4>
				<iframe style="" width="500" height="500" src="https://www.youtube.com/embed/DOLEfuP7V5E" title="엥? 저 남자임?" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
			</div>
		</div>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
	<script src="/seolhwamin/js/member/index.js" type="text/javascript"></script>
	<!-- JSP파일안에 다른 JSP 파일 import 하기  -->
	<%@include file ="footer.jsp" %>

</body>
</html>