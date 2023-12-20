package chapter2;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int  MAX_NUM = 25 ; //선언과 동시에 초기화
		final int MIN_NUM ;
		
		MIN_NUM =1; //사용하기 전에 초기화. 초기화 하지않으면 오류발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		
		//MAX_NUM = 1000; 오류
//		final int max_student = 100 ;  (소문자)노란오류

	}

}
