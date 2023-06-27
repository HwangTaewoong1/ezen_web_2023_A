/*  [ JS 연산자 과제1 ]
   문제11 : 정수 3개를 입력받아 오름차순 으로 출력    [ 7 5 9 -> 5 7 9]
   문제12 : [ 가위바위보 게임 ] 
   - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다. 
   - 승리자 판단과 무승부 경우의수를 출력하시오.
   [입력]
      플레이어1가 0 혹은 1 혹은 2 입력받아 변수에 저장합니다.
      플레이어2가 0 혹은 1 혹은 2 입력받아 변수에 저장합니다.
   [경우의수 판단]
      플레이어1 이겼을때 경우의수 ' 플레이어1 승리 ' 출력
      플레이어2 이겼을때 경우의수 ' 플레이어2 승리 ' 출력
      비겼을경우 '무승부' 출력
*/

//문제 11

let num1 = parseInt(prompt("첫 번째 정수를 입력하세요:"));
let num2 = parseInt(prompt("두 번째 정수를 입력하세요:"));
let num3 = parseInt(prompt("세 번째 정수를 입력하세요:"));

let min, mid, max;

// num1과 num2 비교
min = (num1 < num2) ? num1 : num2;
max = (num1 > num2) ? num1 : num2;

// num3과 비교하여 최소, 중간, 최대 값 결정
min = (num3 < min) ? num3 : min;
max = (num3 > max) ? num3 : max;
mid = (num1 + num2 + num3) - (min + max);

console.log("입력한 정수를 오름차순으로 정렬한 결과: " + min + ", " + mid + ", " + max)

//문제 12

// 가위바위보 게임
// 가위: 0, 바위: 1, 보: 2

// 플레이어1과 플레이어2의 선택을 입력받음
let player1 = parseInt(prompt("플레이어1의 선택을 입력하세요. (0: 가위, 1: 바위, 2: 보)"));
let player2 = parseInt(prompt("플레이어2의 선택을 입력하세요. (0: 가위, 1: 바위, 2: 보)"));

// 승리자 판단
let winner = player1 === player2 ? '무승부' :
             player1 === 0 && player2 === 2 ? '플레이어1' :
             player1 === 1 && player2 === 0 ? '플레이어1' :
             player1 === 2 && player2 === 1 ? '플레이어1' :
             '플레이어2';

// 결과 출력
console.log('플레이어1: ' + player1);
console.log('플레이어2: ' + player2);
console.log('승리자: ' + winner);