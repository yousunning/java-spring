package chapter12.q6;

public class CarTest {

	public static void main(String[] args) {
		// hashMap : 키와 값(밸류)가 있는 쌍으로 된 자료
		//를 이용하여 CarFactory 구현하세요
		CarFactory factory = CarFactory.getInstence();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1==sonata2);

	Car avante1 = factory.createCar("승연 차");
	Car avante2 = factory.createCar("승연 차");
	System.out.println(avante1==avante2);

	System.out.println("=======");
	
	System.out.println(sonata1==avante2);
	}
}
