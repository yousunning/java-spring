package arraylist;

import java.util.ArrayList;// import 해주기

import array.Book;

public class ArraylistTest {

	public static void main(String[] args) {
		// Arraylist 클래스 사용하기
		ArrayList<Book> library = new ArrayList<Book>(); //ArrayList선언
		
		library.add(new Book ("태백산맥", "조정래"));
		library.add(new Book ("데미안", "헤르만헤세"));
		library.add(new Book ("어떻게 살 것인가", "유시민"));
		library.add(new Book ("토지", "박경리"));
		library.add(new Book ("어린왕자", "생텍쥐베리"));
		
		for(Book b : library) { // 향상된 포문
			b.showBookInfo();
		}
		
		System.out.println();
		
		for(int i = 0; i< library.size(); i++) { //반복문 사용
			Book book = library.get(i); // 새로운 생성자
			book.showBookInfo(); //만들어 놓은 인스턴스, showBookInfo 가져오기
		}


		System.out.println("===향상된 for문 사용 ===");
		for (Book book : library) {
			book.showBookInfo();
		}
	
//		int i;
//		i = 0;
//		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
