package Chapter10;


/**
 * Calculates the number of weeks water will last 
 * given a weekly usage rate for the town residents.
 *
 * @aj
 * @codewars.1
 */

import java.util.Scanner;
import java.io.*;
public class CodeWars1
{
    public static void main(String [] args) throws IOException {
        Scanner reader = new Scanner(new File("water.txt"));
        int[] gallon = new int[5];
        int count = 0;
        String weekAmount;
        
        while(count < gallon.length && reader.hasNext()){
            int number = reader.nextInt();
            gallon[count] = number;
            if (weeklyRate(gallon[count]) == 1){
                weekAmount = "week";
            }else{
                weekAmount = "weeks";
            }
            System.out.println(gallon[count] + " gallons per week will last " + 
                                   weeklyRate(gallon[count]) + " " + weekAmount + ".");
            count++;
        }
        
    }
    
    static int weeklyRate(int gallon){
        // Set variables & count for first week
        int currentGallons = 10000-gallon;
        int week = 1;
        while(currentGallons > 0){
            currentGallons -= gallon;
            if (currentGallons >= 0){
                week++;
            }
        }
        
        return week;
    }
}
