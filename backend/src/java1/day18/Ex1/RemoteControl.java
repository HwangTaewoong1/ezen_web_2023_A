package java1.day18.Ex1;

/*
 	JVM 실행 메모리
 	
 	1. 메소드영역 			2. 스택영역				3. 힙영역
 	 - 클래스정보			 - 함수{ }내 변수들	 	- 객체(인스턴스)
 	 - 메소드				 							- 필드
 	 - static정적 
	 - 인터페이스정보								
	 
	class 사람{				사람 유재석 = 102번지		유재석객체( 나이 = 30 )		유재석.밥먹기 => 30
		int 나이;			사람 강호동 = 103번지		강호동객체( 나이 = 40 )		강호동.밥먹기 => 40
		void 밥먹기(){
			print( this.나이 )
		}	
	}
	
 */

// 인터페이스 선언 = interface
public interface RemoteControl {
	// 1. 상수[ public static final ] 필드 : 프로그램 내 수정 불가능한 데이터 
		// int MAX_VOLUME;
	int MAX_VOLUME = 10; // 앞에 public static final 생략됨  public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;  // 상수명은 대문자로 작성하되 , 서로다른 단어는 _로 연결 
	
	// 대표 멤버 구성
		// - 추상[abstract]메소드 : 선언부만 하고 구현{ }은 안하는 함수 [ 각 클래스가 구현 ]
	
	// 2. 추상메소드 / 선언만 하기! 
	void turnOn(); // public abstract void turnOn(); public abstract 생략. 전원켜기 함수
	
	void turnOff(); // 전원 끄기 함수
	
	void setVolume( int volume ); // 볼륨조절 함수
		
}
