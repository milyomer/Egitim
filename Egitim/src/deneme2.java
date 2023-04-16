import java.util.Arrays;

//import java.util.*;
//public class deneme2{
//	class Sports{
//	  static String getName(){
//	        return "Generic Sports";
//	    }
//	    static void getNumberOfTeamMembers(){
//	        System.out.println( "Each team has n players in " + getName() );
//	    }
//	class Soccer extends Sports{
//	   static String getName(){
//	        return "Soccer Class";
//	    }
//	}
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("sdv: ");
//		int a = input.nextInt();
//		System.out.println(getName());
//		getNumberOfTeamMembers();
//	}
//	
//}
//}
//
//class Sports{
//  static String getName(){
//        return "Generic Sports";
//    }
//    static void getNumberOfTeamMembers(){
//        System.out.println( "Each team has n players in " + getName() );
//    }
//}

//public class deneme2 {
//	public static void main(String[] args) {
//
//		int number=1;
//		int matris[][] = new int[4][4];
//		
//		for(int i=0; i<matris.length;i++) {
//						
//			for(int j=0; j<matris[i].length;j++) {
//				matris[i][j]= number++;
//				System.out.print(matris[i][j]+ " ");
//			}
//			System.out.println();
//		}
//
//		
//	}
//}
//public class deneme2 {
//    public static void main(String[] args) {
//        int[][] arr = new int[3][];
//        arr[0] = new int[1];
//        arr[1] = new int[2];
//        arr[2] = new int[3];
//        int sum = 0;
//        for (int i = 0; i < 3; ++i)
//            for (int j = 0; j < i + 1; ++j)
//                arr[i][j] = j + 1;
//        for (int i = 0; i < 3; ++i)
//            for (int j = 0; j < i + 1; ++j)
//                sum += arr[i][j];
//        System.out.print(sum);
//    }
//}
//public class deneme2 {
//	public static void main(String[] args) {
//		int[][] dizi = new int[3][];
//		dizi[0] = new int[2];
//		dizi[1] = new int[3];
//		dizi[2] = new int[2];
//		dizi[0][0] = 15;
//		dizi[0][1] = 4;
//		dizi[1][0] = 9;
//		dizi[1][1] = 96;
//		dizi[1][2] = 7;
//		dizi[2][0] = 32;
//		dizi[2][1] = 54;
//
////		for(int[] satir: dizi) {
////			for(int sutun: satir) {
////				System.out.print(sutun + " ");
////			}System.out.println();
////		}
////		for (int i = 0; i < dizi.length; i++) {
////			for (int k = 0; k < dizi[i].length; k++) {
////				System.out.print(dizi[i][k] + " ");
////			}
////			System.out.println();
////		}
////
////		double[] camis = { 5.2, 3.2, 7.8, 9.5, 8.7 };
////
////		for (int i = 0; i < camis.length; i++) {
////			System.out.print(camis[i] + ", ");
////		}
////		String[][] arabalar = { { "ahmet", "mahmut" }, { "kadife", "nazli", "yasemin" },
////				{ "omer", "ali", "ercan", "firat" } };
////
////		for(String[] isim: arabalar) {
////			for(String adlar: isim) {
////				System.out.print(adlar+ ", ");
////			}System.out.println();
////		}
////	}
////}

public class deneme2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 215, 234, 218, 189, 221, 290 };

		int[] deneme = new int[] { 55, 45, 65, 95, 78, 150 };

		double sum = 0;
		for (int i : deneme) {
			sum += i;
		}
		System.out.println(sum / deneme.length);
	}
}

//		public static void main(String[] args) {
//
//		    Scanner scan = new Scanner(System.in);
//		    int n = scan.nextInt();
//		    int[] a=new int[n];
//		    for(int i=0;i<n;i++){
//		        a[i]=scan.nextInt();
//		    }
//		    scan.close();
//
//		    // Prints each sequential element in array a
//		    for (int i = 0; i < a.length; i++) {
//		        System.out.println(a[i]);
//		    }
//		}