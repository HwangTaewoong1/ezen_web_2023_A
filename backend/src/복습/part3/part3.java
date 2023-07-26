package 복습.part3;

import java.util.Scanner;

public class part3 {
	public static void main(String[] args) {
		
		String[] 재고관리 = { "10,0,300,콜라" , "3,0,200,환타" , "2,0,100,사이다"};
		int 총가격 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------ 메뉴 -----------");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			
			
			if( ch == 1 || ch == 2 || ch == 3) {
				String product = 재고관리[ch-1];
				
				int 재고 = Integer.parseInt(product.split(",")[0]);
				int 바구니 = Integer.parseInt(product.split(",")[1]);
				int 가격 = Integer.parseInt(product.split(",")[2]);
				String 이름 = product.split(",")[3];
				
				if( 재고 > 0 ) {
					재고--; 바구니++;
					System.out.println("안내) "+ 이름 +" 담았습니다.");
				}else { System.out.println("안내) "+ 이름 +"재고가 없습니다. [ 관리자에게 문의]");}
				
				재고관리[ch-1] = 재고 +","+바구니+","+가격+","+이름;
				총가격 += 바구니 * 가격;
			}
			else if( ch == 4) {
				System.out.printf("%10s %10s %10s \n" , "제품명" , "수량", "가격");
				
				for(int i = 0; i<재고관리.length; i++) {
					int 재고 = Integer.parseInt(재고관리[i].split(",")[0]);
					int 바구니 = Integer.parseInt(재고관리[i].split(",")[1]);
					int 가격 = Integer.parseInt(재고관리[i].split(",")[2]);
					String 이름 = 재고관리[i].split(",")[3];
					if(바구니 > 0) {
						System.out.printf("%10s %10s %10s \n" , 이름 , 바구니 , 바구니*가격);
					}
				}
				System.out.println("총가격 : " + 총가격);
			}
		}
		
	}
}
