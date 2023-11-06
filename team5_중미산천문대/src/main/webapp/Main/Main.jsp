<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="Main.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>


	<%@include file="../Header/Header.jsp" %>
	


   <div class="main">
      <div class="mainImg">
         <div>
            <img class="mainimg" src="../img/main.jpg">
         </div>
         <div>
            <img class="jimg" src="../img/right1.jpg" />
         </div>
      </div>
      <div class="Content">
         <div class="mainContent1">
            <div class="hyper1">
               <span>별이 보고싶을땐</span> <strong>중미산 천문대</strong>
               <p>
                  해발 420M에 위치한 중미산천문대는<br /> 수도권에서 가장 많은 별을 볼 수 있는 곳입니다. <strong>(서울에서
                     1시간 거리)</strong>
               </p>
            </div>
            <div class="hyper2">
               <span id = "speedlink">
                  <a class = "introduce"href="#">천문대소개 -></a>
                  <span></span> 
                  <a href="#"> 찾아오시는길 -></a>
               </span>
            </div>
         </div>
         <div class="mainContent2">
            <div class="notice">
               <div class="notice1">
                  <h2>공지사항</h2>
                  <a href="#"></a>
               </div>
               <div class="notice2">
                  <ul>
                     <li class = "oneone1"><a href="#">일일 프로그램 필독</a></li>
                     <li class = "oneone2"><a href="#">일일 프로그램 예약취소, 변경 안내</a></li>
                  </ul>
               </div>
            </div>
            <ul class="quickmenu">
               <li class="quick1 type1"><a href="#">
                     <h2>일일프로그램 신청</h2> <span>바로가기<span class="icon">예약제</span>
                  </span>
               </a></li>
               <li class="quick2 type1"><a href="#">
                     <h2>단체프로그램 신청</h2> <span>바로가기 </span>
               </a></li>
               <li class="quick3 type1"><a href="#">
                     <h2>관측대상</h2> <span>바로가기 </span>
               </a></li>
               <li class="quick4 type1"><a href="#">
                     <h2>날씨 확인하기</h2> <span>바로가기 </span>
               </a></li>
               <li class="quick5 type1"><a href="#">
                     <h2>재관측 안내</h2> <span>바로가기 </span>
               </a></li>
               <li class="quick6 type2"><a
                  href="https://talk.naver.com/ct/wc3wsn" target="_blank">
                     <h2 style = "color : white">중미산천문대</h2> <span>네이버톡톡 문의하기</span>
               </a></li>
            </ul>
         </div>
      </div>

   </div>
   <%@include file="../Footer/Footer.jsp" %>

   <script src="Main.js" type="text/javascript"></script>

</body>
</html>