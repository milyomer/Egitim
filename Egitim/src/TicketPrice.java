import java.util.Scanner;
public class TicketPrice {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		boolean isTrue = false;
		
		System.out.print("Lütfen yaşınızı giriniz: ");
		int age = io.nextInt();
		System.out.print("Lütfen gideceğiniz mesafeyi giriniz: ");
		int distance = io.nextInt();
		System.out.print("Tek yön için 1, gidiş-dönüş için 2 seçiniz: ");
		int outin = io.nextInt();
		
		double price = distance* 0.10;
		
		if(age> 0 && age< 12)
				price = price - (price/2);
		else if(age>=12 && age< 24)
				price = price - (price/10);
		else if(age>=65)
				price = price - (price*0.3);
					
		if(distance<=0 || age <=0 || (outin<=0 || outin>2)) 
			System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyin.");
		else if(outin==1)
			System.out.println("Bilet fiyatınız: " + price + " TL");
		else if(outin==2)
			System.out.println("Bilet fiyatınız: " + ((price-(price*0.20))*2) + " TL");
		
	}
}
