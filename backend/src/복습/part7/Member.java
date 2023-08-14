package 복습.part7;

public class Member {
	String id;
	String pw ;
	String name;
	String phone;
	int age ;
	
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
	public String toString() { 
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}
