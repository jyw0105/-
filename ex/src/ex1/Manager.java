package ex1;

public class Manager extends Employee {
	private String bonus;

	public Manager() {
		super();
		System.out.println("자식 호출");
	}
	public Manager(String name, String salary, String bonus) {
		super(name, salary);
		this.bonus = bonus;
		System.out.println("자식 호출");
	}
	protected void eat() {
		System.out.println("자식");
	}
	public String managerString() {
		return "직원 이름: "+super.getName()
		+ ", 급여: "+super.getSalary()
		+ ", 관리직 보너스: "+ bonus;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

}
