package StudentPointSystem;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note = 0;
	int quiz = 0;

	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
	}

	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		} else {
			System.out.println("Dersin bölümü ile öğretmen uyuşmuyor.");
		}
	}

	void printTeacherInfo() {
		this.teacher.print();
	}
}