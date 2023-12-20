package arraylist;

public class Subject {
	// 멤버변수 (인스턴스 변수)
	private String name; // 과목명
	private int scorePoint; // 과목점수

	// 생성자
	public Subject() {}

	public Subject(String name, int ScorePoint) {
		this.name = name;
		this.scorePoint = scorePoint;
	}

	// 겟셋 메서드.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}

}
