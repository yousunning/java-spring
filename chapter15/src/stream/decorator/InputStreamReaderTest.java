package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// 보조스트림 : 바이트를 문자 데이터로 변환해주는 스트림
		try(InputStreamReader fsr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while ((i = fsr.read())!= -1) {
				System.out.print((char)i);
			}
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}
