import java.util.Scanner;
public class Ucgen {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Lütfen üçgenin bir kenarının uzunluğunu giriniz:");
		int x = io.nextInt();
		System.out.print("Lütfen üçgenin ikinci kenarının uzunluğunu giriniz:");
		int y = io.nextInt();
		System.out.print("Lütfen üçgenin üçüncü kenarının uzunluğunu giriniz:");
		int z = io.nextInt();
		int u = (x+ y+ z)/2;
		double area = Math.sqrt(u * (u-x)* (u-y)* (u-z));
		System.out.println ("Üçgenin alanı: " + area);
		
	}
}
