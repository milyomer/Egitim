import java.util.Scanner;
public class notOrt {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int turkce, matematik, fizik, kimya, muzik;
		System.out.println("Lütfen türkçe dersi notunuzu giriniz");
		turkce = io.nextInt();
		turkce = (turkce>0 && turkce<100)? turkce: 0;
		System.out.println("Lütfen matematik dersi notunuzu giriniz");
		matematik = io.nextInt();
		matematik = (matematik> 0 && matematik< 100)? matematik: 0;
		System.out.println("Lütfen fizik dersi notunuzu giriniz");
		fizik = io.nextInt();
		fizik = (fizik> 0 && fizik< 100)? fizik: 0;
		System.out.println("Lütfen kimya dersi notunuzu giriniz");
		kimya = io.nextInt();
		kimya = (kimya> 0 && kimya< 100)? kimya: 0;
		System.out.println("Lütfen muzik dersi notunuzu giriniz");
		muzik = io.nextInt();
		muzik = (muzik> 0 && muzik< 100)? muzik: 0;
			System.out.println();
			double notOrta = (turkce + kimya+ fizik+ matematik+ muzik)/ 5;
			if(notOrta >= 55) {
				System.out.println("Ders ortalamanız: " + notOrta +  ". Sınıfı Geçtiniz");
			}else {
				System.out.println("Ders ortalamanız: " + notOrta +  ". Sınıfta kaldınız");
			}

			System.out.println("0 dan küçük ve 100 den büyük girilen rakamlar ortalamaya dahil edilmedi.");
		
	}

}
