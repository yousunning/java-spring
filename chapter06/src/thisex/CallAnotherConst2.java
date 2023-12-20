package thisex;

class NewBook {

	String author;
	String title;

	NewBook(String title) {
		// System.out.println("생성자 호출"); 안된다고 한다~
		this("작가미상", title);// 생성자 알려줌 부르는거구나~ / 알려줄때 / this 호출 위에 다른 호출 안됨 / 생성자 호출문 위에 수행문 작성불가.
		// System.out.println("생성자 호출"); 가능
	} // 밑 북으로 호출

	public NewBook(String author, String title) { // 함수
		this.author = author; // 자신이 주소 찾아감. 가리키는 역할 / this. 로 작성했구나 /찾을때
		this.title = title;
	}

	NewBook returnItSelf() {
		return this; // 3. this 생성 인스턴스 주소 반환 돌려주고 싶을때
	}
}


public class CallAnotherConst2 {
	

	public static void main(String[] args) {
		// 2. this : 다른생성자 호출하기

		Book noAuthor = new Book("심청전"); // 인스턴스 주소 참조하고 있다. 그래서 디스가 이친구 주소를 가지고 있어서 b리턴 반환가능
			
			System.out.println(noAuthor.author);
			System.out.println(noAuthor.title);
		
//		NewBook noAuthor = new NewBook("생땍쥐베리", "어린왕자"); // 인스턴스 주소 참조하고 있다. 그래서 디스가 이친구 주소를 가지고 있어서 b리턴 반환가능
//		NewBook noAuthor = new NewBook("심청전","작가미상");
//		System.out.println(noAuthor.author);
//		System.out.println(noAuthor.title);
//
			Book b = noAuthor.returnItSelf();
			System.out.println(b); //returnItSelf(); 반환 값 출력
			System.out.println(noAuthor);
	}

}
