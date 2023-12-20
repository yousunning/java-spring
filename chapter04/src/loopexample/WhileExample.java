package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		// While 반복문 실습
		//초기식
		int num = 1;
		int sum = 0 ;
		
		//조건식
		while (num <= 10) {
			if(num == 10) {
				System.out.println("회차변수 값이 10"); // 디버깅 파란스크롤 더블클릭 후에 벌레클릭
			}
			}
			sum += num;
			//증감식
			num++;  //num = num + 1;
			System.out.println("1~10 까지 합은 "+ sum + "입니다");}
	

}