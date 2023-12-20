package staticex;

public class StudentTest4_1 {

	public static void main(String[] args) {
		// 학번 자동ㅇ생성하는 StudentTest2 클래스 이용
		// StudentTest2 에서 클래스 변수 직접 참조해서 사용
		
		Student3 studentBak =new Student3();
		studentBak.setStudentName("백소나");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentBak.studentName+ "카드번호 : " + 
				studentBak.cardNumber + " 학번: " + studentBak.studentID );
		
		
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이수현");
				System.out.println(Student3.getSerialNum());
				System.out.println(studentLee.studentName + 
						"카드번호 :" +	studentLee.cardNumber + " 학번 : "+ studentLee.studentID);
	}

}
