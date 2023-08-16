package java2.day21;

public class Ex2_예외처리 {
	public static void main(String[] args) {
		// p. 470 : 다중 catch
		String[] array = {"100" , "1oo"};
		
		// Integer.parseInt(문자열인숫자) : 문자열숫자 => 정수형 숫자 타입변환
		// System.out.println( Integer.parseInt("7") ); // 문자 7 => 숫자 7 형변환 가능
		// System.out.println( Integer.parseInt("ㄱ") ); // 문자 ㄱ => 숫자 x // NumberFormatException
		
		
		for ( int i = 0; i<array.length; i++) { // 인덱스 : 0~1 // 길이 : 2 // 인덱스 2는 없음 
			try {		
			// System.out.println( array[i] ); // ArrayIndexOutOfBoundsException
			int value = Integer.parseInt( array[i] );
			// NumberFormatException : For input string : "1oo"
			}
			// 예외클래스 catch 작성 순서 : 하위예외 클래스 블록 먼저 작성
			// catch ( Exception e ) { System.out.println("예외발생 : " + e); }
				// 예외 상위 예외클래스가 앞에 있으면 아래있는 하위 예외클래스들은 실행x 
			catch ( NumberFormatException e ) { System.out.println("숫자로 변환 할 수 없는 데이터 : " + e ); }
			catch ( ArrayIndexOutOfBoundsException e ) { System.out.println("배열 인덱스 초과 : " + e ); }
			catch ( NullPointerException | ClassCastException e ){ System.out.println();}
			catch ( Exception e ) { System.out.println("예외발생 : " + e); }
		}
	}
}
