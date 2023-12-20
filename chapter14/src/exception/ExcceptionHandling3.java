package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcceptionHandling3 {
	// try - catch - finally 문 사용하기
	public static void main(String[] args) throws FileNotFoundException {
	
		FileInputStream fis = new FileInputStream("a.txt");
								//FileNotFoundException - 메인메서드에 추가
								//throws 여기에선 "s" 있음 throws !
	}
}
