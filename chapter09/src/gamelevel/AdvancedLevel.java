package gamelevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");

	}

	@Override
	public void turn() {
		System.out.println("높이 Jump 합니다.");
	}

	@Override
	public void jump() {
		System.out.println("Turn은 할 줄 몰라요.");

	}

	@Override
	public void showLevelMassage() {
		System.out.println("**중급자 레벨 입니다.**");

	}

}
