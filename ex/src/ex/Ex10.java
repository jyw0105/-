package ex;

import java.security.PublicKey;

public class Ex10 {
	public static void main(String[] args) {
		Mo2 m = Mo2.getIn();
		
		m.int1 = 10;
		
		System.out.println("m.int1: "+m.int1);
		
		Mo2 m1 = Mo2.getIn();
		
		m1.int1 = 30;
		
		System.out.println("m.int1: "+m.int1);
		System.out.println("m1.int1: "+m1.int1);
		
		m.int1 =50;
		
		System.out.println("m.int1: "+m.int1);
		System.out.println("m1.int1: "+m1.int1);
		
		//생성자 사용불가
		//Mo2 m2 = new Mo2();
	}
}
