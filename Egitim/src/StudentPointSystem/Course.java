package StudentPointSystem;

public class Course {
	Teacher teacher;
	String name, code, prefix;
	int note;
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
	}

	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;		
			printTeacher();
		}else {
			System.out.println("Ders bölümü ve öğretmen uyuşmuyor.");
		}
	}
	
	void printTeacher() {
		this.teacher.print();
	}
}
