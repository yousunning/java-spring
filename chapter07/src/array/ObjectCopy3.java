package array;

public class ObjectCopy3 {

	public static void main(String[] args) {
		//객체배열 복사하기 깊은복사
		Book[] bookArray1 = new Book[3];// 북 생성자
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민"); //어레이1 안에 넣어줄 인스턴스 선언
 	
		bookArray2[0] = new Book(); // 어레이2에 새로 넣어 줄 공간 만들어 줌
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		// 얕은복사
		//	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor()); //반복문. 어레이2에 어레이1 넣어준다는 말 북 그리고 작가까지
		}
		//-----------------------------------------------------------
		for(int i=0; i<bookArray2.length; i++){
			bookArray2[i].showBookInfo(); 
		}
		System.out.println();
//		//------------------------------------
		//bookArray1 첫번째 요소 값 변경
		bookArray1[0].setBookName("나목"); //어레이1 인덱스0번째 값 변경 입력
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ==="); // 다시 재출력.
		for(int i=0; i<bookArray1.length; i++){
			bookArray1[i].showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++){
			bookArray2[i].showBookInfo();//출력
		}
	}
}
		
		
		
		
		
		
		