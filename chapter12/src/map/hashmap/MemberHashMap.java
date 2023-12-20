package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap {
	// 클래스 바로 밑 블럭 변수 필드 = 멤버변수 = 인스턴스변수
	private HashMap<Integer, Member> hashMap; // 제네릭 안에 많은 아이템들을 넣기 위해 만듬
	// 생성자

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	// 메서드
	// 회원추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); // hash맵에 회우너추가 메서드
	}// 문장의 끝 세미콜론
		// 회원삭제

	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) { // containsKey() 메서드 중요함
			hashMap.remove(memberId); // 매개변수 회원 아이디 키값으로 삭제
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { // 다음 key가 있으면!
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
