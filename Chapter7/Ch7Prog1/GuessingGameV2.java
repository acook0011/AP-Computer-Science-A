package Chapter7.Ch7Prog1;


/**
 * User thinks of the number and computer tries to guess it.
 *
 * @aj
 * @cs7.2
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGameV2
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        
        //Initializing Variables
        int guess = 0;
        int times = 0;
        
        System.out.println("Start thinking about a number! Don't tell me.");
        int answer = reader.nextInt();
        //Checks if in range
        while (answer > 100 || answer <= 0){
                    System.out.println("Not that I'm scanning your brain, but that's out of range.\nTry again:");
                    guess = reader.nextInt();
            }
        
        while (guess != answer){
            //When guess is higher than answer
            if (guess > answer){
                System.out.println("My number is lower! Guess again:");
                times ++;
                guess = reader.nextInt();
                //Checks if in range - doesn't count as a guess
                while (guess > 100 || guess <= 0){
                    System.out.println("That isn't in the range, try again: ");
                    guess = reader.nextInt();
                }
            }
            //When guess is lower than answer
            if (guess < answer){
                times ++;
                System.out.println("My number is higher! Guess again:");
                guess = reader.nextInt();
                //Checks if in range - doesn't count as guess
                while (guess > 100 || guess <= 0){
                    System.out.println("That isn't in the range, try again: ");
                    guess = reader.nextInt();
                }
            }
        }
        System.out.println("Wow, good job! You guessed my number in " + times + " tries!");
   }
}
