<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="Daily_Program.css" rel="stylesheet">
</head>
<body>

	<div id="wrap">
		<!-- 웹 페이지 전체구역 start  -->

		<div id="header">
			<!--header start  -->
			<div id="headerTop">
				<!--header top start  -->
				<div class="logo">
					<span class="mainLogo"></span>
					<h3>예약</h3>
				</div>
				<div class="headerItem">
					<ul class="headerItems">
						<li><span class="headerLo"></span></li>
						<li class="headerItem">내 예약</li>
						<li>차정훈</li>
						<li><span class="headerLogo"></span></li>
						<li><span class="headerLogos"></span></li>
						<li><span  class="hdLogo"></span></li> 
					</ul>
				</div>
			</div>
			<!--header top end  -->


		</div>
		<div id="headerBottom">
			<!--header bottom start  -->
			<ul class="bottomItem">
				<li><span class="subimg"> </span></li>
				<li>중미산천문대 ></li>
				<li>
					<h3>일정선택</h3>
				</li>
			</ul>
		</div>
		<!--  -->
		<!--header end  -->

		<div id="form">
			<!--form start  -->

			<div id="formTop">
				<!--상단 본문 시작  -->
				<div class="contentTop">
					<div class="topLeft">
						<div class="formImg"></div>
						<div class="topItem">당일별자리여행</div>
						<div class="topItems"></div>
					</div>

					<div class="topRight">
						<div class="calwrap">
							<!-- 캘린더 전체구역  -->

							<div class="caltop">
								<!--  상단 메뉴 -->
								<button onclick="onNext(0)" type="button"><</button>
								<!--이전 달 버튼  -->
								<h3 class="caldate"></h3>
								<!-- 현재  연도/월 표시 구역  -->
								<button onclick="onNext(1)" type="button">></button>
								<!-- 다음 달 버튼 -->
							</div>


							<div class="calendar">
								<!-- 날짜 표시 구역 -->
								<div></div>
								<!--일 표기  1~ 31/30/29 -->

							</div>
						<div class="calBm">
							<div class="calColor"></div>
							<div>선택</div>
							<div class="calColors"></div>
							<div>불가</div>
						</div>
						</div>
						<div class="checkIn">예약자 정보 </div>
					</div>
				</div>
				<div class="contentBm">
					<ul class="bottomLeft">
						<li>천문영상교육(30분)<br /> 무한한 우주에 관한 해설과 천체 시뮬레이션 프로그램을 이용해 계절별<br />
							별자리를 알아봅니다.
						</li>
						<li>천체관측(1시간)<br /> 밤하늘 별자리에 대한 해설과 천체망원경을 통해 다양한 천체들을 관측합니다.
						</li>
						<li>진행시간 : 1시간 30분 가량<br /> 예약인원 및 날씨에 따라 프로그램 진행 시간은 달라질 수
							있습니다.
						</li>

					</ul>

					<div class="bottomRight">
						<div class="name"><span>예약자</span><input class="names" type="text" placeholder="asd"/></div>
						<div class="email"><span>이메일</span><input  class="emails"  type="text" placeholder="wdwdwd@naver.com"/></div>
						<div class="phone"><span>전화번호</span> <input  class="phones"   type="text" placeholder="010-5245-5665" /></div>
						<div class="inputBox">
						<h3>회차선택</h3>
						<div class="inputText"></div>
						<button  onclick="check()"    class="buttonBox">
							<span>예약하기</span>
						</button>
						</div>
					</div>
				</div>
				<div class="background">
					<!-- 여백  -->

				</div>


			</div>
			<!--상단 본문 끝  -->

			<div id="formBottom">
				<!--하단 본문 시작  -->
				<div class="bmTop">
					<div  class="bmTopItem">상세정보</div>
				</div>
				<div class="bmBm">
					<h3>진행시간</h3>
					<p>1시간 30분</p>
					<h3>이용 가능 연령</h3>
					<p>전체 이용가</p>
					<p>36개월미만 무료입장(관련확인증지참필수)</p>
					<h3>[이용방법]</h3>
					<p>1. 네이버예약을 통한 예약 및 결제 2. 예약하신 날짜에 방문, 본인 확인과 티켓 발급 후 이용</p>
					<h3>[프로그램 정원]</h3>
					<p>50명</p>
					<h3>[관측이 되지 않을 경우]</h3>
					<p>
						날씨로 인해 부분적으로 관측이 되거나 관측을 못한 경우 1년 이내에 재관측하실 수 있는 티켓이 발급됩니다.<br />
						재방문이 힘드신 분들은 좀 더 신중히 예약해주시기 바랍니다.<br /> 재관측 티켓은 1년 이내에 정상적으로 관측을
						하실 때까지 티켓 사용이 가능합니다.
					</p>
					<h3>[재관측 예약 방법 및 안내]</h3>
					<p>
						재관측은 네이버 예약 없이 방문을 희망하는 당일 오후에 유선 또는 네이버톡톡으로 프로그램 시작시간과 예보를 확인하신
						뒤, 실물티켓을 소지해서 오시면 됩니다.<br /> 인원 파악을 위하여 반드시 연락 주시고 오셔야 하며 재관측 인원을
						고려해 여유를 두고 예약을 받기 때문에 네이버 예약 인원이 마감되어도 프로그램 참여가 가능합니다.<br /> 재관측
						티켓은 분실에 유의해주시기 바라며 실물티켓이 아닌 사진, 예약내역으로는 프로그램 참여가 불가능합니다.<br />
						일일프로그램(당일별자리여행)이 아닌 특별관측회 등 다른 프로그램은 재관측 티켓으로 참여가 불가능합니다.<br />
					<h3>[유의사항]</h3>
					<p>
						- 천문대는 예약하신 분만 입장 및 주차가 가능합니다. <br /> - 천문대는 프로그램 시작 시간 1시간 전부터
						개방합니다.<br /> - 원활한 프로그램 진행을 위해 예약 시간 10분 전까지는 도착 해 주시기 바랍니다.<br />
						- 프로그램 예약 시간보다 늦게 도착하셔도 입장은 가능합니다.<br /> - 어린이 발광 신발 착용 시 관측에 방해가
						될 수 있으니 착용을 피해주세요.<br /> - 미 방문 시 예약 건은 취소 없이 소멸됩니다.<br /> - 음주자는
						절대 입장하실 수 없습니다.<br /> - 반려동물은 실내 및 관측장 출입이 불가합니다.
					</p>
					<h3>[관측 가능한 천체]</h3>
					<p>
						계절별 주요관측대상을 모두 관측하며 날씨 및 프로그램 시간에 따라 변동이 생길 수 있습니다.<br /> 월별 관측
						대상은 중미산천문대 홈페이지 공지사항을 참고해주세요.
					</p>
					<h3>[취소]</h3>
					<p>
						취소는 네이버 예약에서 하시면 됩니다.<br /> 취소하실 때는 환불규정을 미리 참고바랍니다.
					</p>
					<h3>[변경]</h3>
					<p>
						날짜 변경은 네이버 예약에서 직접 취소하시고 다시 신청하셔야 합니다.<br /> 취소하실 경우 수수료가 발생할 수
						있으니 신중히 예약해주시고 환불규정을 참고하시기 바랍니다.
					</p>
					<h3>[환불규정]</h3>
					<p>
						- 이용 3일전 결제 금액의 20% 차감 <br /> - 이용 2일전 결제 금액의 30% 차감 <br /> - 이용
						1일전 결제 금액의 40% 차감 <br /> - 이용 당일 결제 금액의 50% 차감
					</p>
				</div>

			</div>
			<!-- 하단 본문 끝 -->
			<div class="bottomSpace">
				<!-- 여백  -->

			</div>


		</div>
		<!-- form end -->

		<div id="footer">
			<!--footer start  -->
			<div class="ftTop">
				<div class="test">
					<!--footer top start -->
					<div class="ftTopItem">
						<div class="ftImg"></div>
						<div>예약/주문 스마트봇</div>
					</div>
					<div class="ftTopItems">
						<div class="ftImgs"></div>
						<div>예약 소식 받기</div>
					</div>
				</div>
			</div>



			<!--footer top end  -->
			<div class="ftBottom">
				<ul class="ftItem">
					<li class="liItem">전체서비스</li>
					<li>로그인</li>
				</ul>
				<ul class="ftItem">
					<li>네이버 예약 고객센터</li>
					<li class="ftItems">이용약관</li>
					<li>개인정보 처리방침</li>
				</ul>
				<p>네이버(주)는 통신판매의 당사자가 아니며, 상품의 정보, 거래조건, 이용 및 환불, 쿠폰 사용 등과 관련한
					의무와 책임은 각 판매자에게 있습니다.</p>
				<p>(주)네이버 사업자정보</p>
				<div class="ftLogo"></div>

			</div>


		</div>
		<!-- footer end -->

	</div>
	<!--웹 페이지 전체구역 end  -->

	<script src="Daily_Program.js" type="text/javascript"></script>
</body>
</html>