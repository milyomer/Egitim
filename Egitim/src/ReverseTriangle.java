import java.util.Scanner;
public class ReverseTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen üçgen projesi için bir sayı girin: ");
		int number = input.nextInt();
		
		for(int i=1; i<=number; i++) {
			int k,j;
			for( k=0; k<i; k++ )
				System.out.print(" ");
			for( j=0; j<2*(number-k)+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
