package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("input2.txt")){
			byte[] bs = new byte[26]; //선언 및 초기화
			byte data = 65; //대문자 에이 아스키값
			for (int i = 0; i <bs.length; i++) {
				bs[i]= data++;
			}
			fos.write(bs); //배열 한꺼번에 출력하기
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료 되었습니다.");
	}

}
