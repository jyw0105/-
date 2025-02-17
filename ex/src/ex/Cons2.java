package ex;


public class Cons2 {
	public String str1;
	public int int1;
	
	public static String str2;
	public static String str3;
	public void setStr1(int in1, String str2) {
		this.int1 = int1;
		setStr2(str2);
		System.out.println("int1: "+int1);
	}
	public static void setStr2(String str) {
		str2 = str;
		System.out.println("str2: "+str);
	}
	public static void setStr3(String str2, String str) {
		setStr2(str2);
		str3 = str;
		System.out.println("str3: "+str);
	}
	
}
