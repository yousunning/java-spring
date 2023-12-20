package gamelevel;

public class BiginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다");

	}

	@Override
	public void turn() {
		System.out.println("Jump할 줄 몰라요.");

	}

	@Override
	public void jump() {
		System.out.println("Turn할 줄 몰라요.");

	}

	public void showLevelMassage() {
		System.out.println("*초보자 레벨 입니다.*");
	}

}
