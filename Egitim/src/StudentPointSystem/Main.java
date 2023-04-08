package StudentPointSystem;

public class Main {
	public static void main(String[] args) {
		Teacher t1  = new Teacher("Mahmut Hoca", "TRH", "0055");
		Teacher t2  = new Teacher("Graham Bell", "FZK", "554");
		Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");
				
		Course tarih = new Course("Tarih", "101", "TRH");	
		tarih.addTeacher(t1);
		
		Course fizik= new Course("Fizik", "102", "FKZ");
		fizik.addTeacher(t2);
		
		Course biyo = new Course("Biyoloji", "101", "BIO");	
		biyo.addTeacher(t3);
		
		Student s1= new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
	}
}
