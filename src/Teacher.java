
public class Teacher extends User
{
	public Teacher(int id, String name, String address, int numberStudents) {
		super(id, name, address);
	}
	
	public void addStudent(User user)
	{
		System.out.println("Student " + user.getName() + " added.");
	}
	
	public void contactStudent(User user)
	{
		System.out.println("Student " + user.getName() + " contacted.");
	}
}
