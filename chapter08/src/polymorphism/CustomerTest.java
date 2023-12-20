package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// 다형성 연습 - 고객관리 프로그램 완성하기
		Customer custLee = new Customer (10010, "이순신"); //부모타입
		custLee.bonusPoint = 1000;
		System.out.println();
		System.out.println(custLee.showCustomerInfo());

		Customer custKim = new VIPCustomer(10020,"김유신",12345);
		custKim.bonusPoint = 1000;
		
		System.out.println(custKim.showCustomerInfo());
		
		System.out.println("==== 할인율과 보너스 포인트 계산 ====");
		int price = 10000;
		int leePrice = custLee.calcPrice(price);
		System.out.println(custLee.getCustomerName()+ "님이 " + leePrice + "원 지불하셨습니다.");
		
		int kimPrice = custKim.calcPrice(price);
		System.out.println(custKim.getCustomerName()+"님이"+ kimPrice + "원 지불하셨습니다.");
		
		System.out.println(custKim.showCustomerInfo());
		
		
	}
}
