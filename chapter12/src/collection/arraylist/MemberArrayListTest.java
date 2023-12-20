package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		//ArrayList 활용하기
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001 , "이지원");
		Member memberSon = new Member(1002 , "손흥민");
		Member memberWon = new Member(1123 , "원 빈");
		Member memberPark = new Member(1003 , "박지원");
		Member memberHong = new Member(1004 , "홍길동");
		Member memberKim = new Member(1005 , "김은진");
	//회원 추가	
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberWon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberKim);
	
		//전체 회원 출력
		memberArrayList.showAllMember();
		
		System.out.println();
		
	//홍길동 회원 삭제
		memberArrayList.removeMember(memberWon.getMemberId());
	//홍길동 회원을 삭제한 후 다시 전체 회원 출력
		memberArrayList.showAllMember();
	}
}
