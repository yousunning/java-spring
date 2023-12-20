package collection.linkedlist;

import java.util.LinkedList;
import collection.Member;

public class MemberLinkedList {
	private LinkedList<Member> linkedList;

	// 생성자에서 LinkedList 인스턴스 생성
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}

	// LinkedList에 멤버를 매개변수로 받아 추가하는 메서드
	public void addMember(Member member) {
		linkedList.add(member);
	}

	// 멤버 삭제
	public boolean removeMember(int inputMemberId) {
		for (int i = 0; i < linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if (tempId == inputMemberId) {
				linkedList.remove(i);
				return true;
			}
		}
		System.out.println(inputMemberId + " 가 존재하지 않습니다.");
		return false;
	}

	// 멤버조회
	public void showAllMember() {
		for (Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}

	public void insertMember(Member member, int position) {
		if (position < 1 || position > linkedList.size() + 1) {
			System.out.println("입력 위치 값을 확인하세요.");
			return;
		}
		int i = position - 1; // 포지션 배열[]인덱스 하나 삭제.
		linkedList.add(i, member);
	}
}
