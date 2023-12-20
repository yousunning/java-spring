package interfaceex;

public class CompleteCalc extends Calculator {//자식 클래스

	@Override
	public int times(int num1, int num2) {
		return (num1 * num2);
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) {
			return (num1 / num2);
		} else {
			return Calc.ERROR;
		}
	}
	
	//자식 하위 클래스에서 생성된 메소드
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니당");
	}
}
