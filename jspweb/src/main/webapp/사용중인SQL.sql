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

# 1. 저장 insert / 레코드 추가 
#insert into visitlog ( vwirter , vpwd , vcontent ) values( '김현수' , '1234' , '안녕하세요');
# insert into visitlog ( vwirter , vpwd , vcontent ) values( ? , ? , ?);

# 2. 호출 select / 모든 레코드 검색 / 정렬(최신글부터 출력)
#select * from visitlog order by vdate desc;

# 3. 수정 [ 삭제할 조건 필수 ]
#update visitlog set vcontent = '내용수정했다' where vno = 3; /* vno 3이면 vcontent 필드의 값을 수정 */
#update visitlog set vcontent = '내용수정했다' where vno = 3 and vpwd = '1234';  /* vno 3이면서 vpwd 1234이면 vcontent 필드의 값을 수정 */

# 4. 삭제 [ 삭제할 식별자 필수 ] 
#delete from visitlog; 	/* 모든 레코드 삭제 */
#delete from visitlog where vno = 3;  /* vno 3이면 삭제 */
#delete from visitlog where vno = 3 and vpwd = '1234';  /*vno 3이면서 vpwd 1234이면 레코드 삭제 */

DROP TABLE if exists accountbook;
create table accountbook (						
	vno int auto_increment,				-- 식별번호( 가계부 번호 ) , 자동번호 부여 			
    vcontent text not null , 			-- (항목내용)
    vmoney text not null,
    vdate text not null , 		-- ( 방문록 작성일/시간 ) , 생략시 자동날짜/시간 부여
    primary key( vno )
);

DROP TABLE if exists member;
create table member (						
	mno int auto_increment,				-- 식별번호( 가계부 번호 ) , 자동번호 부여 			
    mid varchar(20) not null unique, 			
    mpwd varchar(20) not null,
    memail varchar(50) not null unique, 		
    mimg longtext  , 		# 만약에 프로필 미등록시 기본 프로필 사용
    primary key( mno )
);

select * from member;
#--------------
# 1. 회원가입
# insert into member( mid , mpwd , memail , mimg ) values( 'qweqwe' , 'a1234' , 'qwe@qwe.com' , 'default.jpg' );
# insert into member( mid , mpwd , memail , mimg ) values( ? , ? , ? , ? );

# 2. 아이디 중복검사 [ 특정 mid의 아이디로 검색했을때 존재하면 중복된 아이디 , 없으면 사용가능한 아이디] 
select * from member where mid = 'qweqwe';
# select * from member where mid = ?;
select * from member;
# 3. 로그인 [ 아이디와 비밀번호가 이리한 레코드 존재여부 ]
select * from member where mid = 'qweqwe' and mpwd ='qweqwe'; # 레코드가 검색되면 로그인 성공 / 없으면 로그인 실패
# select * from member where mid = ? and mpwd = ?;

# 4. 회원정보 호출 [ 아이디를 이용해서 패스워드 제외(보안상)하고 모든 회원정보 호출 ] 
select mno , mid , memail , mimg from member where mid = 'qweqwe';
# select mno , mid , memail , mimg from member where mid = ?;

# 5. 회원탈퇴 [ 누구(mno)를 탈퇴할껀지 , 검증(탈퇴할 회원의 패스워드) ]
delete from member where mno = 1 and mpwd ='qweqwe'; # 1번 회원의 패스워드가 'qweqwe'이면 레코드삭제 

# 6. 프로필 수정  [ 누구(mno)를 수정할껀지 , 수정할 내용(사진명) ]
update member set mimg = 'asdasd.jpg' where mno = 1; # 1번 회원의 이미지명을 변경

DROP TABLE if exists library;
create table library (						
	lno int not null unique,		-- 좌석번호 			
    lname varchar(10) not null , 	-- 이름 		
    lphone varchar(20) not null unique -- 연락처
);
insert into library ( lno , lname , lphone ) values ( 1 , '유재석' , '010-8509-6906' );
SELECT lphone FROM library WHERE lno = 1;
select * from library;

DROP TABLE if exists hrm;
create table hrm (						
	hno int auto_increment,				-- 식별번호( 직원번호 ) , 자동번호 부여
    himg longtext not null , 				# 직원사진
    hname varchar(20) not null, 			# 직원이름		
    hphone varchar(20) not null unique, 	# 직원번호
	hrank varchar(10) not null,				# 직급
    hdate text not null,					# 등록일 
    primary key( hno )
);
select * from hrm;

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
insert into bcategory ( bcno , bcname  ) values ( 3 ,'노하우');

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
    primary key ( bno ) ,
    foreign key ( mno ) references member ( mno ) on delete cascade, -- 회원 탈퇴시 게시물도 같이 삭제 [ 제약 조건 ]
    foreign key ( bcno ) references bcategory ( bcno )	on delete cascade on update cascade -- 카테고리 삭제시 게시물도 삭제 , 카테고리번호 변경시 fk도 같이변경 [ 제약조건 ]				
    				
);
#---------------------------------------------------------------#
# 1. 글등록
insert into board( btitle , bcontent , bfile , mno , bcno )values('제목' , '내용' ,null , 1 , 2 ); 
# 1번 회원이 2번 카테고리(자유게시판)에 제목 , 내용 , 첨부파일 등록 
# insert into board( btitle , bcontent , bfile , mno , bcno )values( ? , ? , ? , ? , ? ); 

select * from board;
select * from bcategory;