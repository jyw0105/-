package ex1;

public class Parrot extends Bird{
	private String name;
	private String weight;
	
	public Parrot() {
		super();
		System.out.println("앵무새 호출");
	}
	public Parrot(String species, String gender, String name) {
		super(species, gender);
		this.name = name;
		System.out.println("종, 성별, 이름 호출");
	}
	
	public String parrotString() {
		return "Bird [species= "+super.getSpecies()
				+", age= "+super.getAge()
				+", gender= "+super.getGender() +"]"
				+"Parrot [name=" + name
				+", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}
