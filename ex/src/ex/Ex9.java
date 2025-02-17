package ex;


public class Ex9 {
	public static void main(String[] args) {
		Cons2.setStr2("문자2");
		System.out.println("Cons2.str2: "+Cons2.str2);
		Cons2.setStr2("문자3");
		System.out.println("Cons2.str2: "+Cons2.str2);
		
		Cons2 m = new Cons2();
		System.out.println("Cons2.str2: "+m.str2);
	}
}
