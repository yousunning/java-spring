package itexample;

public class SwitchCase {

	public static void main(String[] args) {
		// 기본 switch~ case 문 실습
		int ranking = 3 ;
		char medalColor;
		
		switch (ranking) {
			case 1 : 
			medalColor = 'G'; 
			break;
		
			case 2 : 
			medalColor = 'S'; 
			break;
		
			case 3 : 
			medalColor = 'B'; 
			break;
		
			default: 
			medalColor = 'N';
		
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
	}

}
