package ex;


public class Mo2 {
	public int int1;
	public String str1;
	
	private static Mo2 sg = new Mo2();
	
	//생성자 Private 생성자가 안보임 생성자 사용을 막음
	private Mo2 () {
		
	}
	
	public static Mo2 getIn() {
		return sg;
	}
}
