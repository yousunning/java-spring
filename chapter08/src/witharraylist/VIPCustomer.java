package witharraylist;

public class VIPCustomer extends Customer {
	

	private int agentID;// 상담원 아이디
	double saleRaito;	// 제품 할인률
	// private int saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 퍼블릭 커스토머 가리키고 있고
		initCustomer();
		//this.agentID  = agentID;
		//System.out.println("VIPCustomer() 생상자호출");
	}
	
	//받는 생성자 만들기
	private void initCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRaito = 0.1;
		//this.agentID = agentID; // 커스터머디스 가리키고 있음
	}
	

	@Override			//매개변수
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (price - (int) (price * saleRaito));
	}

	// price = price - (int) (price - saleRatio); 책

	public int getAgentID() {
		return agentID;
	}

	//	public String showVIPinfo() {
//		return super.showCustomerInfo()+"담당 상담원 아이디는 " + agentID +" 입니다.";
//	}

	@Override
	public String showCustomerInfo() {
		// 상위 클래스 고객정보 메서드 재정의
		return super.showCustomerInfo()+ "담당 상담원 아이디는 " + agentID +" 입니다.";
	}
	
	
}
