package Chapter10.Labwork;


/**
 * Finds the mode of a list of numbers
 *
 * @aj
 * @10.3
 */

import java.io.*;
import java.util.Scanner;

public class Mode
{
    public static void main(String[] args) {
        int[] nums=new int[10];
        int[] numCount=new int[10];
        int mode = findMode(nums, numCount);
        
        // Prints out the found mode
        System.out.println("The mode is: " + mode);
    }

    public static int findMode(int[] nums, int[] numCount){
        Scanner scanner = new Scanner(System.in);

        int maxValue = -1;  // Sets default value meant to later be replaced as mode
        int maxCount = 0;   // Sets highest count of duplicate numbers meant to be overtopped
        int inputs = 0;     // Input from user entering numbers  
        
        // Takes in inputs
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int total = i+1;
            System.out.println("Insert number #" + total + ":");
            inputs = scanner.nextInt();
            nums[i]= inputs;
        }
        
        // Determines appearances of each number
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            numCount[i] = 0; 
            // Will count itself in following program, so all numCount[i] = 1 at minimum
            for (int j = 0; j < nums.length; j++) {
                // Checks each number in array to see if it equals another number in array
                if (nums[j] == nums[i]) {
                    numCount[i] += 1;     // Parallel array syncs with current number being checked
                }
            }
            
            // Checks if number could be a new mode
            if (numCount[i] > maxCount) {
                maxValue = nums[i];
                maxCount = numCount[i];
            }
        }
        
        return maxValue;
    }
    }

