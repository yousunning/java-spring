package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		// 파일출려 테스트
		try(FileOutputStream fos = new FileOutputStream("output3.txt")){
				byte[] bs = new byte[26]; //선언 및 초기화
				byte data = 65; //대문자 에이 아스키값
				for (int i = 0; i <bs.length; i++) {
					bs[i]= data++;
				}
				//배열의 2번째 위치부터 10개 바이트 출력하기
				fos.write(bs, 2, 10); //배열 한꺼번에 출력하기
			}catch(IOException e) {
				System.out.println(e);
			}
			System.out.println("출력이 완료 되었습니다.");
	}
}