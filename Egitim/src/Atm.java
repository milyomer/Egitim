import java.util.Scanner;
public class Atm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username, password;
        int retry= 3, action=0,price, totalValue=2500;
        do {
        System.out.print("Lütfen kullanıcı adınızı giriniz:");
        username = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();
        if(username.equals("patika") && password.equals("dev123")) {
        	System.out.println("Sisteme giriş başarılı. Kodluyoruz bankasına hoşgeldiniz.\n");
            do{
            	System.out.print("1. Para Yatırma\n2. Para Çekme\n3. Bakiye Sorgulama\n4. Çıkış\nLütfen yapmak istediğiniz işlemi seçiniz: ");
            	action= input.nextInt();
            	switch(action) {
            	case 1: {
            		System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
            		price = input.nextInt();
            		totalValue+= price;
            		System.out.println("İşlem başarılı.\n");
            	}break;
            	case 2:{ 
            		System.out.print("Lütfen çekmek istediğiniz tutarı giriniz: ");
            		price = input.nextInt();
            		if(price> totalValue)
            			System.out.println("Bakiye yetersiz.\n");
            		else{
            			totalValue-=price;
            			System.out.println("İşlem başarılı.\n");
            			}
            	}break;
            	case 3: {
            		System.out.println("Güncel bakiyeniz: "+ totalValue+" TL\n");
            		break;
            	}
            	}
            }while(action!=4);
            System.out.println("Başarılı bir şekilde çıkış yaptınız. İyi günler.");
            retry=0;
        }else {
        	retry--;
        	if(retry!=0)
        	System.out.println("Hatalı giriş yaptınız. Kalan hakkınız: "+ retry);
        	else
        	System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
        	}
        }while(retry!= 0);

    }
}
