package object;

public class HashCodeTest {

	public static void main(String[] args) {
		// String과 Integer 클래스의 hashcode()
		String str1 = new String("abc"); // 00x0050
		String str2 = new String("abc"); // 00x0010
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Integer num1 = new Integer("100"); // 00x0060 // 취소선 deprecated 왠만함 쓰지마라 나중에 못쓸수도 있음 -> Integer num1 = 100;
		Integer num2 = new Integer("100"); // 00x008
		System.out.println(num1.hashCode());
		System.out.println(num2.hashCode());

	}

}
