package singleton;

public class CompanyTast {

	public static void main(String[] args) {
		// singleton 패턴 클래스
	Company2 com1 = new Company2();
	Company2 com2 = new Company2();
	System.out.println(com1==com2); //false

//	System.out.println(com1);
//	System.out.println(com2);

		//	싱글톤 패턴 클래스 테스트
		
//		Company myCompany1 = Company.getInstance();
//		Company myCompany2 = Company.getInstance();
//		System.out.println(myCompany1);
//		System.out.println(myCompany2);//같은 박스안에 있어서 주소가 같음.

//System.out.println(myCompany1 == myCompany2); 를 true가 출력되도록 Company를 만들어보세요
	
	Company myCompany1 = Company.getInstance();
	Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2); //true가 출력되도록 컴퍼니를 만들어보세요
	}
}


