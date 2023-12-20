package chapter12.q6;

import java.util.HashMap;

public class CarFactory {
	// 싱글톤 패던 공식 2 생성자 통해 하나의 인스턴스 생성
	private static CarFactory instance = new CarFactory();

	// 싱글톤 패던 공식 1 생성자 만들어다가 private으로 숨김
	private CarFactory() {
	}

	// 싱글톤 패턴 3번 인스턴스를 제공메서드 생성
	public static CarFactory getInstence() {
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}

	HashMap<String, Car> carMap = new HashMap<>();
	
	//***핵심***
	public Car createCar(String name) { // 핵심이 같은 이름의 문자를 같은지 확인.
		if (carMap.containsKey(name)) {
			return carMap.get(name); // 생성되어 있는 키에 해당 인스턴스 밸류를 리턴받는다.
		}

		Car car = new Car(); // 타입, 참조 = 생성자();
		carMap.put(name, car);
		return car;
	}

}
