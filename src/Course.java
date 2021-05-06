
public class Course {
	private int id;
	private String name;
	private Teacher teacher[];
	private int progress;
	private String categories[];
	private int numberTeachers;
	private Student students[];
	private int numberStudents;
	
	public Course(int id, String name, int progress, String categories[]) {
		super();
		this.id = id;
		this.name = name;		
		this.progress = progress;
		this.categories = categories;
	}
	
	public void addTeacher(User user)
	{
		System.out.println("Teacher " + user.getName() + " added.");
		numberTeachers++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher[] getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher[] teacher) {
		this.teacher = teacher;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getNumberTeachers() {
		return numberTeachers;
	}

	public void setNumberTeachers(int numberTeachers) {
		this.numberTeachers = numberTeachers;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getNumberStudents() {
		return numberStudents;
	}

	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}

	public String[] getCategory() {
		return categories;
	}

	public void setCategory(String[] categories) {
		this.categories = categories;
	}
	
	public void getCategoryNames()
	{
		for (String category: categories)
			System.out.println(category);
	}
}
