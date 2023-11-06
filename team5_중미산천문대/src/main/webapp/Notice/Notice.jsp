<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="format-detection" content="telephone=no">
<meta name="viewport"
	content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,target-densitydpi=medium-dpi">

<title>중미산천문대</title>
<!-- css 링크 연결  -->
<link href="http://www.astrocafe.co.kr/css/default.css?ver=171222"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700&amp;subset=korean"
	rel="stylesheet" type="text/css">
<link href="../Headerfont-awesome.min.css" rel="stylesheet">
<link href="../Headerslick.css" rel="stylesheet">
<link href="../Header/style.css" rel="stylesheet">
<link href="../Header/default.css" rel="stylesheet">
<link href="Notice.css" rel="stylesheet">
</head>
<body>

	<div id="wrap">
		<a href="#skipcon" class="skip">본문 바로가기</a>

		<!-- HEADER -->
		<%@include file="../Header/Header.jsp"%>

		<div id="sub">

			<%@include file="../Header_bar/Header_bar.jsp"%>

			<div id="skipcon">
				<div id="sub_contents">

					<!-- SUB MENU -->
					<div class="sub_lnbwrap">
					
						<h3>공지사항</h3>
						<div class="m_menu">
							<h3 class="hide">하위메뉴보기</h3>
							<a href="#none"> 공지사항 </a> <span></span>
						</div>
						<ul class="sub_lnb">
							<li><a href="Notice.jsp">공지사항</a></li>
							<li><a href="">관측대상</a></li>
							<li><a href="">이벤트</a></li>

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
							<h3>공지사항</h3>

							<div class="breadcrumb">
								<img style="width : 17px; height : 14px" src="../img/ico_home.png" alt=""><strong>HOME
									<span>&gt;</span> 공지사항
								</strong>
							</div>
						</div>

						<!-- 게시판 목록 시작 { -->
						<div id="bo_list" style="width: 100%">


							<!-- 게시판 페이지 정보 및 버튼 시작 { -->
							<div id="bo_btn_top">
								<div id="bo_list_total">
									<span>Total 3건</span> 1 페이지
								</div>


							</div>


							<form name="fboardlist" id="fboardlist"
								action="./board_list_update.php"
								onsubmit="return fboardlist_submit(this);" method="post">

								<div class="tbl_head01 tbl_wrap">
									<table border="0" cellpadding="0" cellspacing="0">
										<caption>공지사항 목록</caption>
										<!-- 버튼 -->
										<a href="writeNotice.jsp">
											<button type="button" class="btn">글쓰기</button>
										</a>
										<thead>
											<tr>
												<th scope="col" class="th_num2">번호</th>
												<th scope="col" class="th_subject">제목</th>
												<th scope="col" class="th_name">글쓴이</th>
												<th scope="col" class="th_num"><a
													href="/bbs/board.php?bo_table=notice&amp;sop=and&amp;sst=wr_hit&amp;sod=desc&amp;sfl=&amp;stx=&amp;sca=&amp;page=1">조회
														<i class="fa fa-sort" aria-hidden="true"></i>
												</a></th>
												<th scope="col" class="th_datetime"><a
													href="/bbs/board.php?bo_table=notice&amp;sop=and&amp;sst=wr_datetime&amp;sod=desc&amp;sfl=&amp;stx=&amp;sca=&amp;page=1">날짜
														<i class="fa fa-sort" aria-hidden="true"></i>
												</a></th>
											</tr>
										</thead>
										<tbody>
											<tr class="bo_notice">
												<td class="td_num2">
													<strong class="notice_icon">
														<i class="fa fa-bullhorn" aria-hidden="true"></i>
														<span class="sound_only">공지</span>
													</strong>
												</td>

												<td class="td_subject" style="padding-left: 0px">
													<div class="bo_tit">
														<a href="http://www.astrocafe.co.kr/bbs/board.php?bo_table=notice&amp;wr_id=74">
														일일프로그램 필독 </a> 
														<i class="fa fa-heart" aria-hidden="true"></i>
													</div>

												</td>
												
												<td class="td_name sv_use"><span class="sv_member">관리자</span></td>
												<td class="td_num">27895</td>
												<td class="td_datetime">06-28</td>
											</tr>
											
											<tr class="bo_notice">
												<td class="td_num2">
													<strong class="notice_icon">
														<i class="fa fa-bullhorn" aria-hidden="true"></i> 
														<span class="sound_only">공지</span>
													</strong>
												</td>

												<td class="td_subject" style="padding-left: 0px">
													<div class="bo_tit">
														<a href="http://www.astrocafe.co.kr/bbs/board.php?bo_table=notice&amp;wr_id=57">
														일일프로그램 예약취소, 변경 안내 </a> 
														<i class="fa fa-heart" aria-hidden="true"></i>
													</div>
												</td>
												
												<td class="td_name sv_use"><span class="sv_member">관리자</span></td>
												<td class="td_num">17749</td>
												<td class="td_datetime">06-21</td>
											</tr>
											
										</tbody>

										<tbody class="tcontent">

										</tbody>

									</table>
								</div> <!-- tbl_head01 tbl_wrap end -->


							</form>
						</div> <!-- bo_list end -->
						
						
						
					</div><!-- sub_conwrap end-->
				</div><!-- sub_contents end-->
			</div><!-- skipcon end -->
		</div><!-- sub end -->
	</div> <!--Wrap end -->
	<!-- FOOTER 삽입 -->
<%@include file="../Footer/Footer.jsp"%>


	<!--  JS 추가 -->
	<script src="Notice.js" type="text/javascript"></script>
	<script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="/js/common.js?ver=181222"></script>
	<script type="text/javascript"
		src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=64j1zgkjuk"></script>
	<script type="text/javascript" src="/common/js/slick.min.js"></script>
	<script type="text/javascript" src="/common/js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="/common/js/common.js"></script>
	<script src="http://www.astrocafe.co.kr/js/jquery.menu.js?ver=171222"></script>
	<script src="http://www.astrocafe.co.kr/js/common.js?ver=171222"></script>
	<script src="http://www.astrocafe.co.kr/js/wrest.js?ver=171222"></script>
	<script src="http://www.astrocafe.co.kr/js/placeholders.min.js"></script>
</body>
</html>
