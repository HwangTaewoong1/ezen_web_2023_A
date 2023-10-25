<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>눈송이 월드 ID/PW 찾기</title>
    <link rel="stylesheet" type="text/css" href="../../css/findIdPw.css">
</head>
<body>

<%@include file = "../header.jsp" %>
    <div class="container">
    	<div style="display:flex; align-items: center; flex-direction: column;">
			<img class="mainlogoimg" alt="" src="/jspteam4/img/Logo.png" style="width:150px;"/>
			<h2> 눈송이 월드 ID/PW 찾기</h2>
		</div>
    	<div class="idpw">
	        <div class="section">
	            <h2>ID 찾기</h2>
	            <input type="text" id="findIdNickname" placeholder="트위치닉네임">
	            <input type="email" id="findIdEmail" placeholder="이메일">
	            <button id="findIdButton">ID 찾기</button>
	            <p id="foundId"></p>
	        </div>
	        <div class="section">
	            <h2>비밀번호 찾기</h2>
	            <input type="text" id="findPwMid" placeholder="아이디">
	            <input type="email" id="findPwEmail" placeholder="이메일">
	            <button id="findPwButton">비밀번호 찾기</button>
	            <p id="foundPwd"></p>
	        </div>
        </div>
        <div class="loginsign">
         	<button type="button"><a href="login.jsp" >로그인</a></button>
         	<button type="button"><a href="signup.jsp">회원가입</a></button>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="../js/member/findIdPw.js"></script>
</body>
</html>
