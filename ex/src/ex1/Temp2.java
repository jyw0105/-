package ex1;

public class Temp2 {
	public void weatherPrint(Spring spring) {
		System.out.println("Season"+(spring instanceof Season));
		
		if(spring instanceof Season) {
			Season season = (Season) spring;
		}
	}
}
 