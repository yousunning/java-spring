package object;

class Point{
	int x;
	int y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x= " + ", " + "y "+ y;
	}

}

class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다." ;
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


	public class objectCloneTest{
		public static void main(String[] args) throws CloneNotSupportedException {
			//clone() 메서드로 인스턴스 복제하기
		//clone() 메서드로 인스턴스 복제하기
		Circle circle= new Circle (10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
	
	System.out.println(circle);
	System.out.println(copyCircle);
	System.out.println(System.identityHashCode(circle));
	System.out.println(System.identityHashCode(copyCircle));
	}
}
