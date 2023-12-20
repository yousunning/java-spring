package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("드라이브는 자율주행 합니다.");
		System.out.println("알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");

	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");

	}

	@Override
	public void washCar() {
		System.out.println("자동 세차 해준다.");
	}
}
