package ex.a;

public class PersonArray {

	public static void main(String[] args) {
		// 객체배열 만들기
		Person[] member = new Person[7];
		
		for(int i = 0; i < member.length; i ++ ) {
			System.out.println(member[i]);
		}
	}

}
