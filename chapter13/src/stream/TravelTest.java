package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

		// 스트림 활용하기(2) / 실무코드에서 활용 많이 함 / 유념해서 기억하고 있기 p.482
		// 15세 이상은 100 만원, 그 미만은 50 만원 입니다.
		// 이순신 고객 : 40세  비용 100 
		// 김유신 고객 : 20세  비용 100 
		// 홍길동 고객 : 13세  비용 50
		// 패키지 여행을 간다고 했을 때 비용계산과 고객 명단 검색 등을 스트링을 이용하여 구현하시오.
	public static void main(String[] args) {
		TravelCustomer lee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer kim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer hong = new TravelCustomer("홍길동", 13, 50);

	List<TravelCustomer> customerList = new ArrayList<>();
	
	customerList.add(lee);
	customerList.add(kim);
	customerList.add(hong);
	
	System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
	
	customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
	
	int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
	System.out.println("총 여행 비용은 : " + total + "입니다.");
	
	System.out.println("== 20세 이상 고객 명단 정렬해서 출력 ==");
	customerList.stream().filter(c->c.getAge()>=20)
								.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	
	}
}
