package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length>=s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		// reduce() 함수 사용하기
		String[] greetings = {"Hello", "안녕하세요~~~", "Good Morning", "반갑습니다><"}; //한문장의 끝 ;
		String greeting =Arrays.stream(greetings).reduce("", (s1, s2)->{
			if(s1.getBytes().length>=s2.getBytes().length)
				return s1;
			else return s2;
			});
		System.out.println(greeting);
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}
}
