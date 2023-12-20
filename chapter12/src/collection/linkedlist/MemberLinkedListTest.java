package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		// LinkedList 활용하기
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손흥민");
		Member memberWon = new Member(1123, "원 빈");
		Member memberPark = new Member(1003, "박지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberKim = new Member(1005, "김은진");
		// 회원 추가
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberWon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		memberLinkedList.addMember(memberKim);
		
		// 전체 회원 출력
		memberLinkedList.showAllMember();

		System.out.println();

		//홍길동 회원 삭제
		memberLinkedList.removeMember(memberWon.getMemberId());
		// 홍길동 회원을 삭제한 후 다시 전체 회원 출력
		memberLinkedList.showAllMember();
	}
}
