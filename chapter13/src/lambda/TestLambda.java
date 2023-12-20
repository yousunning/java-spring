package lambda;

public class TestLambda {
	interface PrintString{
		void showString(String str);
	} 
	
	public static void main(String[] args) {
		// 화살표 함수를 변수처럼 사용하는 람다식 예제
		// 1. 람다식을 변수에 대입
		PrintString lambdaStr = s -> System.out.println(s); // 람다식을 변수에 
		lambdaStr.showString("헬로 람다_1 *^3^*");
		
		showMyString(lambdaStr); // 2. 람다식이 메서드 매개변수로 전달

		// 3. 반환값으로 람다식 사용
		PrintString retStr = returnString();
		retStr.showString("*~Hello ");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("헬로 람다_2 *ㅇ3ㅇ*");
	
	}
	public static PrintString returnString() {
		return s -> System.out.println(s + "World~*"); // 람다식으로 리턴
	}
}
