import java.util.Scanner;
public class UsluSayılar {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int num1, num2;
		System.out.print("Lütfen bir sayı giriniz: ");
		num1= io.nextInt();
		System.out.print("Lütfen üst kuvvetini giriniz: ");
		num2= io.nextInt();
		int total=1,i=1;
		
//		for( i= 1; i<num2; i++) {
//			total*= num1;
//		}
//		System.out.println("Girdiğiniz "+ num1+" üstü "+ num2+ " nin sonucu: "+ total);
		
		do {
			total*=num1;
			i++;
		}while(i<=num2);
		System.out.println("Girdiğiniz "+ num1+" üstü "+ num2+ " nin sonucu: "+ total);
	}
}
