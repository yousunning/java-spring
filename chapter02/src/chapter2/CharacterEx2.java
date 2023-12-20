package chapter2;

public class CharacterEx2 {
	public static void main (String [] args ) {
		//\ud55c\u000d
		char ch1= '한';
		char ch2 = '\ud55c'; //한 
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		System.out.println((char)a);
		
		int b = -66;
		System.out.println((char)b);
		
		char a2 = 65; //char 문자형
		System.out.println(a2);
		
		char ch3 = '\uae00'; //글
		System.out.println(ch3);
	}
}
