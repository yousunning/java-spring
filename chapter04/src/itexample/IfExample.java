package itexample;

public class IfExample {
	public static void main (String[] args) {
		
		boolean isMarried = false;
	
		if (isMarried) {
			System.out.println("결혼했음");
		}	else {
			System.out.println("미혼");
		}
		
		boolean isEven;
		int num = 10;
		isEven = (num%2==0) ? true : false;
		System.out.println(isEven);
		
}
}
