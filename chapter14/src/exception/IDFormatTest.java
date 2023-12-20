package exception;

public class IDFormatTest {
	// 사용자 정의 예외 테스트하기
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException  {
		if (userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8이상 20자 이하로 쓰시오.");
		}
	}

	public static void main(String[] args) {
		//사용자 정의 예외처리
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		userID = null;
		try {
			test.setUserID(userID);
		}catch (IDFormatException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
