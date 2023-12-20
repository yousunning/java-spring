package chapter6.q5;

public class Person {
	// 멤버변수 = 인스턴스변수
	String name;
	int money; // 용돈

	// 생성자
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 메서드: 별다방 커피 구입
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(money);
		// String message = "별 다방 아메리카노를 구입했습니다."
		if (message != null) {
			this.money -= money;
			System.out.println(name + " 님이" + money + "으로 " + message);
		}
	}

	// 콩다방 거피 구입
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(money);
		// String message = "별 다방 아메리카노를 구입했습니다."
		if (message != null) {
			this.money -= money;
			System.out.println(name + " 님이" + money + "으로 " + message);
		}
	}
}