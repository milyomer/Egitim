import java.util.Scanner;
public class HesapMak {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı girin");
		int n1 = io.nextInt();
		System.out.println("Lütfen ikinci sayıyı girin");
		int n2 = io.nextInt();
		System.out.println("Lütfen yapmak istediğiniz işlmi seçiniz. \n Toplama için: 1 \n Çıkarma için: 2 \n Çarpma için: 3 \n Bölme için 4 \n işaretini giriniz");
		int value = io.nextInt();
		if(value== 1) {
			System.out.println("Verdiğiniz değerler ve istediğiniz işeme göre sonucunuz: "+ (n1+ n2));
			}			 
		else if(value == 2) {
			System.out.println("Verdiğiniz değerler ve istediğiniz işeme göre sonucunuz: "+ (n1- n2));
			}
			else if(value == 3) {
				System.out.println("Verdiğiniz değerler ve istediğiniz işeme göre sonucunuz: "+ (n1* n2));
				}
			else if(value == 4) {
				if(n2 != 0) {
				System.out.println("Verdiğiniz değerler ve istediğiniz işeme göre sonucunuz: "+ (n1/ n2));
				}
				else {System.out.println("Verdiğiniz ikinci rakam sfıır olamaz. Lütfen yeniden deneyin");}
				}
			else
				{System.out.println("Seçtiğiniz seçeneğe ait işlem yoktur. Lütfen yeniden deneyin");
				}
	}
}
