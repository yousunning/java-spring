package itexample;

public class SwitchCase4 {

	public static void main(String[] args) {
		// break 활용해서 switch 문 만들어보기
		int month = 10;
		int day;
		
		switch(month) {
			case 1 : case 3 :case 5 : case 7 : case 8 :case 10 : case 12 ://마지막 : 까쥐
				day = 31;    break;
					
				
				
			case 2 :
				day = 28; 
				break;
				
			case 4 : case 6 : case 9 :case 11 :
				day = 30; 	break;
				
				default :
					day = 0;
					System.out.println("존제하지 않는 달입니당~!");
						
		}
		System.out.println(month + "월은 " + day + "까지 있습니다.");
	}

}
