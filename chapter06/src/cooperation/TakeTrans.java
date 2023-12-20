package cooperation;

public class TakeTrans {

	public static void main(String[] args) { //테스트 할 거라서 메인메소드 필요로 함.
		// 2명의 학생을 생성해서 객체간 협력 구현 테스트
		// 버스 타는 학생
		Student studentJames = new Student("James", 5000); // 첨에 생성자 없어서 에러 남.
		Bus bus100 = new Bus(100);
		
		studentJames.takeBus(bus100);
		
		studentJames.showInfo();
		bus100.shoeInfo();
		System.out.println();
		
		//지하철 타는 학생
		Student studentTomas = new Student("Tomas", 10000); //처음에 먼저 여기서 진행하는 과정.
		Subway subwayGreen = new Subway ("2호선");
		studentTomas.takeSubway(subwayGreen);
		
		studentTomas.showInfo();
		subwayGreen.showInfo();

		//택시 타는 학생
		Student studentEdward = new Student("Edward", 50000); //처음에 먼저 여기서 진행하는 과정.
		Taxi taxi = new Taxi ("서울택시");
		studentEdward.takeTaxi(taxi);
				
		studentEdward.showInfo();
		taxi.showInfo();

		
		
		
		
		
	}

}
