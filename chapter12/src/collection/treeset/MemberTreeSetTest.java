package collection.treeset;

import collection.Member2; //int 타입으로 만든 메소드로 불러왔기 때문에 숫자로 정렬

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TreeSet 활용 / 주의할점
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member2 Hong = new Member2(1003, "홍길동");
		Member2 lee = new Member2(1001, "이강인");
		Member2 Son = new Member2(1002, "손흥민");
		

		memberTreeSet.addMember(Hong);
		memberTreeSet.addMember(lee);
		memberTreeSet.addMember(Son);

		memberTreeSet.showAllMember();

		Member2 Kang = new Member2(1003, "강감찬"); // Id 중복회원 추가
		memberTreeSet.addMember(Kang);
		memberTreeSet.showAllMember();
	}

}
