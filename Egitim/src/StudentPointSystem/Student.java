package StudentPointSystem;

public class Student {
	String name;
	String classes;
	Course c1;
	Course c2;
	Course c3;
	String stuNo;
	double average;
	boolean isPass;

	Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0.0;
		this.isPass = false;
	}

	void addBulkExamNote(int note1, int quiz1, int note2, int quiz2, int note3, int quiz3) {
		if (note1 >= 0 && note1 <= 100) {
			c1.note = note1;
			c1.quiz = quiz1;
		}
		if (note2 >= 0 && note2 <= 100) {
			c2.note = note2;
			c2.quiz = quiz2;
		}
		if (note3 >= 0 && note3 <= 100) {
			c3.note = note3;
			c3.quiz = quiz3;
		}
	}

	void isPass() {

		this.average = ((c1.note * 8 / 10) + (c1.quiz * 2 / 10) + (c2.note * 8 / 10) + (c2.quiz * 2 / 10)
				+ (c3.note * 8 / 10) + (c3.quiz * 2 / 10)) / 3.0;
		System.out.println("===========================");
		System.out.println("Sayın " + this.name);
		if (this.average >= 55) {
			this.isPass = true;
			System.out.println("Sınıfı Geçtiniz. Tebrikler." + "\n");
		} else {
			this.isPass = false;
			System.out.println("Ortalamanız geçmeniz için yeterli değildir. Malesef sınıtfa kaldınız." + "\n");
		}
	}

	void printNote() {
		System.out.println(this.c1.name + " dersi notunuz: " + c1.note + " ve sözlü notunuz: " + c1.quiz);
		System.out.println(this.c2.name + " dersi notunuz: " + c2.note + " ve sözlü notunuz: " + c2.quiz);
		System.out.println(this.c3.name + " dersi notunuz: " + c3.note + " ve sözlü notunuz: " + c3.quiz);
		System.out.println("Ortalamanız: " + this.average);
	}
}