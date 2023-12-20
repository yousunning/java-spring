package hiding;


public class StudentTest {

	public static void main(String[] args) {
		// 학생 클래스 실행방법 연습
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 금천구 가산동";

//		System.out.println(studentLee.studentName);
//		System.out.println(studentLee.address);

//		studentLee.showStudentinfo();
	}

}

//세터겟터 사용해서 가져오기 중요함.