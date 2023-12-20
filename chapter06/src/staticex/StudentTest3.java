package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		// 학번 자동ㅇ생성하는 스튜던트 1클래스 이용
		// StudentTest2 에서 클래스 변수 직접 참조해서 사용
		Student1 studentBak =new Student1();
		studentBak.setStudentName("백소나");
		System.out.println(Student1.serialNum);
		System.out.println(studentBak.studentName+
				" 학번: " + studentBak.studentID );
		
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이수현");
				System.out.println(Student1.serialNum);
				System.out.println(studentLee.studentName +
						" 학번 : "+ studentLee.studentID);
	}

}

