teamInfo = JSON.parse(localStorage.getItem('submitInfo'))

let x = 0;
console.log(teamInfo)
function submitCheck(){
	
	console.log(teamInfo.length)
	if(teamInfo.length==0) {
	teamInfo = [];
	alert('예약 정보를 찾을 수 없습니다.')
		return;
	}
	
	
	let nameCheck = document.querySelector('.nameCheck').value
	let passCheck = document.querySelector('.passCheck').value
	let html = document.querySelector('.main_content_5')
	
	if( nameCheck=='' || passCheck=='' ){
		alert('예약 정보를 모두 입력해 주세요.')
		return;
	}
	let y = 0;
	for(let i=0; i<teamInfo.length; i++){
		if(teamInfo[i].name == nameCheck &&
		teamInfo[i].password == passCheck){
			y++
		}
	}
	if (y==0){
		alert('예약 정보를 찾을 수 없습니다.'); return;
	}
	
	html.className = 'main_content_5 checkArea';
	for(let i=0; i<teamInfo.length; i++){
		if(teamInfo[i].name == nameCheck &&
		teamInfo[i].password == passCheck){x = i; console.log(x)
			html.innerHTML = `	<div><span class="typeText">참가구분</span><span>
	 							<span class="checkValue">${teamInfo[i].student}</span>
	 							</span></div>
	 							<div><span class="typeText">신청 프로그램</span>
	 							<span class="checkValue">${teamInfo[i].program}</span>
	 							</div>
	 							<div><span class="typeText">예약날짜</span>
	 							<span class="checkValue">${teamInfo[i].timeCategory}</span>
	 							</div>
	 							<div><span class="typeText">신청인 성명</span>
	 							<span class="checkValue">${teamInfo[i].name}</span>
	 							</div>
	 							<div><span class="typeText">연락처</span>
	 							<span class="checkValue">${teamInfo[i].tel}</span>
	 							</div>
	 							<div><span class="typeText">단체명</span><span>
	 							<span class="checkValue">${teamInfo[i].school}</span>
	 							</span></div>
	 							<div><span class="typeText">단체 유형</span>
	 							<span class="checkValue">${teamInfo[i].category}</span>
	 							</div>
	 							<div><span class="typeText">신청자 이메일</span>
	 							<span class="checkValue">${teamInfo[i].email}</span>
	 							</div>
	 							<div><span class="typeText">참가인원</span>
	 							<span class="checkValue">${teamInfo[i].personnel}</span>
	 							</div>
	 							<div><span class="typeText">참가인원 상세</span><span>
	 							<span class="checkValue2">교사 : ${teamInfo[i].teacherNum} 명</span>
	 							<span class="checkValue2">남학생 : ${teamInfo[i].maleNum} 명</span>
	 							<span class="checkValue2">여학생 :  ${teamInfo[i].femaleNum} 명</span>
	 							</span></div>
	 							<div class="sub_div">	
	 							<a href="Team_program_check.jsp"><button class="sumbit1" type="button"
	 							style="margin-right:80px;">돌아가기</button></a>
	 							<button onclick="programCancle()" class="sumbit1" type="button"
	 							style="margin-right:80px;">예약 취소</button>
	 			</div>
	 		</div>
				`
		 return;
		}
	}
}


function programCancle(){
	if(confirm('예약을 취소하시겠습니까?')){
		let pass = prompt('비밀번호를 입력해주세요.')
		if (teamInfo[x].password == pass){
		teamInfo.splice(x,1)
		localStorage.setItem('submitInfo',JSON.stringify(teamInfo))
		alert('예약 취소가 완료되었습니다.');
		location = "Team_program_check.jsp"
		}
		else{alert('비밀번호가 일치하지 않습니다.');}
	}else{
	}
}



