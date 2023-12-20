package lambda;

public class TestStringConcat { 

	public static void main(String[] args) {
		
		// 메서드 테스트 하기
		// 선언 동시와 초기화 해도 이너클래스에서 변수 변경 불가
		String s1 = "Hello!";
		String s2 = "Sun!";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1,s2); //위 컨켓 불러옴
		 
		//StringConcat인페를 사용한 람다식 호출
		StringConcat concat2 = (s, v)-> {// 요 중괄호 없어도 됨
		// i = 200; 이것도 안됨. 상수화 됨 파이널은 전부 변경 불가
			System.out.println(s1+","+s2);
		};
		concat2.makeString(s1, s2); //추상메서드에 있는 멬커스트링
		
		//내부적으로 컴파일되는 익명 이너 클래스 코드
		// 요 안에서 변수 변경 안됨
		StringConcat concat3 = new StringConcat() {
			// 뉴 다음 한칸 띄우고 커트롤 스페이스 / }; innerclass 끝낸 후 출력
			@Override
			public void makeString(String s1, String s2) {
			}
		};
		 System.out.println(s1+","+s2);
		 // System.out.println(concat3);
	}
}
