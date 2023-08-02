package java1.day15.Ex1_상속final;
 public class Member {
//public final class Member {
	 
	public void stop1 () {} // : 오버라이딩 불가능한 메소드
	public final void stop2 () {} // : 오버라이딩 불가능한 메소드
	
	/*
	 	final 키워드 : final(최종적) 뜻 이므로 수정 불가능한 상태 사용하는 키워드
	 		- 필드
	 			final int 나이 = 30;		: 수정 불가능한 필드 [ *나이 필드에 30값은 초기화 이후 변경 불가능 ]
	 		- 클래스
	 			final class Member{} 	: 해당 클래스는 상속불가능 [ * 상속불가 클래스 ]
	 		- 메소드
	 			final void stop(){} 	: 해당 메소드는 자식클래스가 오버라이딩 불가능
	 			
	 	접근제한자    /  DTO 필드 Private , getter setter public
	 		public					vs 			private
	 		- 모든(클래스)범위					- 현(클래스)범위
	 		- 프로젝트내 모든곳					- 현재 클래스에서만 호출
	 		
	 		(default) 생략			vs			protected
	 		- 현재 클래스의 패키지 내 		 	- 현재 클래스의 패키지 내
	 		- 무조건 동일패키지내/하위패키지		- 동일 패키지 내 / 하위패키지
	 		- (생략*)						- 단) 자식클래스가 다른 패키지에 있는 부모클래스에게 호출 가능
	 		
	 */
	
}
