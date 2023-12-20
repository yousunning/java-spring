package ex.a;

public class Person {

	private String memberName;
	private String memberAge;
	private String memberSx;
	
	public Person() {}//기본생성자 만든 후 게터세터 설정
	
	public Person(String memberName, String memberAge, String memberSx) {
		this.memberName = memberName;
		this.memberAge = memberAge; // 만들어 놓고 세터 자동완성 하기. //생성자
		this.memberSx = memberSx;
	}

	public String getBookName() {
		return memberName;
	}

	public void setBookName(String bookName) {
		this.memberName = memberName;
	}

	public String getAuthor() {
		return memberAge;
	}

	public void setAuthor(String author) {
		this.memberAge = memberAge;
	}
	
		public String getMembeSx() {
		return memberSx;
	}

	public void setMembersx(String memberSx) {
		this.memberSx = memberSx;
	}

	//책 제목과 저자 출력하는 메소드.
	public void showPersonInfo() {
		System.out.println(memberName + "," + memberAge +","+ memberSx);
	}
	
}
	
