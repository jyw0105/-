package ex1;

public class Aespa {
	private String musicVideo;
	private String position;
	private int years;
	public Aespa() {
		
	}
	public Aespa(String position, int years) {
		this.position = position;
		this.years = years;
	}
	public String getMusicVideo() {
		return musicVideo;
	}
	public void setMusicVideo(String musicVideo) {
		this.musicVideo = musicVideo;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
}
