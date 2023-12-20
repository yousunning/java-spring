package itexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		// 기본 switch~ case 문 실습 / jdk 7이상 문자열(스트링""으로표시) 가능
		String ranking = "1등";
		String medalColor = "노메달";
				
		
		switch (ranking) {
			case "1등" : 
			medalColor = "금메달"; 
			break;
		
			case "2등" : 
			medalColor = "은메달"; 
			break;
		
			case "3등" : 
			medalColor = "동메달"; 
			break;
		
		//	default: 
		//medalColor = 'N';
		
		}
		System.out.println(ranking + ""
				+ " 메달의 색깔은 " + medalColor + "입니다.");
	}

}
