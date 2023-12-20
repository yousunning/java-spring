package mainex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 코스모 수업 소개 프로그램 메뉴 만들기
		// 콘솔 입력 받기 클래스 선언
		Scanner scanner = new Scanner(System.in);
		// 메인 메뉴는 반복되고 반복횟수는 모르니 while(true)
		// 중지 가능해야 하므로 true 값에 해당 변수를 inMianMenu 변수 false면 중지
		// (E)xit을 선택입력하면 inMainMenu 를 Flase로 변경
		boolean inMainMenu = true;
				
		System.out.println("< 등록 및 수업예약 >");
	    
		while (inMainMenu) {
			System.out.println("(1)강사    (2)회원 ");

			switch (scanner.next()){
			case "1":
			case "2":
				// 인트로 정보
				System.out.println("안녕하세요! :) 코스모필라테스 입니다. \r\n" + "함께 운동합시다.");
				break;

			case "01":
			case "a":
				// 상세정보 중간 메뉴 진행 변수
				boolean inCourseMenu = true;
				while (inCourseMenu) {
					System.out.println();

					System.out.println("코스모 수업을 소개합니다.\r\n" + "(1)리포머   (2)캐딜락  (3)체어   (4)바렐 (E)나가기 ");
					// 입력받기
					switch (scanner.next()) {
					case "월수금 오전10시":
					case "02":
						System.out.println("============리포머==============");
						System.out.println("월수금 오전 10시 리포머 하지강화 운동.\r\n" + "강사: 정유선\r\n" + "추천 소도구: 보수");
						break;

					case "월수금 오후8시":
					case "03":
						System.out.println("==============체어바렐==============");
						System.out.println("월수금 오후 8시 체어/바렐 복부강화 운동.\r\n" + "강사: 정유선\r\n" + "추천 소도구: 매트");
						break;

					case "화목 오전11시":
					case "04":
						System.out.println("================리포머================");
						System.out.println("화목 오전 10시 리포머 하지강화 운동.\r\n" + "강사: 백소나\r\n" + "추천 소도구: 토닝볼");
						break;

					case "화목 오후7시":
					case "05":
						System.out.println("===========체어바렐=============");
						System.out.println("화목 오전 10시 리포머 하지강화 운동.\r\n" + "강사: 백소나\r\n" + "추천 소도구: 토닝볼");
						break;
					
					case "00":
						inCourseMenu = false;
						break;
					
					default:
						System.out.println("입력 값 확인.");
						break;
					}
				}
			case "e":
			case "E":
				// exit 종료
				System.out.println("안녕히가세요.");
				inMainMenu = false;
				break;
	
			  default:
                  System.out.println("==================================");
                  System.out.println("입력값을 확인해 주세요.");
                  break;

			}
		}
	}
}