package Chapter4;

public class NestedLoop2 {

	public static void main(String[] args) {
		// 구구단을 수정해서 3단부터 9단까지만 출력
		for (int dan = 8; dan <= 9; dan++) {
			System.out.println("@@@ " + dan + " @@@");

			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + (dan * times));
				System.out.println();

			}

		}

	}

}
