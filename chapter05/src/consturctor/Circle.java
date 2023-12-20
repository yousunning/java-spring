package consturctor;

public class Circle {
	//멤버변수	
	int radius;
	String name;
		
		//생성자들
		public Circle(){//매개변수 없는 생성자, 다른 클래스에서도 접근 가능하게 퍼블릭
//			this(1, ""); //this 로 다른 생성자 호출가능 단 생성자에서 생성자위에 statement 입력불가
			radius = 1;
			name = "";
		}
//		public Circle(int r, String n) { // 매개변수 있는 생성자
//			radius = r;
//			name = n;
//		}
		
		//this 가 필요한 경우 : this는 생성된 인스턴스의 주소를 가리킴
		// 매개변수명과 멤버변수명이 같을 때this 허용
		public Circle(int radius, String name) { // 매개변수 있는 생성자
			this.radius = radius;
			this.name = name;
	
		}
		
		//메서드
		public double getArea() {
			return 3.14*radius*radius;
		}
		
		public void setRadius(int radius) {
			this.radius = radius;
			
		}
		
		
		public static void main(String[] args) {
		// 생성자 특징
		// 클래스 이름 동일, 리턴타입 없음, 객체 생성 시 반드시 호출, 생성자 오버로딩 가능
		Circle pizza = new Circle(10, "자바피자");
		pizza.setRadius(1);
		
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은 " + area );
		
		Circle donut = new Circle();
		//기본 생성자는 생성잦가 존재하면 컴파일러가 만들어 주지 않는다.
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut + "의 면적은 "+ area);
		
	}

}
