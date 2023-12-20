package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// try - catch 문 사용하기
		int[] arr = new int[5];
		try {
				for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 시 로그 기록");
		}
		System.out.println("프로그램 종료후 후속 작업 진행");
		System.out.println("프로그램 종료후 후속 작업 진행....");
	}
}