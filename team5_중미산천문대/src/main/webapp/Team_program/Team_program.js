let teamInfo = [ ];


/*제이쿼리 날짜입력폼 실행문*/
$(function() {
    $( "#inputDate" ).datepicker({
    dateFormat: 'yy-mm-dd'});
    //날짜 형식 변경
});
//실행문 종료


function teamSubmit(){
	teamInfo = JSON.parse(localStorage.getItem('submitInfo'))
	if(teamInfo == null) { teamInfo = [];}
	
	if(document.querySelector('input[name=student]:checked') == undefined || 
  	document.querySelector('input[name=slot]:checked') == undefined)
  	{alert('정보를 모두 기입해 주세요.');return;}
  		
	let student = document.querySelector('input[name=student]:checked').value
	let program = document.querySelector('input[name=slot]:checked').value
	let timeCategory = document.querySelector('#inputDate').value
	let name = document.querySelector('.uid').value
	let password = document.querySelector('.pass').value
	let tel = document.querySelector('.tel1').value+'-'+
			document.querySelector('.tel2').value+'-'+
			document.querySelector('.tel3').value;
	let school = document.querySelector('.school').value
	let category = document.querySelector('.category').value
	let email = document.querySelector('.email').value
	let personnel = document.querySelector('.personnel').value
	let teacherNum = document.querySelector('.teacherNum').value
	let maleNum = document.querySelector('.maleNum').value
	let femaleNum = document.querySelector('.femaleNum').value
	
	if(timeCategory == '' || name == '' || password == '' || tel == ''||
  		 school == '' || category == '' || email == '' || personnel == '' ||
  		 teacherNum =='' || maleNum =='' || femaleNum == '')
  		 {alert('정보를 모두 기입해 주세요.');return;}
  	
  	if(teamInfo != null) {
	  	for(let i=0; i<teamInfo.length; i++){
			if(teamInfo[i].name == name &&
				teamInfo[i].tel == tel){
					alert('이미 예약되어 있습니다.')
					return;
				}
  			}
  		}
	let personnelInfo = { student : student,
							program : program,
							timeCategory : timeCategory,
							name : name,
							password : password,
							tel : tel,
							school : school,
							category : category,
							email : email,
							personnel : personnel,
							teacherNum : teacherNum,
							maleNum : maleNum,
							femaleNum : femaleNum
							}
	teamInfo.push(personnelInfo)
		
	localStorage.setItem('submitInfo',JSON.stringify(teamInfo))
	
	alert('예약이 완료되었습니다.')
	location = "Team_program.jsp"
	
}
