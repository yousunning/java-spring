package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		//제품가격/지역변수/매게 변수
		int price = 10000;
		
		// 상위클래스 하위클래스 각각 clacPrice 메서드 실행실습
		Customer custLee =new Customer(10010,"이순신");
		System.out.println(custLee.getCustomerName()+
				" 님 지불금액은 " + custLee.calcPrice(price)+ " 원");
		
		VIPCustomer custKim = new VIPCustomer (10020,"김유신",12345);
		System.out.println(custKim.getCustomerName() +
				" 님 지불금액은 " + custKim.calcPrice(price) +" 원");
		// 오버라이딩 가상함수 테스트
		Customer vc = new VIPCustomer(10030, "가함수", 222);
		System.out.println(vc.getCustomerName() + " 님 지불금액은 " + vc.calcPrice(price) + " 원");// 하위클래스 프레이스 메소드가 실행됨
																		//가함수 지불금액
	}
}

