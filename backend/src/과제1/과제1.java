package 과제1;

public class 과제1 {

	public static void main(String[] args) {
	}
	}

/*
	1. 연산자 암기 확인 2인1조 산비논대증삼연
	
	2. p.73 ~ p.76 풀이	=> 카톡 git 주소 풀이
 		문제 1. 변수에 대해 잘못 설명한 것은 무엇입니까?
 			답 : 4번 -> 변수값은 초기값이 설정되어야 출력가능하다.
 		문제 2. 변수 이름으로 사용할 수 없는 것을 모두 선택하세요.
 			답 : 3번( 숫자시작 x) , 6번 ( _ ,$ 제외한 특수문자 X) 7번, 2번 ( 미리 선언되어있는 단어 x)
 		문제 3. 다음 표의 빈칸에 자바의 기본 타입 8개를 적어보세요.	
 			답 : 정수타입 1byte : byte  / 2byte : short , char / 4byte : int / 8byte : long
 				실수타입 4byte : float / 8byte : double
 				논리타입 1byte : boolean  
 		문제 4. 다음 코드에서 타입,변수,이름,리터럴에 해당하는것을 적어보세요.
 			답 :	타입 ( int ) , ( double) / 변수이름 ( age ) , ( price) / 리터럴 ( 10 ) , ( 3.14 )
 		문제 5. 다음 자동 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.
 			답 : 3 short shortValue = charValue; -> 같은 2바이트 이지만 char는 유니코드 문자로써 음수값을 가질 수 없다.
 		문제 6. 다음 강제 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.
 			답 : 4 char var = (char) strValue;  -> 문자열에서 문자로 변환? " ' 차이로 오류날 것 같다?
 		문제 7. 변수를 잘못 초기화한 것은 무엇입니까?	잘 모르겠다.
 			답 : 6 Sting var6 ="""
 							  abc
 							  def
 							  """;
 		문제 8. 콘솔에 값을 입출력하는 방법에 대해 잘못 설명한것을 선택하세요.
 			답 : 3 System.out.printf("형식",변수)는 주어진 형식대로 변수값을 바꾼다. -> 변수값을 대입한다.
 		문제 9. 연산식의 타입 변환 중에서 컴파일 에러가 발생하는 것을 선택하세요.
 			답 : 1 byte result = byteValue + byteValue; -> 타입에러
 		문제 10. 문자열을 기본 타입으로 변환하는 코드로 틀린 것을 고르세요.
 			답 : 2 int var2 = Int.parseInt(str); -> Integer.parseInt(str); 로바뀌어야함
 		문제 11. 다음 코드에서 컴파일 에러가 발생하는 라인을 모두 적어보세요.
 			답 : 13번 16번줄 코드 System.out.println("v3: " + v3) , System.out.println("v2: " + v2) ->변수가 if문 범위 안에서 지정되어 해당 if문 범위 밖에선 인식 할 수 없다.
 			
 	
 */