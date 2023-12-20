package consturctor;

public class Person {
//멤버변수
	String name;
	float height;
	float weigt;

	// 생성자 오버로딩
	// 디폴트 생성자
	public Person() {}
	
	
	//매개변수 있는 생성자 
	public Person (String pname) {
			name =  pname;
	}
	public Person (String pname,float phegiht ,float pweigt) {
		name = pname;
		height= phegiht;
		weigt = pweigt;
}}
