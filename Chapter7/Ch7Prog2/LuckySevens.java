package Chapter7.Ch7Prog2;


/**
 * Simulate the game of lucky sevens until all funds are depleted.
 * 1) Rules:
 *         roll two dice
 *         if the sum equals 7, win $4, else lose $1
 * 2) The inputs are:
 *         the amount of money the user is prepared to lose
 * 3) Computations
 *         use the random number generator to simulate rolling the dice
 *         loop until the funds are depleted
 *         count the number of rolls
 *         keep track of the maximum amount
 * 4) The outputs are:
 *         the number of rolls it takes to deplete the funds
 *         the maximum amount
 *         
 * @aj
 * @cs7.6
 */

import java.util.Scanner;
import java.util.Random;

public class LuckySevens
{
    public static void main (String [] args) {
     Scanner reader = new Scanner(System.in);
     Random generator = new Random();
     
     int die1, die2,        // two dice    
         dollarsInt,        // initial number of dollars (input)
         dollarsRun,        // dollars while running
         count,             // number of rolls to reach depletion
         averageCount,      // average number of rolls
         totalCount;        // for calculating average number of rolls
         
     // Request the input
     System.out.print("How many dollars do you have? ");
     dollarsInt = reader.nextInt();
     dollarsRun = dollarsInt;
     
     // Initialize variables
     totalCount = 0;
     count = 0;
     
     // Loop until the money is gone
     for (int i = 1; i < 100; i++){
     // The normal LuckySevens process till bankrupt
     while (dollarsRun > 0) {
         count++;
         
         // Roll the dice
         die1 = generator.nextInt (6) + 1; // 1-6
         die2 = generator.nextInt (6) + 1; // 1-6
         
         // Calculate the winnings or losses
         if (die1 + die2 == 7)
            dollarsRun += 4;
         else 
            dollarsRun -= 1; 
            
        }
     // Adds count from while (dollarsRun > 0) to total
     totalCount += count;
     // Sets count to 0 and dollarsRun to dollarsInt to prepare to go again
     count = 0;
     dollarsRun = dollarsInt;
    }
    
    // Calculates the average
    averageCount = totalCount/100;
    System.out.println("The average number of rolls it takes before you go bankrupt: " + averageCount);
    }
}
