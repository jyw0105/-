package ex1;

public class GasolineEngine extends Engine{
	private String fuel;
	
	public GasolineEngine() {
		super();
	}
	public GasolineEngine(int year) {
		super(year, "가솔린엔진");
		this.fuel = "휘발유";
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
}
