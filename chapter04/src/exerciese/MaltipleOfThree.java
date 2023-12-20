package exerciese;

import java.util.Scanner;

public class MaltipleOfThree {

	public static void main(String[] args) { 
		// 3배수인지 판별하는 예제
		Scanner in = new Scanner(System.in);
		System.out.println("수 입력>>");
		
		int num = in.nextInt();
		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		in.close();
		
	}

}
