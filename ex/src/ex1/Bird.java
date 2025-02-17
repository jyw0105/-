package ex1;

import ex.BirdIf;
import ex.BirdIfS;

public class Bird implements BirdIf{
	private String species;
	private String age;
	private String gender;
	
	public Bird() {
		System.out.println("새 호출");
	}
	public Bird(String species, String gender) {
		this.species = species;
		this.gender = gender;
		System.out.println("종, 성별 호출");
	}
	public void eat() {
		System.out.println("부모가 먹다");
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
	@Override
	public void eatPrint1() {
		// TODO Auto-generated method stub
		System.out.println("eatPrint1");
	}
	public void eatPrint2() {
		System.out.println("eatPrint2");
	}

	@Override
	public void eatPrint3() {
		System.out.println("eatPrint3");
	}

	@Override
	public void eatPrint4() {
		System.out.println("eatPrint4");
	}

	@Override
	public void eatPrint5() {
		System.out.println("eatPrint5");
	}

	@Override
	public void eatPrint6() {
		System.out.println("eatPrint6");
	}
	public void eatPrint7() {
		System.out.println("eatPrint7");
		eatPrint4();
		eatPrint5();
		eatPrint6();
		System.out.println("MAX_BIRD_NUM2 : "+MAX_BIRD_NUM2);
	}
}
