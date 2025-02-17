package ex;

public enum Week {
	Mon("월요일"),
	Tue("화요일"),
	Wed("수요일"),
	Thu("목요일"),
	Fri("금요일"),
	Sat("토요일"),
	Sun("일요일");
	private String day;
	private Week(String day) {
		this.day = day;
	}
}
