package pilatesproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
      ArrayList<Customer> customers = new ArrayList<Customer>();//Customer class에서  new Customer을 생성하여 앞으로 넣어줄 customers변수를 생성시켜줌
      ArrayList<PilatesClass> clalist = new ArrayList<PilatesClass>();
      ArrayList<PtClass> ptlist = new ArrayList<PtClass>();

      Scanner sc = new Scanner(System.in); //스캐너 메서드를 sc라는 변수명으로 시스템 안에 넣어줄거다
      boolean inMainMenu = true; //blooean 참과 거짓을 넣어주는 것 /inmainmenu 가 참일때까지 반복
      while (inMainMenu) { //while문이 참일때 반복하는 것/ 스위치문을 감싸고 있다
         System.out.println("----------------------");
         System.out.println(" 1. 회원   |   2. 강사    ");
         System.out.println("----------------------");
         System.out.print("실행할 번호를 입력하세요:");

         switch (sc.next()) { // 1.회원 //입력해서 넘어가게끔 스캐너 넥스트 메서드 지정
         //스위치 케이스문에 문자를 입력했을 시 다음으로 넘어가는 메서드 지정
         
         case "1":
            boolean inMemberMenu = true; // case1문이 참일때 반복할거다
            while (inMemberMenu) {// while문이 참일 시 반복
               System.out.println("-----------------------------------------------------------------------");
               System.out.println("| 1. 회원 등록  |   2. 회원 삭제   | 3. 회원 정보 수정 | 4. 수업 신청 | (B) 뒤로가기  |");
               System.out.println("-----------------------------------------------------------------------");
               System.out.print("실행할 번호를 입력하세요:");

                  switch (sc.next()) { //switch문에 입력된 값으로 다음으로 넘어가는 메서드
                  case "1": // 추가 1. 회원 등록
                     System.out.println();
                     System.out.println("추가할 회원의 정보를 입력하세요.");
                     System.out.println("---------------------");
                     System.out.print("회원 이름: ");
                     String name = sc.next(); // Customer class 안에 만든 멤버변수를 사용함 // 문자 입력할 시 sc.next();로 다음열로 넘어감
                     System.out.print("회원 나이: ");
                     String age = sc.next();
                     System.out.print("회원 성별: ");
                     String gender = sc.next();
                     System.out.print("회원 번호: ");
                     String phone = sc.next();
                     customers.add(new Customer(name, age, gender, phone));// 위에서 입력된 값이 customers 안 인덱스에 입력된다.
                     System.out.println("회원 등록되었습니다. "+ name + "님 환영합니다!"); // 회원등록이 되었다는 출력문
                     break;
   
                  case "2": // 삭제 2. 회원 삭제
                     System.out.println();
                     System.out.println("삭제할 회원의 이름을 입력하세요.");
                     System.out.println("---------------------");
                     System.out.print("이름: ");
                     name = sc.next(); // name 입력시 다음으로 넘어가게끔
                     Customer removedCustomer = null;
                     for (int i = 0; i < customers.size(); i++) { // for 반복문 : coustomer 인덱스 0부터 인덱스 전체를 돌며 i만큼 하나씩 찾는 형식
                    	 if (name.equals(customers.get(i).getName())) { // 만약 삭제할 회원의 이름을 입력했을때 customer입력 값에 있는 name과 같다면
                    		 customers.remove(i); //removedCustomer = customers.remove(i); // 그 이름을 지워준다
                    		 System.out.println(customers.get(i).getName() + " 회원님 " + "삭제되었습니다!");
                    	 }else
                    		 System.out.println("해당하는 회원이 존재하지 않습니다.");
                        }
//                     }
//                     if(removedCustomer == null)
//                    	 System.out.println("해당하는 회원이 존재하지 않습니다.");
   
                     break;
   
                  case "3": // 수정 3. 회원 정보 수정
                     System.out.println();
                     System.out.print("수정할 회원의 이름을 입력하세요.");
                     name = sc.next(); //위 수정할 회원의 이름이 입력 될 경우 다음으로 넘어간다.
                     for (int i = 0; i < customers.size(); i++) { // 인덱스값 0부터 customer인덱스 전체를 돌며 한칸씩 이동해 i값을 찾아 돌아다님
                        if (name.equals(customers.get(i).getName())) { // 만약 위 이름 입력값이 인덱스에 있을 경우에만 get호출
   
                           System.out.print("수정하실 항목을 선택하세요. (1)이름     (2)나이     (3)성별    (4)번호");
                           System.out.println();
   
                           switch (sc.next()) { //switch case문 sc.next메서드에 값 입력시 인덱스를 가져와 재설정
                           case "1": 
                              System.out.print("이름을 새로 입력하세요.");
                              name = sc.next();
                              customers.get(i).setName(name);
                              break;
                           case "2":								// 위에서 입력한 이름이 인덱스에서 찾았을 시 발견되면 재설정하는 스위치문에 들어간다
                              System.out.print("나이를 새로 입력하세요."); // 커스터머 인덱스 값이 같은 경우 확인하고 입력한 값으로 재설정set
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
                           }
                           System.out.println("수정되었습니다!");
   
                        } else
                           System.out.println("잘못된 정보입니다.");
                     }
   
                     break;
   
                  case "4": // 회원탭에서 4.수업 신청 탭 
                     //4. 수업 신청 : 인덱스를 가진 수업리스트가 출력되면 수업리스트의 인덱스번호로 어떤회원이 수업을 신청하는지.
                     System.out.println("수업 신청하실 회원의 이름을 입력해주세요.");
                     System.out.println("회원 이름: ");
                     String reginame = sc.next();
                     for (int i = 0; i < customers.size(); i++) { // 위에서 입력한 회원의 이름이 인덱스값에 있을시
                        if (reginame.equals(customers.get(i).getName())) { 
                        	// 참의 값으로 신청가능한 회원이라고 나옴
                            //입력받은 이름과 회원리스트의 있는 이름과 비교해서 같으면 신청가능하고 -> 수업 목록 조희.
                        	// 수업 목록 표시 구현부
                        	System.out.println("입력하신 회원이 등록되어 있습니다. 현재 신청 가능한 수업 목록입니다.");
                    		
                   		 for (PilatesClass PilatesClass : clalist) {	//수업 목록 조회
								System.out.println(clalist.toString());
								}
								break;								
							} else {
								System.out.println("입력하신 회원의 이름이 회원 목록에 없습니다.");	//다시 입력해주세요.
							}
                        }
                     /*
                        switch (sc.next()) {
                        case "1" : 
                        	System.out.println("신청가능한 목록입니다.");
                          String pt = sc.next();
                            System.out.println(); // 
                            for (int i1 = 0; i1 < customers.size(); i1++) {
                            	 if (name.equals(customers.get(i1).getName())) {  // 참의 값으로 신청가능한 회원이라고 나옴
                                     //입력받은 이름과 회원리스트의 있는 이름과 비교해서 같으면 신청가능하고 -> 수업 목록 조희.
                            		 System.out.println("입력하신 회원이 등록되어 있습니다. 현재 신청 가능한 수업 목록입니다.");
                            		
                            		 for (PilatesClass PilatesClass : clalist) {	//수업 목록 조회
     									System.out.println(clalist.toString());
     									}
   									break;								
     								} else {
     									System.out.println("입력하신 회원의 이름이 회원 목록에 없습니다.");	//다시 입력해주세요.
     								}
     									
     							//어떤 회원인지 입력을 받을건데 입력한 이름이 있는지 확인 후 어떤 수업을 신청할지 입력 받음.
     							}
     							*/
                        
                  case "b":
                  case "B":
                     // 종료
                     //System.out.println("안녕히 가세요.");
                     inMemberMenu = false; //blooean 값으로 거짓일 시에 다시 inMemberMenu 처음으로
                     break;
   
                  default:
                     System.out.println("■□■□■□■□■□■□■□■□");
                     System.out.println("입력값을 확인해 주세요.");
                     System.out.println("■□■□■□■□■□■□■□■□");
                     break; //이 모든 것들이 입력값과 다를시에 나오는 출력값
               }

            }
            break; //inMainMenu 1번케이스 아웃
                  
            
         case "2": // 2강사
            boolean teacher = true;
            while (teacher) {
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("1. 수업 등록   |   2. 등록된 수업 조회   |  3.회원 조회  |  4.수업 수정  |  (B) 뒤로가기  |  ");
               System.out.println("---------------------------------------------------------------------------");
               System.out.print("실행할 번호를 입력하세요:");

               switch (sc.next()) {
               case "1": // 1 . 수업 등록
                  System.out.println();
                  System.out.println("추가할 수업의 정보를 입력하세요.");
                  System.out.println("---------------------");
                  System.out.println("수업명: ");
                  String clname = sc.next();
                  System.out.println("강사명: ");
                  String tchname = sc.next();
                  System.out.println("수업 시간: ");
                  String classtime = sc.next();
                  System.out.println("수업 기구: ");
                  String organi = sc.next();

                  clalist.add(new PilatesClass(clname, tchname, classtime, organi));//입력 받은 값을 변수에 담아 인스턴스생성 후 회원 배열에 저장
                  System.out.println(clname + "수업, " + tchname + "강사, " + organi+ "기구, "+ classtime +"수업으로 등록되었습니다.");
                  break;

               case "2": // 2.등록된 수업 조회
                  System.out.println(); // 
                  for (PilatesClass pilatesClass : clalist) {// PilatesClass 형 변수 pilatesClass = ArrayList형 clalist에서 꺼내 왔습니다.
                     System.out.println(pilatesClass.toString());
                  }
                  break;
                  
               case "3":
                  for (Customer customer : customers)// 향상된 for문은 배열문 
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