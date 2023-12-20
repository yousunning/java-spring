package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// 파일출려 테스트
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
		fos.write(65); //A
		fos.write(66); //B
		fos.write(67); //C
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("출력완료");
	}

}
