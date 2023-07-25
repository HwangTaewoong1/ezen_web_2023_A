package 과제.과제9;

// 목적 : 설계도 , 객체의 모델
public class Member {
	
	
	// 1. 필드 : 객체의 데이터를 저장하는곳
	String id;
	String password;
	String name;
	String phone;
	int age;
	
	// 클래스 빈 공간 오른쪽 클릭
		// 오른쪽 클릭 -> Source -> Generate Constructor using fields
	
	// 2. 생성자
	public Member( String id , String password , String name , String phone , int age) {	// 1. 매개변수 5개 정의한 생성자
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	/*
	 * public Member() {} // 0번 [ 매개변수 없는 ] 생성자 
	 * public Member( String id , String password , String name , String phone ) {} // 2. 매개변수 4개 정의한 생성자 
	 * public Member( String id , String password , String name) {} // 3. 매개변수 3개 정의한 생성자
	 * public Member( String id , String password) {} // 4. 매개변수 2개 정의한 생성자 public
	 * Member( String id ) {} // 5. 매개변수 1개 정의한 생성자 
	 * // public Member( String password ) {} // 5. 매개변수 1개 정의한 생성자 
	 * public Member( int age ) {} // 5. 매개변수 1개 정의한 생성자
	 */						
	
	// 3. 메소드
}
