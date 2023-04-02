
public class PrimeNumbers {
	public static void main(String[] args) {
		

		System.out.print("Asal sayılar sırasıyla: 2, 3, 5, 7, ");
		for(int i=2; i>1 && i<100; i++)
			if(i%2!= 0 && i%3!=0 && i%5!=0 && i%7!=0)
				System.out.print(i+", " );
	}		
}


//public class PrimeNumbers {
//    public static void main(String[] args) {
//
//        for(int j = 2 ; j <= 100 ;j++) {
//            int count = 0;
//            for (int i = 2; i <= j ; i++) {
//                if(j % i == 0 ){
//                count++;
//                }
//           }
//            if(count < 2){
//                System.out.print(j+" ");
//            }
//        }
//    }
//}