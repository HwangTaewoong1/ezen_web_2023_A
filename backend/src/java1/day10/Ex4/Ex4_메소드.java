package java1.day10.Ex4;


public class Ex4_메소드 {
	public static void main(String[] args) {
	
		// ------------- 메소드 사용/호출 --------------
		// 1. 객체 필요 !!!!
		Member m = new Member();
		// 2. 객체내 .(도트연산자) 이용한 필드/메소드 호출
			// 1. 리턴x 매개변수x 함수 호출
		m.signUp();
			// 2. 리턴x 매개변수o 함수 호출
	 //	m.login("qwe" , "1234" ); -> 오류발생 : 문자 1개 정수1개 순서로 전달하는걸로 약속/선언 했는데 문자2개 주니까 거부  
		m.login("qwe", 1234);
			// 3. 리턴o 매개변수x 함수호출
		m.findId();						// 리턴된 값을 받았지만 추후[다음코드]에 그 값을 사용할 목적이 없어서 저장x
		String result2 = m.findId(); 	// 리턴된 값을 받았어서 추후 [다음코드] 에 그 값을 사용할 목적이 있어서 변수에 저장o
		// int result1 = m.findId();	// 리턴된 값을 받았지만 저장하는데 있어서 타입 일치하지않는 경우
			// 4. 리턴O 매개변수O 함수 호출
		String[] result3 = m.findPw("qwe" , "qwe");
			// 5. 가변길이
		m.delete("안녕" , "하세요");
		m.delete("안녕" , "하세요" , "!");
		
			// 6. 오버로딩
		m.delete( 1 , "안녕" , "하세요" , "!");

	}
}
