package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {

		public static void main(String[] args) {
			ArrayList<Customer> customers = new ArrayList<Customer>();
			// Customer customer = new Customer();
			Scanner sc = new Scanner(System.in);
			int n = 0;

			Boolean flag = true;
			while (flag) {
				System.out.println("------------------------------------------------------------------");
				System.out.println("1. 고객 추가   |   2. 고객 삭제   |   3. 고객리스트   |   4. 고객 정보 수정   |   5. 종료");
				System.out.println("------------------------------------------------------------------");
				System.out.print("실행할 번호를 입력하세요:");
				n = sc.nextInt();

				switch (n) {
				case 1: // 추가
					System.out.println();
					System.out.println("추가할 고객의 정보를 입력하세요.");
					System.out.println("---------------------");
					System.out.print("이름: ");
					String name = sc.next();
					System.out.print("주소: ");
					String address = sc.next();
					System.out.print("번호: ");
					String phone = sc.next();
					customers.add(new Customer(name, address, phone));
					System.out.println("추가 되었습니다!");
					break;

				case 2: // 삭제
					System.out.println();
					System.out.println("삭제할 고객의 이름을 입력하세요.");
					System.out.println("---------------------");
					System.out.print("이름: ");
					name = sc.next();
					for (int i = 0; i < customers.size(); i++) {
						if (name.equals(customers.get(i).getName())) {
							customers.remove(i);
							System.out.println("삭제되었습니다!");
						} else
							System.out.println("회원이 존재하지 않습니다.");
					}
					break;

				case 3: // 리스트 출력
					System.out.println();
					for (Customer customer : customers)
						System.out.println(customer);

				case 4: // 수정
					System.out.println();
					System.out.print("수정할 고객의 이름을 입력하세요.");
					name = sc.next();
					for (int i = 0; i < customers.size(); i++) {
						if (name.equals(customers.get(i).getName())) {

							System.out.print("수정하실 항목을 선택하세요. (1)이름     (2)주소     (3)번호");
							n = sc.nextInt();
							System.out.println();

							switch (n) {
							case 1:
								System.out.print("이름을 새로 입력하세요.");
								name = sc.next();
								customers.get(i).setName(name);
								break;
							case 2:
								System.out.print("주소를 새로 입력하세요.");
								address = sc.next();
								customers.get(i).setAddress(address);
								break;
							case 3:
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

				case 5:
					flag = false;
					System.out.println("시스템이 종료되었습니다.");
					break;

				default:
					System.out.println("1 ~ 5 까지의 숫자만 입력하세요.");
					break;

				}

			}

		}

	}

