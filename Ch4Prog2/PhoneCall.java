package Ch4Prog2;

/**
 * Find the cost of a phone call to Lexington, Virginia.
 *
 * @aj
 * @cs4.3
 */

import java.util.Scanner;

public class PhoneCall
{
    public static void main (String [] args){
     Scanner reader = new Scanner(System.in);
     
     int minute,                // Inputs total amount of minutes spent on call
         sub;                   // Substitution for variable minute in for-statement
     double cost;               // Outputs of cost for phone call
     
     // Request the input
     System.out.println("How many minutes long is the telephone call?");
     minute = reader.nextInt();
     while (minute <= 0){
         System.out.print("ERROR: Minutes must be a positive integer: ");
         minute = reader.nextInt();
        }
     
     
     // Calculating the cost
     cost = 1.15;
     sub = minute;
     for (sub = minute; sub > 2; sub--){
         cost += 0.50;
        }
       
     // Display the results
        System.out.print("A " + minute + " minute long phone call costs $" + cost + ".");
    }
}
