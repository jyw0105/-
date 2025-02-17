package ex1;

public class Dragon {
	private String sexagenaryCycle;
	private int order;
	private double percent;
	private boolean polyphgousCheck;
	
	private boolean earLength;
	
	public Dragon(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphgousCheck,
			boolean earLength
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
	public boolean printEarLength(boolean beforeEarLength) {
		System.out.println(beforeEarLength+"->"+earLength);
		return earLength; 
	}
}
