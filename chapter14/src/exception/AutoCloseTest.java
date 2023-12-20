package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// AutoCloseTest - try-sith-resources문 사용하기
		// 다른 참조 변수로 다시 선언해야함
		try (AutoCloseObj obj = new AutoCloseObj()) {
		//강제 예외 발생
			throw new Exception(); //강제 예외 발생시 throw 에서 s 제외
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		} 
	}
}
