package gamelevel;

public abstract class PlayerLevel {
		public abstract void run();//출력순서 바뀔 수 있음.
		public abstract void jump();
		public abstract void turn();
		public abstract void showLevelMassage();
		
		final public void go (int count) { //  ""final"" 넣으면 상속에서 변수, 
						// 더이상 상속 되지도 않음. (go)템프릿 메서드를 바꿔주지 못함
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
		}
}