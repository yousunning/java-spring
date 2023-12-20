package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		// 객체 정보를 문자열로 출력가능
		return bookTitle + ","+ bookNumber;
		}	
	}

public class ToStringEx {

	public static void main (String[] agrs) {
		Book book = new Book(111, "어린왕자");
		
		//재정의 하지 않으면 object.Book@7c30a502
		//재정의 하면 -> 어린왕자,111 / return bookTitle + ","+ bookNumber;
		System.out.println(book);
		System.out.println(book.toString());
		}
	}
