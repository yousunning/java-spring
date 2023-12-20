package cooperation;

public class Subway {
	//멤버변수
	public String lineNumber; 	// 지하철 노선
	public int passengerCount; 	//승객수
	public int money;			//수입 금액
	
	
	public Subway(String lineNumber) {
		// 지철 문자열 정보 받아서 생성자로 만들거야
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		// 지하철 태워주는 메소드
		this.money = this.money + money; // 수입증가
		passengerCount++;
	}
	
	public void showInfo() {
		// 지하철 정보 조회
		System.out.println(lineNumber + "의 승객은 " 
		+ passengerCount + "명 이고, 수입은" + money + "입니다.");
		}

	}

