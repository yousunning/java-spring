package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBuilder 클래스 예제 : StringBuffer는 동기화 보장
		String javaStr = new String("Java");
		System.out.println("String 처음 주소 :  " + System.identityHashCode(javaStr));

		StringBuilder sb = new StringBuilder(javaStr); // String으로 부터 sb 생성
		System.out.println("연산 전 sb메모리 주소 : " + System.identityHashCode(sb));
		sb.append(" and");
		sb.append(" android");
		sb.append(" programming is fun!!!"); // 문자열 추가
		System.out.println("연산 후 sb메모리 주소 : " + System.identityHashCode(sb));

		javaStr = sb.toString(); // String 클래스로 변환
		System.out.println(javaStr);
		System.out.println("String 연결값 주소 : " + System.identityHashCode(sb));

		
		System.out.println();
		
		String str1 ="1000";
		
//		String rslt = 10 + str1;
//		System.out.println(rslt);
		
		int rslt = 1000000 + Integer.parseInt(str1);
		System.out.println(rslt);
		
		Integer num1 = new Integer(100);
		Integer num2 = 200;
		int num3 = 300;
		int sum = num1 + num3; //언박싱
		Integer num4 = num3; //오토박싱
		System.out.println(sum + num2);
	}
}
