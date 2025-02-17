package ex1;

public class Tiger {
	private String sexagenaryCycle;
	private int order;
	private double percent;
	private boolean polyphgousCheck;
	
	private boolean swimCheck;
	
	public Tiger(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphgousCheck,
			boolean swimCheck
			) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphgousCheck = polyphgousCheck;
		this.swimCheck = swimCheck;
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
	public boolean printSwimCheck(boolean beforeSwimCheck) {
		System.out.println(beforeSwimCheck+"->"+swimCheck);
		return swimCheck;
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

	public boolean isSwimCheck() {
		return swimCheck;
	}

	public void setSwimCheck(boolean swimCheck) {
		this.swimCheck = swimCheck;
	}
	
}
