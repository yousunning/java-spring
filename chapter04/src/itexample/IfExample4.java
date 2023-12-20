package itexample;

public class IfExample4 {

	public static void main (String [] args) {
		//지역변수 개념
		int age= 10;
		int charge =0;
		int i = 10;
		i += 2;
		if(age <8) {
			charge = 1000;
		}
		
		if(age < 14) {
			charge = 2000;

		}
		System.out.println("입장료는 "+ charge + "원입니다");
		System.out.println(i);
	}
}
