package arrayex;

public class ArrayEx {

	public static void main(String[] args) {
		// 객체배열 생성 및 사용
		Circle[] c; //c지역변수
		c = new Circle[5];
		
		for(int i = 0; i <c.length; i++) {
			c[i] = new Circle(i);
			}
		//for(Circle a : c ) {
			for(int i = 0; i<c.length;i++) {
			System.out.println(c[i].radius);
			System.out.println(c[i].getArea());
			}
	}
}


