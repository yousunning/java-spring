package ex.a;

public class VIPMember extends Member {
	public VIPMember(int memberID, String memberName, String memberGrade, int age) {
		super(memberID, memberName);
		initMember();
	}
	
	//받는 생성자 만들기
	protected void initMember() {
		memberGrade = "VIP";
		num = 1;
	}
	
	@Override
	public void setNum(int num) {
		super.num++;
	}
	@Override
	public String showMemberInfo() {
		return super.showMemberInfo();
	}
	
}

