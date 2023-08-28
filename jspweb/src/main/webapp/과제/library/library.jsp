<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    
    <!-- css import -->
    <link href="library.css" rel="stylesheet" />
        
</head>
<body>
    <h1 class="title">도서관</h1>
    <div class="librarywrap"> <!-- 전체구역 -->
        <div class="button_wrap"> <!--  버튼 구역  -->
            <div class="buttonarea">
                <button data-lno="1" onclick="getValue(this)" type="button">1</button>
                <button data-lno="2" onclick="getValue(this)" type="button">2</button>
                <button data-lno="3" onclick="getValue(this)" type="button">3</button>
                <button data-lno="4" onclick="getValue(this)" type="button">4</button>
                <button data-lno="5" onclick="getValue(this)" type="button">5</button>
                <button data-lno="6" onclick="getValue(this)" type="button">6</button>
                <button data-lno="7" onclick="getValue(this)" type="button">7</button>
                <button data-lno="8" onclick="getValue(this)" type="button">8</button>
            </div>
        </div>
        <div class="inputarea">
            <input class="name" type="text" placeholder="이름">
            <input class="phone" type="text" placeholder="전화번호">
        </div>
        <div class="bottom_button">
            <button onclick="admission()" type="button">[ 입실 ]</button>
            <button onclick="ldelete()" type="button">[ 퇴실 ]</button>
        </div>
    </div>

    <!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <!-- js import -->
    <script src="library.js" type="text/javascript"></script>
</body>
</html>