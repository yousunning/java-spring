package arrayex;

public class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		// 객체의 치환
		Circle obj1 = new Circle(1);
		Circle obj2 = new Circle(2);
		Circle s;
		
		s = obj2;
		obj1 = obj2;
		
		System.out.println("obj1 radius: "+ obj1.radius);
		System.out.println("s radius: "+ s.radius);
	}

}
