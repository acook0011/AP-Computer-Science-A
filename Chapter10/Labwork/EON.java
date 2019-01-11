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
     Scanner reader = new Scanner(System.in);
     int[] unlisted = new int[10];
     int[] evenList = new int[10];
     int[] oddList = new int[10];
     int[] negativeList = new int[10];
     int inputs = 0;
     
     // Takes in number inputs (no break)
     while (inputs < unlisted.length){
        inputs++;
        System.out.println("Please enter number #" + inputs + ":");
        int number = reader.nextInt();
        unlisted[inputs-1] = number;
     }
     
     // Sorts numbers
     int count = 0, ncount = 0, ecount = 0, ocount = 0;
     for (int sort : unlisted){
         if (sort < 0){
             negativeList[ncount] = unlisted[count];
             ncount++;
            }
         if (sort % 2 == 0){
             evenList[ecount] = unlisted[count];
             ecount++;
            }
         if (sort % 2 != 0){
             oddList[ocount] = unlisted[count];
             ocount++;
            }
         count++;   
     }
     
     // Print lists
     System.out.println("~~ Even Number List ~~");
     for (int i = 0; i < ecount; i++){
         if (evenList[i] >= 0){
             System.out.print(" ");
            }
         System.out.println(evenList[i]);
     }
     System.out.println("~~ Odd Number List ~~");
     for (int i = 0; i < ocount; i++){
         if (oddList[i] >= 0){
             System.out.print(" ");
            }
         System.out.println(oddList[i]);
     }
     System.out.println("~~ Negative Number List ~~");
     for (int i = 0; i < ncount; i++){
         System.out.println(negativeList[i]);
     }
 }
}
