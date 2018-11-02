package Chapter8.Ch8Prog1;


/**
 * Write a description of class CreditPlan here.
 *
 * @aj
 * @cs8.4
 */

import java.util.Scanner;

public class CreditPlan
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        
        // Initializing Variables
        int    month = 0;  
        double totalOwed1,         // (Input) The purchase price      
               totalOwed2 = 1,     //  
               downPay,            // The down payment
               intRate = 0.12,     // The interest rate
               interest,           // The interest owed    
               principal,          // The principal owed
               monthly;            // The payment per month
               
        
        // Taking input 
        System.out.println("Please enter the purchase price: ");
        totalOwed1 = reader.nextDouble();
        while (totalOwed1 < 0){
         System.out.println("Please enter a positive number: ");
         totalOwed1 = reader.nextDouble();
        }

        // Calculations
        downPay = 0.10 * totalOwed1;
        totalOwed1 -= downPay;
        monthly = totalOwed1 * 0.05;
        
        // More Calculations + Printing Columns                             
        System.out.printf("%5s %15s %16s %17s %10s %18s %n", "Month", "Balance Owed", "Interest Owed", "Principal Owed", "Payment", "Money Remaining");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while (totalOwed2 > 0) {
          month++;
	  interest = totalOwed1 * intRate/12;
	  principal = monthly - interest;
	  if (principal > totalOwed1){
	     principal = totalOwed1;
	   }
	  totalOwed2 = totalOwed1 - principal;	
	  System.out.printf("%5d %,15.2f %,16.2f %,17.2f %,10.2f %,18.2f %n", month, totalOwed1, interest, principal, monthly, totalOwed2);
	  totalOwed1 = totalOwed2;
        }
    }
}
