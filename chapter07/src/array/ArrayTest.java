package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 초기화하고 출력하기
		
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//System.out.println(num.length); -> 10
		//System.out.println(num[4]); -> 5
	
		
//		for (int i = 0; i < num.length; i++) {
//		System.out.println(num[i]);
//	
//		}
	
		int[] arr = new int[] { 3, 5, 9, 12 }; // 29
		// [0],[1],[2],...
//		System.out.println(arr[0] + 10); // 13
//		System.out.println(arr[1]+arr[2]); // 5 + 9 -> 14
//		System.out.println(arr[4]-3); // 오류발생
//		System.out.println(arr[2]+arr[2]);//18
	
//		int sum = 0;// 포문 전에 초기화
//		for (int i = 0; i < arr.length; i++) {
//			// System.out.println(arr[i]);
//
//			System.out.println(arr[i]);
//			sum = sum + arr[i];
//		}
//		System.out.println("합계 : " + sum);
//	}
//}

		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("합계 "+ sum);
	}
}