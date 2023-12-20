package inheritance;

public class VIPCustomerOld {
	// 멤버변수 = 인스턴스 변수
	private int customerID; // 고객 아이디
	private String customerName; // 고객 이림
	private String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio;

	// VIP 고객 추가 속성
	private int agentID; // 담당상담원 아이디
	double saleRatio; // 제품 할인율

	// 생성자
	public VIPCustomerOld() {
		if (customerGrade == "VIP") {
			customerGrade = "VIP"; // 기본등급
			bonusRatio = 0.05; // 기본 보너스 포인트 적립 비율
			saleRatio = 0.1;
		} else {
			customerGrade = "SILVER"; // 기본등급
			bonusRatio = 0.01; // 보너스 포인트 적립 비율
		}
	}

	// 메서드
	public int calcPrice(int price) {
		if (customerGrade == "VIP") {
			price = price - (int) (price * saleRatio);
			bonusPoint += price * bonusRatio;
		} else {
			bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		}
		return price;
	}

	// 그대로
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

}