package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열길이만큼 출력하기
		double[] data = new double[5]; //더블형으로 길이 5인 배열선언
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i =0; i <data.length; i++) {
			System.out.println(data[i]);
		}
		
	}

}
