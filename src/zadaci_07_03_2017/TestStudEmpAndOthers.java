package zadaci_07_03_2017;

public class TestStudEmpAndOthers {
	// testiramo klase Person Student, Employee, Faculty, Staff

	public static void main(String[] args) {

		Person person = new Person("Marko", "Markovic", "065111222", "markomail@gmail.com");
		Student student = new Student("Pero", "Peric");
		Employee employee = new Employee("Janko", "Kabinet 1", 2800, new MyDate());
		Faculty faculty = new Faculty("IT");
		Staff staff = new Staff("Janko", "Secretary");

		System.out.println(person.toString());
		System.out.println();
		System.out.println(student.toString());
		System.out.println();
		System.out.println(employee.toString());
		System.out.println();
		System.out.println(faculty.toString());
		System.out.println();
		System.out.println(staff.toString());
	}
}
