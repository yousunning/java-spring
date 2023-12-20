package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import collection.Member2;

// 2번째 Member2로 변경
public class MemberTreeSet {
	// HashSet 활용해 회원관리 프로그램 구현하기
	private TreeSet<Member2> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>(new Member2());
	}

	// 회원추가
	public void addMember(Member2 member) {
		treeSet.add(member);
	}

	// 회원 삭제
	public boolean removeMenber(int memberId) {
		Iterator<Member2> ir = treeSet.iterator();

		while (ir.hasNext()) {
			// 회원을 하나씩 가져와서
			Member2 member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	// 모든회원 출력
	public void showAllMember() {
		for (Member2 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
