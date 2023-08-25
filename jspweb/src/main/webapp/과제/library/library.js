console.log('library.js 열림');

let lno = ``; // 버튼값 저장 전역변수
let lphoneFromDB = ``; // db에서 특정 lno 값과 같은 레코드의 phone 값

// 버튼값 불러오는 함수
function getValue(button) {
    lno = button.textContent;
    alert("눌린 버튼의 값: " + lno);
}

// 4. delete ( 삭제 ) : 방문록 삭제 함수 = vdelete
function ldelete() {
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