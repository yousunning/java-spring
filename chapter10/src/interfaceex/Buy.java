package interfaceex;

public interface Buy {
	void buy(); //public abstract  추상메서드
	
	default void order() {
		System.out.println("구매주문");
	}
}
