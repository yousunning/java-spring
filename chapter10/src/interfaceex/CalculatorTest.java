package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		// CompleteCalc 클래스 실행하기
		int num1 = 10;
		int num2 = 5;

		// Calc c =new Calc(); 인터페이스는 인스턴스 생성불가
		// Calculator cc = new Calculator(); 추상 클래스는 인스턴스 생성불가

//		CompleteCalc calc = new CompleteCalc();
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
//
//		calc.showInfo();

		calc.description(); // 디폴트 메소드 호출
		
//		Calc cc = new CompleteCalc();
//		cc.showInfo
//		자식 하위 클래스에서 생성된 메소드는 호출 안뜸.
//		인터페이스로 형변환 시 인터페이스에 있는 선언된 메서드만 실행 가능
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr); //정적 메소드 사용
		System.out.println(sum);
	}
}
