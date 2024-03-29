<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="../css/member.css" rel="stylesheet">

</head>
<body>

	<%@include file = "../header.jsp" %>
	
	<div> <!-- 회원가입 전체 구역 -->
		아이디 : <input onkeyup="idcheck()" class="mid" type="text"/>
		 <span class="idcheckbox"></span>
		 <br/>
		비밀번호 :<input onkeyup="pwcheck()" class="mpwd" type="password"/> 
		<span class="pwcheckbox"></span>
		<br/>
		비밀번호 확인  :<input onkeyup="pwcheck()" class="mpwdconfirm" type="password"/> <br/>
		
		
		이메일 : <input onkeyup="emailcheck()" class="memail" type="text"/>  
		<!-- 이메일 인증요청 통과시 버튼 활성화 -->
		<button class="authReqBtn" onclick="authReq()" disabled type="button">인증요청</button> <br/>
		
		<div class="authbox">
			<!-- 인증요청 버튼 클릭시 보이는 구역 -->
		</div>
		
		<span class="emailcheckbox"></span>
		<br/>
		
		프로필 : <input class="mimg" type="file"/> <br/>
		<button onclick="signup()" type="button">회원가입</button>
	</div>
	
	<!-- 최신 JQUERY 불러오기 : AJAX 메소드 사용하기 위해 : JS가 외부로부터 통신하기 위해 -->
   <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
   
	<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>