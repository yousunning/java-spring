package hiding;


public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		//showDateInfo(date);
//		date.month =2;
//		date.day = 31;
//		date.year =2023;
		
		date.setMonth(2);
		date.setDay(29);

		showDateInfo(date);
		
		//MyDate as = date; as값이 0X0050
	}
	public static void showDateInfo(MyDate as) {
		//as값이 0X0050
	
		System.out.println(as.getDay());// 힙에서 못가져오고 있음.
	
	}
}
