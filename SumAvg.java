import java.util.Scanner;

public class SumAvg {
    public static  void main(String []args) {
        Scanner sc= new Scanner(System.in);
        int lower_limit;
        int upper_limit;
        int sum=0;
        System.out.print("Enter the lower limit : ");
        lower_limit=sc.nextInt();
        System.out.print("Enter the upper limit : ");
        upper_limit=sc.nextInt();
        for(int i=lower_limit;i<=upper_limit;i++){
            sum+=i;

        }
        System.out.println("The sum from "+lower_limit+" till "+upper_limit+" is :"+sum);

        
    }
    
}
