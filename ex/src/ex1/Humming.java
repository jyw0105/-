package ex1;

public class Humming extends Bird{
	private String species;
	private String age;
	private String gender;
	
	public Humming() {
		super();
	}
	public Humming(String species, String gender) {
		
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
