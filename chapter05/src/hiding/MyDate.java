package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 29) {
				System.out.println("오류입니다.");
			} else {
				this.day = day;
				// 디스 : 멤버변수 가리킬때, 생성자에서 다른생성자 호출
			}
		}
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay(){
			return day;
	}
}

// 생성자 기본생성법?
// 인스턴스에 주소값을 넣어놨따.
