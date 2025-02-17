package ex1;

public class Parent {
	private String a;
	private String b;
	private String c;
	public Parent() {
		System.out.println("부모 호출");
	}
	public Parent(String a, String b) {
		this.a = a;
		this.b = b;
		System.out.println("부모 호출");
	}
	protected void eat() {
		System.out.println("부모가 찍음");
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
}
