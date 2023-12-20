package arraylist;

import java.util.ArrayList; //import 해주기 Ctrl + Shift + O

public class Student {
	// 멤버변수
	int studentID; //학번
	String studentName; // 이름
	ArrayList<Subject> subjectList; // 수강과목 리스트
	// 어레이리스트 임폴트 함

	public Student(int studentID, String studentName) {
		// 학생학번과 이름을 매개변수로 받아 멤버변수 초기화 할거임.
		this.studentID = studentID; // A a = new A 인스턴스 생성 this 로 자기것 가져오기
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // A a = new A 인스턴스 생성
	}

	public void addSubject(String name, int score) {
		// subjectList에 입력 받은 과목명과 점수를 subject 타입의 인스턴스로 만들어 추가
		Subject subject = new Subject(); // 생성자
		subject.setName(name);
		subject.setScorePoint(score);
		// 위와 동일
//		Subject subject = new Subject(name, score); 책과 다른버전

		subjectList.add(subject);
	}

	public void showStudentInfo() {
		// TODO 해당학생 정보 출력
		int total = 0;
		for (Subject subject : subjectList) { // 향상된 포문
			total = total + subject.getScorePoint();
		System.out.println("학생 " + studentName + "의 " + subject.getName() + "과목의 성적은" + subject.getScorePoint() + "입니다");
	}
		System.out.println("학생 " + studentName + "의 총점은" + total +"입니다");
	}
}