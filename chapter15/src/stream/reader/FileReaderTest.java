package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		//FileReader로 문자단위의 데이터 읽기
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i =fr.read())!= -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
