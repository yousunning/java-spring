package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
//		System.out.println("전화 상담 할당 방식을 선택하세요. ");
//		System.out.println(" R or r : 한명씩 RoundRobin ");
//		System.out.println(" L or l : LaestJob ");
//
//		System.out.println("args[0] : " + args[0]);
//		System.out.println("args[1] : " + args[1]);
	
		//int sch = System.in.read();
		
		String ch = String.valueOf(args[0]);
		
		
		Scheduler sch = null;

		if (ch.equals("R") || ch.equals("r")) {
			sch = new RoundRobin();
			// Scheduler scheduler = new RoundRobin();

		} else if (ch.equals("L") || ch.equals("l")) {
			sch = new LaestJob();
		} else if (ch.equals("P") || ch.equals("p")) {
			sch = new PriorityAllocation();
		} else {
			System.out.println("지원안됨");
			return;
		}
		sch.getNextCall();
		sch.sendCallToAgent();
	}
}
