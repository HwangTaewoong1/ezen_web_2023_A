package 복습.part1;

import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		
		  int 콜라재고 = 10 ; int 환타재고 = 3; int 사이다재고 = 2;
		  int 콜라바구니 = 0 ; int 환타바구니 = 0 ; int 사이다바구니 = 0;
		  int 콜라가격 = 300 ; int 환타가격 = 200 ; int 사이다가격 = 100 ;
	
	while( true ){
		
		System.out.println("------------------ 메뉴 ----------------");
		System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
		Scanner scanner = new Scanner(System.in);
		int ch = scanner.nextInt();
		
		
		if( ch == 1) {
			if( 콜라재고 > 0) {
			System.out.println("안내) 콜라 담았습니다.");
			콜라재고 -=1;
			콜라바구니 +=1;
			}else {System.out.println("안내) 콜라 재고가 없습니다. [ 관리자에게 문의] ");
			}
		}
		
		if( ch == 2) {
			if( 환타재고 > 0) {
			System.out.println("안내) 환타 담았습니다.");
			환타재고 -=1;
			환타바구니 +=1;
			}else {System.out.println("안내) 환타 재고가 없습니다. [ 관리자에게 문의] ");
			}
		}
		
		if( ch == 3) {
			if( 사이다재고 > 0) {
			System.out.println("안내) 사이다 담았습니다.");
			사이다재고 -=1;
			사이다바구니 +=1;
			}else {System.out.println("안내) 사이다 재고가 없습니다. [ 관리자에게 문의] ");
			}
		}
		
		if( ch == 4) {
			System.out.println("----------------------------------");
			System.out.printf("%1s   %2s   %1s\n" , "제품명" ,"수량" ,"가격");
			
			 if( 콜라바구니 >= 1) { System.out.printf("%1s   %3s   %4s\n" , "콜라" , 콜라바구니 , (콜라가격*콜라바구니) ); }
			 if( 환타바구니 >= 1) { System.out.printf("%1s   %3s   %4s\n" , "환타" , 환타바구니 , (환타가격*환타바구니) ); }
			 if( 사이다바구니 >= 1) { System.out.printf("%1s   %2s   %4s\n" , "사이다" , 사이다바구니 , (사이다가격*사이다바구니) ); }
			 System.out.println("총가격 : " +( (콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니) ) );
			
			if(콜라바구니 >= 1 || 환타바구니 >= 1 || 사이다바구니 >= 1) { // if 1 s
				System.out.println("--------------");
				System.out.println("1. 결제 2.취소");
				int 결제값 = scanner.nextInt();
				if( 결제값 > 2) { // if 2 s
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				} // if 2 e
				if( 결제값 == 1) { // if 3 s
					System.out.println("금액을 입력하세요.");
				int 금액 = scanner.nextInt();	
					
					if( 금액 >= (콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니) ) {
						System.out.println("결제 성공.");
						System.out.println("거스름돈 : " + (금액-((콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니))) );
						콜라바구니 = 0; 환타바구니=0; 사이다바구니=0;
						
					}else {
						System.out.println("금액이 부족합니다. ( 결제 취소 )");
						콜라재고+=콜라바구니; 환타재고+=환타바구니; 사이다재고+=사이다바구니;
						콜라바구니 = 0; 환타바구니=0; 사이다바구니=0; }
				} // if 3 e
				if( 결제값 == 2) { // if 4 s
					System.out.println("결제 취소");
					콜라재고+=콜라바구니; 환타재고+=환타바구니; 사이다재고+=사이다바구니;
					콜라바구니 = 0; 환타바구니=0; 사이다바구니=0;
				} // if 4 e
			} // if 1 e
		}	
	}
		
	} // main e
} // class e
