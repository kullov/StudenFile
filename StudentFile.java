package nga.oop3;

import java.util.Scanner;

public class StudentFile {
	public static void main(String[] args) {
		String u, t;
		int YOB;
		Scanner scan = new Scanner(System.in);
		Student[] students;
		StudentFile sF = new StudentFile();
		Menu m = new Menu();
		System.out.println("Enter number of student: ");
		int numberOfStudent = Integer.parseInt(scan.nextLine());
		students = sF.enterStudent(numberOfStudent);
		do {
			m.menu();
			System.out.println("Enter value= ");
			int value = Integer.parseInt(scan.nextLine());

			switch (value) {
			case 1:
				sF.showStudents(students);
				break;
			case 2:
				do {
				System.out.println("Find students: ");
				System.out.println("=================================================");
				System.out.println("Enter year of birth: ");
				YOB = Integer.parseInt(scan.nextLine());
				System.out.println("Show students was born in " + YOB + ": ");
				sF.showStudentsWasBornInYOB(students, YOB);
				System.out.println("Do you want to continue? Y or N");
				t = scan.nextLine();
				} while(!t.equalsIgnoreCase("N"));
				break;
			case 3:
				do {
				System.out.println("Count students: ");
				System.out.println("=================================================");
				System.out.println("Enter year of birth: ");
				YOB = Integer.parseInt(scan.nextLine());
				System.out.println("Number of student was born in" + YOB + " and live in HN: " + sF.countStudent(students, YOB));
				System.out.println("=====================================================");
				System.out.println("Do you want to continue? Y or N");
				t = scan.nextLine();
				} while(!t.equalsIgnoreCase("N"));
				break;
			default:
				break;
			}
			System.out.println("=====================================================");
			System.out.println("Do you want to continue this program? Y or N");
			u = scan.nextLine();
		} while (!u.equalsIgnoreCase("N"));

	}

	public Address enterAddress() {
		Address address = new Address();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of house: ");
		address.setNumberOfHouse(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter alley: ");
		address.setAlley(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter lane: ");
		address.setLane(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter street: ");
		address.setStreet(scan.nextLine());
		System.out.println("Enter subDistrict: ");
		address.setSubDistrict(scan.nextLine());
		System.out.println("Enter district: ");
		address.setDistrict(scan.nextLine());
		System.out.println("Enter city: ");
		address.setCity(scan.nextLine()); 
		
		return address;
	}
	public Student[] enterStudent(int numberOfStudent) {
		System.out.println("=================================================================");
		Scanner scan = new Scanner(System.in);
		Student[] students = new Student[numberOfStudent];
		Student student;
		for (int i = 0; i < students.length; i++) {
			student = new Student();
			System.out.println("Enter id of student " + (i+1) + ": ");
			student.setId(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter name of semester " + (i + 1) + ": ");
			student.setSemester(scan.nextLine());
			System.out.println("Enter name of class " + (i + 1) + ": ");
			student.setClassName(scan.nextLine());
			System.out.println("Enter name of student " + (i + 1) + ": ");
			student.setName(scan.nextLine());
			System.out.println("Enter age of student " + (i + 1) + ": ");
			student.setAge(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter year of birh of student " + (i + 1) + ": ");
			student.setYOB(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter address of student " + (i + 1) + ": ");
			student.setAddress(enterAddress());
			students[i] = new Student(student.getId(), student.getSemester(), student.getClassName(), student.getName(), student.getAge(), student.getYOB(), student.getAddress());
		}
		return students;
	}
	public void showStudents(Student[] students) {
		System.out.println("Show list of students: ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	public void showStudentsWasBornInYOB(Student[] students, int YOB) {
				for (Student student : students) {
					if (student.getYOB() == YOB) {
						System.out.println(student.toString());
					}
				}
	}
	
	public int countStudent(Student[] students, int YOB) {
		int count = 0;
		for (Student student : students) {
			if (student.getYOB() == YOB && student.getAddress().getCity().equalsIgnoreCase("HN")) {
				count++;
			}	
		}
		return count;
	}
}
