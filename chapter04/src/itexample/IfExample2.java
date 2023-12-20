package itexample;

public class IfExample2 {

	public static void main(String[] args) {
		// if else if, else 조건문
		int age = 9;
		int charge; /*
					 * 입장료 변수*
					 * 기본자료형 외우기
					 * int, charge 데이터를 다룰 수 있는 공간 앞에 자료형 넣어주기
					 * 자료변수에 참조형 변수로 만들 수 있음, 객체 형대로 만들어서 변수로 만들 수 있음?
					 */
		
		
		if(age < 8) {        // 1-7세
			charge = 1000;
			 //여기서+는 연결 연산자
			System.out.println("취학 전 아동입니다");
			}
		
		 else if(age < 14){  // 8-13세
			charge =2000;
			System.out.println("초등학생 입니다");
			}
		
		else if (age <20){  // 14-19세
			charge =2500;
			System.out.println("중, 고등등학생 입니다.");
		}
	     else  {            //20-세
			charge =3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다");
		}
		
			
	          

       }
 