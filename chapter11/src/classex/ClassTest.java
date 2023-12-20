package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// Person 클래스 생성하기
		Person person = new Person();
		// 1. 오브젝트의 겟클레스() 메서드 이용
		Class pClass = person.getClass();
		System.out.println(pClass.getName());

		// 2. 직접 클래스파일 대입
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		// 3. 클래스 이름으로 가져오기
		Class pClass3 = Class.forName("classex.Person"); // add 어쩌구 해주기
		System.out.println(pClass3.getName());

	}

}
