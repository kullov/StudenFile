package nga.oop3;

public class Student extends Person {
	int id;
	String semester;
	String className;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String semester, String className, String name, int age, int yOB, Address address) {
		super(name, age, yOB, address);
		this.id = id;
		this.semester = semester;
		this.className = className;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [id: " + id + ", semester: " + semester + ", className: " + className + ", name: " + name + ", age: "
				+ age + ", YOB: " + YOB + " \n address: " + address + "]";
	}
	

}
