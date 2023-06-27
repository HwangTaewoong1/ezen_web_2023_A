// 틱택토 보드 배열
let board = ["", "", "", "", "", "", "", "", ""];

// 현재 플레이어 (o: 사람, x: 컴퓨터)
let currentPlayer = "o";

// HTML으로 버튼 생성하는 함수
function createButtons() {
  const container = document.getElementById("container");
  for (let i = 0; i < 9; i++) {
    const button = document.createElement("button");
    button.classList.add("cell");
    button.addEventListener("click", () => handleCellClick(i));
    container.appendChild(button);
  }
}

// 셀 클릭 이벤트 처리 함수
function handleCellClick(index) {
  if (board[index] === "" && currentPlayer === "o") {
    board[index] = currentPlayer;
    document.getElementById("cell-" + index).textContent = currentPlayer;
    if (checkWin(currentPlayer)) {
      displayMessage("게임 종료! " + currentPlayer + "가 이겼습니다.");
      resetGame();
    } else if (board.indexOf("") === -1) {
      displayMessage("게임 종료! 무승부입니다.");
      resetGame();
    } else {
      currentPlayer = "x";
      setTimeout(computerMove, 500);
    }
  }
}

// 컴퓨터의 랜덤 움직임
function computerMove() {
  const emptyCells = board.reduce((cells, cell, index) => {
    if (cell === "") {
      cells.push(index);
    }
    return cells;
  }, []);
  const randomIndex = Math.floor(Math.random() * emptyCells.length);
  const computerIndex = emptyCells[randomIndex];
  board[computerIndex] = currentPlayer;
  document.getElementById("cell-" + computerIndex).textContent = currentPlayer;
  if (checkWin(currentPlayer)) {
    displayMessage("게임 종료! " + currentPlayer + "가 이겼습니다.");
    resetGame();
  } else if (board.indexOf("") === -1) {
    displayMessage("게임 종료! 무승부입니다.");
    resetGame();
  } else {
    currentPlayer = "o";
  }
}

// 승리 조건 확인 함수
function checkWin(player) {
  const winConditions = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
  ];
  return winConditions.some(condition => {
    return condition.every(index => {
      return board[index] === player;
    });
  });
}

// 메시지 출력 함수
function displayMessage(message) {
  document.getElementById("message").textContent = message;
}

// 초기화 함수
function resetGame() {
  board = ["", "", "", "", "", "", "", "", ""];
  currentPlayer = "o";
  clearBoard();
}

// 보드 초기화 함수
function clearBoard() {
  const buttons = document.getElementsByClassName("cell");
  Array.from(buttons).forEach(button => {
    button.textContent = "";
  });
}

// 초기화 및 게임 시작
resetGame();
createButtons();