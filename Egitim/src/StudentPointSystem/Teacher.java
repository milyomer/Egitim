package StudentPointSystem;

public class Teacher {
	String name, mpno, branch;
	
	Teacher(String name,String branch,String mpno){
	this.name = name;
	this.mpno = mpno;
	this.branch = branch;
	}
	
	void print() {
		System.out.println("Adı: "+ this.name);
		System.out.println("Telefonu: "+ this.mpno);
		System.out.println("Branşı: "+ this.branch);
	}
	
}
