package ex.a;


import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;


public class MainEntry {
	public static void main(String[] args) {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<PilatesClass> clalist = new ArrayList<PilatesClass>();
	ArrayList<Member> memberList = new ArrayList<Member>();
//	ArrayList<Customer2> customers2 = new ArrayList<Customer2>();
	// Customer customer = new Customer();

	
	Scanner sc = new Scanner(System.in);
	Customer cus = new Customer(null, null, null, null);
	
	boolean inMainMenu = true;

	while (inMainMenu) {
		System.out.println("----------------------");
		System.out.println("1. 회원   |   2. 강사    ");
		System.out.println("----------------------");
		System.out.print("실행할 번호를 입력하세요:");

		switch (sc.next()) { // 1.회원

		case "1":
			
			boolean inMemberMenu = true;
			
			while (inMemberMenu) {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("| 1. 회원 등록  |   2. 회원 삭제   | 3. 회원 정보 수정 | 4. 수업 신청 | (B) 뒤로가기  |");
				System.out.println("-----------------------------------------------------------------------");
				System.out.print("실행할 번호를 입력하세요:");

				switch (sc.next()) {
			
				case "1": // 추가 1. 회원 등록
					System.out.println();
					System.out.println("추가할 회원의 정보를 입력하세요.");
					System.out.println("---------------------");
					System.out.print("회원 이름: " + memberList );
					String name = sc.next();
					System.out.print("회원 나이: ");
					String age = sc.next();
					System.out.print("회원 성별: " + name);
					String gender = sc.next();
					System.out.print("회원 번호: ");
					String phone = sc.next();
					customers.add(new Customer(name, age, gender, phone));
					System.out.println(name + "님 환영합니다!");
					
//					for(Customer meb : customers) {
//					System.out.println(meb.showCustomerInfo());
//					}
				 System.out.println(memberList);
					break;
					
					

				case "2": // 삭제 2. 회원 삭제
					System.out.println();
					System.out.println("삭제할 회원의 이름을 입력하세요.");
					System.out.println("---------------------");
					System.out.print("이름: ");
					name = sc.next();
					for (int i = 0; i < customers.size(); i++) {
						if (name.equals(customers.get(i).getName())) {
							customers.remove(i);
							System.out.println("삭제되었습니다!");
						} else
							System.out.println("해당하는 회원이 존재하지 않습니다.");
					}

					break;

				case "3": // 수정 3. 회원 정보 수정
					System.out.println();
					System.out.print("수정할 수업의 이름을 입력하세요.");
					name = sc.next();
					for (int i = 0; i < customers.size(); i++) {
						if (name.equals(customers.get(i).getName())) {

							System.out.print("수정하실 항목을 선택하세요. (1)이름     (2)나이     (3)성별    (4)번호");
							System.out.println();

							switch (sc.next()) {
							case "1":
								System.out.print("이름을 새로 입력하세요.");
								name = sc.next();
								customers.get(i).setName(name);

								break;
							case "2":
								System.out.print("나이를 새로 입력하세요.");
								age = sc.next();
								customers.get(i).setAge(age);
								break;
							case "3":
								System.out.print("성별를 새로 입력하세요.");
								gender = sc.next();
								customers.get(i).setGender(gender);
								break;
							case "4":
								System.out.print("번호를 새로 입력하세요.");
								phone = sc.next();
								customers.get(i).setPhone(phone);
								break;
							}
							System.out.println("수정되었습니다!");

						} else
							System.out.println("잘못된 정보입니다.");
					}

					break;

				case "4": // 추가 4. 수업 조회
					System.out.println();
					for (PilatesClass PilatesClass : clalist) {
						System.out.println(PilatesClass);
					}
//					for(Customer meb : customers) {
//					System.out.println(meb.showCustomerInfo());
//					}
//					break;

				case "b":
				case "B":
					// 종료
					// System.out.println("안녕히 가세요.");
					inMemberMenu = false;
					break;

				default:
					System.out.println("■□■□■□■□■□■□■□■□");
					System.out.println("입력값을 확인해 주세요.");
					System.out.println("■□■□■□■□■□■□■□■□");
					break;

				}

			}
			break; // inMainMenu 1번케이스 아웃

		case "2": // 2강사
			boolean teacher = true;
			while (teacher) {
				System.out.println("---------------------------");
				System.out.println("1. 수업 등록   |   2. 등록된 수업 조회   |  3.회원 조회  |  (B) 뒤로가기  |  ");
				System.out.println("---------------------------");
				System.out.print("실행할 번호를 입력하세요:");

				switch (sc.next()) {
				case "1": // 1 . 수업 등록
					System.out.println();
					System.out.println("추가할 수업의 정보를 입력하세요.");
					System.out.println("---------------------");
					System.out.println("강사ID: ");
					String tchid = sc.next();
					System.out.println("강사명: ");
					String tchname = sc.next();
					System.out.println("수업 시간: ");
					String classtime = sc.next();
					System.out.println("수업 기구: ");
					String organi = sc.next();

					clalist.add(new PilatesClass(tchid, tchname, classtime, organi));
					System.out.println(tchid + " 강사님 "+ classtime + " 수업이 등록되었습니다.");
					
					System.out.println(organi + " 수업 " + classtime + "으로 등록 되었습니다.");
					
					
					break;

				case "2": // 2.등록된 수업 조회
					System.out.println();
					for (PilatesClass PilatesClass : clalist) {
						System.out.println(PilatesClass);
					}
					
					break;
					

				case "3":
					for (Customer customer : customers)
						System.out.println(customer);
					break;

				default:
					System.out.println("■□■□■□■□■□■□■□■□");
					System.out.println("입력값을 확인해 주세요.");
					System.out.println("■□■□■□■□■□■□■□■□");
					break;

				case "b":
				case "B":
					// 종료
					System.out.println("안녕히 가세요.");
					teacher = false;
					break;
				}
			}
		}
	}
}
}
