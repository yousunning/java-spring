package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		// 상위클래스 하위클래스 각각 clacPrice 메서드 실행실습
		Customer custLee =new Customer(10010,"이순신");
		custLee.bonusPoint = 1000;
		VIPCustomer custKim = new VIPCustomer (10020,"김유신",12345);
		custKim.bonusPoint = 5000;
		
		//제품가격
		int price = 10000;
		System.out.println(custLee.getCustomerName()+
				" 님 지불금액은 " + custLee.calcPrice(price)+ " 원");
		System.out.println(custKim.getCustomerName() +
				" 님 지불금액은 " + custKim.calcPrice(price) +" 원");

	}

}
