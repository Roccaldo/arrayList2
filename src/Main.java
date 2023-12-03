import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>(11);
		student.add(new Student("Donato", 15));
		student.add(new Student("Paolo", 18));
		student.add(new Student("Antonio", 10));
		student.add(new Student("Giuseppe", 25));
		student.add(new Student("Gianpaolo", 24));
		student.add(new Student("Carlo", 27));
		student.add(new Student("Rebecca", 20));
		student.add(new Student("Jason", 32));
		student.add(new Student("Jack", 29));
		student.add(new Student("Gianluca", 25));
		student.add(new Student("Orazio", 14));
		student.add(new Student("Onofrio", 33));

		System.out.println(student);

		student.sort(Comparator.comparing(Student::getAge));
		System.out.println(student);





	}
}