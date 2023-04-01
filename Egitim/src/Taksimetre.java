import java.util.Scanner;
public class Taksimetre {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Toplam katedilen km: ");
		double totalKm = io.nextDouble();
		double perKm = 2.2;
		int basePrice = 10;
		double priceTotal = (perKm * totalKm) + basePrice;
		
		System.out.println("Toplam ücret: "+ ((priceTotal> 20)? priceTotal: 20) + " TL");
	}
}
