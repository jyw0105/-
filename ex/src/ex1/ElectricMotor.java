package ex1;

public class ElectricMotor extends Engine{
	private String fuel;
	
	public ElectricMotor() {
		super();
	}
	public ElectricMotor(int year) {
		super(year, "전기모터");
		this.fuel = "전기";
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
}
