package innerclass;

class  Outter2{
	// 메서드
		Runnable getRunnable(int i) {// i ,num 지역변수 메서드 안에 있기 때문에
			// 지역변수 : i , num
			int num = 100;

			// 메서드 안에 지역내부 클래스 생성
			class MyRunnable implements Runnable {
				// 지역 내부 클래스의 인스턴스 변수
				int localNum = 10;
				//지역변수 i, num 은 상수로 바쒸므로 변경할 수 없음.
//				num =200;
//				i = 100; 상수화 되어서 변경하지 못함.
				
				
				@Override
				public void run() { // 스레드 만들 때 러너블 사용
					System.out.println("i = " + i);
					System.out.println("num =" + num);
				}

			}//클래스가 끝낸 부분에
			return new MyRunnable();
		}
		
		Runnable runner = new Runnable() { //runner참조변수

			@Override
			public void run() { // 런 힙
				// TODO Auto-generated method stub
				System.out.println("Runnable 인터페이스를 구현된 익명 클레스 메서드");
			}
		};
}	// 인터페이스나 추상 클래스 형 변수를 선언하고 클래스를 생성해 대입하는 방법	


public class AnonymousInnerTest {

	public static void main(String[] args) {
		// 익명(Anonymous) 내부(inner) 클래스
		Outter2 out = new Outter2(); // 아웃 스택
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run();
	}
}
