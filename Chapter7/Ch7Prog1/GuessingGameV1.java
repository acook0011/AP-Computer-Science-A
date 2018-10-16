package Chapter7.Ch7Prog1;


/**
 * Computer thinks of a number and the user must guess it.
 *
 * @aj
 * @cs7.1
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGameV1
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        
        //Initializing Variables
        int answer = generator.nextInt(100)+1;
        int times = 0;
        
        System.out.println("I'm thinking of a number between 1 and 100.");
        times ++;
        int guess = reader.nextInt();
        //Checks if in range - doesn't count as a guess
        while (guess > 100 || guess <= 0){
                    System.out.println("That isn't in the range, try again: ");
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
