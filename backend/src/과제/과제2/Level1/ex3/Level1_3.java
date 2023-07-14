package 과제.과제2.Level1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		System.out.print("input boolean: ");
		boolean 논리 = scanner.nextBoolean();
		System.out.print("input byte: ");
		byte 값1 = scanner.nextByte();
		System.out.print("input char: ");
		char var1 = scanner.next().charAt(0);
		System.out.print("input short: ");
		short 값2 = scanner.nextShort();
		System.out.print("input int: ");
		int 값6 = scanner.nextInt();
		System.out.print("input long: ");
		long 값3 = scanner.nextLong();
		System.out.print("input float: ");
		float 값4 = scanner.nextFloat();
		System.out.print("input double: ");
		double 값5 = scanner.nextDouble();
		
		System.out.println("output boolean : " + 논리);
		System.out.println("output byte : " + 값1);
		System.out.println("output char : " + var1);
		System.out.println("output short : " + 값2);
		System.out.println("output int : " + 값6);
		System.out.println("output long : " + 값3);
		System.out.println("output float : " + 값4);
		System.out.println("output double : " + 값5);
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
