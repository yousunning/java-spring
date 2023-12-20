package chapter6.q5;

public class CoffeeTest {

	public static void main(String[] args) {
		// 출근길 김씨 4,000원 내고 별다방 커피 구매
		Person kim = new Person ("kim", 10000) ;
		StarCoffee starCoffee = new StarCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		
		// 출근길 이씨 4,300원 내고 콩다방 커피 구매
		
		Person Lee = new Person ("Lee", 20000);
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Lee.buyBeanCoffee (beanCoffee, 4300);

	}

}
