package ex1;

public class Sheep {
	private String sexagenaryCycle;
	private int order;
	private double percent;
	private boolean polyphgousCheck;
	
	private boolean woolUseCheck;
	
	public Sheep(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphgousCheck,
			boolean woolUseCheck
			) {
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphgousCheck = polyphgousCheck;
		this.woolUseCheck = woolUseCheck;
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
	public boolean printWoolUseCheck(boolean beforeWoolUseCheck) {
		System.out.println(beforeWoolUseCheck+"->"+woolUseCheck);
		return woolUseCheck;
	}
}
