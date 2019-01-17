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
        int[] gallon = new int[10];
        int count = 0;
        
        while(reader.hasNext()){
            int number = reader.nextInt();
            if (number != 0){
            gallon[count] = number;
            System.out.println(gallon[count] + " gallons per week will last " + 
                               weeklyRate(gallon[count]) + " week.");
            count++;
        }else{
            break;
        }
    }
    }
    
    static int weeklyRate(int gallon){
        int currentGallons = 10000-gallon;
        int week = 1;
        while(currentGallons > 0){
            currentGallons -= gallon;
            if (currentGallons > 0){
                week++;
            }
        }
        
        return week;
    }
}
