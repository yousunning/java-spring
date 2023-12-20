package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;

//생성자에서 ArrayList 인스턴스 생성
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	// ArrayList에 멤버를 매개변수로 받아 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 멤버 삭제
	public boolean removeMember(int inputMemberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (tempId == inputMemberId) {
				arrayList.remove(i);
				return true;
			}
		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next(); //기억 잘 하셈 다음 메소드 끄집어 올때 씀
			int tempId = member.getMemberId();
			if(tempId== inputMemberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(inputMemberId + " 가 존재하지 않습니다.");
		return false;
	}

	// 멤버조회
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

	public void insertMember(Member member, int position) {
		if (position < 1 || position > arrayList.size() + 1) {
			System.out.println("입력 위치 값을 확인하세요.");
			return;
		}
		int i = position - 1; // 포지션 배열[]인덱스 하나 삭제.
		arrayList.add(i, member);
	}
}
