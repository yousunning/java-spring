package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// FileWriter 쓰기
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char buf[] = {'B','C','D','E','F','G'};
			
			
			fw.write("\n안녕하세요 잘써지네요?");
			fw.write("65");//문자배열 일부 출력
			fw.write(buf, 1, 3); // 숫자를 문자열 출력
			
			String sId ="1001";
			String name = "이순신";
			String grade = "3학년";
			String address = "서울";
					
			fw.write("\n" + sId + "|" +  name + "|" + grade + "|" + address ); //문자배열 출력
			
		} catch (IOException e) {
		//System.out.println(e);
			
		}
	System.out.println("출력 완료");
	}
}
