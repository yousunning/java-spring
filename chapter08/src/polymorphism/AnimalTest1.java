package polymorphism;

class Animal{ // 트랜스 - 버스 지하철 택시 - 다형성 상속활용하긔 
	public void move () {
		System.out.println("동물이 움직입니다");//상위클래스 부모클래스 수퍼 클래스
	}
}
class Human extends Animal{
	public void move() {
			System.out.println("사람이 두발로 걷습니다.");
		}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	public void move() {
			System.out.println("호랑이가 네발로 뜁니다.");
		}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
			System.out.println("독수리는 날개로 납니다.");
		}
	public void flying() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

class Point {
	int x;
	int y;
}


public class AnimalTest1 {

	public static void main(String[] args) {
		// Polymorphism (다형성) 실습
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Eagle());
	
		//Animal animal = new Human();
//		Point p = new Point();
//		//Animal animal = new Human();
//		Point p = new Point();
//		aTest.moveAnimal(p);
	}

	//메소드 하나로 가능하다. 재정의 한 오버라이딩 인스턴스로 실행된다. 알맹이만 바뀔 수 있도록 다향성!
	public void moveAnimal(Animal animal) {  //지역변수 같은이름 안됨.
		animal.move();	// 인스턴스의 move메서드 실행 (가상메서드가 실행)
	}
	
//	public void moveHuman(Human human) {
//		human.move();
//	}
//	public void moveTiger(Tiger tiger) {
//		tiger.move();
//	}
	
}