import java.util.*;

class deneme{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t =0;
        do{
            t=in.nextInt();
        }while(t<0 || t>500);
        
            int a=0, b=0, n=0;
        do{
            for(int i=0;i<t;i++){
                 a = in.nextInt();

                 System.out.println("başarılı a");
                 b = in.nextInt();

                 System.out.println("başarılı b");
                 n = in.nextInt();

                 System.out.println("başarılı n");
                 int k=1,sum=0;
                 
            	 sum=a+b;
                 System.out.print((sum)+" ");
                     for(int j=1; j<n;j++){
                     k*=2;
                     sum=(sum)+(k*b);
                     System.out.print(sum+" ");
                     }
                     System.out.println();
                 
            }
        }while((a<0 || a>50) || (b<0 || b>50) || (n<1 || n>15));
        
        
        
    }
}