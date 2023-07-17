package 과제.과제3.Level2;

import java.util.Scanner;

public class If문제7문제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* -------문제1----- */
		System.out.println("문제1");
		System.out.print("첫 번째 정수를 입력하세요: ");
		int 정수1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int 정수2 = scanner.nextInt();
		
		if(정수1>정수2) {
			System.out.println("더 큰수는 정수1 입니다."); }
		else if(정수1==정수2) {
			System.out.println("입력한 두 정수가 같습니다."); }
		else { System.out.println("더 큰수는 정수2 입니다."); }
		/* -------문제2----- */
		System.out.println("문제2");
		System.out.print("첫 번째 정수를 입력하세요: ");
		int 세정수1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int 세정수2 = scanner.nextInt();
		System.out.print("세 번째 정수를 입력하세요: ");
		int 세정수3 = scanner.nextInt();
		
		int max;

		if (세정수1 > 세정수2) {
		    if (세정수1 > 세정수3) {
		        max = 세정수1;
		    } else {
		        max = 세정수3;
		    }
		} else {
		    if (세정수2 > 세정수3) {
		        max = 세정수2;
		    } else {
		        max = 세정수3;
		    }
		}

		System.out.println("가장 큰 수는 " + max + "입니다.");
		/* -------문제3----- */
		System.out.println("문제3");
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = scanner.nextInt();
		System.out.print("세 번째 정수를 입력하세요: ");
		int num3 = scanner.nextInt();
		
		int temp;
			
		
		if (num1 > num2) {
		    temp = num1;
		    num1 = num2;
		    num2 = temp;
		}

		if (num2 > num3) {
		    temp = num2;
		    num2 = num3;
		    num3 = temp;

		    if (num1 > num2) {
		        temp = num1;
		        num1 = num2;
		        num2 = temp;
		    }
		}
		System.out.println("오름차순 정렬 결과: " + num1 + ", " + num2 + ", " + num3);
		System.out.println("내림차순 정렬 결과: " + num3 + ", " + num2 + ", " + num1);
		
		/* -------문제4----- */
		System.out.println("문제4");
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		if( score>=90 ) {
			System.out.println("합격");
		}else{ System.out.println("불합격");}
		/* -------문제5----- */
		System.out.println("문제5");
		System.out.print("점수를 입력하세요: ");
		int score2 = scanner.nextInt();
		if ( score2 >= 90 ) {
			System.out.println("등급은 A등급입니다.");
		}else if( score2 >= 80) {
			System.out.println("등급은 B등급입니다.");
		}else if( score2 >= 70) {
			System.out.println("등급은 C등급입니다.");
		}else {System.out.println("재시험 입니다.");}
		/* -------문제6----- */
		System.out.println("문제6");
		System.out.print("국어점수를 입력하세요: ");
		int kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		int eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		int mat = scanner.nextInt();
		int total = kor + eng + mat;
		String korgrade=""; // 과목성적을 저장하는 변수
		String enggrade="";
		String matgrade="";
		
		if ( total >= 90 ) {
			
			if( kor >= 100 ) { korgrade = " 국어우수";}
			if( eng >= 100 ) { enggrade = " 영어우수";}
			if( mat >= 100 ) { matgrade = " 수학우수";}
			System.out.println("시험에 합격하셨습니다. " + "추가상장 :" + korgrade + enggrade + matgrade );
		}
		else if ( total >= 80 ) { // 점수가 90점 미만이면
		
			if( kor >= 90 ) { korgrade = " 국어장려";}
			if( eng >= 80 ) { enggrade = " 영어장려";}
			if( mat >= 70 ) { matgrade = " 수학장려";}
			System.out.println("시험에 합격하셨습니다. " +  "추가상장 :" + korgrade + enggrade + matgrade );
		}
		else { System.out.println("재시험");
		}
		
		/* -------문제7----- */
		System.out.println("문제7");
		System.out.print("아이디를 입력하세요: ");
		String 아이디 = scanner.next();
		System.out.print("비밀번호를 입력하세요: ");
		String 비밀번호 = scanner.next();
		if (아이디.equals("admin") && 비밀번호.equals("1234")) {
		    System.out.println("로그인 성공");
		} else {
		    System.out.println("로그인 실패");
		}
		
	
	}
}

/*
 	 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 [ 경우의수 : 3개(크다,작다,같다=그외) ]
 	 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
 	 문제3 : 3개의 정수를 입력받아서 오름차순[>] / 내림차순[<] [ 경우의수 :  3 7 5 : 3>7 , 3>5 , 7>5     총 : 3개  ] 
 	 문제4 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 [ 경우의수 : 2개 ]
 	
 	 문제5 : 
			// 점수를 입력받아 점수가 90점 이상이면 A등급
			//				점수가 80점 이상이면 B등급
			//				점수가 70점 이상이면 C등급
			//				그외 재시험
	
	
 	 문제6	[ 경우의수 3개 , 첫번째 경우의수 : 3개 , 두번째 경우의수 : 3개 ] 총 9개  
			[ 입력 ] : 국어,영어,수학 입력받기
			[ 조건 ]
				평균이 90점 이상이면서 
					국어점수 100점 이면 '국어우수' 출력
					영어점수 100점 이면 '영어우수' 출력
					수학점수 100점 이면 '수학우수' 출력
				평균이 80점 이상이면서 
					국어점수 90점이상 이면 '국어장려' 출력
					영어점수 90점이상 이면 '영어정려' 출력
					수학점수 90점이상 이면 '수학장려' 출력
				그외 재시험 
		 
	문제7 로그인페이지
	 		[ 입력 ] : 아이디와 비밀번호를 입력받기
	 		[ 조건 ] : 회원아이디가 admin 이고 
	           			비밀번호가 1234 일 경우에는 
	          			로그인 성공 아니면 로그인 실패 출력
 */
