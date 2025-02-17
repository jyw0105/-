package ex1;

public class Vehicle {
	private String modelName;
	private int year;
	

	public void printCatalogue(Engine engine) {
		System.out.println(year+"년식 \""
				+modelName+"\"차량은 "
				+engine.getYear()+"년식 "
				+engine.getEngineKind()+"(을)를 장착하고 있다.");
	}
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
}
