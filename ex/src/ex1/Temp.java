package ex1;

import ex.BirdIf;

public class Temp {
	public void birdCPring(Bird bird) {
		//if(birdH instanceof Humming) 체크
		if(bird instanceof Humming) {
			Humming humming = (Humming) bird;
			//자식클래스 함수 실행
			System.out.println(humming.toString());
		}
		
	}
	public void ifCPrint(BirdIf birdIf) {
		System.out.println("Bird ? "+(birdIf instanceof Bird));
		if(birdIf instanceof Bird) {
			//버드타입에 강제 캐스팅을 해서 넣음
			Bird bird = (Bird) birdIf;
			//버드 안에 함수 사용
			bird.eat();
		}
	}
	
}
