package 과제.Accountbook;

public class AccountbookDto {
	// 1.필드
	private int vno;
	private String vcontent;
	private String vmoney;
	private String vdate;
	
	// 2.생성자
	public AccountbookDto() {}
	public AccountbookDto(int vno, String vcontent, String vmoney, String vdate) {
		super();
		this.vno = vno;
		this.vcontent = vcontent;
		this.vmoney = vmoney;
		this.vdate = vdate;
	}
	// --- * 저장 * 할때 사용되는 생성자 [ 매개변수 3개 ]
	public AccountbookDto(String vcontent, String vmoney, String vdate) {
		super();
		this.vcontent = vcontent;
		this.vmoney = vmoney;
		this.vdate = vdate;
	}
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVcontent() {
		return vcontent;
	}
	public void setVcontent(String vcontent) {
		this.vcontent = vcontent;
	}
	public String getVmoney() {
		return vmoney;
	}
	public void setVmoney(String vmoney) {
		this.vmoney = vmoney;
	}
	public String getVdate() {
		return vdate;
	}
	public void setVdate(String vdate) {
		this.vdate = vdate;
	}
	@Override
	public String toString() {
		return "AccountbookDto [vno=" + vno + ", vcontent=" + vcontent + ", vmoney=" + vmoney + ", vdate=" + vdate
				+ "]";
	}
	
	
}
