package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
	// Class return type 의 method
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		// throws 로 예외 미루기
		ThrowsException2 test = new ThrowsException2();

			try {
				test.loadClass("a.txt", "java.lang.String");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //throws 인셉션 활용하여 만들기
	}
}
