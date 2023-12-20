package staticex;

public class StudentTest1 {

//	public static void main(String[] args) {
//		// static 변수 테스트
//		Student studentLee = new Student();
//		studentLee.setStudentName("이순신");
//		System.out.println(studentLee.serialNum);//1000
//		studentLee.serialNum++; //1001
//		
//		Student studentSin = new Student();
//		studentSin.setStudentName("신사임당");
//
//	System.out.println(studentLee.serialNum);//1001
//	System.out.println(studentSin.serialNum);//1001
//	}
//
//} 
	//출력할거니까 메인메소드 넣어주기
	
	public static void main (String[] args) {
	//변수 테스트
	Student studentJung = new Student();
	studentJung.setStudentName("정유선");
	System.out.println(studentJung.serialNum);
	studentJung.serialNum++;
	System.out.println(studentJung.serialNum);
	
	Student sutdentKim = new Student();
	sutdentKim.setStudentName ("김은진");
	System.out.println(studentJung.studentName);
	System.out.println(sutdentKim.studentName);
	}
}