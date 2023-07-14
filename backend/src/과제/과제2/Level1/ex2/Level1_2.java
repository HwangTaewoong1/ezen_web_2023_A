package 과제.과제2.Level1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean 논리 = 5>1;
		System.out.printf("%-10s   %15s   %30s\n" , "boolean" , 논리 , "true or false" );
		byte 임의1 = 100;
		System.out.printf("%-10s   %15s   %30s\n" , "byte" , 임의1 , "-128 ~ 127" );
		char 임의2 = 'A';
		System.out.printf("%-10s   %15s   %30s\n" , "char" , 임의2 , "0~65535[ character 1 ]" );
		short 임의3 = 30000;
		System.out.printf("%-10s   %15s   %30s\n" , "short" , 임의3 , "-32768 ~ 32767" );
		int 임의4 = 2000000000;
		System.out.printf("%-10s   %15s   %30s\n" , "int" , 임의4 , "-+2000 million" );
		long 임의5 = 40000000000L;
		System.out.printf("%-10s   %15s   %30s\n" , "long" , 임의5 , "-+2000 million Excess" );
		float 임의6 = 3.1231232f;
		System.out.printf("%-10s   %15s   %30s\n" , "float" , 임의6 , "8 decimal places" );
		double 임의7 =3.123123123;
		System.out.printf("%-10s   %15s   %30s\n" , "double" , 임의7 , "17 decimal places" );
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
