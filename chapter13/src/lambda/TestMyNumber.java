package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		// 람다식 구현과 호출
		MyNumber max = (x,y) -> (x>=y) ? x : y; //람다식을 인터페이스형 max변수에 대입
		System.out.println(max.getMax(10, 20)); // 인터페이스형 변수로 메서드 호출

	 MyNumber compMax = new MyNumber() {
		
		@Override
		public int getMax(int num1, int num2) {
			// 람다식 구현과 호출
			return (num1 >= num2) ? num1 : num2;
		}
	}; 
		System.out.println(compMax.getMax(10, 20));
	
	 
	}
	//앞 코드에서 getMax()추상메서드는 입력받은 두수중 더큰수를 반환하는 기능을 구현하는 것.
}	// MyNumber max = (x,y) -> (x>=y) ? x : y; 이너클래스로 추상메서드 구현은
	// new 후 컨트롤 스페이스로 추상메서드 생성

