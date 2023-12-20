package inheritance;

public class OverirringTest2 {

	public static void main(String[] args) {
		// 오버라이딩 가상함수 테스트
		Customer vc = new VIPCustomer(10030, "가함수", 222);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() + "님 지불금액은 " + vc.calcPrice(10000) + "원");// 하위클래스 프레이스 메소드가 실행됨

	}

}
