package thisex;

public class PersonTest {

	public static void main(String[] args) {
		// 자신의 주소를 반환하는 this 테스트
		Person p = new Person();
		p.name = "James";
		p.married = true;
		p.numberOfChild = 3;
		p.age = 40;
		
		Person p2 = p.getPerson();
		System.out.println(p2.age);

	}

}
