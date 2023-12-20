package ex.a;

public class PilatesClass {
	String clname;
	String tchname;
	String classtime;
	String organi;

	public PilatesClass(String clname, String tchname, String classtime, String organi) {
		super();
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

//	@Override
//	public String toString() {
//		return " \"기구\" + \" 수업 \" + \" 오전 \" + \"수업으로 등록 되었습니다.\"";
//	}

	@Override
	public String toString() {
		return "[ 수업명: " + clname + " , 강사명: " + tchname + " , 수업날짜: " 
	+ classtime + ", 운동기구: " + organi + " ]";
	}
	public String showTeacherInfo() {
		return organi + " 수업 " + " classtime " + "으로 등록 되었습니다." ;
	}

}
