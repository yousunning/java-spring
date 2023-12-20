package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		// FileOutputStream 과 byte arr 활용
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
		
		// byte 배열로 파일읽기
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			byte [] bs = new byte[10];
			int i;
			while((i=fis.read(bs))  != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println(" : " + i +"byte read");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}

