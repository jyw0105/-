package ex1;

public class Engine {
	private int year;
	private String engineKind;
	
	public Engine() {
		
	}
	public Engine(int year, String engineKind) {
		this.year = year;
		this.engineKind = engineKind;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEngineKind() {
		return engineKind;
	}

	public void setEngineKind(String engineKind) {
		this.engineKind = engineKind;
	}
	
	
	
}
