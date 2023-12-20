package gamelevel;

public class MainBoard {
	
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);

		System.out.println();

		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel); // 중급자 레벨의 플레이어
		player.play(2);

		System.out.println();

		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel); // 상급자 레벨의 플레이어
		player.play(3);
	}
}
