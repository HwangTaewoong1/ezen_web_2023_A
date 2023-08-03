package java1.day16.Ex1_필드의다형성;

public class Car {
	// 1. 필드 
	public Tire tire;		// Tire 클래스의 타입 필드 선언 [ 객체 x ]

	// 2. 생성자
	// 3. 메소드
	public void run() {tire.roll();}
	public void info( Tire tire ) { System.out.println("Tire : " + tire);
		
	}
}
