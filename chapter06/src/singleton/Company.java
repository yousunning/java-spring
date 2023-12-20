package singleton;

public class Company {
	//1. 생성자 프라이빗 만든다
	private Company() {
	}

	// 2. 내부에서 인스턴스를 가져다 만든다
	public static Company instance = new Company();
	
	//3. 하나뿐인 인스턴트를 리턴해주는 게터메서드 생성
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
			return instance;
	}
	
}


//private
