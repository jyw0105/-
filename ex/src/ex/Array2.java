package ex;

public class Array2 {
	public int[][] numArray() {
		int[][] array = new int [10][20];
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length;j++) {
				array [i][j]=(20*i)+j;
				System.out.println((20*i)+j);
			}
		}
		return array;
	}
}
