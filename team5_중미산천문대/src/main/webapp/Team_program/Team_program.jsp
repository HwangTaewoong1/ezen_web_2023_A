<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중미산천문대</title>
	<link href="Team_program.css" rel="stylesheet">
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
	 			<h2>참가신청</h2>
	 			<div><span><img src="../img/ico_home.png"> HOME > 단체프로그램</span></div>
	 		
	 		</div>
	 		<div class="main_content_2">
		 		<p class="c_text1">프로그램 <span class="s_text1">참가신청</span></p>
		 		<p class="p_text1">중미산천문대 <span class="s_text2">단체프로그램</span> 신청페이지입니다,
		 		개인은 신청불가하며 20인 이하 단체는 유선으로 문의주세요.</p>
		 		<p class="p_text1">(천문대장 : 010-8520-0818)</p>	
		 		
	 		</div>
	 		
	 		<div class="head_text">
	 			<p>선택사항</p>
	 		</div>
	 		
	 		<div class="main_content_3">
	 			
	 			<div><span class="typeText">참가구분</span><span>
	 				<span class="checkButton1"><input type="radio" name="student" value="유치원"> 유치원</span>
	 				<span class="checkButton1"><input type="radio" name="student" value="초등학생"> 초등학생</span>
	 				<span class="checkButton1"><input type="radio" name="student" value="중/고등학생"> 중/고등학생</span>
	 				<span class="checkButton1"><input type="radio" name="student" value="학교외 단체"> 학교외 단체</span>
	 			</span></div>
	 			
	 			
	 			<div><span class="typeText">프로그램 선택</span><span>
	 				<span class="checkButton1"><input type="radio" name="slot" value="낮"> 낮</span>
	 				<span class="checkButton1"><input type="radio" name="slot" value="밤"> 밤</span>
	 				<span class="checkButton1"><input type="radio" name="slot" value="종일"> 종일</span>
	 				<span class="checkButton1"><input type="radio" name="slot" value="1박2일"> 1박2일</span>
	 			</span></div>
	 			
	 		
	 			<div><span class="typeText">날짜입력</span><span>
	 				<input id="inputDate" type="text">
	 			</span></div>
	 			
	 		
	 		</div>
	 		
	 		<div class="head_text">
	 			<p>단체정보</p>
	 		</div>
	 		
	 		<div class="main_content_4">
	 			<div><span class="typeText">신청인 성명 *</span><span>
	 				<input id="inputBox1" class="uid" type="text">
	 			</span></div>
	 			
	 			<div><span class="typeText">비밀번호 *</span><span>
	 				<input class="pass" id="inputBox2" type="password" maxlength="4"></span>
	 				<div id="m_div4"><span class="typeText2"></span>
	 					<span>* 참가신청확인시 사용할 비밀번호 4자리를 입력해주세요.</span>
		 			</div>
	 			</div>
	 			
	 			<div><span class="typeText">연락처 *</span><span>
	 				<input class="tel1" id="inputBox2" type="text" maxlength="3"> - 
	 				<input class="tel2" id="inputBox2" type="text" maxlength="4"> - 
	 				<input class="tel3" id="inputBox2" type="text" maxlength="4"></span>
	 				<div id="m_div4"><span class="typeText2"></span>
	 					<span>* 프로그램 관련 실무담당자 연락처를 정확하게 기입해 주세요.</span>
		 			</div>
	 			</div>
	 			
	 			<div class="m_div2"><span class="typeText">단체(학교)명 *</span><span>
	 				<input class="school" id="inputBox3" type="text">
	 			</span></div>
	 			
	 			<div class="m_div2"><span class="typeText">단체유형 *</span><span>
	 				<input class="category" id="inputBox3" type="text"
	 				placeholder="ex) 학교, 학원, 어린이집, 지역아동센터 등">
	 			</span></div>
	 			
	 			<div class="m_div2"><span class="typeText">이메일 *</span><span>
	 				<input class="email" id="inputBox3" type="text">
	 			</span></div>
	 			
	 			<div class="m_div2"><span class="typeText">참가인원 *</span><span>
	 				<input class="personnel" id="inputBox2" type="text">
	 			</span></div>
	 			
	 			<div><span class="typeText">참가인원 상세 *</span><span>
	 				<span class="s_div2">교사: <input class="teacherNum" id="inputBox4" type="text"> 명</span>
		 			<span class="s_div2">남학생: <input class="maleNum" id="inputBox4" type="text"> 명</span>
		 			<span class="s_div2">여학생 <input class="femaleNum" id="inputBox4" type="text"> 명</span></span>
		 			<div id="m_div4"><span class="typeText2"></span>
		 				<span>* 대략적인 인원을 작성해 주시고, 인원 변동이 생길 경우 사전에 연락 주시기 바랍니다.</span>
		 			</div>
	 			</div>
	 		</div>
	 		
	 		<div class="sub_div">
	 			<button onclick="teamSubmit()" class="sumbit" type="button">작성완료</button>
	 		</div>
	 	
	 	</div> <!-- 메인컨텐츠 종료 -->


	</div> <!-- 전체페이지 종료 -->
	</form> 
		
 <%@include file="../Footer/Footer.jsp" %>

	
	<!-- 제이쿼리 입력폼 스크립트 호출 -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> 
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
	
	<!-- 내부 js파일 호출 -->
	<script src="Team_program.js" type="text/javascript"></script>
</body>
</html>