package itexample;

public class SwitchCase1 {

	public static void main(String[] args) {
		// 기본 switch~ case 문 실습
		int ranking = 1;// '' 작은 따옴표 넣으면 아스케문자로 인식함
		char medalColor = 'N';
		
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
		
		//	default: 
		//medalColor = 'N';
		
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
	}

}
