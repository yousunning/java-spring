package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		// 중첩된 반복문 실습
		// 초기식, 조건식, 증감식 2단-9단
		// 초기식, 조건식, 증감식 times1-9
		
		// 외부반복
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("##### " + dan + " #####");

			// 내부반복
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + (dan * times));
				System.out.println();
			}
		}
	}
}