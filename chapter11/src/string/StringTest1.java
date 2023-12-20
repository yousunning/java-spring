package string;

public class StringTest1 {

	public static void main(String[] args) {
		// String 주소값 비교하기
		String str1 =  new String("abc");
		String str2 =  new String("abc");
		
		System.out.println(str1 == str2); //거짓
		System.out.println(str1.equals(str2));
	
		//상수풀에 리터럴
		String str3 = "abc";
		String str4 = "abc";
	
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
