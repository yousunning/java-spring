package exerciese;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// 반복문으로 별삼각형을 입력받은 라인수에 맞게 출력하세요.
		Scanner sc = new Scanner (System.in);
		System.out.println("삼각형 라인수를 입력하세요>>");
		int lineCnt = sc.nextInt();
		int spaceCnt = lineCnt - 1;
		int starCnt = 1;	
		//삼각형 line반복
		for(int i = 0 ; i < lineCnt ; i++);{
			//라인 안의 공백과 별표를 붙여서 만든다. 반복문을 통해.
			//공백부터
		for(int j=0; j < spaceCnt; j++);{
			System.out.print(" ");
		}
		for(int j=0; j < starCnt ; j++); {
			System.out.print("*");
		}
		
				spaceCnt-=1;
				starCnt +=2;
				
				System.out.println();		// 개행 처리 	
		}

	}
}