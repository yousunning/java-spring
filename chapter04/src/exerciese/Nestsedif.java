package exerciese;

import java.util.Scanner;

public class Nestsedif {

	public static void main(String[] args) {
			// 점수와 학년을 입력 받아 60점 이상이면 합격, 
			// 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)>>");
		int score = sc.nextInt();
		
		System.out.println("학년을 입력하세요(1~4)>>");
		int year = sc.nextInt();
		
		
		if(score>=60) {
			if (year !=4) {
				System.out.println("합격!");
			} else if (score>=70) {       //4학년 일때만 넘어옴
				System.out.println("합격!");
			} else { //4학년 이면서 70점 미만 의 경우
				System.out.println("불합격!");
			}
		
		} else {
			System.out.println("불합격!");
		}
			
		sc.close();
	}
}


