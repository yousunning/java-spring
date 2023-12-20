package array;

public class BookArray {

	public static void main(String[] args) {
		// 객체 배열 만들기
		Book[] library =new Book[5]; //북 클래스형으로 객체배열 생성
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}