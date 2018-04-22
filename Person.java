package nga.oop3;
public class Person {
	String name;
	int age;
	int YOB;
	Address address;
	
	public Person() {
		super();
	}

	public Person(String name, int age, int yOB, Address address) {
		super();
		this.name = name;
		this.age = age;
		YOB = yOB;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYOB() {
		return YOB;
	}

	public void setYOB(int yOB) {
		YOB = yOB;
	}

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\n \t [Name of student: " + name + ", age: " + age + ", Year Of Birth: " + YOB + ", Address: " + address + "]";
	}
	
}
