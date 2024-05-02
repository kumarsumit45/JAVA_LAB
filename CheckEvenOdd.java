// writw a program called CheckEvenOdd which print "odd number" if the int variable "number " is 
// odd or even number otherwise. The program shall always print "bye!" before existing.

import java.util.*;
import java.util.Scanner;
class CheckEvenOdd{
     public static void main(String[] args) {
        
   
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to check whether Even or odd :");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even Number..."); 
        
        }
        else{
            System.out.println("Odd Number...");
        }
        System.out.println("Bye!...");

        
    } 
}