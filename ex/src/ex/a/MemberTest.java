package ex.a;

import java.util.ArrayList;

public class MemberTest {
	public static void main (String[] args) {

	ArrayList<Member> memberList = new ArrayList<Member>();
	
	Member memLee = new Member(10010, "이순신","New", 45);
	Member memShin = new Member(10020, "신사임당","New", 71);
	Member memHong = new BasicMember(10030, "홍길동", "Basic", 15);
	Member memYoul = new PremiumMember(10034, "이율곡", "Premium", 30);
	Member memKim = new VIPMember(10035, "김유신","VIP", 20);

	memberList.add(memLee);
	memberList.add(memKim);
	memberList.add(memYoul);
	memberList.add(memHong);
	memberList.add(memShin);
	
	System.out.println("--------------------");
	System.out.println("=====회원 정보 출력=====");
	System.out.println("--------------------");
	for(Member meb : memberList) {
		System.out.println(meb.showMemberInfo());
	}
	System.out.println("--------------------");
	System.out.println("=====횟수차감 횟수======");
	System.out.println("--------------------");
	int num = 1;
	for(Member meb : memberList) {
		int mem = meb.num;
		System.out.println(meb.getMemberName() +"님 "+ mem + "회 차감");
	}
	}
}
	
