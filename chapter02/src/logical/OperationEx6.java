package logical;

public class OperationEx6 {

	public static void main(String[] args) {
		// 단락회로 평가실습
		int num1 = 10;
		int i =2 ;
		//논리곱 연산 시 앞 항목이 거짓이면 뒤에 항은 연산 안함
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
//		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
//		System.out.println(value);
//		System.out.println(num1);
//		System.out.println(i);
		
	//	boolean value = ((num1 = num1 + 10) < 10) & ((i = i + 2) < 10);
	//	System.out.println(value);
	//	System.out.println(num1);
	//	System.out.println(i);  ??안됨
		
		
		
		
	}

}
