package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	// Hash 맵 활용하여 구현하기
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberLee = new Member(1004, "이지원");
		Member memberSon = new Member(1002, "손흥민");
		Member memberKim = new Member(1001, "김지성");
		Member memberJung = new Member(1003, "정유선");

		memberTreeMap.addMember(memberJung);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberKim);

		memberTreeMap.showAllMember();

		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}

}
