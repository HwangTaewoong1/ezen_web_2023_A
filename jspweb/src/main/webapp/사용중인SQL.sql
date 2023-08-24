DROP DATABASE if exists JSPWEB;
CREATE DATABASE JSPWEB; 
USE JSPWEB;

DROP TABLE if exists visitlog ;
create table visitlog (						
	vno int auto_increment,				-- 식별번호( 방문록 번호 ) , 자동번호 부여 			
    vwriter varchar(30) not null , 		-- ( 방문록 작성자 명 ) , 공백불가능  
    vpwd varchar(10) not null , 		-- ( 방문록 비밀번호 ) , 공백불가능
    vcontent text not null , 			-- ( 방문록 내용 ) , 공백불가능
    vdate datetime default now() , 		-- ( 방문록 작성일/시간 ) , 생략시 자동날짜/시간 부여
    primary key( vno )
);
DROP TABLE if exists member;
create table member (						
	mno int auto_increment,				-- 식별번호( 회원 번호 ) , 자동번호 부여 			
    mid varchar(20) not null unique, 	-- ( 회원아이디 ) , 공백불가능 , 중복불가능		
    mpwd varchar(20) not null,			-- ( 회원비밀번호 ) , 공백불가능
    meamil varchar(50) not null unique, 		-- ( 회원이메일 ) , 공백불가능
    mimg longtext  , 					-- ( 회원 프로필의 이미지사진 이름) 공백가능
    primary key( mno )
);