package java1.day06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_확인문제9 { // class s

	public static void main(String[] args) { // main s
		
		
		int student = 0;
		String [] 점수 = null;
		// [ p.199 ] 확인문제 9
		
		while(true) { // while s // 무한루프
			
			System.out.println("-------------------------------------------- ");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------- ");
			System.out.print("선택> ");
		
			// step 3 : 경우의수가 있을대 경우의수에 따른 서로 다른 실행/코드 * 경우의 수 5가지 중에 선택(입력)
			// 입력
			// 1. Scanner 객체 새성 [ import ]
			Scanner scanner = new Scanner(System.in); 
			// 2. 객체.nextLine(); : 입력받은 데이터를 문자열로 반환 함수 // 3. 변수 저장
			String ch = scanner.nextLine();
			
			// 경우의 수 판단
			if( ch.equals("1") ) {
				System.out.print("학생수> "); student += scanner.nextInt();
				System.out.println("입력된 총 학생수 : " + student);
				점수 = new String[student];
				System.out.println( Arrays.toString( 점수 ) );
			}
			
			else if( ch.equals("2") ) { 
				for( int i = 0; i<student; i++ ) {
					System.out.print( "scores[" + i + "] > ");	
						int 점수2 = scanner.nextInt();
						점수[i] = Integer.toString(점수2);
						System.out.println( Arrays.toString( 점수 ) );
				}
			}
			
			else if( ch.equals("3") ) { 
				for( int i = 0; i<student; i++ ) {
					System.out.println( "scores[" + i + "] > " + 점수[i]);	
				}
			}
			
			else if( ch.equals("4") ) { 
				double sum = 0;
				int max = 0;
				for( int i = 0; i<student; i++ ) {
					sum += Double.parseDouble(점수[i]);
					if( max <= Integer.parseInt(점수[i]) ) { max = Integer.parseInt(점수[i]); }
				}
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + sum/student);
			}
			
			else if( ch.equals("5") ) { 
				System.out.println("프로그램 종료");
				break;
			}
			
			
		
		} // while e
	} // main e
} // class e
