package 복습.part5;

// 목적 : 설계도 , 객체의 모델

public class Member {
	
	
	// 1. 필드 : 객체의 데이터를 저장하는곳
	String id;
	String password;
	String name;
	String phone;
	int age;
	
	// 2. 생성자
	public Member( String id , String password , String name , String phone , int age) {	// 1. 매개변수 5개 정의한 생성자
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

}
