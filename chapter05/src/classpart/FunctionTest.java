package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20; // 초기화

	// 함수호출
		int sum = 0;

		sum = addNum(n1, n2); // sum = 30; 위 int 선언되어 있어서 재선언 안함. 한번만 선언.

		System.out.println(n1 + "+" + n2 + "=" + sum);

	} //  First in Last out

	// 함수생성
	public static int addNum(int n1, int n2) {
		int result = 0;
		result = n1 + n2;
		return result;

	}

}
