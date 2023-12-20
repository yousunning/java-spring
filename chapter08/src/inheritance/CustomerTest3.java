package inheritance;

public class CustomerTest3 {

	public static void main(String[] args) {
		// 
//		VIPCustomer customerKim = new VIPCustomer();
//		customerKim.setCustomerID(10020);
//		customerKim.setCustomerName("김유신");
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신",100);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
