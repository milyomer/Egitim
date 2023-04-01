import java.util.Scanner;
public class SmallBigNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int i=1,j,k= 0,l=0,n;
		
		do {
			System.out.print("Lütfen birden fazla sayı giriniz: \n");
			n = input.nextInt();
		}
		while(n<=1);

			while(i<=n){
				System.out.println(i+ ". Sayıyı giriniz.");
				j=input.nextInt();
				if(j>=k)
					k= j;
				else if(j<l)
					l=j;
				i++;
			}
			System.out.println("Girilen en büyük sayı: "+ k);
			System.out.println("Girilen en küçük sayı: "+ l);
	}
}
