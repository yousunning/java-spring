package cooperation;

public class Taxi {
	String taxiName; 		//택시이름
	int passengerCount; // 승객수
	int money;			//버스 수입

	public Taxi(String taxiName) {
		// 택시 이름
		this.taxiName = taxiName;	
	}

	public void take(int money) {
		// 수입.
		this.money += money;
	}

	public void showInfo() {
		// 택시 정보 조회
		System.out.println(taxiName + "의 승객의 " + "수입은" + money + "입니다.");
	}

}
