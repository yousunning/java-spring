package thisex;

public class Person {
	String name;
	Boolean married;
	int numberOfChild;
	int age;
	
	//Person() {} 기본디폴트 생성자
	
	Person getPerson() {
		return this; // 생성 인스턴스 주소 반환하는this
		
	}
}
