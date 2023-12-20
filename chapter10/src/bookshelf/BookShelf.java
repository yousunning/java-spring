package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		//shelf 배열에 요소추가
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		//맨처음 요소를 배열에서 삭제하고 반환
		return shelf.remove(0);
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
	
}
