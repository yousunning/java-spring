package arraylist;
//테스트 먼저 만들면 빨간색 줄 뜸. 크리에잉트로 다시 입맛대로 코드 만들기.
public class StudentTest {

	public static void main(String[] args) { //메인메소드에서 출력하기
		// 학생 각각의 성적과 총점 출력하기
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);

	
			studentLee.showStudentInfo();
			System.out.println("==========================");
			studentKim.showStudentInfo();
	
	
	
	
	
	
	
	
	}

}
