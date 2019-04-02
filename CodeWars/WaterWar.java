package CodeWars;


/**
 * Calculates the number of weeks water will last 
 * given a weekly usage rate for the town residents.
 *
 * @aj
 * @codewars.1
 */

import java.util.Scanner;
import java.io.*;
public class WaterWar
{
    public static void main(String [] args) throws IOException {
        Scanner reader = new Scanner(new File("water.txt"));
        int[] gallon = new int[5];
        int count = 0;
        String weekAmount;
        
        while(reader.hasNext()){
            int number = reader.nextInt();
            if (number != 0){
            if (weeklyRate(number) == 1){
                weekAmount = "week";
            }else{
                weekAmount = "weeks";
            }
            System.out.println(number + " gallons per week will last " + 
                               weeklyRate(number) + " " + weekAmount + ".");
            count++;
            }else{
                break;
            }
        
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
