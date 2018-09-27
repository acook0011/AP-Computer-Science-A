package Chapter6.Ch6Prog1;


/**
 * Rework "LuckySevens" so that it uses dice objects.
 * 
 * Previous rules: 
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

import java.util.Random;

public class Dice
{
    int numDots;
    Random generator = new Random();

    public Dice(){
        roll();
    }
    
    public int getNumDots(){
        return numDots;
    }
    
    public void roll(){
        numDots = generator.nextInt(6) + 1;
    }
    
    
}
