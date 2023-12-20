package consturctor;

public class PersonTest {

	public static void main(String[] args) {
		// 인스턴트 생성 A a = new A();
		Person personLee = new Person ();
		personLee.name = "김유신";
		personLee.weigt = 85.5F;
		personLee.height = 180.0F;
		
		Person personKim = new Person("김유신", 175, 75);
		
				

	}

}
