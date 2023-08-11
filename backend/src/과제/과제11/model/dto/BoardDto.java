package 과제.과제11.model.dto;

public class BoardDto { // 이동객체 = 휘발성
	
	// 1. 필드 : DB TABLE 필드명과 순서 일치화 +추가 
	private int bno;			
	private String btitle;		
	private String bcontent;	
	private String bdate;		
	private int bview;		
	private int mno;	// 작성자가 회원번호 식별자..
	// 화면에는 작성자를 회원번호가 아닌 회원 다른 정보 출력
	private String mid; // 회원번호를 이용한 회원테이블에서 조회 가능 [ 테이블 합치기 JOIN ]
	private String pcontent;
	private int pno;
	private String pdate;
	private String preply;
	
	// 2. 생성자 [ 1.빈생성자 2.풀생성자 + 추가생성자 ( 글쓰기 사용할생성자 , 글출력 사용할 생성자 )  ]
	public BoardDto() {}
	public BoardDto(int bno, String btitle, String bcontent, String bdate, int bview, int mno, String mid , String pcontent , int pno , String pdate , String preply ) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bview = bview;
		this.mno = mno;
		this.mid = mid;
		this.pcontent = pcontent;
		this.pno = pno;
		this.pdate = pdate;
		this.preply = preply;
		
	}
	// + 글등록시 사용되는 생성자 
	public BoardDto(String btitle, String bcontent, int mno) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.mno = mno;
	}
	
	// + 글 수정시 사용되는 생성자
	public BoardDto(int bno, String btitle, String bcontent) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
	}
	
	// 쪽지 보내기시 사용되는 생성자
	public BoardDto(int bno, int mno, String pcontent) {
		super();
		this.bno = bno;
		this.mno = mno;
		this.pcontent = pcontent;
	}
	
	// 쪽지 보기 생성자
	public BoardDto(int pno,int mno, String pcontent, String pdate) {
		super();
		this.pno = pno;
		this.bno = bno;
		this.mno = mno;
		this.pcontent = pcontent;
		this.pdate = pdate;
	}
	
	// 3. 메소드 [ 1.get or set 2.toString ]
	
	
	
	public int getBno() {
		return bno;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getPreply() {
		return preply;
	}
	public void setPreply(String preply) {
		this.preply = preply;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
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
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bdate=" + bdate
				+ ", bview=" + bview + ", mno=" + mno + ", mid=" + mid + "]";
	}
	
	
	
	
}