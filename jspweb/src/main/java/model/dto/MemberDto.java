package model.dto;

public class MemberDto {
	// 1.필드
	private int mno;		
    private String mid;	
    private String mpwd;
    private String memail;
    private String mimg;
    
    // 2. 생성자
    public MemberDto() {}

	public MemberDto(int mno, String mid, String mpwd, String meamil, String mimg) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpwd = mpwd;
		this.memail = meamil;
		this.mimg = mimg;
	}
    // -- 회원가입 용 생성자

	public MemberDto(String mid, String mpwd, String meamil, String mimg) {
		super();
		this.mid = mid;
		this.mpwd = mpwd;
		this.memail = meamil;
		this.mimg = mimg;
	}
	// 3. 메소드
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpwd() {
		return mpwd;
	}

	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String meamil) {
		this.memail = meamil;
	}

	public String getMimg() {
		return mimg;
	}

	public void setMimg(String mimg) {
		this.mimg = mimg;
	}

	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpwd=" + mpwd + ", meamil=" + memail + ", mimg=" + mimg
				+ "]";
	}
	
	
	
	
	
}
