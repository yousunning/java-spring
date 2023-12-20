package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// 한 클래스가 여러 인터페이스를 구현하는 경우 실습
		Customer cust = new Customer();
		
		Buy buyer = cust;
		buyer.buy();
		buyer.order();
		System.out.println();
		
		Sell seller = cust;
		seller.sell();
		seller.order();
		
		System.out.println();
	
		Customer order = cust;
		order.order();
		
		
		System.out.println();
		if(seller instanceof Customer) {
			Customer cust2 = (Customer)seller;
			cust2.buy();
			cust2.sell();
			cust2.order();
		}
		
	}

}
