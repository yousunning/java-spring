package chapter2;

public class ExplicitConversion {
public static void main (String[] args) {
	double dNum1 = 1.2;
	float fNum2 = 0.9F;
	
	int iNum3 = (int) dNum1 + (int) fNum2;//1+0
	System.out.println(iNum3);
	int iNum4 = (int)(dNum1+fNum2); //(int)(2.1)
	System.out.println(iNum4);
}
}
