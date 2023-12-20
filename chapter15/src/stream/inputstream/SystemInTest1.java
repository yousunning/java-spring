package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		// 표준입출력으로 문자 하나를 입력받기
		System.out.println("표준입출력으로 문자 하나를 입력받기>>");

		int i;
		try {
			i = System.in.read(); // 한 read 메서드로 한 바이트 읽음
			System.out.println(i);
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
