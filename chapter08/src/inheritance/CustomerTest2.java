package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 하위클래스 테스트하기
		

		VIPCustomer customerKim = new VIPCustomer(); // 하위 클래스 생성
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
