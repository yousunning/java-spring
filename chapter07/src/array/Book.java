package array;

public class Book {
	//멤버변수 = 인스턴스변수
	private String bookName;
	private String author;
	
	public Book() {}//기본생성자 만든 후 게터세터 설정
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author; // 만들어 놓고 세터 자동완성 하기. //생성자
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
		//책 제목과 저자 출력하는 메소드.
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
}
	
