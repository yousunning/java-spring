package interfaceex;

public interface Calc {
	double PI = 3.14; // public static final double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2); // public abstract
	int substract (int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//	1. jdk 8 이후 디폴트 메서드 사용가능
	default void description() {
		System.out.println("정수 계산기를 구현합니당");
		myMethod();
	}
	//인터페이스는 new 인스턴스 생성불가
	//	2. jdk 8 이후 정적 메소드 사용가능
	static int total(int[] arr) { //얜 메서드 몬씀
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		// mymethod(); - 에러남 
		myStaticMethod();
		return total;
		}
	// 	3. jdk 10 이후 private - 내부에서 사용가능한 메서드 생성가능
	private void myMethod() {
		System.out.println("private 메서드 입니당");
	}// 	10버전으로 바꿈
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니당");
	}
}