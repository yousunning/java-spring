package object;

public class StringEquals {

	public static void main(String[] args) {
		// Equals를 재정의 한 String과 Integer 클래스 테스트
		String str1 = new String("abc"); // 00x0050
		String str2 = new String("abc"); // 00x0010

		System.out.println((str1 == str2) ? "주소 같음" : "주소 다름");// ==주소를 비교하는 연산자
		System.out.println(str1.equals(str2) ? "같다" : "다르다");

		Integer num1 = new Integer("100"); // 00x0060  // 취소선 deprecated 왠만함 쓰지마라 나중에 못쓸수도 있음 -> Integer num1 = 100;
		Integer num2 = new Integer("100"); // 00x0088

		System.out.println((num1 == num2) ? "Integer 주소 같음" : "Integer 주소 다름");// ==주소를 비교하는 연산자
		System.out.println(num1.equals(num2) ? "숫자가 같다" : "숫자가 다르다");

	}

}
