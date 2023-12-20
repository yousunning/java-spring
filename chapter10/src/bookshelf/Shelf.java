package bookshelf;

import java.util.ArrayList;

public class Shelf {
	//멤버변수
	protected ArrayList<String> shelf;
	
	public Shelf() { //생성자 클래스와 같이 대문자
	//기본생성자 (디폴트 컨스트럭터)
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	

}
