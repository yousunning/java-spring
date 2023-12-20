package stream;
//reduce() 사용하기
	public class TravelCustomer {

// 15세 이상은 100 만원, 그 미만은 50 만원 입니다.
// 이순신 고객 : 40세  비용 100 
// 김유신 고객 : 20세  비용 100 
// 홍길동 고객 : 13세  비용 50
// 패키지 여행을 간다고 했을 때 비용계산과 고객 명단 검색 등을 스트링을 이용하여 구현하시오.
		
		private String name; //고객 이름 
		private int age; 	 // 고객 나이
		private int price; 	// 고객 비용
		
	public TravelCustomer(String name, int age, int price) { //바로 컨트롤 스페이스로 생성가능
		//매개변수 있는 생성자
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "고객명 : " + name + "나이 : " + age + "비용 : " + price;
	}
}
	
