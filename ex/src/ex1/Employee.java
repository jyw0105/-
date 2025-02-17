package ex1;

public class Employee {
	private String name;
	private String salary;
	
	public Employee() {
		System.out.println("부모 호출");
	}
	public Employee(String name, String salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("부모 호출");
	}
	protected void eat() {
		System.out.println("부모");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
