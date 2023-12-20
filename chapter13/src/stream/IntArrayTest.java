package stream;

import java.util.Arrays;

public class IntArrayTest {
	// 정수 배열에서 스트림 활용하기
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum();
		System.out.println("합계 : " + sumVal + "개");
		int count =(int)Arrays.stream(arr).count(); //명시적 형변환
		System.out.println("해당요소 배열개수 : " + count + "개");
		
// 		Integer reduce1 = Arrays.asList(1, 2, 3).stream()
//		 .reduce(1, (a, b) -> a * b + 3);
// 		System.out.println(reduce1);
//
// 		1  * 1 + 3 = 4
// 		4  * 2 + 3 = 11
// 		11 * 3 + 3 = 36
				
		int[] arr1 = {1, 2, 3};
		
		Integer reduce2 = Arrays.stream(arr1)
				.reduce(1, (a, b) -> a * b + 3);
		System.out.println(reduce2);

//		 a    b      누적치 -> 최종누적치 출력
// 		1  * 1 + 3 = 4
// 		4  * 2 + 3 = 11
// 		11 * 3 + 3 = 36		

		}
}