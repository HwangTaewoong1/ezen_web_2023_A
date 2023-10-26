DROP DATABASE if exists JSPWEB;
CREATE DATABASE JSPWEB; 
USE JSPWEB;

# 1000일게시판
DROP TABLE if exists visitlog ;
create table visitlog (						
	vno int auto_increment,				-- 식별번호( 방문록 번호 ) , 자동번호 부여 			
    vwriter varchar(30) not null , 		-- ( 방문록 작성자 명 ) , 공백불가능  
    vcontent text not null , 			-- ( 방문록 내용 ) , 공백불가능
    vdate datetime default now() , 		-- ( 방문록 작성일/시간 ) , 생략시 자동날짜/시간 부여
    vimg longtext,
    primary key( vno )
);

# 회원 DB
DROP TABLE if exists member;
create table member (						
	mno int auto_increment,				-- 식별번호( 가계부 번호 ) , 자동번호 부여 			
    mid varchar(20) not null unique, 			
    mpwd varchar(20) not null,
    memail varchar(50) not null unique, 		
    mimg longtext  , 		# 만약에 프로필 미등록시 기본 프로필 사용
    mnickname varchar(20) not null unique ,
    primary key( mno )
);

# 게시판 카테고리 
drop table if exists bcategory;
create table bcategory(						
	bcno int auto_increment ,
    bcname varchar(30) not null ,
    primary key( bcno ) 
);
# 샘플 [ 공지사항 자유게시판 노하우 ] 
insert into bcategory ( bcno , bcname  ) values ( 1 ,'공지사항');
insert into bcategory ( bcno , bcname  ) values ( 2 ,'자유게시판');
insert into bcategory ( bcno , bcname  ) values ( 3 ,'노하우/팁');

# 게시판 
drop table if exists board;
create table board(						
	bno int auto_increment ,
    btitle varchar(30) not null ,
    bcontent longtext ,
    bfile longtext ,
    bdate datetime default now() ,
    bview int default 0 ,
    mno int ,
    bcno int ,
    mnickname varchar(20) not null ,
    primary key ( bno ) ,
    foreign key ( mno ) references member ( mno ) on delete cascade, -- 회원 탈퇴시 게시물도 같이 삭제 [ 제약 조건 ]
    foreign key ( bcno ) references bcategory ( bcno )	on delete cascade on update cascade -- 카테고리 삭제시 게시물도 삭제 , 카테고리번호 변경시 fk도 같이변경 [ 제약조건 ]				
				
);
# 공지사항 
drop table if exists noticeboard;
create table noticeboard(						
	bno int auto_increment ,
    btitle varchar(30) not null ,
    bcontent longtext ,
    bfile longtext ,
    bdate datetime default now() ,
    bview int default 0 ,
    mno int ,
    bcno int ,
    mnickname varchar(20) not null ,
    primary key ( bno ) ,
    foreign key ( mno ) references member ( mno ) on delete cascade, -- 회원 탈퇴시 게시물도 같이 삭제 [ 제약 조건 ]
    foreign key ( bcno ) references bcategory ( bcno )	on delete cascade on update cascade -- 카테고리 삭제시 게시물도 삭제 , 카테고리번호 변경시 fk도 같이변경 [ 제약조건 ]				
	
);
# 댓글
drop table if exists comment;
create table comment(
	cmno int auto_increment ,
    cmcontent varchar(255) not null ,
    cmdate datetime default now() ,
    bno int ,
    mno int ,
    mnickname varchar(20) not null ,
	primary key ( cmno ) ,
	foreign key ( mno ) references member ( mno ) on delete cascade, -- 회원 탈퇴시 댓글도 같이 삭제 [ 제약 조건 ]
	foreign key ( bno ) references board ( bno ) on delete cascade -- 게시물 삭제시 댓글도 같이 삭제 [ 제약 조건 ]
);

SELECT * from member;
select * from noticeboard;
select * from visitlog;











