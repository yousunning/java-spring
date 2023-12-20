package exercise;

public class TypeConversion {

	public static void main(String[] args) {
		// 자동 타입변환 (묵시적 형변환 ) 과 강제 타입 변환(명시적 형변환)예제
		byte b = 127;
		int i = 100;

		System.out.println(b + i); // 227
		System.out.println(10 / 4); // 2 정수 나누기 정수는 정수. 몫.
		System.out.println(10.0 / 4); // 2.5 하나라도 소수점이(실수)면 소수점으로 표시
		System.out.println((char) 0X12340041); // A 총 4바이트 2바이트 날라가서 0041만 남음 (chat) 65 => A 아스키코드표 참고
		System.out.println((byte) (b + i)); // 정수값이 되는데 값이 너무 커져서 오류로 이상한 값이 나옴); / -29
		System.out.println((int) 2.9 + 1.8); // 실수가 있는 연산이면 실수로 결과나옴. 처음 2.9는 2로 들어감
		System.out.println((int) 2.9 + (int) 1.8); // 정수끼리의 연산은 정수결과가 나옴

	}
}
