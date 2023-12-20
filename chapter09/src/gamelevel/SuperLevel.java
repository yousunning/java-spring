package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");

	}

	@Override
	public void turn() {
		System.out.println("아주 높이 Jump 합니다.");

	}

	@Override
	public void jump() {
		System.out.println("한바퀴 돕니다.");

	}

	@Override
	public void showLevelMassage() {
		System.out.println("***상급자 레벨 입니다***");

	}

}
