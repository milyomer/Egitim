import java.util.Scanner;
public class WeatherHeat {
	public static void main(String[] args) {
	Scanner io = new Scanner(System.in);	
	System.out.println("Lütfen sıcaklık değerini belirtiniz:");
	int heat = io.nextInt();
	if(heat <0)
		System.out.println("Kayak yapmaya gidebilirsiniz");
	else if(heat<= 25) {
		if(heat<=15) {
			System.out.println("Sinemaya gidebilirsiniz");
		}if(heat>=10) {
			System.out.println("Piknik yapmaya gidebilirsiniz");
		}
	}else {
		System.out.println("Yüzmeye gidebilirsiniz");
	}
	}
}
