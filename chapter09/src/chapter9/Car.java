package chapter9;

public abstract class Car {
	
	public abstract void start();
	public abstract void stop();
	public abstract void drive();
	public abstract void turnoff();


	public void wiperCar() {
		System.out.println("세차를 합니다.");
	}

	public void run() {
		start();
		drive();
		stop();
		turnoff();
		wiperCar();
	}

}
