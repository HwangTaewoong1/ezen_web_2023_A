package model.dto;

public class VisitDto {
	// 1. 필드 
	private int vno;			
    private String vwriter;
    private String vcontent	;
    private String vdate;
    private String vimg;
    // 2. 생성자 [ 기본셋팅 : 1.빈생성자 2.풀생성자 3.그외추가 ]
    public VisitDto() { }
	public VisitDto(int vno, String vwriter, String vcontent, String vdate , String vimg) {
		super();
		this.vno = vno;
		this.vwriter = vwriter;
		this.vcontent = vcontent;
		this.vdate = vdate;
		this.vimg = vimg;
	}
		// --- * 저장 * 할때 사용되는 생성자 [ 매개변수 3개 ]
		public VisitDto(String vwriter,String vcontent , String vimg) {
			super();
			this.vwriter = vwriter;
			this.vcontent = vcontent;
			this.vimg = vimg;
		}
	
    // 3. 메소드 [ 기본셋팅 : 1.get , set 2.toString() 3.그외추가 ]
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVwriter() {
		return vwriter;
	}
	public void setVwriter(String vwriter) {
		this.vwriter = vwriter;
	}

	public String getVcontent() {
		return vcontent;
	}
	public void setVcontent(String vcontent) {
		this.vcontent = vcontent;
	}
	public String getVdate() {
		return vdate;
	}
	public void setVdate(String vdate) {
		this.vdate = vdate;
	}
	
	public String getVimg() {
		return vimg;
	}
	public void setVimg(String vimg) {
		this.vimg = vimg;
	}
	@Override
	public String toString() {
		return "VisitDto [vno=" + vno + ", vwriter=" + vwriter + ", vcontent=" + vcontent + ", vimg=" + vimg
				+ ", vdate=" + vdate + "]";
	}
}