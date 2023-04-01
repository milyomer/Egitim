import java.util.Scanner;
public class ListNumbers {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Lütfen ilk sayıyı giriniz");
		a = io.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz");
		b = io.nextInt();
		System.out.println("Lütfen üçüncü sayıyı giriniz");
		c = io.nextInt();
		
		if(a< b && a< c) {
			if(b< c)
				System.out.println("Küçükten büyüğe sıralamanız a < b < c dir.");
			else
				System.out.println("Küçükten büyüğe sıralamanız a < c < b dir.");
		}else if(b< a && b< c) {
			if(a< c)
				System.out.println("Küçükten büyüğe sıralamanız b < a < c dir.");
			else
				System.out.println("Küçükten büyüğe sıralamanız b < c < a dir.");				
		}else if(a< b)
			System.out.println("Küçükten büyüğe sıralamanız c < a < b dir.");
		else
			System.out.println("Küçükten büyüğe sıralamanız c < b < a dir.");
	}
}
