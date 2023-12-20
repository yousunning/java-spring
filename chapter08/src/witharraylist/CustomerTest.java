package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// 배열을 활용한 고객관리 프로그램 구현하기
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer custLee = new Customer(10010, "이순신");
		Customer custShin = new Customer(10020, "신사임당");
		Customer custHong = new GoldCustomer(10030, "홍길동");
		Customer custYoul = new GoldCustomer(10034, "이율곡");
		Customer custKim = new VIPCustomer(10035, "김유신", 12345);

		customerList.add(custLee);
		customerList.add(custShin);
		customerList.add(custHong);
		customerList.add(custKim);
		customerList.add(custYoul);

		System.out.println("==고객 정보 출력==");
		for (Customer cust : customerList) {
			System.out.println(cust.showCustomerInfo());
		}
		System.out.println("==제품가격과 보너스 포인트 출력==");
		int price = 10000;
		for (Customer cust : customerList) {
			int cost = cust.calcPrice(price);
			System.out.println(cust.getCustomerName() + "님이" + cost + "원 지불");
			System.out.println(cust.getCustomerName() + "님의 보너스 포인트는" 
			+ cust.bonusPoint + "점 입니다.");
		}
	}
}
