package pilatesproject;

public class PtClass {
	String ptclass;
	String pttime;
	String ptname;
	String ptorgani;
	
	public PtClass(String ptclass, String pttime,String ptname,String ptorgani ) {
		this.ptclass = ptclass;
		this.ptname = ptname;
		this.ptorgani = ptorgani;
		this.pttime = pttime;
	}

	public String getPtclass() {
		return ptclass;
	}

	public void setPtclass(String ptclass) {
		this.ptclass = ptclass;
	}

	public String getPttime() {
		return pttime;
	}

	public void setPttime(String pttime) {
		this.pttime = pttime;
	}

	public String getPtname() {
		return ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

	public String getPtorgani() {
		return ptorgani;
	}

	public void setPtorgani(String ptorgani) {
		this.ptorgani = ptorgani;
	}

	@Override
	public String toString() {
		return "[ 수업: " + ptclass + " , 강사명: " + ptname + " , 수업날짜: " 
		+ pttime + ", 운동기구: " + ptorgani + " ]";
	}
	
	
}
