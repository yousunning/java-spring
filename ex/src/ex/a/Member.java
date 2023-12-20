package ex.a;

public class Member {//초기 생성자 만들기 클래스, 여러개 찍어낼 수 있는 붕어빵틀
	//멤버 변수 = 인스턴스 변수
	protected int memberID; //회원 아이디
	protected String memberName; // 고객이름
	protected String memberGrade; //고객 등급
	int num;			//횟수 차감률
	
	
	//인스턴스 생성자
	public Member(int memberID, String memberName, String memberGrade, int age) {
		initMember();
		System.out.println();
	}
	
	//생성자오버로딩
	public Member (int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		initMember();
	}
	protected void initMember() {
		memberGrade = "New";
		num = 1;
	}
	public String showMemberInfo() {
		return memberName + " 님의 등급은 " + memberGrade 
				+ " 이며, 차감 횟수는 " + num + "회 입니다." ;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
