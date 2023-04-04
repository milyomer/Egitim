import java.util.Scanner;
public class recursiveFibonacci {
	static int fibonacci(int number) {
		if (number ==2 || number== 1)
			return 1;
		return fibonacci(number-1)+ fibonacci(number-2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = input.nextInt();
		System.out.println(fibonacci(number));
				
	}
}
