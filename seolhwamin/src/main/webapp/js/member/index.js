vread();
function vread() {
  $.ajax({
    url: "/seolhwamin/VisitLogController",
    method: "get",
    data: "",
    success: function f(r) {
      console.log(r);

      // - 응답 받은 객체를 HTML에 출력
      // 1. [어디에] 출력할 구역의 객체 호출
      let output = document.querySelector('.dayul');

      // 2. [무엇을] 반복문 이용한 데이터를 HTML 형식으로 만들기
      let html = ``; // ` 백틱

      // 리스트내 모든 데이터를
      for (let i = 0; i < r.length; i++) {
        // 리스트내 모든 객체의 데이터를 HTML 형식으로 HTML변수에 누적 더하기
        html += `<div class="visitbox">
			          	<a class="vcontent" href="/seolhwamin/1000Day/1000Day.jsp">${r[i].vcontent}</a>	 
			            <div class="visitdate"> ${r[i].vdate} </div>
          		</div>`;
      }

      // 3. [대입] 출력객체 HTML형식 대입
      output.innerHTML = html;
    },
    error: function f(r) {}
  });
}