package reference; //힙, 동적 메모리

public class Student4 {
	// 멤버변수
	int studentID;
	String studentName;
	Subject2 korean; //class
	Subject2 math;   //class

	public Student4(int studentID, String studentName)  {
		this.studentID = studentID;
		this.studentName = studentName;
//		// 데이터에 쓰면 힙 메모리에 박스생김(이스턴스 생성) 
//		->STD라는 애가 스택으로 옮겨줌 
//		스택에서 this라는 애도 힙으로 옮겨줌으로서 힙도 this 의미 
		
		korean = new Subject2();
		math = new Subject2();
	}

	public void setkorean(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);

	}

	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);

	}

	public void showStudentInfo() { //호출
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
	}

		// int koreaScore;
		//	int mathScore;
		//	String koreaSubject; // 국어과목명
		//	String mathSubject; //수학과목명
}


