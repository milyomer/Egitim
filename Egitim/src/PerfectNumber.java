import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int tempNumber = input.nextInt();
		int n=0, number;
		number= (tempNumber<0?-(tempNumber):tempNumber);
		for(int i=1; i<number; i++) {
			if(number%i==0)
				n+=i;				
		}
		if(n!= number)
			System.out.println(tempNumber+ " sayısı mükemmel sayı değildir.");
		else
			System.out.println(tempNumber+ " sayısı mükemmel sayıdır.");
	}
}
