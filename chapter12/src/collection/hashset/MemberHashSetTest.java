package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// HashSet 활용 / 주의할점 
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member lee = new Member(1001, "이강인");
		Member Son = new Member(1002, "손흥민");
		Member Hong = new Member(1003, "홍길동");
		
		memberHashSet.addMember(Hong);
		memberHashSet.addMember(lee);
		memberHashSet.addMember(Son);
		
		memberHashSet.showAllMember();
		
		Member Kang = new Member(1003, "강감찬"); //Id 중복회원 추가
		memberHashSet.addMember(Kang);
		memberHashSet.showAllMember();
	}

}
