package 복습.part3;

import java.util.Scanner;

public class part3_2 {
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			String[] 재고관리 = { "10,0,300,콜라" , "10,0,200,환타" , "10,0,100,사이다"};
			int 주문번호 = 0;
			while(true) {
				System.out.println("\n\n-------------------- 메뉴 ------------------- ");
				System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
				System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
				
				if( ch == 1 || ch == 2 || ch==3  ) {
					String product = 재고관리[ch-1];	
						
					int stock = Integer.parseInt( product.split(",")[0] );
					int basket = Integer.parseInt( product.split(",")[1] );
					int price = Integer.parseInt( product.split(",")[2] );
					String name =  product.split(",")[3] ;
					
					if( stock > 0 ) { 
						stock--; 	basket++; System.out.println( name+ " 바구니 담았습니다.");
					}
					else {System.out.println(" 재고 부족 ");}
					
					재고관리[ch-1] = stock+","+basket+","+price+","+name;
					
				} // if e
				else if( ch == 4 ) {
					System.out.printf("%10s %10s %10s \n" , "제품명" , "수량" , "가격");
					
					for( int i = 0 ; i<재고관리.length ; i++ ) {
						int stock = Integer.parseInt( 재고관리[i].split(",")[0] );
						int basket = Integer.parseInt( 재고관리[i].split(",")[1] );
						int price = Integer.parseInt( 재고관리[i].split(",")[2] );
						String name = 재고관리[i].split(",")[3];
					
						if( basket > 0 ) { 
							 System.out.printf( "%10s %10s %10s \n" , name ,  basket , basket*price );
							 
						} // if e
					} // f e
				} // else if ch 4 e
			} // while end 
		} // main end
}
