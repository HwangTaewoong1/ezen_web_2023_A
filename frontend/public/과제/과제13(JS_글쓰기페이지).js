let 글쓰기리스트 = [ ]

console.log('js 열림');
listpage();

// 1. 등록 버튼 클릭했을때 이벤트 
function addItem(){ 	console.log('글 등록 함수 클릭');
	// 1. HTML 특정 태그를 가져오기 
	//document.getElementsByClassName("클래스명")
	let idInput = document.querySelector("#id-input");	 	console.log( idInput )
	let pwInput = document.querySelector("#pw-input");		console.log( pwInput )
	let titleInput = document.querySelector("#title-input");		console.log( titleInput )
	let contentInput = document.querySelector("#content-input");		console.log( contentInput )
	
	
	// 2. 태그의 입력된 값 호출 
	let id = idInput.value;		console.log( id )
	let pw = pwInput.value;		console.log( pw )
	let title = titleInput.value;	console.log( title )
	let content = contentInput.value;	console.log( content )
	let currentTime = new Date();
	let years = currentTime.getFullYear();
	let months =currentTime.getMonth();
	let dates = currentTime.getDate();
    let hours = currentTime.getHours();
    let minutes = currentTime.getMinutes();
    let seconds = currentTime.getSeconds();
	let timeString = years+ "년 "+ months + "월 " + dates + "일 " + hours + ":" + minutes + ":" + seconds;
	// * 유효성검사 : 만약에 3가지중에 하나라도 공백이면 
	if( id == '' || pw == '' || title == '' || content =='' ){ 
		alert(' 미입력이 존재합니다. [등록불가] ');
		return; // 함수 강제종료 // return 실행되면 아래 코드는 실행x
	}
	
	let writer = { 아이디 : id , 비밀번호 : pw , 제목 : title , 내용 : content , 작성일 : timeString}; console.log( writer );
	// 3. 배열 저장 
	글쓰기리스트.push( writer );		console.log( 글쓰기리스트 )
	alert('게시글 작성이 완료되었습니다.');

       
      

     
	// ------------------------------ 입력상자 초기화 ------
	document.querySelector("#id-input").value = ``	 	
	document.querySelector("#pw-input").value = ``		
	document.querySelector("#title-input").value = ``	
	document.querySelector("#content-input").value = ``
} // f end 

function listpage(){ 	console.log('글 목록 페이지 함수 클릭');
	// 1. 어디에 출력할껀지??? table 가져오기 
	let outputTable = document.querySelector('.outputTable')
	// 2. 무엇을???? 
	let html = `<tr> <th> 번호 </th> <th> 제목 </th> <th> 작성자</th> <th> 작성일 </th> <th> 조회수 </th> </tr>`			
	for( let i = 0 ; i<글쓰기리스트.length ; i++ ){
		// i는 0부터 마지막인덱스까지 1씩 증가 반복 -> 글쓰기리스트(전체) 중에서 회원1명(1개씩) 꺼내서
		let member = 글쓰기리스트[i];	// i번째 인덱스의 객체1개 꺼내기 
		
		html += `<tr>
					<td> ${ [i+1] } </td>
					<td> <div onclick="viewpoint()"> ${ member.제목 }</div> </td>
					<td> ${ member.id} </td>
					<td> ${ member.작성일} </td>
					<td> ${ [i]} </td>
					
				</tr>`	// 삭제할 인덱스번호를 삭제()함수에 인수로 전달
	
	} // if 2 조건 모두 충족했을때 login 변수는 true값 으로 변경 
	
		
	
	// 3. table 에 HTML  넣어주기  <table> inner </table>
	outputTable.innerHTML = html ;
} // f end
function viewpoint(){ console.log('조회수 함수 클릭')
	f
}
