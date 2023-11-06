//0.현재 연도/월[초기값]
   //new Date() : 현재 날짜/시간 반환해주는 클래스
      //.getFullYear (),
let year = new Date().getFullYear();             //현재 연도
let month = new Date().getMonth()+1;         //현재 월(0~11)+1
let day= new Date().getDate();
console.log(day)

let contents = [] // 여러개 일정객체를 등록하는 배열
let checkIn =[]       //예약자 배열
let pay=0;      // 선택된 날짜의 금액 


//1. 현재 연도/월 기준으로 달력 출력해주는 함수
calPrint();
function calPrint(){
      //1. 현재 연도와 월 을 해당 구역에 출력하기
   document.querySelector('.caldate').innerHTML = `${ year } ${ month }`;
   
   
   // 현재 보고 있는 캘린더의 날짜
      let now=new Date(year,month-1,1);
      let sWeek = now.getDay();    
   //1. 요일과 일 출력
      let now2 = new Date(year,month,0);
      let eDay = now2.getDate(); 
      
   
   
   let calendar = document.querySelector('.calendar');
   let html = ' ';
         //1요일
         html +=`<div class="sunday week">일</div>      <div class="week">월</div>
                     <div class="week">화</div>            <div class="week">수</div>
                   <div class="week">목</div>            <div class="week">금</div>
                   <div class="week">토</div>`;
         //2. **** 현재 달력 1일의 요일까지 공백 출력
         for(let b = 1 ; b<=sWeek ; b++){   //1부터 1일의요일까지 공백 구역 출력
            html += `<div></div>`
         }
            for (let day = 1; day <= eDay; day++) {         //for start
           const clickedDate = new Date(year, month - 1, day);
           const dayOfWeek = clickedDate.getDay();
           if(clickedDate<new Date ()){					//현재 날짜와 달력에 있는 날짜 비교하기
			   html+=`<div class="day disabled" >${day}${contentPrint(`${year}-${month}-${day}`)}</div>`
			  
		   }else{
           if (dayOfWeek === 0 ) { // 0=일요일 일요일이 맞을때
             html += `<div class="day sunday" onclick="openPrint(${day})">${day}${contentPrint(`${year}-${month}-${day}`)}</div>`;
              } 
                 else if( dayOfWeek === 6){   //6=토요일 툐요일이 맞을때 
                    html +=`<div class="day saturday" onclick="openPrint(${day})">${day}${contentPrint(`${year}-${month}-${day}`)}</div>`
                 }
                    else {				//평일 일때 
             html += `<div class="day" onclick="openPrint(${day})">${day}${contentPrint(`${year}-${month}-${day}`)}</div>`;
                    }
             }     
         }               //for end
         
      calendar.innerHTML = html;
}

//6. 일정 출력함수 [ 실행조건 : 만약에 현재 날짜와 동일한 일정 날짜 찾아서 출력]
      // 인수 : 함수 안으로 들어오는 수/값/코드
      // 반환 : 함수{} 끝나고 함수 호출 했던곳으로 수/값/데이터 보내기 = 해당날짜의 일정 내용 HTML
function contentPrint(date){

   let html=' ';
   //인수로 들어온 날짜와 같은 일정목록에서 일정 찾기
   for(let i = 0 ; i<contents.length ; i++){
      if(date==contents[i].date){
         html+=   `${contents[i].content}`
         contents.push(contents[i])
         
      }
   }
   return html;
}


function onNext(check){
   

   if( check ==0){         //이전 달
      month --;            //현재 보고 있는 월 1 차감
      
         if(month<1){month=12; year--;}
         
   }else if(check ==1 ){   //다음 달
         month++                  //현재 보고 있는 월 1 증가
         
   }      if(month>12){month=1;year++;}
   
   
   calPrint();
}


function openPrint(day){
   
   let days = document.querySelectorAll('.day')
   
   for( let i = 0 ; i<days.length ; i++ ){
      
      if( days[i].innerHTML+' ' == day){
         days[i].style.backgroundColor = `#00af35`;
         days[i].style.color=`white`;
      }else{
         days[i].style.backgroundColor = ``;
         days[i].style.color=`black`
      }
   }

   
   //* 현재 클릭한 일수의 날짜 출력
   document.querySelector('.topItems').innerHTML= `${month}.${day}`
    // * 현재 클릭한 일수의 날짜와 요일 출력
    const clickedDate = new Date(year, month - 1, day);
    const dayOfWeek = clickedDate.getDay();
   
    //값 저장
     let weekPay = '';
     //월~목요일 금액과 금~일 금액 변경하기
  if (dayOfWeek >= 1 && dayOfWeek <= 4) {
    weekPay = '22,000';
  
  } else if (dayOfWeek === 5|| dayOfWeek ===6 || dayOfWeek ===0) {
   weekPay= '25,000';
  } 
  
    const monthString = month < 10 ? `0${month}` : month;
    const dayString = day < 10 ? `0${day}` : day;

    document.querySelector('.topItems').innerHTML = `${monthString}.${dayString} (${getWeekName(dayOfWeek)}) ${weekPay}원 `;
    document.querySelector('.inputText').innerHTML = `${monthString}.${dayString} (${getWeekName(dayOfWeek)}) ${weekPay}원 `;
   pay=weekPay;
} // f end 


//날짜 출력

function getWeekName(dayOfWeek) {
    const weekNames = ['일', '월', '화', '수', '목', '금', '토'];
    return weekNames[dayOfWeek];
}

//예약 버튼 클릭시 값 배열에 넣기


function check(){
   alert('예약이 완료되었습니다.')
   let name=document.querySelector('.names').value
   let email=document.querySelector('.emails').value
   let phone=document.querySelector('.phones').value

   let profile={name:name,  email:email,phone:phone , pay : pay ,}
   
   checkIn.push(profile);
   console.log(checkIn);
   
   document.querySelector('.topItems').innerHTML ='';
   document.querySelector('.inputText').innerHTML ='';
}










