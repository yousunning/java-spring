package lambda;

public class StringConCatImpl implements StringConcat{
		// 추상메서드 구현하기
	@Override 
	public void makeString(String s1, String s2) {
		System.out.println(s1+","+s2);
		
	}

} 
