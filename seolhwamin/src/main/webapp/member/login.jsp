<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="../img/눈송이.ico">
<meta charset="UTF-8">
<title>눈송이 월드 들어가기</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="../css/member/member.css" rel="stylesheet">

</head> 
<body>

	<%@include file = "../header.jsp" %>
	
	<!-- 1.헤더에서 로그인메뉴를 클릭했을때 2.회원가입 성공하면 -->
	
	<div class="webcontainer"> <!-- 로그인 전체 구역  -->
		<form class="signupForm"> <!-- 폼 전송시 각 input에 name속성 -->
			<div style="display: flex; margin-left: 60px;">
			<img src="/seolhwamin/img/눈꽃.png" style="margin-top: 13px; margin-right:5px; width: 33px; height: 33px;">
			<div>
			<h2> 눈송이 월드 들어가기</h2>
			<p> 눈송이 월드에 온걸 환영해! </p>
			</div>
			<img src="/seolhwamin/img/눈꽃.png" style="margin-top: 13px; margin-left:5px; width: 33px; height: 33px;">
			</div>
			
			<div class="intitle">아이디</div>
			<input maxlength="20" name="mid" class="mid"  type="text" /> 
			
			<div class="intitle">비밀번호</div>
			<input maxlength="20"  name="mpwd" class="mpwd" type="password" />
	
			<div class="logincheckbox"></div> <!-- 로그인 유효성검사 구역 -->
			
			<div class="findbtnbox"> <!-- 아이디/비밀번호찾기 구역  -->
				<a href="findIdPw.jsp">아이디/비밀번호 찾기</a>
			</div>
			
			<button class="signupbtn" onclick="login()" type="button">로그인</button>
			
		</form>
	</div>
	
	<script src="../js/member/login.js" type="text/javascript"> </script>
	<%@include file ="../footer.jsp" %>

</body>
</html>