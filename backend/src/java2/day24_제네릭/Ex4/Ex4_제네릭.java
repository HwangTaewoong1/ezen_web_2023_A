package java2.day24_제네릭.Ex4;

public class Ex4_제네릭 {
	
	// 제네릭 메소드 선언
		// 목적 : 함수 매개변수 받을 때, 정해져 있지않는 타입 받고 싶을때, 
		// public boolean 메소드 ( int value ) {}
		// public boolean 메소드 ( String value) {}
		// --> 통합 	// public <T> boolean 메소드 ( T value ){}
	
		// 메소드 선언부 <제네릭타입> : 함수내에서도 제네릭타입 사용할 수 있다.
	public static <T> Box<T> boxing(T t){
					// 매개변수 제네릭타입 사용하기위한 <T> 선언부에 정의하면 사용가능
					// Integer t = 100  
		Box<T> box = new Box<>(); // Box<Integer> box = new Box<>();
		box.setT(t);	// box객체 [ t = 100 ]
		return box;
	}
	
	public static void main(String[] args) {
		
		// 1. Box 객체 t필드를 Integer 타입으로 선정
		Box<Integer> box1 = boxing(100); // 타입 파라미터에 값 넣으면 ( 자동으로 ) 값의 타입 Integer 대체 
			// box1 [ Integer t ]
		int intvalue = box1.getT();
		System.out.println( intvalue );
		
		// 2.
		Box<String> box2 = boxing("홍길동"); // 타입 파라미터에 값 넣으면 (자동으로) 값의 타입으로 String 대체
		String strvalue = box2.getT();
		System.out.println( strvalue );
		
	}
}
