package reference2;

public class Subject1 {
	// 멤버변수** 속성
	int studentID;
	String studentName; // 접근자를 프라이빗 인슽너스 참조변수에 안보임
	int grade;
	String address;

	// 생성자
	// Student(){}

	// 메서드 (멤버함수)** 기능
	public void showStudentinfo() {
		System.out.println(studentName + "," + address); // 이름주소 출력;
	}

//	public static void main(String[] args) {
//		Student studentLee = new Student();
//
//		studentLee.studentName = "이순신";
//		studentLee.address = "서울시 금천구 가산동";
//
//		System.out.println(studentLee.studentName);
//		System.out.println(studentLee.address);
//	}

	public String getStudentName() {
		return studentName;
	}// 값을 읽어오는

	public void setStudentName(String name) {
		studentName = name; // 값을 세팅하는
	}
}