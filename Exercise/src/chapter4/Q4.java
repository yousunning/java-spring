package chapter4;

public class Q4 {

	public static void main(String[] args) {
		// 별 삼각형 그리기 실습
		int lineCnt = 4; // 줄수 4;
		int spaceCnt = 3; // lineCnt-1; 공백
		int starCnt = 1; // 시작개수

		// 초기식, 조건식, 증감식
		
		for (int i = 0; i < lineCnt; i++) {
			// 왼쪽공백
			for (int s = 0; s < spaceCnt; s++) {
				System.out.print('_');
			}
			for (int t = 0; t < starCnt; t++) {// 오른쪽 공백
				System.out.print('*');
			}
			for (int s = 0; s < spaceCnt; s++) {// 오른쪽 공백
				System.out.print('_');
			}

			spaceCnt -= 1;
			starCnt += 2;
			System.out.println();  // if문으로 line3부터 line cnt7까지 만들어서 마름모 만들기
		}
	}
}