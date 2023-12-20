package reference; //스택

public class StudentTest {

	public static void main(String[] args) {
		// 참조자료형 클래스 테스트
		Student4 studentLee = new Student4(1001,"Lee");
		studentLee.setkorean("국어",100);
		studentLee.setMath("수학",70);
		
		Student4 studentKim = new Student4(1002 ,"kim");
		studentKim.setkorean("국어",80);
		studentKim.setMath("수학",85);

		studentKim.showStudentInfo();
		studentLee.showStudentInfo();

	}

}
