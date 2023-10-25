<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="../img/눈송이.ico">
<meta charset="UTF-8">
<title>눈송이 월드 가입하기</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<link href="../css/member/member.css" rel="stylesheet">

</head> 
<body>

	<%@include file = "../header.jsp" %>

	<div class="webcontainer"> <!-- 회원가입 전체 구역  -->
		<form class="signupForm"> <!-- 폼 전송시 각 input에 name속성 -->
			<div style="display: flex; margin-left: 60px;">
			<img src="/seolhwamin/img/눈꽃.png" style="margin-top: 13px; margin-right:5px; width: 33px; height: 33px;">
			<div>
			<h2> 눈송이 월드 가입하기</h2>
			<p> 눈송이 월드에 온걸 환영해! </p>
			</div>
			<img src="/seolhwamin/img/눈꽃.png" style="margin-top: 13px; margin-left:5px; width: 33px; height: 33px;">
			</div>
			
			<div class="intitle">아이디</div>
			<input maxlength="30" onkeyup="idcheck() " name="mid" class="mid"  type="text" /> 
			<div class="idcheckbox"></div>
			
			<div class="intitle">트위치 닉네임</div>
			<input maxlength="20" onkeyup="nicknamecheck()" name="mnickname" class="mnickname"  type="text" />
			<div class="nicknamecheckbox"></div> 
			
			<div class="intitle">비밀번호</div>
			<input maxlength="20"  onkeyup="pwcheck()" name="mpwd" class="mpwd" type="password" />
			
			<div class="intitle">비밀번호 확인</div>
			<input maxlength="20" onkeyup="pwcheck()"  class="mpwdconfirm" type="password" />
			<div class="pwcheckbox"></div>
			
			<div class="intitle">이메일</div>
			<div class="emailbox">
				<input onkeyup="emailcheck()" name="memail" class="memail" type="text" /> 
				<button disabled class="authReqBtn" onclick="authReq()"  type="button">인증요청</button> 
			</div>
			<div class="authbox"> </div>
			<div class="emailcheckbox"></div>
			
			<div class="intitle">프로필 사진</div>
			<input onchange="preimg( this )" name="mimg" class="mimg" type="file" accept="image/*" />
			<h2 style="font-size: 15px;"> 기본 이미지 </h2>
			<img class="preimg" alt="" src="../img/default.png"> 
			
			<button class="signupbtn" onclick="signup()" type="button">눈송이 월드 가입하기</button>
			
		</form>
	</div>
	
	<script src="../js/member/signup.js" type="text/javascript"> </script>
	<%@include file ="../footer.jsp" %>

</body>
</html>