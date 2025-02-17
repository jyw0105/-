package ex1;

public class Student extends Human{
	private String grade;
	private String speciality;
	private String department;
	public Student() {
		super();
		System.out.println("Student 호출");
	}
	public Student(String name, String age,String grade) {
		super(name,age);
		this.grade =grade;
		System.out.println("Student 호출");
	}
	//다용성
	protected void eat() {
		System.out.println("자식");
	}
	public String studentString() {
		return "Human [name=" + super.getName()
				+ ", age=" + super.getAge()
				+ ", gender=" + super.getGender() + "]"
				+"Student [grade=" + grade
				+ ", speciality=" + speciality
				+ ", department=" + department + "]";
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
