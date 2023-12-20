package array;

public class TwoDimension2 {

	public static void main(String[] args) {
		// 이차원 배열의 로또생성
		int[][] lotto = new int[5][6];// 5줄의 로또번호 6개를 생성

		for (int row = 0; row < lotto.length; row++) {
			for (int i = 0; i < lotto[row].length; i++) {
				//난수생성
				//System.out.println((int) (Math.random() * 45) + 1);
				lotto[row][i] = (int) (Math.random() * 45) + 1;
				//기존뽑힌 컬럼 값 비교해서 같은 수가 있으면 다시 추측
				// 자바에서 지원하는 math클래스로 랜덤출력
				for(int j=0; j<i; j++) {
					
				}
			}
		}
System.out.println("로또번호");
for(int row=0; row<lotto.length;row++) {
	for(int col=0; col<lotto[row].length; col++) {
		System.out.print(lotto[row][col]+" ");
	}
	System.out.println( ); //개행 
}
	}




}
