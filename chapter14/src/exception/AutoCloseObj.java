package exception;

public class AutoCloseObj implements AutoCloseable {
	//close() 메서드 구현
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}

}
