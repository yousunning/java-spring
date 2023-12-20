package reference;

public class Student3 {
	//멤버변수
	int studentID;
	String studentName;
	Subject korean; ///단순 멤버변수만 있는 클래스 참조
	Subject math;
	//메서드
	public Student3() {
		korean = new Subject(); //인스턴스
		math = new Subject(); //
	}
	public void setKorean(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
}
	
	
	//	int koreaScore;
	//	int mathScore;
	//	String koreaSubject; // 국어과목명
	//	String mathSubject; //수학과목명
		
	


