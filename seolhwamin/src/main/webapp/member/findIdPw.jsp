<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="../img/눈송이.ico">
    <title>눈송이 월드 ID/PW 찾기</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../css/member/findIdPw.css">
</head>
<body>

<%@include file = "../header.jsp" %>
	<img class="findimg" src="/seolhwamin/img/화민.jfif">
    <div class="webcontainer">
    	<div class="findbox">
	    	<div style="display:flex; justify-content: center;">
				<img src="/seolhwamin/img/눈꽃.png" style="margin-top: 3px; margin-right:5px; width: 33px; height: 33px;">
				<h2> 눈송이 월드 ID/PW 찾기</h2>
				<img src="/seolhwamin/img/눈꽃.png" style="margin-top: 3px; margin-left:5px; width: 33px; height: 33px;">
			</div>
	    	<div class="idpw">
		        <div class="section">
		            <h2>ID 찾기</h2>
		            <div class="idbox2">
			            <div class="idbox">
				            <input type="text" maxlength="20" id="findIdNickname" placeholder="트위치닉네임">
				            <input type="email" maxlength="50" id="findIdEmail" placeholder="이메일">
			            </div>
		            <button id="findIdButton">ID 찾기</button>
		            </div>
		            <p id="foundId"></p>
		        </div>
		        <div class="section">
		            <h2>비밀번호 찾기</h2>
		            <div class="idbox2">
		            	<div class="idbox">
				            <input type="text" maxlength="20" id="findPwMid" placeholder="아이디">
				            <input type="email" maxlength="50" id="findPwEmail" placeholder="이메일">
		           		</div>
		           		<button id="findPwButton">비밀번호 찾기</button>
		            </div>
		            <p id="foundPwd"></p>
		        </div>
	        </div>
	        <div class="loginsign">
	         	<a class="button2 button3" href="login.jsp" >로그인</a>
	         	<a class="button2" href="signup.jsp">회원가입</a>
	        </div>
        </div>
   	</div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="../js/member/findIdPw.js"></script>
</body>
</html>
