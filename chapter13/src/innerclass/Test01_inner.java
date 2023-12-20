package innerclass;

//외부클래스

class OuterClass {
	private int a = 10;
	public void printa() {
		System.out.println("a : " + a);
	}
	public void printab() {
		InnerClass ic = new InnerClass();
		ic.print();
	}
	// 내부 클래스
	class InnerClass {
		private int b = 20;
		public void print() {
		//내부클래스는 외부클래스의 private멤버까지도 접근할 수 있다.
		 System.out.println("a : " + a);
		 System.out.println( "b : " + b);
		}
	}
}

public class Test01_inner{
		
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.printab();
		//내부클래스 객체를 생성할 떄는 외부 클래스 객체를 통해서 생성해야한다.
		OuterClass.InnerClass aa = oc.new InnerClass();
		aa.print();
		}
	}
