package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 1 ;
		//두와일문 포문/초기식,조건식,증감식! 필수로 알아두기 반복시키기 위해서는 필요함 : 반복문 i + + ->i = i+1
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1 ;
			System.out.println(dnum);
		
		}
			
	}

}
