package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// HashSet Test하기
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("정유선"));
		hashSet.add(new String("가나다"));
		hashSet.add(new String("라마바"));
		hashSet.add(new String("사아자"));
		hashSet.add(new String("정유선"));

		System.out.println(hashSet);
	}
}
