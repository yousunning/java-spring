package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcceptionHandling1 {
	// try - catch 문 사용하기
	public static void main(String[] args) {
	
		FileInputStream fis = null;
		try { // 무조건 실행
			fis = new FileInputStream("a.txt");
			//
			//
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
	
		}//중괄호 쳐져있어 밑 출력 가능(?)
		
		System.out.println("에러나도 여기까지 오능감?");
	}

}
