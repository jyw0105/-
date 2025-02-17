package ex;

import ex1.Manager;

public class Ex15 {
	public static void main(String[] args) {
		Manager em = new Manager();
		em.setName("홍길동");
		em.setSalary("300");
		em.setBonus("50");
		System.out.println(em.managerString());
		
	}
}
