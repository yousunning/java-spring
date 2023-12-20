package chapter9;


public class Grangeur extends Car {

	@Override
	public void start() {
		System.out.println("Grangeur 시동을 켭니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Grangeur 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Grangeur 멈춥니다");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Grangeur 시동을 끕니다.");
		
	}


}
