// harmonic series 1/1+1/2+1/3+..........+1/n;
import java.util.Scanner;
public class harmonic_series {
    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        int n;
        double sum=0;
        System.out.print("enter the limit of the series :");
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println("the sum of the harmonic series is : "+sum);

    }
    
}
