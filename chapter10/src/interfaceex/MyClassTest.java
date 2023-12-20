package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		// interface 상속받은 interface 를 구현한 클레스 테스트
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x(); // x()
		
		Y yClass = mClass;
		yClass.y(); // y()
		
		System.out.println();
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
