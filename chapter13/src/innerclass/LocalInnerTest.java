package innerclass;

class Outter {
	// 멤버변수
	int outNum = 100;
	static int sNum = 200; // 클래스 변수, 스테틱 변수

	// 메서드
	Runnable getRunnable(int i) {// i ,num 지역변수 메서드 안에 있기 때문에
		// 지역변수 : i , num
		int num = 100;

		// 메서드 안에 지역내부 클래스 생성
		class MyRunnable implements Runnable {
			// 지역 내부 클래스의 인스턴스 변수
			int localNum = 10;
			//지역변수 i, num 은 상수로 바쒸므로 변경할 수 없음.
//			num =200;
//			i = 100; 상수화 되어서 변경하지 못함.
			
			
			@Override
			public void run() { // 스레드 만들 때 러너블 사용
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("loclaNum = " + localNum);
				System.out.println("외부 클래스의 인스턴스 변수 outNum : " + outNum);
				System.out.println("외부 클래스의 정적 변수 sNum : " + Outter.sNum);
			}

		}//클래스가 끝낸 부분에
		return new MyRunnable();
	}

}

public class LocalInnerTest {

	public static void main(String[] args) {
		// 지역 내부 클래스
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
