package ex1;

public class Child extends Parent {
	private String d;
	private String e;
	private String f;
	public Child() {
		super();
		System.out.println("자식 호출");
	}
	public Child(String a, String b, String d) {
		super(a,b);
		this.d = d;
		System.out.println("자식 호출");
	}
	protected void eat() {
		System.out.println("자식이 찍음");
	}
	public String childString() {
		return "Parent [a= "+super.getA()
				+",b= "+super.getB()
				+",c= "+super.getC()
				+"Child [d= "+ d
				+", e= "+ e
				+", f= "+ f + "]";
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
}
