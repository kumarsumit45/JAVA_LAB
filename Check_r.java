//write a program called CheckPass Failwhich prints "Pass" if the variable "mark"is more than or equal to 50
// or prints "FAIL" otherwise. the program shall alhways print "done" before existing .

import java.util.Scanner;
public class Check_r{
     public static void main(String[] args) {
        float mark;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Marks :");
        mark=sc.nextFloat();
        if(mark>=0 && mark<=100){
            System.out.println("Fetching Your Result......");

        
       // System.out.println("your entered marks :"+mark);
       if(mark>=50){
        System.out.println("PASS");
       }
       else {
        System.out.println("Fail");

       }
       System.out.println("Done");
    }
    else{
        System.out.println("Please enter Valid Marks.....");
    }
        
    }
}