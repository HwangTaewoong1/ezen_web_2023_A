package 과제.hrm;

public class HrmDto {
	// 1.필드
	private int hno;
	private String himg;  				
	private String hname; 
	private String hphone; 
	private String hrank; 			
	private String hdate;
	
	// 2. 생성자
	public HrmDto() { }
	
	public HrmDto(int hno, String himg, String hname, String hphone, String hrank, String hdate) {
		super();
		this.hno = hno;
		this.himg = himg;
		this.hname = hname;
		this.hphone = hphone;
		this.hrank = hrank;
		this.hdate = hdate;
	}
	
	// 인사등록 용 생성자
	public HrmDto( String himg, String hname, String hphone, String hrank, String hdate) {
		super();
		this.himg = himg;
		this.hname = hname;
		this.hphone = hphone;
		this.hrank = hrank;
		this.hdate = hdate;
	}
	
	// 3. 메소드
	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getHimg() {
		return himg;
	}

	public void setHimg(String himg) {
		this.himg = himg;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHphone() {
		return hphone;
	}

	public void setHphone(String hphone) {
		this.hphone = hphone;
	}

	public String getHrank() {
		return hrank;
	}

	public void setHrank(String hrank) {
		this.hrank = hrank;
	}

	public String getHdate() {
		return hdate;
	}

	public void setHdate(String hdate) {
		this.hdate = hdate;
	}

	@Override
	public String toString() {
		return "HrmDto [hno=" + hno + ", himg=" + himg + ", hname=" + hname + ", hphone=" + hphone + ", hrank=" + hrank
				+ ", hdate=" + hdate + "]";
	}
	
	
	
	
	
}
