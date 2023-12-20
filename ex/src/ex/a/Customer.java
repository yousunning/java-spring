package ex.a;

import java.lang.reflect.Member;
import java.util.ArrayList;


public class Customer {
	String name;
	String age;
	String gender;
	String phone;
	String num;

	public Customer(String name, String age, String gender, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.num = num;
	
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}



	@Override
	public String toString() {
		return "[ 회원이름: " + name + " , 나이: " + age + " , 성별: " + gender + " 번호: " + phone + " ]";
	}
//	public String showCustomerInfo() {
//		return name + " 님의 등급은 " + age 
//				+ " 이며, 차감 횟수는 " + num + "회 입니다." ;
//	}
	

}

