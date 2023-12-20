package stream.serialzation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable {
	private static final long serialVersionUID = 5915960393523847423L;
	// 멤버변수 = 인스턴스 변수
	String name;
	String job;

	// 생성자
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;

	}

	public String toString() {
		return name + ", " + job;

	}

	public static class SerializationTest {
		public void main(String[] args) throws ClassNotFoundException {
			// 직렬화 / 역직렬화 실습
			Person personLee = new Person("이순신", "대표이사");
			Person personKim = new Person("김유신", "상무이사");

			try (FileOutputStream fos = new FileOutputStream("serial.out");
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				// 리와 킴의 값을 파일에 씀 -> 직렬화 
				oos.writeObject(personLee);
				oos.writeObject(personKim);
				
			} catch (IOException e) {
				System.out.println(e);
			}
			
			try(FileInputStream  fis = new FileInputStream("serial.out");
					ObjectInputStream ois = new ObjectInputStream(fis)){
				//역직렬화
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		
			}catch(IOException e) {
				System.out.println(e);

		}
	}
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
		
	}
}
