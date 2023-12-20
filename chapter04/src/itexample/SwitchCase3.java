package itexample;

public class SwitchCase3 {

	public static void main(String[] args) {
		// 기본 switch~ case 문 실습 / jdk 7이상 문자열(스트링""으로표시) 가능
		String ranking = "1등"; //요기 데이터 박스에 문자열을 넣음 
		String medalColor = "노메달";
			//스트링 문자 리터럴 큰따옴표	
		
//char rank = '1'; / char 리터럴 작은따옴표, 문자하나 표현하는 어쩌구

		
		
		switch (ranking) {
			case "1등" : 
			medalColor = "금메달"; 
		
		
			case "2등" : 
			medalColor = "은메달"; 

		
			case "3등" : 
			medalColor = "동메달"; 
			break;
			//브레이크가 있어야 박스 탈출 안함
		
		//	default: 
		//medalColor = 'N';
		
			//메달그릇에 엎어쓰다가 동메달로 출력 브레이크가 없을시에.
		
		}
		System.out.println(ranking + ""
				+ " 메달의 색깔은 " + medalColor + "입니다.");
	}

}
