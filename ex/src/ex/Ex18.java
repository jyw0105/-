package ex;

import ex1.Bird;
import ex1.Temp;

public class Ex18 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		BirdIf birdIf = bird;
		BirdIfS birdIfS = bird;
		//birdIf.MAX_BIRD_NUM! = 10;
		System.out.println(birdIf.MAX_BIRD_NUM1);
		System.out.println(birdIfS.MAX_BIRD_NUM2);
		
		birdIf.eatPrint1();
		birdIf.eatPrint2();
		birdIf.eatPrint3();
		
		birdIfS.eatPrint4();
		birdIfS.eatPrint5();
		birdIfS.eatPrint6();
		birdIfS.eatPrint7();
		
		Temp temp = new Temp();
		temp.ifCPrint(birdIf);
	}
}
