package ex1;

public class Cow {
	private String sexagenaryCycle;
	private int order;
	private double percent;
	private boolean polyphgousCheck;
	
	private int earLength;
	
	public Cow(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphgousCheck,
			int earLength
			) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphgousCheck = polyphgousCheck;
		this.earLength = earLength;
	}
	
	public String printSexagenaryCycle(String beforeSexagenaryCycle) {
		System.out.println(beforeSexagenaryCycle+"->"+sexagenaryCycle);
		return sexagenaryCycle;
	}
	
	public int printOrder(int beforeOrder) {
		System.out.println(beforeOrder+"->"+order);
		return order;
	}
	public double printPercent(double beforePercent) {
		System.out.println(beforePercent+"->"+percent);
		return percent;
	}
	public boolean printPolyphgousCheck(boolean beforePolyphgousCheck) {
		System.out.println(beforePolyphgousCheck+"->"+polyphgousCheck);
		return polyphgousCheck;
	}
	public int printEarLength(int beforeEarLength) {
		System.out.println(beforeEarLength+"->"+earLength);
		return earLength; 
	}

	public String getSexagenaryCycle() {
		return sexagenaryCycle;
	}

	public void setSexagenaryCycle(String sexagenaryCycle) {
		this.sexagenaryCycle = sexagenaryCycle;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public boolean isPolyphgousCheck() {
		return polyphgousCheck;
	}

	public void setPolyphgousCheck(boolean polyphgousCheck) {
		this.polyphgousCheck = polyphgousCheck;
	}

	public int getEarLength() {
		return earLength;
	}

	public void setEarLength(int earLength) {
		this.earLength = earLength;
	}
	
}
