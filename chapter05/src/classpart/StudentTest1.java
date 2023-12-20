package classpart;

public class StudentTest1 {
	public static void main(String[] args) {
		// 클래스로 인스턴트 생성(인스턴트화)
		// A a = new A ( ); / N n = New N( ); *외우기*
		// 클래스 타입 변수명 = New 생성자(); => 인스턴스 생성 동적메모리
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.setStudentName("이순신");
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee); //인스턴스 주소값
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.setStudentName("김유신");
		
		System.out.println(studentKim.getStudentName());	
		System.out.println(studentKim); // 인스턴스 주소값
		
		
	}

}
