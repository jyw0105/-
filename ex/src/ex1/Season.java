package ex1;

public class Season implements Spring, Summer, Fall, Winter{
	private String weather;
	private String temperature;
	
	public Season() {
		
	}
	public Season(String weather, String temperature) {
		this.weather = weather;
		this.temperature = temperature;
		
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	@Override
	public void seasonStart3() {
		System.out.println("3월에서");
	}
	@Override
	public void seasonStart5() {
		System.out.println("5월");
	}
	@Override
	public void seasonStart6() {
		System.out.println("6월에서");
	}
	@Override
	public void seasonStart8() {
		System.out.println("8월");
	}
	@Override
	public void seasonStart9() {
		System.out.println("9월에서");
	}
	@Override
	public void seasonStart11() {
		System.out.println("11월");
	}
	@Override
	public void seasonStart12() {
		System.out.println("12월에서");
	}
	@Override
	public void seasonStart2() {
		System.out.println("2월");
	}
}
