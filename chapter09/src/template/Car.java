package template;

public abstract class Car {
	public abstract void drive(); // 추상 메서드 명시
	public abstract void stop();
	public abstract void wiper();	
	
	public void washCar() {} // ****
	
	public void startCar() {
	System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
	System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드
	public void run() { //순서 순서대로
		drive();
		stop();
		wiper();
		startCar();
		turnOff();
		washCar();
	}
}
