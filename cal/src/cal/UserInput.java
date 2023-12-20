package cal;


//사용자가 입력한 정보를 저장하기 위한 클래스
class UserInput {
	public static final UserInput QUIT = new UserInput(ConsoleCaculator.STATE_QUIT);
	public static final UserInput CLEAR = new UserInput(ConsoleCaculator.STATE_CLEAR);
	public static final UserInput READ_NUMBER_ERROR = new UserInput(ConsoleCaculator.STATE_READ_NUMBER_ERROR);
	public static final UserInput READ_OPERATOR_ERROR = new UserInput(ConsoleCaculator.STATE_READ_OPERATOR_ERROR);
	
	// 다음 상태를 저장함
	public final int nextState;
	
	// 입력받은 숫자를 저장할 멤버 변수
	public final double number;
	
	// 입력받은 연산자를 저장할 멤버 변수
	public final String operator;
	
	public UserInput(int nextState, double number, String operator) {
		this.nextState = nextState;
		this.number = number;
		this.operator = operator;
	}
	
	public UserInput(int nextState) {
		this(nextState, 0, null);
	}
	
	public UserInput(int nextState, double number) {
		this(nextState, number, null);
	}
	
	public UserInput(int nextState, String operator) {
		this(nextState, 0, operator);
	}
}