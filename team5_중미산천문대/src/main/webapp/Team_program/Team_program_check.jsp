<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중미산 천문대</title>
	
	<link href="Team_program_check.css" rel="stylesheet">
	<link href="http://www.astrocafe.co.kr/css/default.css?ver=171222"rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700&amp;subset=korean" rel="stylesheet" type="text/css">
	<link href="../Headerfont-awesome.min.css" rel="stylesheet">
	<link href="../Headerslick.css" rel="stylesheet">
	<link href="../Header/style.css" rel="stylesheet">
	<link href="../Header/default.css" rel="stylesheet">

	<!-- 제이쿼리 입력 폼 -->
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
</head>
<body>

<%@include file="../Header/Header.jsp" %> 
<%@include file="../Header_bar/Header_bar.jsp" %> 
	<form>
	 <div class="wrap"><!-- 전체페이지 시작 -->
	 	
	 	<div class="sideMenu"> <!-- 사이드메뉴 시작 -->
	 		<div class="sideTeam"><!-- 단체프로그램 메뉴 -->
		 		<div class="sideLine"></div>
		 			<h3>단체프로그램</h3>
		 		</div>
	 		<div><!-- 사이드 리스트 메뉴 -->
	 		
	 		
	 		<ul class="listStyle">
	 			<a href="Team_program.jsp"><span><h3 class="headText">신청 및 확인<span class="arrow"></span></h3></span></a>
	 			<li><a href="Team_program.jsp"><span class="makerImg"></span>참가신청</a></li>
	 			<li><a href="Team_program_check.jsp"><span class="makerImg"></span>참가신청확인</a></li>
	 		</ul>
	 		
	 		</div>
	 		
	 		<a href="https://talk.naver.com/ct/wc3wsn"><div class="navertalk"><!-- 사이드 메뉴 네이버톡톡 -->
	 			<div>
		 			<img class="talkImg"src="../img/ico_navertalk.png">
		 		</div>
		 			
		 		<div class="talkText">
		 			<h3>중미산천문대</h3>
		 			<h4>네이버톡톡 문의하기</h4>
		 		</div>
	 		</div></a>
	 	
	 	</div> <!-- 사이드메뉴 종료 -->
	 	<div class="main_content"> <!-- 메인컨텐츠 시작 -->
	 		<div class="main_content_1">
	 			<h2>참가신청확인</h2>
	 			<div><span><img src="../img/ico_home.png"> HOME > 단체프로그램</span></div>
	 		
	 		</div>
	 		<div class="main_content_2">
		 		<p class="c_text1">프로그램 <span class="s_text1">참가신청확인</span></p>
		 		<p class="p_text1">중미산천문대 프로그램 예약을 확인할 수 있습니다. </p>
		 		
		 		
	 		</div>
	 		
	 		
	 		<div class="main_content_5">
	 			<div><span class="typeText3">성명</span><span>
	 				<input class="nameCheck" id="inputBox5" type="text">
	 			</span></div>
	 			
	 			<div><span class="typeText3">비밀번호</span><span>
	 				<input class="passCheck" id="inputBox5" type="password">
	 			</span>
	 			</div>
	 			
	 			<div class="numberS">※ 프로그램 참가신청시 작성했던 성명 및 비밀번호(4자리)를 입력해주세요</div>
		 		<div class="sub_div">	
	 				<button onclick="submitCheck()" class="sumbit1" type="button">신청확인</button>
	 			</div>
	 			
	 			
	 		</div>
	 	
	 	</div> <!-- 메인컨텐츠 종료 -->


	</div> <!-- 전체페이지 종료 -->
	</form> 
		
 <%@include file="../Footer/Footer.jsp" %> 

	
	<!-- 제이쿼리 입력폼 스크립트 호출 -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> 
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
	
	<!-- 내부 js파일 호출 -->
	<script src="Team_program_check.js" type="text/javascript"></script>

</body>
</html>