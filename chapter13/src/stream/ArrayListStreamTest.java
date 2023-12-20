package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// ArrayList에서 스트림 활용하기
		List<String> sList = new ArrayList<String>();
		sList.add("T♡mas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream(); //스트림생성
		stream.forEach(s-> System.out.print(s+"♥"));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s+"♡"));
	
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s+"♡"));
		
		for(String s : sList) {
			System.out.println(s+"♥");
		}// <스트림 특징>
		// 1. 자료 대상 관계없이 동일한 연산 수행
		// 2. 한번 사용한 스트링은 재사용 할 수 없다.
		// 3. 기존 자료를 변경하지 않는다.
		// 4. 중간연산과 최종연산이 있다.
	}
}
