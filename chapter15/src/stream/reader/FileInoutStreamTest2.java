package stream.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInoutStreamTest2 {

	public static void main(String[] args) {
		// 파일에서 자료읽기 try with resource 문과 여러글자 읽기
		
		try(FileInputStream fis =new FileInputStream("reader.txt")) { // 추가
			int i;
			while ((i = fis.read() ) != -1) { //대입연산자
				System.out.println((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		
	System.out.println("end");
	}
}
