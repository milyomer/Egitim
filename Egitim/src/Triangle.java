import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen bir değer giriniz: ");
		int n = input.nextInt();
		int i=1, m=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			
			int k= 1;
			while(k<=(2*i)-1) {
			System.out.print("*");
			k++;
			}
			
			i++;
			System.out.println();
		}
		while(m<=n) {
			int j=1;
			while(j<=m) {
				System.out.print(" ");
				j++;				
			}
			int k=1;
			while(k<=2*(n-m)-1) {
				System.out.print("*");
				k++;
			}
			m++;
			System.out.println();
		}

	}
}