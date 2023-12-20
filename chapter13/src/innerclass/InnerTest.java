package innerclass;

	class OutClass { // 외부클래스
		private int num = 10; // 인스턴스 변수
		private static int sNum = 20; // 정적변수 스태틱변수 == 클래스 변수 
		private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언
	
		public OutClass() {
			inClass = new InClass(); // 외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 내부 클래스 생성가능
		}
	
		// 인스턴스 내부 클래스 ; 인스턴스가 만들어 질때 생성되는 클래스
		class InClass {
			int inNum = 100; // 내부 클래스의 인스턴스 변수
			// 인스턴스 내부 클래스에 정적변수 선언 불가

			void inTest() {
				System.out.println("외부 클래스 인스턴수 변수 num : " + num);
				System.out.println("외부 클래스 스태틱 변수 sNum : " + sNum);
			}
		} // 동적으로 만들어지는데 미리 만들어지는 메서드 정의불가

	public void usingClass() {
		inClass.inTest();
		}
		//정적 내부 클래스 만들기
		static class InStaticClass{
		//정적 내부 클래스 인스턴스 변수
		int inNum = 100;
		//정적 내부 클래스 정적 변수
		static int sInNum = 200;
		//정적 내부 클래스의 일반 메서드
		void inTest() {
			//num += 10; // 외부클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("정적 내부 클래스 인스턴스 변수 inNum : " + inNum);
			System.out.println("정적 내부 클래스 static 변수 sInNum : " + sInNum);
			System.out.println("정적 외부 클래스 static 변수 sNum : " + sNum);
		}
		//정적 내부 클래스의 static 메서드 
		static void sTest() {
			//num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음
			//inNum += 10; // 정적 외부 클래스의 인스턴스 변수는 정적 메서드에서 사용할 수 없음
			System.out.println("정적 외부 클래스 static 변수 sNum : " + sNum);
			System.out.println("정적 내부 클래스 static 변수 sInNum : " + sInNum);
		}
	}
}

	public class InnerTest {
		public static void main(String[] args) {
			// 인스턴스 내부 클래스 = 동적 메모리
			OutClass outClass = new OutClass();
			System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
			outClass.usingClass();
			System.out.println();
			
			// 외부클래스를 이용하여 내부클래스 생성
			// OutClass.InClass inClass = outClass.new InClass();
			// inClass.inTest();
			// static 내부 클래스는 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
			OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
			System.out.println("정적 내부 클래스 일반 매서드 호출");
			sInClass.inTest();
			
			System.out.println();
			
			System.out.println("정적 내부 클래스의 static 정적 메서드 호출");
			OutClass.InStaticClass.sTest();
		}
	}