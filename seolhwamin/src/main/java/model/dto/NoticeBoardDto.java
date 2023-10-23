package model.dto;

public class NoticeBoardDto {
	
	// 1.필드
	private int bno;
	private String btitle;
	private String bcontent;
	private String bfile;
	private String bdate;
	private int bview;
	private int mno;
	private int bcno;
	// DB 없지만 게시물에 추가적으로 표시할 필드들
	private String mid; // 작성자 회원아이디
	private String bcname;// 카테고리명
	private String mimg; // 작성자 프로필
	// - 조회 대상자와 작성자 대상자 일치여부 [ 본인글 체크여부 ]
	private boolean ishost;
	
	
	

	// 2. 생성자 [ 1. 빈생성자 2.풀생성자 3.(추후에) 작업하면서 필요한 생성자들 ]
	public NoticeBoardDto() {}
	
	// 모든글 출력시 사용되는 생성자 ( 풀생성자)
	public NoticeBoardDto(int bno, String btitle, String bcontent, String bfile, String bdate, int bview, int mno, int bcno,
			String mid, String bcname, String mimg) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.bdate = bdate;
		this.bview = bview;
		this.mno = mno;
		this.bcno = bcno;
		this.mid = mid;
		this.bcname = bcname;
		this.mimg = mimg;
	}
	// 게시물 수정용 생성자
		public NoticeBoardDto(int bno, String btitle, String bcontent, String bfile, int bcno) {
			super();
			this.bno = bno;
			this.btitle = btitle;
			this.bcontent = bcontent;
			this.bfile = bfile;
			this.bcno = bcno;
		}
	// 글 등록시 사용되는 생성자
	public NoticeBoardDto(String btitle, String bcontent, String bfile, int mno, int bcno) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.mno = mno;
		this.bcno = bcno;
	}


	
	// 3. 메소드 [ get/set /toString ]
	
	public String getMimg() {
		return mimg;
	}
	public boolean isIshost() {
			return ishost;
		}
	
		public void setIshost(boolean ishost) {
			this.ishost = ishost;
		}
	public void setMimg(String mimg) {
		this.mimg = mimg;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBfile() {
		return bfile;
	}

	public void setBfile(String bfile) {
		this.bfile = bfile;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getBcno() {
		return bcno;
	}

	public void setBcno(int bcno) {
		this.bcno = bcno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getBcname() {
		return bcname;
	}

	public void setBcname(String bcname) {
		this.bcname = bcname;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bfile=" + bfile
				+ ", bdate=" + bdate + ", bview=" + bview + ", mno=" + mno + ", bcno=" + bcno + ", mid=" + mid
				+ ", bcname=" + bcname + ", mimg=" + mimg + "]";
	}

	
	
	
}	
	
	
	