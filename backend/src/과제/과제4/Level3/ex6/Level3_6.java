package 과제.과제4.Level3.ex6;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Level3_6 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_6 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		/* 문제풀이 위치 */
		int seat1 = 0;	int seat3 = 0;	int seat5 = 0;
		int seat2 = 0; 	int seat4 = 0; 	int seat6 = 0;
		while(true) {
			System.out.println("0. 메뉴 : 1. 예약하기 2. 예약취소 3. 예약현황");
			System.out.print(">>> 선택 : ");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("1. 예약할 좌석 선택 : ");
				int ch2 = scanner.nextInt();
				if(ch2 == 1) {
					if(seat1 == 0 ) {
						System.out.println(" 정상적으로 예약 되었습니다. "); seat1 = 1;
					}else System.out.println(" 이미 예약된 좌석입니다. ");
				} 
				else if(ch2 == 2) {
					if(seat2 == 0 ) {
						System.out.println(" 정상적으로 예약 되었습니다. "); seat2 = 1;
					}else System.out.println(" 이미 예약된 좌석입니다. ");
				}
				else if(ch2 == 3) {
					if(seat3 == 0 ) {
						System.out.println(" 정상적으로 예약 되었습니다. "); seat3 = 1;
					}else System.out.println(" 이미 예약된 좌석입니다. ");
				}
				else if(ch2 == 4) {
					if(seat4 == 0 ) {
						System.out.println(" 정상적으로 예약 되었습니다. "); seat4 = 1;
					}else System.out.println(" 이미 예약된 좌석입니다. ");
				}
				else if(ch2 == 5) {
					if(seat5 == 0 ) {
						System.out.println(" 정상적으로 예약 되었습니다. "); seat5 = 1;
					}else System.out.println(" 이미 예약된 좌석입니다. ");
				}
				else if(ch2 == 6) {
					if(seat6 == 0 ) {
						System.out.println(" 정상적으로 예약 되었습니다. "); seat6 = 1;
					}else System.out.println(" 이미 예약된 좌석입니다. ");
				}
				else {
					System.out.println(" 잘못된 입력입니다 다시 입력해주세요. ");
				}
			}
			else if(ch == 2) {
				System.out.println("2. 예약 취소할 좌석 선택 : ");
				int ch3 = scanner.nextInt();
				if(ch3 == 1) { seat1 = 0; } 
				else if(ch3 == 2) { seat2 = 0; }
				else if(ch3 == 3) { seat3 = 0; }
				else if(ch3 == 4) { seat4 = 0; }
				else if(ch3 == 5) { seat5 = 0; }
				else if(ch3 == 6) { seat6 = 0; }
				System.out.println(" 정상적으로 예약이 취소되었습니다.");
			}
			else if( ch == 3) {
				if(seat1 == 1) System.out.print("[ 예약 ] ");
				else System.out.print("[ ] ");
				if(seat2 == 1) System.out.print("[ 예약 ] ");
				else System.out.print("[ ] ");
				if(seat3 == 1) System.out.print("[ 예약 ] ");
				else System.out.print("[ ] ");
				System.out.println();
				if(seat4 == 1) System.out.print("[ 예약 ] ");
				else System.out.print("[ ] ");
				if(seat5 == 1) System.out.print("[ 예약 ] ");
				else System.out.print("[ ] ");
				if(seat6 == 1) System.out.print("[ 예약 ] ");
				else System.out.print("[ ] ");
				System.out.println();
			}
		/* ----------- */
		}
	}
}
/* 
	주제 : 예약 좌석 시스템
	실행결과는 제공하지 않습니다.
	
	- 변수 조건 
		1. 변수 : 6개의 좌석 은 변수를 이용합니다. [ 배열X ]
		2. 그외 자유롭게 사용. 배열/리스트 사용 금지 [ day1~day4 문법 이용 ]
	- 메뉴 조건
		0. 메뉴 : 1.예약하기 2.예약취소 3.예약현황 
	- 기능 조건 
	 	예약하기 출력예시 )
	 		1. 예약할 좌석을 선택한다.
	 		2. 만약에 비어 있으면 예약성공 아니면 예약 실패 
	 	예약취소 출력예시 )
	 		1. 예약할 취소할 좌석을 선택한다.
	 	예약현황 출력예시 )
	 		* 3개씩 2줄로 출력합니다.
			[ 예약 ]	[ ]	[ ]
			[ ] [예약] [ ]  
			- 예약이 되어 있는 좌석은 [예약] 예약이 없으면 [ ] 공란으로 출력합니다.
			
*/
