package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		// Break 반복문 연습 : 합계가 100 초과경우 그 수와 합을 구하는 예제
		int sum = 0;
		int num = 0;
		for (num = 0;; num++) {
			sum += num;
			if (sum >= 100) { // 종료조건
				break;
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
