import java.util.Scanner;
public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner io= new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = io.nextInt();

		int tempNumber= number;
		int result,total=0;

		while(tempNumber!=0) {
			result= tempNumber%10;
			tempNumber/=10;
			total+=result;
		}
		System.out.println(number+ " sayısının basamakları toplamı: "+total);
	}
}
