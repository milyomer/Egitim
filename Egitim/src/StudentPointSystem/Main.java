package StudentPointSystem;

public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Ahmet ALTAN", "TRH", "555");
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);

		Teacher t2 = new Teacher("Graham BELL", "FZK", "111");
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);

		Teacher t3 = new Teacher("Kamuran AKKOR", "BIO", "642");
		Course biyo = new Course("Biyoloji", "103", "BIO");
		biyo.addTeacher(t3);

		Student s1 = new Student("Küçük Emrah", "001", "4", tarih, fizik, biyo);
		s1.addBulkExamNote(50, 50, 20, 45, 60, 55);
		s1.isPass();
		s1.printNote();

		Student s2 = new Student("İbrahim TATLISES", "002", "4", tarih, fizik, biyo);
		s2.addBulkExamNote(20, 85, 40, 75, 100, 65);
		s2.isPass();
		s2.printNote();

		Student s3 = new Student("Seda SAYAN", "003", "4", tarih, fizik, biyo);
		s3.addBulkExamNote(75, 45, 65, 95, 40, 75);
		s3.isPass();
		s3.printNote();

	}
}