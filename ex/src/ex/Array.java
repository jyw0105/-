package ex;


public class Array {
	public int[][] numArray() {
		int[][] array = new int [10][10];
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length;j++) {
				array [i][j]=(10*i)+j;
				System.out.println((10*i)+j);
			}
		}
		return array;
	}
}
