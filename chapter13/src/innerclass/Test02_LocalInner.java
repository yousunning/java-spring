package innerclass;

class OuterClass1 {
	private int a = 10;

	public void test() {
		int b = 20;
		final int d = 40;

		class LocalInner {
			private int c = 30;

			// 내부 클래스에서 static멤버는 선언할 수 없다
			// private static int f = 100;

			public void print() {
				System.out.println("a : " + a);

				// 로컬 내부 클래스에 지역변수는 접근할 수 없다.
				// System.out.println("b: " + b);
				System.out.println("d : " + d);
			}
		}// 이너 클래스 중괄호
			// final로 선언된 지역변수(상수)는 접근할 수 있다
		System.out.println("d " + d);
	}
}

public class Test02_LocalInner {

	public static void main(String[] args) {
	}
	
}
