package loopexample;

public class DoWhileExample {

	public static void main(String[] args) {
		// While 반복문 실습
		//초기식
		int num = 100; // 조건에 안맞더라도 do while 문은 무조건 한번은 수행된다.
		int sum = 0 ;
		
		// 조건식
		do {
			sum += num;
			// 증감식
			num++;  // num = num + 1;
		}
		while (num <= 10);
			System.out.println("1~10 까지 합은 "+ sum + "입니다"); }
	}
