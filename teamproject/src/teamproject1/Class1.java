package teamproject1;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// 코스모 수업 소개 프로그램 메뉴 만들기
		// 콘솔 입력 받기 클래스 선언
		Scanner scanner = new Scanner(System.in);
		//메인 메뉴는 반복되고 반복횟수는 모르니 while(true)
		// 중지 가능해야 하므로 true 값에 해당 변수를 inMianMenu 변수 false면 중지
		//(E)xit을 선택입력하면 inMainMenu 를 Flase로 변경
		boolean inMainMenu =true;
		
		while(inMainMenu) {
			System.out.println(" -------------------------------------");
			System.out.println("|☆(I)ntro     (C)ources      (E)xit ☆|");
			System.out.println(" -------------------------------------");
			switch(scanner.next()) {
				case "i" : 
				case "I" :
					//인트로 정보
					System.out.println(" -------------------------------------");
					System.out.println("안녕하세요! :) 코스모 입니다. \r\n"
							+ "함께 공부합시다.");
					System.out.println(" -------------------------------------");
					break;
					
					
				case "c" :
				case "C" :
					//상세정보 중간 메뉴 진행 변수
					boolean inCourseMenu = true;
					while(inCourseMenu) {
						System.out.println();
					
						System.out.println("코스모 수업을 소개합니다.\r\n"
								+ "(J)ava   (S)QL   (P)ython   (B)ack" );
						//입력받기
						switch (scanner.next()) {
						case "j" : 
						case "J" :
							System.out.println("========================");
							System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\r\n"
									+ "강사: 엄호식\r\n"
									+ "추천 선수과목: 없음");
							break;
						
						case "S" : 
						case "s" :
							System.out.println("========================");
							System.out.println("최신 SQL 언어를 통해 데이타를 조작할 수 있습니다.\r\n"
									+ "강사: 성태호\r\n"
									+ "추천 선수과목: Java");
							break;
						
						case "p" : 
						case "P" :
							System.out.println("========================");
							System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\r\n"
									+ "강사: 강영훈\r\n"
									+ "추천 선수과목: Java, SQL");
							break;
						
						case "b" : 
						case "B" :
							inCourseMenu = false;
							break;
							default : 
									System.out.println("입력 값 확인.");
									break;
						}
					}
				case "e" :
				case "E" :
					//exit 종료
					System.out.println("안녕히가세요.");
					inMainMenu= false;
					break;
						default :
						System.out.println("다시입력해주세요");
						break;
			}
		}
	}
}