import java.util.Scanner;
public class EbobEkok {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int number1 = input.nextInt();
		System.out.print("Lütfen ikinci bir sayı giriniz: ");
		int number2 = input.nextInt();
		int tempnum= number1;
		if (number2<=number1) {
			number1= number2;
			number2=tempnum;
		}
		int i=number1, ebob=1,k=1,ekok= 1;
		if(number2%number1!=0) {
		do {		
			i--;
			if(number1%i==0 && number2%i==0) {
			ebob= i;	
			break;
			}
		}while(i>1);
		System.out.print(number1+ " ve "+ number2+ " nin ebob u: " +ebob);
		}else
			System.out.print(number1+ " ve "+ number2+ " nin ebob u: " +number1);
		System.out.println();
		do {
			k++;
			if(k%number1==0 && k%number2==0) {
				ekok= k;
				break;
			}
		}
		while( k<=(number1*number2));
		System.out.print(number1+ " ve "+ number2+ " nin ekok u: " +ekok);
	}
}
