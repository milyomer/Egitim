import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("Lütfen n kümesi için bir sayı giriniz: ");
		int n = io.nextInt();
		System.out.print("Lütfen n'in elemanlarından oluşan r kümesi için bir sayı giriniz: ");
		int r = io.nextInt();
		
		int total=1, total2=1, total3=1;
		for(int i= 1; i<=n; i++) {
			total= total*i;
		}for(int j= 1; j<=r; j++) {
			total2= total2*j;
		}for(int k= 1; k<=(n-r); k++) {
			total3= total3*k;
		}if(n<r || n<0 || r<0)
			System.out.println("Lütfen n e eşit veya daha küçük bir rakam giriniz. Eksi rakam girmeyiniz.");
		else {System.out.print("\n"+n+" in "+r+ " li kombinasyonu:");
			System.out.print("\nC"+"("+n+","+r+ ") = "+total/(total2*total3));
		}
	}
}
