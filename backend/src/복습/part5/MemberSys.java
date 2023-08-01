package 복습.part5;
// 목적 : 실행 

import java.util.Arrays;
import java.util.Scanner;

public class MemberSys { // class s
	public static void main(String[] args) { // main s
		
		
		Member[] memberList = new Member[100];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(Arrays.toString(memberList));
			
			System.out.println("\n\n-------- 회원 시스템 ----------"); // 1. 무한출력
			System.out.print("1.회원가입 2.로그인    선택> ");
			int ch = sc.nextInt(); 
			
			
			if( ch == 1) {
				System.out.println("---------------- 회원가입 -------------");
				
				System.out.print("아이디 : "); 		String inputId = sc.next();
				System.out.print("비밀번호 : "); 	String inputPw = sc.next();
				System.out.print("이름 : "); 		String inputName = sc.next();
				System.out.print("전화번호 : "); 	String inputPhone = sc.next();
				System.out.print("나이(연령) : "); 	int inputAge = sc.nextInt();
				
				Member member = new Member(inputId,inputPw,inputName,inputPhone,inputAge);
				
				for ( int i = 0; i<memberList.length; i++) {
					// 만약에 i번째 인덱스에 null 이면 해당 i번째 인덱스에 입력받아서 만든 객체 대입
					if( memberList[i] == null) { memberList[i] = member; break; }
				}// f e
			} // if ch1 e
			else if( ch == 2) {
				System.out.println("---------------- 로그인 ---------------");
			
				System.out.print("아이디 : ");	String inputId = sc.next();
				System.out.print("비밀번호 : "); String inputPw = sc.next();
				
		
				int login = -1; // 로그인 여부를 저장하는 변수 -1 : 못찾았다 0이상이면 찾고 찾은 인덱스 번호 저장
				for ( int i = 0; i<memberList.length; i++) {
					if(memberList[i] != null && // 비어 있는 인덱스는 검사할 필요는 없다! // i번째 인덱스가 비어있지 않고
							memberList[i].id .equals(inputId) && 
							memberList[i].password .equals(inputPw)) {
						login = i; // 로그인성공후 변수에 성공한 인덱스 저장 = 추후에 로그인 상태 활용
						break;
					}
				} // for e
				
				// 3. 로그인 성공여부 변수에 따른 흐름제어
				//로그인 실패
				if(login >= 0 ) { System.out.println("로그인성공");} // 추후 로그인시 새로운 메뉴 메소드 호출
				else { System.out.println("안내) 로그인 실패 ");}
			} // if e
			
		} // w e
	} // main e
} // class e
