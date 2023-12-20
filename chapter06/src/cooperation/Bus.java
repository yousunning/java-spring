package cooperation;

public class Bus {
	//버스멤버변수
	int busNumber; 		//버스번호
	int passengerCount; // 승객수
	int money;			//버스 수입
	
	
	public Bus(int busNumber) {
		// 버스번호 받아서 사용하는 생성자
		this.busNumber = busNumber;
	}

	
	public void take(int money) {
		// 승객을 태우는 기능
		this.money += money; // 버스 수입이 증가
		passengerCount++; // 승객수 늘어남 passengerCount + 1 증감 연산자
	}

	public void shoeInfo() {
		// 버스 정보 조회
		System.out.println("버스 " + busNumber + "번의 승객은" + 
		passengerCount + "명이고, 수입은 " + money + "입니다.");
	}



}
