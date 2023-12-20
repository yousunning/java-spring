package witharraylist;

public class GoldCustomer extends Customer {
	double saleRatio; //제품할인율 명시
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}
	public int calcPrice(int price, int saleRaito) {
		bonusPoint += price * bonusRatio;
		return (price - (int) (price * saleRaito)); //할인률 차감 고객
	}
}
