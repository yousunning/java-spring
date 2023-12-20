package bookshelf;

import java.sql.Connection;

public class BookShelfTest {

	public static void main(String[] args) {
		//  BookShelf Test
	
	Queue shelfQueue =new BookShelf();
	shelfQueue.enQueue("Java책");
	shelfQueue.enQueue("DB책");
	shelfQueue.enQueue("Javas책");
	
	System.out.println(shelfQueue.deQueue());
	System.out.println(shelfQueue.deQueue());
	System.out.println(shelfQueue.deQueue());
	
	Connection con;
	
	}
}
