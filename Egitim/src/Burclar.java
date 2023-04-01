import java.util.Scanner;
public class Burclar {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("Lütfen doğduğunuz yılı rakam olarak giriniz");
		int month = io.nextInt();
		System.out.println("Lütfen doğduğunuz günü girin");
		int day = io.nextInt();
		String burc = "";
		Boolean isTrue = false;
		
		if (month== 1) {
			if (day >0 && day < 22)
			burc = "Oğlak";
			else if (day< 32)
				burc = "Kova";
			else
				isTrue = true;
		}else if(month== 2) {
			if (day >0 && day < 20)
			burc = "Kova";
			else if (day< 29)
				burc = "Balık";
			else
				isTrue = true;
		}else if(month== 3) {
			if (day >0 && day < 21)
			burc = "Balık";
			else if (day< 32)
				burc = "Koç";
			else
				isTrue = true;
		}else if(month== 4) {
			if (day >0 && day < 21)
			burc = "Koç";
			else if (day< 31)
				burc = "Boğa";
			else
				isTrue = true;
		}else if(month== 5) {
			if (day >0 && day < 22)
			burc = "Boğa";
			else if (day< 32)
				burc = "İkizler";
			else
				isTrue = true;
		}else if(month== 6) {
			if (day >0 && day < 23)
			burc = "İkizler";
			else if (day< 31)
				burc = "Yengeç";
			else
				isTrue = true;
		}else if(month== 7) {
			if (day >0 && day < 23)
			burc = "Yengeç";
			else if (day< 32)
				burc = "Aslan";
			else
				isTrue = true;
		}else if(month== 8) {
			if (day >0 && day < 23)
			burc = "Aslan";
			else if (day< 32)
				burc = "Başak";
			else
				isTrue = true;
		}else if(month== 9) {
			if (day >0 && day < 23)
			burc = "Başak";
			else if (day< 31)
				burc = "Terazi";
			else
				isTrue = true;
		}else if(month== 10) {
			if (day >0 && day < 23)
			burc = "Terazi";
			else if (day< 32)
				burc = "Akrep";
			else
				isTrue = true;
		}else if(month== 11) {
			if (day >0 && day < 22)
			burc = "Akrep";
			else if (day< 31)
				burc = "Yay";
			else
				isTrue = true;
		}else if(month== 12) {
			if (day >0 && day < 22)
			burc = "Yay";
			else if (day< 32)
				burc = "Oğlak";
			else
				isTrue = true;
		}else
			isTrue = true;
		
		
		if(isTrue)
			System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar deneyiniz");
		else
			System.out.println("Burcunuz: "+ burc);
	}

}
