package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// BufferedStream 보조 스트림 예제
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("ALZip1219.exe");
				FileOutputStream fos = new FileOutputStream("Alcopy.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			//시작시간
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read())!= -1) {
				bos.write(i);
			}
			
			//소요시간 = 종료시간 - 시작시간;
			millisecond = System.currentTimeMillis() - millisecond;
			}
			catch(IOException e) {
				System.out.println();
			}
		System.out.println("파일 복사하는데" + millisecond +"millisecounds 소요시간");
	// (기반스트림) 이전 :  88431
	//  (Buffered) 이후 : 672
	}
}



