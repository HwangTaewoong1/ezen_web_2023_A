package 과제.과제5;

import java.util.Scanner;

public class 과제5_키오스크 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String 재고관리 = "";
		/* 재고관리 변수 샘플  */
		// 콜라재고,환타재고,사이다재고,콜라바구니,환타바구니,사이다바구니,콜라가격,환타가격,사이다가격 순
		재고관리 = "10,10,10/0,0,0/300,200,100";
		/* ----------- */
		
		int 콜라재고 = Integer.parseInt(재고관리.split("/")[0].split(",")[0]);
		int 환타재고 = Integer.parseInt(재고관리.split("/")[0].split(",")[1]);
		int 사이다재고 = Integer.parseInt(재고관리.split("/")[0].split(",")[2]);
		int 콜라바구니 = Integer.parseInt(재고관리.split("/")[1].split(",")[0]);
		int 환타바구니 = Integer.parseInt(재고관리.split("/")[1].split(",")[1]);
		int 사이다바구니 = Integer.parseInt(재고관리.split("/")[1].split(",")[2]);
		int 콜라가격 = Integer.parseInt(재고관리.split("/")[2].split(",")[0]);
		int 환타가격 = Integer.parseInt(재고관리.split("/")[2].split(",")[1]);
		int 사이다가격 = Integer.parseInt(재고관리.split("/")[2].split(",")[2]);
		
		while(true) {
			System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			
			/* 문제풀이 위치 */
				
				
				
				if( ch == 1 ) {
					
					if( 콜라재고 < 1 ) { System.out.print("재고부족"); }
					else { 콜라바구니 ++; 콜라재고--;}
					}
				else if( ch == 2 ) { 
					if( 환타재고 < 1 ) { System.out.print("재고부족"); }
					else { 환타바구니 +=1; 환타재고-=1; }
					}
				else if( ch == 3 ) {
					if( 사이다재고 < 1 ) { System.out.print("재고부족"); }
					else { 사이다바구니 +=1; 사이다재고-=1; }
					} 
				else if( ch == 4 ) { 
					System.out.println("- 현재 장바구니 현황 표시 목록");
					System.out.println("----------------------------------");
					System.out.printf("%1s   %2s   %1s\n" , "제품명" ,"수량" ,"가격");
					
					 if( 콜라바구니 >= 1) { System.out.printf("%1s   %3s   %4s\n" , "콜라" , 콜라바구니 , (콜라가격*콜라바구니) ); }
					 if( 환타바구니 >= 1) { System.out.printf("%1s   %3s   %4s\n" , "환타" , 환타바구니 , (환타가격*환타바구니) ); }
					 if( 사이다바구니 >= 1) { System.out.printf("%1s   %2s   %4s\n" , "사이다" , 사이다바구니 , (사이다가격*사이다바구니) ); }
					 System.out.println("총가격 : " +( (콜라가격*콜라바구니) + (환타가격*환타바구니) + (사이다가격*사이다바구니) ) );
					
					if(콜라바구니 >= 1 || 환타바구니 >= 1 || 사이다바구니 >= 1) { // if 1 s
						System.out.println("- 결제메뉴 표시");
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
			/* ----------- */
			
			
		} // while end 
	} // main end 
	
} // class end 

/*

	 주제 : 키오스크(변수버전)
	 	- 실행예시 사진은 없습니다.
		조건 
		1. 제품 가격/재고/바구니 상태를 하나의 문자열 변수에서 관리 
			// 샘플 : 
					이름 : 콜라 , 환타 , 사이다
					가격 : 300 , 200 , 100
					바구니 : 0 , 0 , 0
			
		2. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ] 
			1. 콜라 2.사이다 3.환타 4.결제
			[ 1~3 선택시 ]
				- 재고가 있을경우 장바구니 담기 / 없으면 '재고부족' 출력
				 
			[ 4 선택시 ] 
				- 현재 장바구니 현황 표시 목록 
				----------------------------------
				제품명	수량	가격
				사이다	1	400
				환타		2	1000
				총가격 : 1400
				- 결제메뉴 표시
					1. 결제 2.취소 
					[결제]
						- 금액 입력받아 총가격에 뺀 잔액 출력 -> 결제 성공시 장바구니 초기화 
						- 만약에 금액이 부족하면 결제 취소 -> 장바구니 초기화 / 재고 다시 되돌리기
					[취소]
						- [ 장바구니 초기화 / 재고 다시 되돌리기 ]
 
 */







