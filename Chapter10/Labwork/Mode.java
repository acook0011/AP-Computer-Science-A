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
        int[] nums= new int[10];
        int[] numCount= new int[10];
        int[] modeNum= new int[10];
        int maxValue = -1;  // Sets default value meant to later be replaced as mode
        int mode = findMode(nums, numCount, modeNum);
        
        // Prints out the found modes
        System.out.println("The mode(s) is: ");
        for (int x = 0; x < modeNum.length; x++){
            // Checks if value is equal to placeholder value. If yes, doesn't print
            if (modeNum[x] != 2495325){
            System.out.println(modeNum[x]);
         }
        }
        System.out.println("If none or all print, there is no mode.");
    }

    public static int findMode(int[] nums, int[] numCount, int[] modeNum){
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
        
        // Sets all values of modeNum to placeholder value
        for (int i = 0; i <modeNum.length; i++){
            modeNum[i] = 2495325;
        }
        
        // After highest possible mode is determined, checks  if there are other modes
        int x = -1; 
        for (int i = 0; i < nums.length; i++) {
            if (numCount[i] == maxCount) {
                // To avoid duplicates in modeNum, sets all equivalent valeus to placeholder value
                for (int y = 0; y < modeNum.length; y++){
                    if (modeNum[y] == nums[i]){
                        modeNum[y] = 2495325;
                    }
                }
                x++;
                modeNum[x] = nums[i];
   
            }
        }
        

        return modeNum[x];
    }
}

