package ex;

import java.util.Iterator;

public class Ex2 {
	public static void main(String[] args) {
		String[] oStr = {"a","b","c"};
		String[] nStr = new String[5];
				//복사할려는거, 시작위치, 받는곳, 받는 시작위치, 복사 길이
		System.arraycopy(oStr, 0, nStr, 1, oStr.length);
		for (int i = 0; i < nStr.length; i++) {
			System.out.println("nStr"+(i+1)+": "+nStr[i]);
		}
	}
}
