package generics;

public class GenericPrinterTest  {

	public static void main(String[] args) {
		// GenericPrinter<T> 클래스 사용하기
		GenericPrinter<Powder> powderprinter = new GenericPrinter<Powder>();
		
		powderprinter.setMaterial(new Powder());
		Powder powder = powderprinter.getMaterial();
		System.out.println(powderprinter);
		
		System.out.println();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder2 = (Powder)powderprinter.getMaterial();
		System.out.println();
		
	//	GenericPrinter<Water> printer = new GenericPrinter<Water>();
	}
}
