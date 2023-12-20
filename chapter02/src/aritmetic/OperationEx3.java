package aritmetic;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameScore = 150;
		
//		int lastScore1 = ++gameScore;
		int lastScore1 = gameScore++;
	//gamaeScore++ => gameScore =gameScore + 1;
		System.out.println(lastScore1); //150
		System.out.println(gameScore); //151
		
		int lastScore = --gameScore;
		System.out.println(lastScore); // 증감소연산자
		
		
		
	}

}
