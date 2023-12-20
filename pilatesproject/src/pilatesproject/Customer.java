package pilatesproject;


public class Customer {
	String name;
	String age;
	String gender;
	String phone;
	String ptclass;

	public Customer(String name, String age, String gender, String phone) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		Customer.this.phone = phone;
		String ptclass;
	
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

	@Override
	public String toString() {
		return "[ 회원이름: " + name + " , 나이: " + age + " , 성별: " + gender + " 번호: " + phone + " ]";
	}

}

