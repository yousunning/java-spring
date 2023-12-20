package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcceptionHandling2 {
	// try - catch - finally 문 사용하기
	public static void main(String[] args) {
	
		FileInputStream fis = null;
		try { // 무조건 실행
			fis = new FileInputStream("a.txt");
			} catch (IOException e) {
				System.out.println(e);
				return;
			}finally {
			if(fis != null){
		try { fis.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
			System.out.println("항상 수행합니다");
		}
		System.out.println("에러나도 여기까지 오능감?");
	}
}
