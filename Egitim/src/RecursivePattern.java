import java.util.Scanner;
public class RecursivePattern {
	static int pattern(int n,int temp, int i) {
		if(i>0) {
			System.out.print(n+ " ");
			i-=5;
			return pattern(n-5, temp,i);
		}
		if(n<temp) {
			System.out.print(n+" ");
			return pattern(n+5,temp,i);
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir rakam giriniz: ");
		int n = input.nextInt();
		int temp= n, i= n;
		System.out.println(pattern(n,temp,i));
	}

}
