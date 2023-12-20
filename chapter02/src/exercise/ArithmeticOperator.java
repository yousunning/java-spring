package exercise;

import java.util.Scanner; // Ctrl + Shift + 영문 O 자동입력

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 정수를 입력받아 시, 분, 초로 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요>>");
		
		int time = sc.nextInt(); //정수입력
		// 60 으로 나눈 나머지는 초 320 % 60 -> 20초 
		int second = time % 60;
		// ( 320 / 60 = 5.33333 ) -> ( 5 ) % 60 -> 5분 
		int minute = (time / 60) %  60; //60으로 나눈 몫을 60으로 나눈 나머지는 분이된다.
		// (3600 / 60 ) /60 한시간 
		int hour = (time /60) /60;
		
		System.out.print(time+ "초는 ");
		System.out.println(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초 입니다.");
		
	
	
		
	
	
	}

}
