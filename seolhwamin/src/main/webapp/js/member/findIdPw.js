

$(document).ready(function () { // 아이디 찾기 함수 
    $("#findIdButton").click(function () {
		var mnickname = $("#findIdNickname").val();
        var memail = $("#findIdEmail").val();
        console.log(memail); console.log(mnickname);
        $.ajax({
            type: "GET",
            url: "/seolhwamin/MemberFindController",
            data: { type: "findId", mnickname: mnickname , memail : memail },
            dataType: "json",
            success: function (data) {
                if (data && data.id) {
                    $("#foundId").text(" 사용자 ID: " + data.id);
                } else {
                    $("#foundId").text("유효한 ID를 찾을 수 없습니다.");
                }
            },
            error: function () {
                $("#foundId").text("서버 오류가 발생했습니다.");
            }
        });
    });

   $("#findPwButton").click(function () { // 비밀번호 재설정 함수
    var mid = $("#findPwMid").val();
    var memail = $("#findPwEmail").val();
    console.log(mid); console.log(memail);
   // 랜덤 비밀번호 생성 및 출력
	const newPassword = generateRandomPassword();
	console.log(newPassword);
	
    $.ajax({
        type: "POST", // 비밀번호 업데이트를 위해 GET 대신 POST 사용
        url: "/seolhwamin/MemberFindController",
        data: { type: "resetPw", data1: mid, data2: memail, newPassword: newPassword }, // 새 비밀번호를 전송
        dataType: "json",
        success: function (data) {
            if (data && data.updated) {
                $("#foundPwd").text("임시 비밀번호 "+ newPassword + " 가 발급되었습니다. 새로운 비밀번호로 로그인하시고 비밀번호를 변경해주세요.");
            } else {
                $("#foundPwd").text("유효한 비밀번호를 찾을 수 없습니다.");
            }
        },
        error: function () {
            $("#foundPwd").text("서버 오류가 발생했습니다.");
        }
    });
});

function generateRandomPassword() {
   // 사용할 문자 및 숫자 집합
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    const passwordLength = 10;
    let randomPassword = '';

    // 비밀번호 길이(10자) 만큼 반복하여 랜덤 문자 선택
    for (let i = 0; i < passwordLength; i++) {
        const randomIndex = Math.floor(Math.random() * characters.length);
        randomPassword += characters.charAt(randomIndex);
    }

    return randomPassword;
}
});
