import java.util.Scanner;
public class KdvHesabı {
		public static void main(String[] args) {
			Scanner io = new Scanner(System.in);
			System.out.println("Lütfen ürünün fiyatını giriniz:");
			float fiyat = io.nextFloat();
			float kdvOran = fiyat < 1000? 0.18f: 0.08f;
			float kdv = ( kdvOran * fiyat);
			float topTutar = fiyat + kdv;
			
			System.out.println();
			System.out.println("Kdv hariç tutarınız : " + fiyat + " TL ve kdv oranınız : " + kdvOran);	
			System.out.println();
			System.out.println("Kdv tutarınız : \n" + kdv + " TL");	
			System.out.println();
			System.out.println("Ürününüzün kdv dahil fiyatı: \n" +  topTutar + " TL");
			
					
		}
	}
