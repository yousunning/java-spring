package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		// 학번 자동ㅇ생성하는 StudentTest2 클래스 이용
		// StudentTest2 에서 클래스 변수 직접 참조해서 사용
		
		Student2 studentBak =new Student2();
		studentBak.setStudentName("백소나");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentBak.studentName+
				" 학번: " + studentBak.studentID );
		
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이수현");
				System.out.println(Student2.serialNum);
				System.out.println(studentLee.studentName +
						" 학번 : "+ studentLee.studentID);
	}

}
