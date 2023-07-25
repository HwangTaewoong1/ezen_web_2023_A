package 복습.part1;

import java.util.Scanner;

public class Part2 { // class s
	public static void main(String[] args) { // main s
	
		Scanner sc = new Scanner(System.in);
		

		String 재고관리 = "10,0,300\n3,0,200\n2,0,100\n";
		
		int 콜라재고 = Integer.parseInt(재고관리.split("\n")[0].split(",")[0]);
		int 환타재고 = Integer.parseInt(재고관리.split("\n")[1].split(",")[0]);
		int 사이다재고 = Integer.parseInt(재고관리.split("\n")[2].split(",")[0]);
		
		int 콜라바구니 = Integer.parseInt(재고관리.split("\n")[0].split(",")[1]);
		int 환타바구니 = Integer.parseInt(재고관리.split("\n")[1].split(",")[1]);
		int 사이다바구니 = Integer.parseInt(재고관리.split("\n")[2].split(",")[1]);
		
		int 콜라가격 = Integer.parseInt(재고관리.split("\n")[0].split(",")[2]);
		int 환타가격 = Integer.parseInt(재고관리.split("\n")[1].split(",")[2]);
		int 사이다가격 = Integer.parseInt(재고관리.split("\n")[2].split(",")[2]);
		int 주문번호 = 0;
		
		while(true) { // w s
			System.out.println("------------------- 메뉴 -------------------");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = sc.nextInt();
			
			if( ch == 1) {
				if( 콜라재고 > 0) {
				System.out.println("안내) 콜라 담았습니다."); 
				콜라재고 -=1;
				콜라바구니 +=1;
				}
				else {System.out.println("안내) 콜라 재고가 없습니다. [ 관리자에게 문의 ]");}
			}// if 1 e
			if( ch == 2) {
				if( 환타재고 > 0) {
				System.out.println("안내) 환타 담았습니다."); 
				환타재고 -=1;
				환타바구니 +=1;
				}
				else {System.out.println("안내) 환타 재고가 없습니다. [ 관리자에게 문의 ]");}
			}
			if( ch == 3) {
				if( 사이다재고 > 0) {
				System.out.println("안내) 사이다 담았습니다."); 
				사이다재고 -=1;
				사이다바구니 +=1;
				}
				else {System.out.println("안내) 사이다 재고가 없습니다. [ 관리자에게 문의 ]");}
			}
			if( ch == 4) {
				System.out.println("----------------------------------");
				System.out.printf("%1s   %2s   %1s\n" , "제품명" ,"수량" ,"가격");
				
				 if( 콜라바구니 > 0) { System.out.printf("%1s   %3s   %4s\n" , "콜라" , 콜라바구니 , (콜라가격*콜라바구니) ); }
				 if( 환타바구니 > 0) { System.out.printf("%1s   %3s   %4s\n" , "환타" , 환타바구니 , (환타가격*환타바구니) ); }
				 if( 사이다바구니 > 0) { System.out.printf("%1s   %2s   %4s\n" , "사이다" , 사이다바구니 , (사이다가격*사이다바구니) ); }
				 System.out.println("총가격 : " +( (콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니) ) );
				 
				 if( 콜라바구니 > 0 || 환타바구니 > 0 || 사이다바구니 > 0) {
					 System.out.println("--------------------------");
					 System.out.println("1.결제 2.취소");
					 System.out.print(">>>>>> 선택 : ");
					 int ch2 = sc.nextInt();
					 
					 if( ch2 == 1 ) {
						 System.out.print("안내 금여 투여 : "); int money = sc.nextInt();
						 if( money >= ( (콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니) ) ) {
						 System.out.println("잔액 : " + (money-( (콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니) ) ) );
						 주문번호++;
						 System.out.println("주문번호: " + 주문번호);
						 콜라바구니 = 0;
						 환타바구니 = 0;
						 사이다바구니 = 0;
						 }else { System.out.println("잔액이 부족합니다.");}
					 }
					 if( ch2 == 2) {
						 System.out.println("취소 되었습니다.");
						 콜라재고 += 콜라바구니;
						 환타재고 += 환타바구니;
						 사이다재고 += 사이다바구니; 
						 콜라바구니 = 0;
						 환타바구니 = 0;
						 사이다바구니 = 0;
					 }else { System.out.println("잘못된 입력입니다. 다시 입력해주세요.");}
				 }
			}
		} // w e
	} // main e
} // class e
