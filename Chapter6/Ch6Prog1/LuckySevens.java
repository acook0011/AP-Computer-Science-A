package Chapter6.Ch6Prog1;


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
 * @cs6.4
 */

import java.util.Scanner;
import java.util.Random;

public class LuckySevens
{
    public static void main (String [] args) {
     Scanner reader = new Scanner(System.in);
     Random generator = new Random();
     //Initialize variables
     int dollars, count, maxDollars, countAtMax;
     Dice die1 = new Dice();
     Dice die2 = new Dice();
         
     // Request the input
     System.out.print("How many dollars do you have? ");
     dollars = reader.nextInt();

      //Initialize variables
      maxDollars = dollars;
      countAtMax = 0;
      count = 0;
     // Loop until the money is gone
     while (dollars > 0) {
         count++;
         
         // Calculate the winnings or losses
         if (die1.getNumDots() + die2.getNumDots() == 7)
            dollars += 4;
         else 
            dollars -= 1;
            
         // If this is a new maximum, remember it
         if (dollars > maxDollars){
             maxDollars = dollars;
             countAtMax = count;
            }
            
         die1.roll();
         die2.roll();
        }
     
     // Display the results
     System.out.println
     ("You are broke after " + count + " rolls.\n" +
      "You should have quit after " + countAtMax +
      " rolls when you had $" + maxDollars + ".");
    }
}
