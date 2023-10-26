package model.dto;

public class CommentDto {

	// 1.필드
	private int cmno;
	private String cmcontent;
	private String cmdate;
	private int bno;
	private int mno;
	// member join 후 member 정보 담는 필드
	private String mnickname;
	private String mid;
	private String mimg;

	public CommentDto() {
		// TODO Auto-generated constructor stub
	}

	public CommentDto(int bno, int cmno, int mno, String cmcontent, String cmdate, String mid, String mimg,
			String mnickname) {
		super();
		this.cmno = cmno;
		this.cmcontent = cmcontent;
		this.cmdate = cmdate;
		this.bno = bno;
		this.mno = mno;
		this.mnickname = mnickname;
		this.mid = mid;
		this.mimg = mimg;
	}

	public int getCmno() {
		return cmno;
	}

	public void setCmno(int cmno) {
		this.cmno = cmno;
	}

	public String getCmcontent() {
		return cmcontent;
	}

	public void setCmcontent(String cmcontent) {
		this.cmcontent = cmcontent;
	}

	public String getCmdate() {
		return cmdate;
	}

	public void setCmdate(String cmdate) {
		this.cmdate = cmdate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMnickname() {
		return mnickname;
	}

	public void setMnickname(String mnickname) {
		this.mnickname = mnickname;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMimg() {
		return mimg;
	}

	public void setMimg(String mimg) {
		this.mimg = mimg;
	}

	@Override
	public String toString() {
		return "CommentDto [cmno=" + cmno + ", cmcontent=" + cmcontent + ", cmdate=" + cmdate + ", bno=" + bno
				+ ", mno=" + mno + ", mnickname=" + mnickname + ", mid=" + mid + ", mimg=" + mimg + "]";
	}

}
