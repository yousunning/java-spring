package downcasting;

import java.util.ArrayList;

class Animal { // 트랜스 - 버스 지하철 택시 - 다형성 상속활용하긔
	public void move() {
		System.out.println("동물이 움직입니다");// 상위클래스 부모클래스 수퍼 클래스
	}
}

class Human extends Animal {// 하위클래스 자식클래스 , 상위클래스에서 상속받아 더 디테일한 추가구현가능
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리는 날개로 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 하늘을 납니다.");
	}

}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>(); // <> 제네릭 자료형
	// ArrayList 배열의 자료형은 Animal로 지정 

	public static void main(String[] args) {
		//메인메소드 안에 넣어주기
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal(); // 밑 add 메소드 만든 후 호출가능

		System.out.println("###원래타입으로 다운캐스팅###");
		aTest.testCasting(); // 밑 casting 메소드 만든 후 호출가능
	}

	// 리스트에 각각 하위클래스 추가 메서드
	public void addAnimal() {

		Animal hAnimal = new Human();

		aniList.add(hAnimal); // ArrayList <Animal> 추가 되면서
		aniList.add(new Tiger());// 각각 다 Animal형으로 타입변환
		aniList.add(new Eagle());

		for (Animal ani : aniList) { // 배열 요소를 Animal형으로 꺼내서 move()를 호출하면 재정의 된 함수가 호출됨
			ani.move();// 다형성
		}
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) { // 모든 배열 요소를 하나씩 돌면서
			Animal ani = aniList.get(i);		// Animal형으로 가져옴
			if (ani instanceof Human) {       //Human형이면
				Human h = (Human) ani;			//Human형 으로 다운캐스팅 
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle E = (Eagle) ani;
				E.flying();
			} else {
				System.out.println("지원되지 않는 타입입니다");
			}
		}
	}
}