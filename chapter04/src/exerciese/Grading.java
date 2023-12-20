package exerciese;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// 다중 if문을 이용하여 입력받은 성적에 대해 학점부여 하는 예제
		char grade;  // 학점
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)>>");
		int score = sc.nextInt();
		if(score>=90) {
			grade = 'A';
		}
		else if(score >= 80) {
			
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'E';
		}
			System.out.println("학점은 "+ grade +"학점 입니다.");
			
			sc.close();
		
		
		}
	}


