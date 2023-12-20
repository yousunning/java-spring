package itexample;

public class IfExample1 {

	public static void main(String[] args) {
		// if else 조건문
		int age = 2;
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		//조건 연산자
			
		String val = (age >= 10) ? "학교에 다닙니다." : "학교에 다니지 않습니다.";
			System.out.println(val);
			
	          

       }
  }