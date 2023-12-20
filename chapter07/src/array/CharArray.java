package array;

public class CharArray {

	public static void main(String[] args) {
		// 알파벳 문자와 아스키 코드 값 출력하기
		
		char[] alphabets = new char[26];
		char ch = 'A';
		//배열에 알파벳 문자입력
		for(int i = 0; i < alphabets.length; i++,ch++ ) {
			alphabets[i] = ch;
		}
		//출력
		for(int i = 0; i < alphabets.length; i++,ch++ ) {
			System.out.println(alphabets[i] + ","+(int)alphabets[i]);
		}
	}
}