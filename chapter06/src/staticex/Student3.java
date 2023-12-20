package staticex;

public class Student3 {
//student 에서 생성자를 학번 자동 부여하기
//serialNum 변수 정보은닉

	//정적변수 = 스태틱 변수 = 클래스 변수
	private static int serialNum = 1000;
	//멤버변수 = 인스턴스 변수
	//인스턴스 변수 *new
	int studentID;
	int gread;
	String address;
	int cardNumber;// 카드번호
	String studentName; // 학생이름
	
	// 생성자
	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}
//	return studentName;
//	
//	}
	public void setStudentName(String studentName) {//매개변수 넣고 안넣고 차이
		 this.studentName = studentName;
	}	 
	public String getstudentName () {
		return studentName;
	}
//	public void studentName (String studentName) {
//		this.studentName = studentName;
//	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}	