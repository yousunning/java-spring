package logical;

public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated metod stub
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0); // and
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0); // false
		System.out.println(flag);
	
		flag = (num1 < 0) || (num2 > 0); // 
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0); // or
		System.out.println(flag); // 
		
		flag = !(num1 > 0); // 
		System.out.println(flag);
		
		
		
		
		
		
		
	}

}
