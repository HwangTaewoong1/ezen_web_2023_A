package 복습.part4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.nio.channels.AcceptPendingException;
import org.xml.sax.SAXNotRecognizedException;

public class Part4 {

	public static void main(String[] args) throws IOException {
		
		while(true) {
			
				Scanner scanner = new Scanner(System.in);
				  String filePath = "./src/복습/part4/part4.txt";
				    FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
				    FileInputStream fileInputStream = new FileInputStream(filePath);
				    File file = new File(filePath);

				    byte[] inByteArray = new byte[(int) file.length()];
				    fileInputStream.read(inByteArray);
				    fileInputStream.close(); // 파일 읽기 완료 후 파일 닫기

				    String fileInfo = new String(inByteArray);
				    String[] 재고관리 = fileInfo.split("\n");
			    
			    System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			    System.out.print("-1:제품등록 0:결제 ");
			    
			    	for( int i = 0; i<재고관리.length; i++) {
			    		if( !재고관리[i].equals("") ){
			    			String 상품이름 = 재고관리[i].split(",")[0];
			    			int 재고 = Integer.parseInt( 재고관리[i].split(",")[1]);
			    			int 바구니 = Integer.parseInt( 재고관리[i].split(",")[2]); 
							int 가격 = Integer.parseInt( 재고관리[i].split(",")[3]);
							if( 재고 == 0 ) {System.out.print( (i+1) + ":" + 상품이름 + "[재고없음] ");} 
							else { System.out.print( (i+1) + ":" + 상품이름 +"["+가격+"] "); }
			    		} // if e
			    	}// f e
			  
			   System.out.println("\n>>>>>> 선택 : "); 	int ch = scanner.nextInt();
			   
			   if( ch == -1) {
				   System.out.println("제품명 : "); String 상품이름 = scanner.next();
				   System.out.println("초기재고 : "); int 재고 = scanner.nextInt();
				   System.out.println("가격 : "); int 가격 = scanner.nextInt();
				   int 바구니 = 0;
				   String OutStr = 상품이름+","+재고+","+바구니+","+가격+"\n";
				   fileOutputStream.write(OutStr.getBytes());
				   System.out.println("안내) 제품 등록이 되었습니다. ");
			   }// if e
			   else if (ch > 0 && ch <= 재고관리.length) {
				   String 상품이름 = 재고관리[ch-1].split(",")[0];
				   int 재고 = Integer.parseInt( 재고관리[ch-1].split(",")[1] );
				   int 바구니 = Integer.parseInt(재고관리[ch-1].split(",")[2] );
				   int 가격 = Integer.parseInt( 재고관리[ch-1].split(",")[3] );
				   if( 재고 > 0 ) {
					   재고--; 바구니++; 
					   System.out.println( 상품이름 + " 제품을 담았습니다.");
				   }
				   else { System.out.println( 상품이름 + " 제품의 재고가 부족합니다.");}
				   
				   재고관리[ch - 1] = 상품이름 + "," + 재고 + "," + 바구니 + "," + 가격;
				    String outStr = "";
				    for (int i = 0; i < 재고관리.length; i++) {
				        outStr += 재고관리[i].split(",")[0] + "," + 재고관리[i].split(",")[1]
				                + "," + 재고관리[i].split(",")[2] + "," + 재고관리[i].split(",")[3]
				                + "\n"; // 각 제품 정보 끝에 줄바꿈 문자 추가
				   }
				    FileOutputStream fileOutputStream2 = new FileOutputStream(filePath);
				    fileOutputStream2.write(outStr.getBytes());
				    fileOutputStream2.close();
			   } // else if e
			   else if ( ch == 0 ) {
				   System.out.printf("%10s %10s %10s \n" , "제품명" , "수량" , "가격");
				   for ( int i = 0; i<재고관리.length; i++) {
					   int 바구니 = Integer.parseInt( 재고관리[i].split(",")[2]);
					   int 가격 = Integer.parseInt( 재고관리[i].split(",")[3]);
					   String 상품이름 = 재고관리[i].split(",")[0];
					   if( 바구니 > 0 ) {
						   System.out.printf("%10s %10s %10s" , 상품이름 , 바구니 , 바구니*가격);
					   }
				   }
			   }
			   
		} // w e
	}
}
