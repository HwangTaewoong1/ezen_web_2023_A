package 복습.part6;

public class Member {
	// 1. 필드
	String id; 
	String pw ;
	String name;
	String phone;
	int age ;
	// 2. 생성자
	public Member() { } 
	
	public Member(String id, String pw, String name, String phone, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	@Override
	public String toString() { // 객체의 주소값 대신 필드 문자형식으로 반환
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}
