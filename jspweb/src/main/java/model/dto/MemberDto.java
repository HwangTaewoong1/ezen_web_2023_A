package model.dto;

public class MemberDto {
	// 1.필드
		// 1-1 DB 있는 필드
	private int mno;		
    private String mid;	
    private String mpwd;
    private String memail;
    private String mimg;
    	// 1-2 DB에 없는 필드
    private String loginDatetime; // 로그인 시간
    
    // -- * 로그인 객체를 만들 생성자 [ 패스워드 제외 ]
    
    // 2. 생성자
    public MemberDto() {}
    // -- 로그인 객체를 만들 생성자 [ 패스워드 제외 ] : 오버로딩 하기위해 매개변수
	public MemberDto(String loginDatetime, int mno, String mid, String memail, String mimg) {
		super();
		this.loginDatetime = loginDatetime;
		this.mno = mno;
		this.mid = mid;
		this.memail = memail;
		this.mimg = mimg;

	}
    // -- 회원가입 용 생성자
	public MemberDto(int mno, String mid, String mpwd, String memail, String mimg) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpwd = mpwd;
		this.memail = memail;
		this.mimg = mimg;
	}
	


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

	public String getLoginDatetime() {
		return loginDatetime;
	}

	public void setLoginDatetime(String loginDatetime) {
		this.loginDatetime = loginDatetime;
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
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpwd=" + mpwd + ", memail=" + memail + ", mimg=" + mimg
				+ ", loginDatetime=" + loginDatetime + "]";
	}

	
	
	
	
	
}
