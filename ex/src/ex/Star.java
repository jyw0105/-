package ex;

public class Star {
	public void printTriangle(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=0 ;j< i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printReverseTriangle(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=0; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printPushTriangle(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printReversePushTriangle(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printTop(int num) {
		for(int i=1; i<=num; i++) {
			//빈칸 사각형
			for(int j=0; j<(3*num)-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printMiddleOne(int num) {
		for(int i=1; i<=num; i++) {
			//역삼각
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=(6*num)-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printMiddleTwo(int num) {
		for(int i=1; i<=num; i++) {
			//삼각
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			//사각형 * 채우기
			for(int j=0; j<(4*num)+(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printBottom(int num) {
		for(int i=1; i<=num; i++) {
			//빈칸 사각형
			for(int j=0; j<(2*num)+i-1; j++) {
				System.out.print(" ");
			}
			//역삼각형
			for(int j=0; j<=2*(num-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printStar(int num) {
		printTop(num);
		printMiddleOne(num);
		printMiddleTwo(num);
		printBottom(num);
	}
	
}