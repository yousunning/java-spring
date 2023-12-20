package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRaito;
	// private int saleRatio;

	public VIPCustomer() {
		super(); // 퍼블릭 커스토머 가리키고 있고
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRaito = 0.1;
		
		//System.out.println("VIPcustomer() 생상자호출");
	}
	
	//받는 생성자 만들기
	public VIPCustomer(int customerID, String customerName,
			int agentID) {
		//System.out.println("VIPcustomer");
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRaito = 0.1;
		this.agentID = agentID; // 커스터머 디스 가리키고 있음
	}
	

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price = (price - (int) (price * saleRaito));
		return price;
	}

	// price = price - (int) (price - saleRatio); 책

	public int getAgentID() {
		return agentID;
	}
	public String showVIPinfo() {
		return super.showCustomerInfo()+"담당 상담원 아이디는 " + agentID +" 입니다.";
	}
}
