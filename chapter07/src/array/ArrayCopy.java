package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// System.arraycopy()얕은 복사
//		int[] array1 = {10, 20, 30, 40, 50};
//		int[] array2 = {1, 2, 3, 4, 5};
//		
//		System.arraycopy(array1, 0, array2, 1, 4);//마지막 항목은 복사할 요소
//		for(int i =0 ; i<array2.length; i++) {
//		System.out.println(array2[i]);
//		}
//
//	}
//}
	
	//System.arraycopy()얕은 복사
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		System.arraycopy(array1, 0, array2, 1, 3);
		for(int i = 0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	
	
	
	
	
	
	
	
	}
}