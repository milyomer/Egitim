import java.util.Scanner;
public class RecursivePrime {
	static boolean prime(int n, int count) {
		if(count==1)
			return true;
		else if(n%count==0)
			return false;
		return prime(n,(count-1));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir rakam giriniz: ");
		int n = input.nextInt();
		int count = n/2;

		if(prime(n,count)) {
			System.out.println("Sayınız asaldır");
		}else {
			System.out.println("Sayınız asal değildir");
		}
	}
}
