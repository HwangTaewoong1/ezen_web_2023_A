package 과제.과제1;

public class 과제1 {

	public static void main(String[] args) {

	/*1. 연산자 암기 확인 2인1조 산비논대증삼연
	
	2. p.73 ~ p.76 풀이	=> 카톡 git 주소 풀이
 		문제 1. 변수에 대해 잘못 설명한 것은 무엇입니까?
 			// 1 : 변수는 하나의 값만 저장o vs 배열은 여러개 값 저장
 			// 2 : int 타입으로 선언했으면 int 허용범위 내 데이터만 저장
 			// 3 : { } 안에서 선언된 변수는 밖으로 나올 수 없다.
 			답 : 4번 -> 변수값은 초기값이 설정되어야 출력가능하다.
 	*/
 		
 	 // 문제 2. 변수 이름으로 사용할 수 없는 것을 모두 선택하세요.
 			1. int modelName;  2. int class;  3. int 6hour;  4. int $value;
 			5. int _age;	   6. int #name;  7. int int;
 		// 답 : 3번( 숫자시작 x) / 6번 ( _ ,$ 제외한 특수문자 X)  / 2번, 7번 ( 미리 정해진 단어 : 문법적으로 사용되는 단어 불가능 [키워드] x)
 		
 	/* 	문제 3. 다음 표의 빈칸에 자바의 기본 타입 8개를 적어보세요.	
 		 답 : 정수타입 1byte : byte  / 2byte : short , char / 4byte : int / 8byte : long
 				실수타입 4byte : float / 8byte : double
 				논리타입 1byte : boolean  
 	*/
 		
 	/*  문제 4. 다음 코드에서 타입,변수,이름,리터럴에 해당하는것을 적어보세요.
 			답 :	타입 : 	 	( int ) , ( double) 
 				변수이름 : 	( age ) , ( price)  
 				리터럴 : 	 	( 10 ) , ( 3.14 ) 
 	*/
 		
 	 // 문제 5. 다음 자동 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.
 			byte bytevalue = 10;	int	intvalue = bytevalue;
 			char charvalue = 10;	intvalue = charvalue;
 									short shortvalue = charvalue; // 3 : char에는 음수가 없기 때문에
 									double doublevalue = bytevalue;
 									
 		 // 답 : 3번 short shortValue = charValue; -> 같은 2바이트 이지만 char는 유니코드 문자로써( 0 ~ 대략 65500 ) 음수값을 가질 수 없다.
 		
 	 // 문제 6. 다음 강제 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.
 			1. int intValue = 10;		double var1 = (double)intValue; // 자동
 			2. char charValue = 'A';		byte var2 = (byte)intValue;	// 강제
 			3. double doubleValue = 5.7;	int var3 = (int)doubleValue; // 강제
 			4. String srtValue = "A";		char var4 = (char)strValue;	// 4 : 오류 객체는 기본타입으로 캐스팅 불가능  
 			
 		 // 답 : 4번 char var = (char) strValue;  -> 오류 객체는 기본타입으로 캐스팅 불가능
 			/* 해결방안 => */ char var5 = strValue.charAt(0); // 문자열.charAt(인덱스) : 문자열 내 인덱스 번째 문자 1개 추출
 		
 	 // 문제 7. 변수를 잘못 초기화한 것은 무엇입니까?
 			1. int value1 = 10;  			2. long value2 = 1000000000000L;
 			3. char value3 = ''; 			4. float value4 = 10;
 			5. String value5 = "abc\ndef"; 	6. String value6 =  """
 																abc
 																def
 																"""; // * [ P51 ] JDK13 버전 이상만 사용가능
 					
 		 // 답 : 3번 char value3 = ''; // '' 문자로 표현불가능 / ' ' 공백 가능
 		
 	 // 문제 8. 콘솔에 값을 입출력하는 방법에 대해 잘못 설명한것을 선택하세요.
 			1. System.out.print();	
 			2. System.out.println();
 			3. System.out.printf();
 			4. nextLine() 메소드
 			
 		 // 답 : 3번 System.out.printf(); 주어진 형식대로 변수값을 바꾸고 * 출력한다 * 
 		
 	 // 문제 9. 연산식의 타입 변환 중에서 컴파일 에러가 발생하는 것을 선택하세요. [ 피연산자 중에 더 큰 허용범위 내로 반환 , * byte short 는 int 반환 ]
 		byte bvalue = 10;		float fvalue = 2.5f;	double dvalue = 2.5;
 		
 			1. byte result1 = bvalue + bvalue;
 			2. int result2 = 5[int] + bvaue; -> int
 			3. float result3 = 5[int] + fvalue; -> float
 			4. double result4 = 5[int] + dvalue; -> double
 			
 		 // 답 : 1번 byte result = byteValue + byteValue; -> 타입에러 byte는 int 변환
 		
 	 // 문제 10. 문자열을 기본 타입으로 변환하는 코드로 틀린 것을 고르세요.
 		// 답 : 2번 int var2 = Int.parseInt(str); -> Integer.parseInt(str); 로바뀌어야함
 		
 	 // 문제 11. 다음 코드에서 컴파일 에러가 발생하는 라인을 모두 적어보세요. [ 변수의 허용범위 : { } 안에서 선언된 변수는 밖으로 호출/사용 불가 
 			답 : 13번 16번줄 코드 System.out.println("v3: " + v3) , System.out.println("v2: " + v2) 
 			// -> 변수가 if문 범위 안에서 지정되어 해당 if문 범위 밖에선 인식 할 수 없다.
 			
 	
 
	}
}