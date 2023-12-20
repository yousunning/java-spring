package cooperation;

public class Student {
	//멤버변수
	public String studentName; //학생이름
	public int gread; //학년
	public int money; // 용돈
	

	public Student(String studentName, int money) {
		// 학생 생성자 (이름, 용돈)
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		// 버스객체 받아서 타고 갈꺼야
		bus.take(1000);
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		// 해당 노선 지하철 객체 받아서 타고 갈거야
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		// 해당 노선 지하철 객체 받아서 타고 갈거야
		taxi.take(4000);
		this.money -= 4000;
	}
	
	public void showInfo() {
		// 학생정보 확인해볼거야
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}

	

}
