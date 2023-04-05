import java.util.Scanner;
public class RecursivePower {
	
	static int power(int a, int b) {
			if(b==0) {
				return 1;
			}
	return a* power(a,(b-1));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen taban sayıyı giriniz: \n");
		int a = input.nextInt();
		System.out.print("Lütfen üssü girin: ");
		int b = input.nextInt();
		
		System.out.print(power(a,b));
	}
}
