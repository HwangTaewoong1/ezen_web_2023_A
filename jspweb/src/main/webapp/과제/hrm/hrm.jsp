<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="hrm.css" rel="stylesheet">

</head> 
<body>

	<%@include file = "../../header.jsp" %>

	<div class="webcontainer"> <!-- 회원가입 전체 구역  -->
		<form class="signupForm"> <!-- 폼 전송시 각 input에 name속성 -->
			<h2> 인사관리 등록 시스템 </h2>
			
			<div class="intitle">증명사진</div>
			<input onchange="preimg( this )" name="himg" class="himg" type="file" accept="image/*" />
			<img class="preimg" alt="" src="../../member/img/default.webp"> 
			
			<div class="intitle">직원명</div>
			<input maxlength="30" onkeyup="idcheck() " name="hname" class="hname"  type="text" /> 
			
			<div class="intitle">전화번호</div>
			<input maxlength="20"  onkeyup="phonecheck()" name="hphone" class="hphone" type="text" />
			<div class="phonecheckbox"></div>
			
			<div class="intitle">직급</div>
			<select id="hrank" onchange="rankcheck()">
				<option>사장</option>
				<option>부장</option>
				<option>팀장</option>
				<option>대리</option>
				<option>주임</option>
				<option>사원</option>
			</select>
			
			<div class="intitle">등록일</div>
				<input onkeyup="datecheck()" name="hdate" class="hdate" type="text" />
				<div class="datecheckbox"></div>
			<button class="signupbtn" onclick="signup()" type="button">인사등록</button>	
		</form>
	</div>
	
	<div class="employeelist">
    <!-- 직원 목록 -->
    <div class="listwrap">
      <div class="listheader">사원번호 | 증명사진 | 사원이름 | 연락처 | 직급 | 등록일</div>
      <div class="hlist">
        <!-- JavaScript를 사용하여 동적으로 목록 항목이 여기에 추가됩니다 -->
      </div>
    </div>
  </div>
</div>
	
	<script src="hrm.js" type="text/javascript"> </script>
	

</body>
</html>