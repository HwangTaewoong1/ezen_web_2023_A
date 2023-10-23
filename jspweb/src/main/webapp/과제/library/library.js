console.log('library.js 열림');

let lno = ``; // 버튼값 저장 전역변수
let lphoneFromDB = ``; // db에서 특정 lno 값과 같은 레코드의 phone 값

// 버튼값 불러오는 함수
function getValue(button) {
    lno = button.textContent;
    alert("누른 좌석번호: " + lno);
}

function admission() {
	 if (!lno) {
        alert('안내] 좌석번호를 먼저 선택해주세요.');
        return;
    }
    
    let nameInput = document.querySelector('.name');
    let phoneInput = document.querySelector('.phone');
   
    let name = nameInput.value;
       let phone = phoneInput.value;
   
    if (name === "" || phone === "" || lno === "") {
        alert('안내] 모든 정보를 입력해주세요.');
        return; // 입력되지 않은 정보가 하나라도 있으면 입실 불가능
    }
     // 이미 사용 중인 좌석 확인
    if (lphoneFromDB === phone) {
        alert('안내] 이미 사용 중인 좌석입니다. 다른 좌석을 이용해주세요.');
        return;
    }
    
   
    let info = {
        lno: lno, // 이미 선언된 전역 변수 lno 사용
        name: nameInput.value,
        phone: phoneInput.value,
    };

    console.log(info);

     $.ajax({
         url : "/jspweb/library", 
         method : "post",      
         data : info ,
         success : function f(r){console.log( r );
            if( r === "true"){
				 alert('입실 성공');
       			  		
        		let button = document.querySelector(`button[data-lno="${lno}"]`);
                if (button) {
                    button.style.backgroundColor = "green"; // 변경할 색상
                    
                lno = 0;			// 좌석 및 입력값 초기화
                nameInput.value = ""; 
        		phoneInput.value = "";
        		}
			}
            else{alert('안내] 이미 사용중인 좌석입니다. 다른 좌석을 이용해주세요.')}
         
         } ,       
         error : function f( r ){}       
      });
}

// 4. 퇴실
function ldelete() {
	 if (!lno) {
        alert('안내] 좌석번호를 먼저 선택해주세요.');
        return;
    }
	console.log("ldelete() open: " + "입력한 버튼값" + lno);
    let phoneNumber = prompt("전화번호를 입력하세요:");
    if (phoneNumber === null || phoneNumber.trim() === "") {
        alert("전화번호를 입력해주세요.");
        return;
    }
    
    $.ajax({
        url: "/jspweb/library",
        method: "get",
        data: { lno:lno },
        success: function (result) {
            console.log(result);
            lphoneFromDB = result[0].lphone
            console.log(phoneNumber)
			console.log(lphoneFromDB)
            if (phoneNumber === lphoneFromDB) {
                console.log("ldelete() open: " + lno);

                $.ajax({
                    url: "/jspweb/library",
                    method: "delete",
                    data: { lno:lno },
                    success: function (result) {
                        console.log("doDelete통신성공");
                        if (result == true) {
                            alert("성공적으로 퇴실처리 되었습니다.");  
                            let button = document.querySelector(`button[data-lno="${lno}"]`);
               			 	if (button) {
                   			 button.style.backgroundColor = "#3498db"; // 변경할 색상 
                   			 }  
                        } else {
                            alert("입력하신 전화번호가 올바르지 않습니다.");
                        }
                    },
                    error: function (result) {
                        console.log(result);
                    },
                });
            } else {
                alert("입력하신 전화번호가 올바르지 않습니다.");
            }
        },
        error: function (result) {
            console.log(result);
        },
    });
}