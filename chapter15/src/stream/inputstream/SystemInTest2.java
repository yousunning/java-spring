package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// 표준입출력으로 문자 여러개를 입력받기
		System.out.println("표준입출력으로 문자들을 입력받기>>");

		int i;
		try {
			while((i = System.in.read())  != '\n'){ // 개행문자 '\n'  :  enter key
			//System.out.println(i);
			System.out.print((char) i);
		}
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
