<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중미산천문대</title>
	<meta name="format-detection" content="telephone=no">
	<meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,target-densitydpi=medium-dpi">
	<link href="http://www.astrocafe.co.kr/css/default.css?ver=171222" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700&amp;subset=korean"rel="stylesheet" type="text/css">
	<link href="../Headerfont-awesome.min.css" rel="stylesheet">
	<link href="../Headerslick.css" rel="stylesheet">
	<link href="../Header/style.css" rel="stylesheet">
	<link href="../Header/default.css" rel="stylesheet">
	<link href="Re_observation.css" rel="stylesheet">
</head>
<body>

	<div id="wrap">
		<a href="#skipcon" class="skip">본문 바로가기</a>

		<!-- HEADER -->
		<%@include file="../Header/Header.jsp" %>

		<div id="sub">

			<%@include file="../Header_bar/Header_bar.jsp" %>

			<div id="skipcon">
				<div id="sub_contents">

					<!-- SUB MENU -->
					<div class="sub_lnbwrap">
						<h3>재관측안내</h3>
						<div class="m_menu">
							<h3 class="hide">하위메뉴보기</h3>
							<a href="#none"> 재관측안내 </a> <span></span>
						</div>
						<ul class="sub_lnb">
						</ul>
						<div class="minbanner">
							<a href="https://talk.naver.com/ct/wc3wsn" target="_blank">
								<h2>중미산천문대</h2> <span>네이버톡톡 문의하기</span>
							</a>
						</div>
					</div>

					<!-- SUB CONTENTS AREA -->
					<div class="sub_conwrap">
						<div class="subtit">
							<h3>재관측안내</h3>

							<div class="breadcrumb">
								<img src="../img/ico_home.png" alt=""><strong>HOME
									<span>&gt;</span> 재관측안내
								</strong>
							</div>
						</div>

						<div class="location">
							<div class="titwrap clearfix">
								<div class="txt">
									<p>중미산천문대 프로그램 체험 후 정상적으로 관측을 못하신분들을 위한 안내 페이지입니다.</p>
								</div>
							</div>

							<dl>
								<dt>
									<span>01</span>
								</dt>
								<dd>
									<div>재관측은 네이버 예약 없이 방문하고자 하는 당일 오후 유선 또는 네이버톡톡으로 프로그램 시작
										시간과 예보를 확인하신 뒤, 실물티켓을 소지해서 오시면 됩니다.</div>
								</dd>
							</dl>
							<dl>
								<dt>
									<span>02</span>
								</dt>
								<dd>
									<div>인원 파악을 위하여 반드시 연락 주시고 오셔야 합니다.</div>
								</dd>
							</dl>
							<dl>
								<dt>
									<span>03</span>
								</dt>
								<dd>
									<div>재관측 인원을 고려하여 여유를 두고 예약을 받기 때문에 네이버 예약 인원이 마감되어도 프로그램
										참여가 가능합니다.</div>
								</dd>
							</dl>
							<dl>
								<dt>
									<span>04</span>
								</dt>
								<dd>
									<div>재관측 티켓은 분실에 유의해 주시기 바라며 실물티켓이 아닌 사진, 예약내역으로는 프로그램
										참여가 불가합니다.</div>
								</dd>
							</dl>
							<dl>
								<dt>
									<span>05</span>
								</dt>
								<dd>
									<div>재관측티켓은 티켓에 찍힌 날짜로부터 1년 이내에 사용하셔야 합니다.</div>
								</dd>
							</dl>
							<dl>
								<dt>
									<span>06</span>
								</dt>
								<dd>
									<div>1년 이내에 정상적으로 관측이 가능할때까지 티켓 사용이 가능합니다.</div>
								</dd>
							</dl>
							<dl>
								<dt>
									<span>07</span>
								</dt>
								<dd>
									<div>일일프로그램(당일별자리여행)이 아닌 특별관측회 등 다른 프로그램은 재관측 티켓으로 참여가
										불가능합니다.</div>
								</dd>
							</dl>
						</div> <!-- location end -->




					</div> <!-- sub_conwrap end -->
				</div> <!-- subcontent end -->
			</div> <!-- skipcon end -->
		</div> <!-- sub end -->
		
		<!-- FOOTER -->
		<%@include file="../Footer/Footer.jsp" %>
	</div> <!-- wrap end -->
	<!-- 스크립트 호출 -->
<script type="text/javascript" src="../Header/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="../Header/common.js?ver=181222"></script>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=64j1zgkjuk"></script>
<script type="text/javascript" src="../Header/slick.min.js"></script>
<script type="text/javascript" src="../Header/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="../Header/common.js"></script>
<script src="http://www.astrocafe.co.kr/js/jquery.menu.js?ver=171222"></script>
<script src="http://www.astrocafe.co.kr/js/common.js?ver=171222"></script>
<script src="http://www.astrocafe.co.kr/js/wrest.js?ver=171222"></script>
<script src="http://www.astrocafe.co.kr/js/placeholders.min.js"></script>
	
</body>
</html>