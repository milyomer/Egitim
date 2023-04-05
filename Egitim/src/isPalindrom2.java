import java.util.Scanner;
public class isPalindrom2 {
	//isPalindrom için pekiştirme pratiği
	
	static boolean isPalindrom(int number) {
		int lastNumber, tempNumber= number, reverseNumber= 0;
		while(tempNumber!=0) {
		lastNumber= tempNumber%10;
		System.out.print("Son basamak sayısı: "+ lastNumber+"\n");
		reverseNumber= (reverseNumber*10)+lastNumber;
		System.out.print("Rakamımızın tersten yazılışı: "+ reverseNumber+"\n");
		tempNumber/=10;
		System.out.print("İlk rakamımızdan kalan rakam: "+ tempNumber+"\n");
		}
		
		if(tempNumber==number)
			System.out.println("Rakamınız Polindrom bir sayıdır.");
		else
		System.out.println("Rakamınız Polindrom bir sayı değildir.");
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = input.nextInt();
		isPalindrom(number);	
	}
}
