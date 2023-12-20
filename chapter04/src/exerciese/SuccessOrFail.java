package exerciese;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// 합격 판별하는 프로그램
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하시오>>");
		int score = sc.nextInt();
		if (score >= 80) {
			System.out.println("축하합니다! 합격입니다.");
		}

		sc.close();
		
	}
}
