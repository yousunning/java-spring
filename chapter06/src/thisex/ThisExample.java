package thisex;


	class BirthDay{
		   int day;
		   int month;
		   int year;
		   public void setYear(int year) {
		      this.year = year;
		   }
		   
		   public void printThis() {
		      System.out.println(this);
		   }
	}
		public class ThisExample {

		   public static void main(String[] args) {
		      // 1. this : 자신의 메모리를 가리키는 this 출력하기
		      BirthDay bDay = new BirthDay();
		      bDay.setYear(2000);
		      
		      System.out.println(bDay.year);      // 참조변수
		      bDay.printThis();                // this 출력 메서드 호출   
		   }

		}
