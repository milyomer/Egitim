import java.util.Scanner;
public class PlusYear {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Lütfen Yıl giriniz: ");
		int year = io.nextInt();
		
		if(year%4==0) {
			if(year%100 == 0 && year%400!= 0)
				System.out.println(year + " bir artık yıl değildir.");
			else			
			System.out.println(year + " bir artık yıldır.");
				}
		else 
			System.out.println(year + " bir artık yıl değildir.");
	}
}