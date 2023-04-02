import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int n = input.nextInt();
		
		int sum= 0,a=0,b=1;
		System.out.print("0, 1, ");
		for(int i=1; i<n-1; i++) {
			sum= a+b;
		System.out.print(sum+ ", ");
			a= b;
			b= sum;
		}
	}
}
