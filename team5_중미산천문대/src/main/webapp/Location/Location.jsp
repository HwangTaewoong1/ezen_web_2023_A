<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<link href = "Location.css" rel = "stylesheet">
<link href="http://www.astrocafe.co.kr/css/default.css?ver=171222" rel="stylesheet">
<link
   href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700&amp;subset=korean"
   rel="stylesheet" type="text/css">
<link href="../Headerfont-awesome.min.css" rel="stylesheet">
<link href="../Headerslick.css" rel="stylesheet">
<link href="../Header/style.css" rel="stylesheet">
<link href="../Header/default.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=xadtduthyv&callback=initMap"></script>
<%@include file="../Header/Header.jsp" %> 
<%@include file="../Header_bar/Header_bar.jsp" %>
<div id = "wrap">
    <!-- SUB MENU -->
               <div class="sub_lnbwrap">
               
                  <h3>찾아오시는길</h3>
                  <div class="m_menu">
                     <h3 class="hide">하위메뉴보기</h3>
                     <a href="#none"> 찾아오시는길 </a> <span></span>
                  </div>
                  <ul class="sub_lnb">
                     <li><a href="Location.jsp">찾아오시는길</a></li>
            

                  </ul>
                  <div class="minbanner">
                     <a href="https://talk.naver.com/ct/wc3wsn" target="_blank">
                        <h2>중미산천문대</h2> <span>네이버톡톡 문의하기</span>
                     </a>
                  </div>
               </div>
    <div class = "location" style = "margin-left: 320px;">
         <div class="title">
            <div class="sub_title">
               <h1 style = "display: inline-block;
                   position: relative;
                   padding: 38px 0 20px;
                   font-size: 32px;
                   color: #333;
                   font-weight: 400;
                   letter-spacing: -2px;
                   line-height: 32px;
                   border-bottom: 4px solid #0079E9;">찾아오시는길</h1>
            </div>
            <div class="img_title">
               <img style = "width : 17px; height : 14px;" src="../img/ico_home.png">
               <p>HOME > 찾아오시는길</p>
            </div>
         </div>
         <div id="map" style="width: 880px; height: 400px;">
           <script type="text/javascript">
               function initMap() {
                   var mapOptions = {
                       center: new naver.maps.LatLng(37.5818, 127.4594), // 중미산천문대의 좌표
                       zoom: 16
                   };
   
                   var map = new naver.maps.Map('map', mapOptions);
   
                   var markerOptions = {
                       position: new naver.maps.LatLng(37.5818, 127.4594), // 중미산천문대의 좌표
                       map: map
                   };
   
                   var marker = new naver.maps.Marker(markerOptions);
               }
           </script>
        </div>
        <div class = "area">
              <div>
                 <span>중미산 천문대</span>
                 <p>경기도 양평군 옥천면 중미산로 1268</p>
              </div>
              <div class ="btnarea">
                 <a href = "http://naver.me/GRSBwzHn" target="_blank" title= "새창열기" class = "map_btn">지도에서 보기</a>
              </div>
        </div>
         <dl>
            <dt><span>이용시간</span></dt>
            <dd>
               매일<br/>
               <p>자세한 이용시간은 예약페이지를 참고해주세요</p>
            </dd>
         </dl>
         <dl>
            <dt><span>전화번호</span></dt>
            <dd>
               <div>0507-1319-0306</div>
            </dd>
         </dl>
         <dl>
            <dt><span>이용안내</span></dt>
            <dd>
               <ul>
                  <li class = "ico01">예약</li>
                  <li class = "ico02">단체석</li>
                  <li class = "ico03">무선인터넷</li>
                  <li class = "ico04">남/녀 화장실 구분</li>
               </ul>
            </dd>
         </dl>
         <dl>
            <dt><span>사업자정보</span></dt>
            <dd>
                <div>상호명 : 중미산천문대<br/>
                  대표자 : 고경옥<br/>
                  사업자번호 : 132-90-64791<br/>
                  이메일 : jungmiastro@naver.com
               </div>
            </dd>
         </dl>
         <dl>
            <dt><span>주차요금</span></dt>
            <dd>
					<div class = "park_wrap">
						<div>
							차량 번호 뒷자리를 입력해주세요<br />
							<br /> <input class="parking" placeholder="차량 번호 뒷자리">
							<button class="parkbtn" onclick="calculate()" value="확인">확인</button>

							<div class="printBox"></div>
						</div>
						<div class="parkingInfo">
							기본요금 : 30분(5000원)<br /> 초과요금 : 10분당 500원 추가 요금 부과<br />


						</div>



					</div>
				</dd>
         </dl>

      </div>
</div>
<%@include file="../Footer/Footer.jsp" %>
<script src = "Location.js" type="text/javascript"></script>
</body>
</html>