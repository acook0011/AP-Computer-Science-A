package Chapter10.Labwork;


/**
 * Sort inputs into even, odd, and negative.
 *
 * @aj
 * @10.1
 */

import java.io.*;
import java.util.Scanner;

public class EON
{
    public static void main(String [] args){
     // Initialization
     Scanner reader = new Scanner(System.in);
     int[] unlisted = new int[10];
     int[] even = new int[10];
     int[] odd = new int[10];
     int[] negative = new int[10];
     int inputs = 0;
     
     // Takes in number inputs (no break)
     while (inputs < unlisted.length){
         inputs++;
         System.out.println("Please enter number #" + inputs + ": (0 to quit)");
         int number = reader.nextInt();
         if (number == 0){
             break;
         }
         unlisted[inputs-1] = number;
     }
     
     // Sorts numbers
     int count = 0, ncount = 0, ecount = 0, ocount = 0;
     for (int sort : unlisted){
         if (sort < 0){
             unlisted[count] = negative[ncount];
             ncount++;
            }
         else if (sort % 2 == 0){
             unlisted[count] = even[ecount];
             ecount++;
            }
         else {
             unlisted[count] = odd[ocount];
             ocount++;
            }
         count++;   
     }
     
     // Print lists
     System.out.println("Even Number List:");
     for (int i = 0; i < even.length; i++){
         System.out.println(even[i]);
     }
     System.out.println("Odd Number List:");
     for (int i = 0; i < odd.length; i++){
         System.out.println(odd[i]);
     }
     System.out.println("Negative Number List:");
     for (int i = 0; i < negative.length; i++){
         System.out.println(negative[i]);
     }
}
}
