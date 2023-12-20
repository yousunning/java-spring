package chapter6.q5;

public class BeanCoffee {
//멤버변수
	int money; //수입
	
	//커피판매기능 메서드
	public String brewing(int money) {
		this.money += money;	//수입증가
	      if(money == Menu.BEANAMERICANO ) {
	          return "콩 다방 아메리카노를 구입했습니다.";
	       }
	       else if(money == Menu.BEANLATTE) {
	          return "콩 다방 라떼를 구입했습니다.";
	       }
	       else {
	          return null;
	       }
	    }
	 }















