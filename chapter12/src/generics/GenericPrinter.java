package generics;

public class GenericPrinter < T extends Material > {
	private T material; // T자료형으로 선언한 변수

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
		
	}
}
