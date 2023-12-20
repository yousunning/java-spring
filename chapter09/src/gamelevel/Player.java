package gamelevel;

public class Player {
	// 플레이어가 가지는 level멤버변수 선언
	private PlayerLevel level;

	// 생성자
	public Player() {
		level = new BiginnerLevel();
		level.showLevelMassage();
	}

	// 멤버함수. 메서드
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		// PlayerLevel level = new AdvancedLevel();
		this.level = level;
		level.showLevelMassage(); // 메세지 나오게 끔 써주기
	}

	public void play(int jumpCount) {
		level.go(jumpCount);
	}
}
