package array;

public class TwoDimension {

	public static void main(String[] args) {
		// 이차원 배열 초기화하기
		int[] [] arr = {{3,1,2},{4,5,6}};
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length ;col++ ) {
				System.out.print(arr[row][col]+" ");
		}
			System.out.println();
		}
	}
}
