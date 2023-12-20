package Chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		// 구구단을 수정해서 3단부터 7단까지만 출력
		for (int dan = 3; dan <= 7; dan++) {
			System.out.println("!!!!! " + dan + " !!!!!");

			for (int times = 1; times <= 7; times++) {

				System.out.println(dan + "X" + times + "=" + (dan * times));
				System.out.println();
			}
		}
	}
}