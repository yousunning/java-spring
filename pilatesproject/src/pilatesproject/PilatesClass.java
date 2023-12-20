package pilatesproject;

public class PilatesClass {
	String clname; // 기본자료형 byte값의 문제 지금은 간단해서 문제 없지만 나중 큰프로젝트시에 문제 있을 수 있음
	String tchname; //String type으로 변수지정
	String classtime;
	String organi;

	public PilatesClass(String clname, String tchname, String classtime, String organi) {
		this.clname = clname; 
		this.tchname = tchname;
		this.classtime = classtime;
		this.organi = organi;
	}
	
	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getTchname() {
		return tchname;
	}

	public void setTchname(String tchname) {
		this.tchname = tchname;
	}

	public String getClasstime() {
		return classtime;
	}

	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}

	public String getOrgani() {
		return organi;
	}

	public void setOrgani(String organi) {
		this.organi = organi;
	}

	@Override
	public String toString() {
		return "[ 수업명: " + clname + " , 강사명: " + tchname + " , 수업날짜: " 
	+ classtime + ", 운동기구: " + organi + " ]";
	}
	
}
