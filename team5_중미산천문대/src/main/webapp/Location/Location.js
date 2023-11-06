let carList = ['3333', '4444', '5555'];

let parkTime = [
  { 차량번호: '09러3333', 주차시간: 34, price: 5500, category: 0 },
  { 차량번호: '48노4444', 주차시간: 23, price: 5000, category: 1 },
  { 차량번호: '134도5555', 주차시간: 42, price: 6000, category: 2 },
];

function calculate() {
  let park = document.querySelector('.parking').value;
  let print = document.querySelector('.printBox');
  let html = '';

  for (let i = 0; i < carList.length; i++) {
    if (carList[i] === park && parkTime[i].category === i) {
      html += `
        <div>
          <div class="number"> ${parkTime[i].차량번호} </div>
          <div class="park"> ${parkTime[i].주차시간}분 </div>
          <div class="price"> ${parkTime[i].price.toLocaleString()}원 </div>
        </div>
      `;
    }
  }

  if (html === '') {
    alert('차량번호가 없습니다. 다시 입력해주세요.');
  }

  print.innerHTML = html;
}
