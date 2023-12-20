package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		// 생성자 통한 학생카드번호 부여 출력
		Student3 studentkim = new Student3();
		System.out.println("학번: "+ studentkim.studentID+ 
				", 카드번호 :"+studentkim.cardNumber);
		
		Student3 studentLee = new Student3();
				System.out.println("학번: "+ studentLee.studentID+ 
						", 카드번호 :"+studentLee.cardNumber);
		
	}

}
