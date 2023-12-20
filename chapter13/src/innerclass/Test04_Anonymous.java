package innerclass;

	interface Shape{
		void draw();
		void paint();
	}
	interface Message{
		void send(String msg);
	}

public class Test04_Anonymous {

	public static void main(String[] args) {
		// Massage를 익명의 내부클래스를 만들어 사용해보세요.
		Message mm = new Message() {
			public void send (String msg) {
				System.out.println(msg + "를 이메일로 전송했습니다.");
			}
		};
	mm.send("test...");
	
	new Message() {
		public void send (String msg) {
			System.out.println(msg + "를 문자메세지로 보냈어요");
		}
	}.send("ddd");
		
	// 익명의 내부 클래스 만들기
	Shape sh = new Shape() {
		//추상메서드 오버라이딩
		public void paint() {
			System.out.println("사각형 칠하기");
		}

		@Override
		public void draw() {
			System.out.println("사각형 그리기");
			
		}
	};
	sh.draw();
	sh.paint();
	
	}

}
