package abstractex;
// ex)))  AA(DeskTop) a = new C(MyNoteBook) 변형불가
public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DaskTop typing()");
		
	}
	
}
