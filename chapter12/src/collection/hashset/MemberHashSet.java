package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	// HashSet 활용해 회원관리 프로그램 구현하기
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	// 회원추가
	public void addMember(Member member) {
		hashSet.add(member);
	}

	// 회원 삭제
	public boolean removeMenber(int memberId) {
		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) {
			// 회원을 하나씩 가져와서
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	//모든회원 출력
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
