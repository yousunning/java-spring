package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java ");
		String androidStr = new String("& android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		//   .concat   문자 열과 문자열을 연결해줌
		
		System.out.println();
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(javaStr));
	}

}
