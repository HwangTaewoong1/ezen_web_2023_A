package 과제.과제5;

import java.util.Random;
import java.util.Scanner;

public class 과제5_좌석예매 {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int[] 좌석리스트 = new int[20];
      int 등급단위 = 5;
      Random random = new Random();
      
      for( int i = 1; i<5; i++) {
         int min = (i-1)*5;
         좌석리스트[random.nextInt(5)+min] = 2;
      }   
      //좌석리스트[수리좌석] = 2; 
      while(true)
      {   System.out.println("---------------------------------------");
         System.out.println("1.좌석예매 | 2.좌석예매취소 | 3.좌석현황 | 4.매출");
         System.out.println("---------------------------------------");
         System.out.print("선택 >>> ");
         switch(sc.nextInt())
         {
            case 1:
               
               for(int i=0;i<좌석리스트.length/등급단위;i++)
               {
                  System.out.printf("%d등급 좌석 -> ",i+1);
                  for(int j=i*등급단위;j<(i*등급단위)+5;j++)
                  {
                     if(좌석리스트[j] < 1)
                     {
                        System.out.printf("[%02d] ",j+1);
                     }else if(좌석리스트[j] == 2){
                        System.out.printf("[수리중]");
                     }
                     else // 예약되어있으면
                     {
                        System.out.printf("[예약]");
                     }
                  }
                  System.out.println();
               }
               System.out.print("예약 할 좌석의 번호를 입력해 주세요. >>> ");
               int ch = sc.nextInt();

               int 금액 = (int)(Math.ceil(ch/5.0f)-1)*5000;
               if(좌석리스트[ch-1] == 0)
               {
                  //          Math.ceil ( 1~ 5 - > 1-1  6 ~ 10 -> 2-1
                  
                  System.out.printf("%02d번 자리의 예약 금액은 %d원 입니다.\n",ch,(20000-금액));
                  System.out.println("지불할 금액 입력 >> ");
                  int 지불금액 = sc.nextInt();
                  

                  if(지불금액 >= (20000-금액))
                  {
                     System.out.printf("%02d번 자리 예약완료\n거스름돈 : %d원\n",ch,지불금액 -(20000-금액));
                     좌석리스트[ch-1] = 1;
                  }
                  else
                  {
                     System.out.println("잔액이 부족합니다.");
                  }
                  
               }else if(좌석리스트[ch-1] == 2) {
                  System.out.println("수리중인 좌석 입니다.");
               }
               else
               {
                  System.out.println("예약된 좌석 입니다.");
               }
               
               break;
            case 2:
               for(int i=0;i<좌석리스트.length/등급단위;i++)
               {
                  System.out.printf("%d등급 좌석 -> ",i+1);
                  for(int j=i*등급단위;j<(i*등급단위)+5;j++)
                  {
                     if(좌석리스트[j] < 1)
                     {
                        System.out.printf("[%02d] ",j+1);
                     }else if(좌석리스트[j] == 2){
                        System.out.printf("[수리중]");
                     }
                     else // 예약되어있으면
                     {
                        System.out.printf("[예약]");
                     }
                  }
                  System.out.println();
               }
               System.out.println("취소할 예약번호를 입력해 주세요 ");
               int ch2 = sc.nextInt();
               if(좌석리스트[ch2-1] == 1)
               {
                  System.out.println("예약 취소 완료되었습니다\n반환 금액:"+ (20000-(int)(Math.ceil(ch2/5.0f)-1)*5000));
                  좌석리스트[ch2-1] = 0;
               }else if(좌석리스트[ch2-1] == 2){
                  System.out.println("수리중인 좌석 입니다.");
                  break;
               }
               else
               {System.out.println("예약되지 않은 좌석 입니다.");}   
               
               break;
            case 3:
               
               
               for(int i=0;i<좌석리스트.length/등급단위;i++)
               {
                  System.out.printf("%d등급 좌석 -> ",i+1);
                  for(int j=i*등급단위;j<(i*등급단위)+5;j++)
                  {
                     if(좌석리스트[j] < 1)
                     {
                        System.out.printf("[%02d] ",j+1);
                     }else if(좌석리스트[j] == 2){
                        System.out.printf("[수리중]");
                     }
                     else // 예약되어있으면
                     {
                        System.out.printf("[예약]");
                     }
                  }
                  System.out.println();
               }
               break;
            default:
               for(int i=0;i<좌석리스트.length/등급단위;i++)
               {
                  System.out.printf("%d등급 좌석 -> ",i+1);
                  for(int j=i*등급단위;j<(i*등급단위)+5;j++)
                  {
                     if(좌석리스트[j] < 1)
                     {
                        System.out.printf("[%02d] ",j+1);
                     }else if(좌석리스트[j] == 2){
                        System.out.printf("[수리중]");
                     }
                     else // 예약되어있으면
                     {
                        System.out.printf("[예약]");
                     }
                  }
                  System.out.println();
               }
               int 매출 = 0;
               for(int i=0;i<좌석리스트.length;i++)
               {
                  매출 += (좌석리스트[i] == 1)?   (20000-(int)(Math.ceil((i+1)/5.0f)-1)*5000): 0;
               }
               System.out.println("");
               System.out.println("매출액:"+매출);
               break;
               
         }
      }
   }

}