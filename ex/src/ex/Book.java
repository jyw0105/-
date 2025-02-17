package ex;


public class Book {
	//책 가격
	private int bPrice;
	//책 제목
	private String bTitle;
	//책 내용
	private String bC;
	private String bA;
	private String bCr;
	
	public void setBookInfo(String bTitle, String bC) {
		this.bTitle = bTitle;
		this.bC = bC;
	}
	public void setBookInfo(String bTitle, String bC, String bA) {
		setBookInfo(bTitle, bC);
		this.bA = bA;
	}
	public void setBookInfo(String bTitle, String bC, String bA, String bCr) {
		setBookInfo(bTitle, bC, bA);
		this.bCr = bCr;
	}
	public void setBookInfo(String bTitle, String bC, String bA, String bCr, int bPrice) {
		setBookInfo(bTitle, bC, bA, bCr);
		this.bPrice = bPrice;
	}
	public void bookInfoPrint() {
		if(bTitle != null) {
			System.out.println("책제목: "+bTitle);
		}
		if(bC != null) {
			System.out.println("책내용: "+bC);
		}
		if(bA != null) {
			System.out.println("작가: "+bA);
		}
		if(bCr != null) {
			System.out.println("카테고리: "+bCr);
		}
		if(bPrice != 0) {
			System.out.println("책가격: "+bPrice);
		}
	}
	
	
}
