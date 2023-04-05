import java.util.Scanner;
public class enchantedCalculator {
	static int sum(int a, int b) {
		int result = a+b;
		System.out.println("Sonuç: "+result);
		return result;
	}
	static int minus(int a, int b) {
		int result = a-b;
		System.out.println("Sonuç: "+result);
		return result;
	}
	static int cross(int a, int b) {
		int result = a*b;
		System.out.println("Sonuç: "+result);
		return result;
		}
	static int divide(int a, int b) {
		int result = a/ b;
		System.out.println("Sonuç: "+result);
		return result;
	}
	static int power(int a, int b) {
		int result= 1;
		for(int i=1; i<=b; i++)
		result*=a;
		System.out.println("Sonuç: "+result);
		return result;
	}
	static int fact(int a) {
		int result=1;
		for(int i=1; i<=a; i++) {
		result*=i;
		}
		System.out.println("Sonuç: "+result);
		return result;
	}
	static int mod(int a, int b) {
		int result= a% b;
		System.out.println("Sonuç: "+result);
		return result;
	}
	static int rect(int a, int b) {
		int result = 2* (a+b);
		System.out.print("Dikdörgenin Çevresi: "+ result+ "\n");
		result = a*b;
		System.out.println("Dikdörtgenin Alanı: "+ result);
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String menu = "1. Toplama işlemi \n"
				+ "2. Çıkarma İşlemi \n"
				+ "3. Çarpma İşlemi \n"
				+ "4. Bölme İşlemi \n"
				+ "5. Üs Alma işlemi \n"
				+ "6. Faktöryel Hesaplama\n"
				+ "7. Mod Alma İşlemi \n"
				+ "8. Dikdörtgen Çevre ve Alan Hesabı\n"
				+ "0. Çıkış";
				
		System.out.println(menu);
		int select,a=0,b=0;
		first: while(true) {
			do {
				System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
				select = input.nextInt();
				
				if(select<0 || select>8) {
					System.out.print("Hatalı bir seçim yaptınız. ");
				}else if(select==0) {
					System.out.println("Başarılı bir şekilde çıkış yaptınız.");
					break first;
				}		 
			}while(select<0 || select>8);
				if(select!=6) {
				System.out.print("Lütfen ilk sayınızı girin: \n");
				a = input.nextInt();
				System.out.print("Lütfen ikinci sayınızı girin: \n");
				b = input.nextInt();
				}else {
					System.out.print("Lütfen sayınızı giriniz: ");
				a= input.nextInt();
				}
			switch(select) {
			case 1 : sum(a,b); break;
			case 2 : minus(a,b); break;
			case 3 : cross(a,b); break;
			case 4 : 
				if(b!=0) {
					divide(a,b);
				}else { 
					System.out.println("ikinci rakamınız 0 olamaz. Lütfen tekrar deneyiniz.");
				} break;
			case 5 : power(a,b); break;
			case 6 : fact(a); break;
			case 7 : mod(a,b); break;
			case 8 : rect(a,b); break;
			}
		}
	}
}
