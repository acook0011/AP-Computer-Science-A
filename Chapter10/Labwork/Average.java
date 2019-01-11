package Chapter10.Labwork;


/**
 * Finds the average and prints all numbers in the group greater than it.
 *
 * @aj
 * @10.2
 */

import java.io.*;
import java.util.Scanner;

public class Average
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        double[] inputs = new double[10];
        int count = 0;
        
        // Takes in inputs
        while (count < inputs.length){
            count++;
            System.out.println("Enter number #" + count + ":");
            double number = reader.nextDouble();
            inputs[count-1] = number;
        }
        
        System.out.println("The average is: " + getAverage(inputs) 
                           + "\n~~ Numbers above the average ~~");
        // Determines numbers over the average and prints them
        for (double digit : inputs){
            if (digit > getAverage(inputs)){
                System.out.println(digit);
            }
        }
        
        // For fun I'm adding the lower numbers, too
        System.out.println("~~ Numbers below the average ~~");
         for (double digit : inputs){
            if (digit < getAverage(inputs)){
                System.out.println(digit);
            }
        }
        
    }
    
    static double getAverage (double[] d){
        // Initialization
        double sum = 0;
        double average = 0;
        
        // Find sum to be used for later calculation
        for (double digit : d){
            sum += digit;
        }
        // Find average
        average = sum/d.length; 
        
        return average;
    }
}
