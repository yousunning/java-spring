package object;

class Student {
	int studenetID;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studenetID = studentID;
		this.studentName = studentName;

	}

	@Override // 재정의 했단뜻
	public String toString() {
		return studenetID + studentName;
	}

	@Override // 밑 Object 바꿀 수 없음
	public boolean equals(Object obj) {
		// 학번이 동일하면 동일하다. 로 재정의
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studenetID == std.studenetID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// 해시코드 값으로 학번변환. 메서드 재정의
		return studenetID;

	}
}

public class EqualsTest {

	public static void main(String[] args) {
		// Object 클래스의 equals 메서드 재정의
		Student lee = new Student(100, "이상윤"); // 00x0050
		Student lee2 = lee; // 00x0050
		Student sangwon = new Student(100, "이상원"); // 00x0070

		System.out.println("lee.hashCode : " + lee.hashCode());
		System.out.println("sangwon.hashCode : " + sangwon.hashCode());

		System.out.println("lee.실주소 값 : " + System.identityHashCode(lee));
		System.out.println("sangwon.실주소 값 : " + System.identityHashCode(sangwon));

		System.out.println();

		if (lee == lee2) { // 비교연산자
			System.out.println("lee와 lee2 주소는 같다.");
		} else {
			System.out.println("lee와 lee2 주소는 다르다.");
		}
		//
		if (lee.equals(lee2)) { // **String 문자열 비교는 equals() 메서드**
			System.out.println("lee와 lee2 주소는 동일하다.");
		} else {
			System.out.println("lee와 lee2 주소는 동일하지 않다.");
		}

		// equals를 재정의를 안한다면 lee 와 sangwon은 논리적으로 같은 학생인데
		// 다른 학생으로 출력됨

		if (lee == sangwon) { // 비교연산자
			System.out.println("lee와 sangwon 주소는 같다.");
		} else {
			System.out.println("lee와 sangwon 주소는 다르다.");
		}
		//
		if (lee.equals(sangwon)) { // equals() 메서드 / lee와 sangwon비교
			System.out.println("lee와 sangwon 주소는 동일하다.");
		} else {
			System.out.println("lee와 sangwon 주소는 동일하지 않다.");
		}

	}

}
