package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		// continue
		int total = 0;
		for (int num = 0; num <= 10; num++) {
			if (num % 2 == 0) {
				continue;
			}
			total += num;
		}
		System.out.println("1~100까지 홀수 합은 : " + total + "입니다");
	}
}