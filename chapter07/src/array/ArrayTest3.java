package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열길이만큼 출력하기
		double[] data = new double[5]; //더블형으로 길이 5인 배열선언
		//입력카운트 세기
		int iCnt = 0;
		
		data[0] = 10.0;	iCnt++; // iCnt= iCnt+ 1;
		data[1] = 20.0;	iCnt++;	// -> 2
		data[2] = 30.0;	iCnt++;	// -> 3
		
		for(int i =0; i <iCnt; i++) {
			System.out.println(data[i]);
		}
	}
}
