package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	// Hash 맵 활용하여 구현하기
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손흥민");
		Member memberKim = new Member(1003, "김지성");
		Member memberJung = new Member(1004, "정유선");

		memberHashMap.addMember(memberJung);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
