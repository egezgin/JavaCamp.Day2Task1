
public class Output {

	public static void main(String[] args) {
		User user1 = new Student(1, "Emrah Gezgin", "57th Street, NYC, USA");		
		User user2 = new Teacher(2, "Engin Demirog", "Istanbul, Turkey", 10);
		
		String[] categories = new String[] {"Java", "React"};
		Course course1 = new Course(1, "Software developer training camp", 68, categories);
		
		course1.addTeacher(user2);
		((Teacher) user2).addStudent(user1);
		((Teacher) user2).contactStudent(user1);
		
		course1.getCategoryNames();
	}

}
