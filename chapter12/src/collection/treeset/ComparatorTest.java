package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return (s1.compareTo(s2)) * -1;
	}

}

public class ComparatorTest {

	public static void main(String[] args) {
		// Comparator 인터페이스 테스트하기
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("Aaa");
		set.add("Bbb");
		set.add("Ccc");
		System.out.println(set);

	}

}
