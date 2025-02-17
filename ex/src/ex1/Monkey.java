package ex1;

public class Monkey {
	private String sexagenaryCycle;
	private int order;
	private double percent;
	private boolean polyphgousCheck;
	
	private boolean socialityCheck;
	
	public Monkey(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphgousCheck,
			boolean socialityCheck
			) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphgousCheck = polyphgousCheck;
		this.socialityCheck = socialityCheck;
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
	public boolean printSocialityCheck(boolean beforeSocialityCheck) {
		System.out.println(beforeSocialityCheck+"->"+socialityCheck);
		return socialityCheck;
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

	public boolean isSocialityCheck() {
		return socialityCheck;
	}

	public void setSocialityCheck(boolean socialityCheck) {
		this.socialityCheck = socialityCheck;
	}
	
}
