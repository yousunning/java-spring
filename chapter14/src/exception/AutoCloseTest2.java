package exception;

public class AutoCloseTest2 {

	public static void main(String[] args) {
		// AutoCloseTest - try-sith-resources문 사용하기 
		//jdk9버전부터 생성자로 변수명만 넣고 트라이매서드 명시 가능
		//↑외부에서 선언한 변수를 그대로 사용할 수 있음
		AutoCloseObj obj = new AutoCloseObj();
		try (obj) {
		//강제 예외 발생
			throw new Exception(); //강제 예외 발생시 throw 에서 s 제외
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		} 
	}
}
