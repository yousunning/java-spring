package polymorphism;

public class Customer { //초기생성자 만들기 클래수, 여러개 찍어낼 수 있음 붕어빵 틀.
	// 멤버변수 = 인스턴스 변수
	protected int customerID; // 고객 아이디
	protected String customerName; // 고객이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립 비율

	// 인스턴스 생성자
	public Customer() {
		customerGrade = "SILVER";// 기본등급
		bonusRatio = 0.01; // 기본 보너스 포인트 적립 비율
		System.out.println("Customer() 생상자호출");
	}
	
	
	//생성자오버로딩이 뭔감-면접시 준비
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";// 기본등급
		bonusRatio = 0.01; 
	}
	
	//메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


}
