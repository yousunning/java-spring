package chapter2;

public class ImplicitConversion {
	public static void main (String[] args) {
		byte bnum =19;
		int iNum= bnum;
		System.out.println(bnum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2 ;
		
		System.out.println(iNum);
		System.out.println(fNum); //20.0
		
		
		double dnum;
		dnum = fNum + iNum;//19+20.0
		System.out.println(dnum);//39.0
		
		short num1 =10;
		short num2 =20;
		
		int sum = num1 + num2;
		System.out.println(sum);
				

		
		
	}
	
}
