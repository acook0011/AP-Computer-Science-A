package Chapter4.Ch4Prog1;

/**
 * Dividing two numbers and returning quotient and remainder. 
 *
 * @aj
 * @cs4.1
 */

import java.util.Scanner;

public class Division
{
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        
        int num1, num2;                                // Inputs 
        int quo, rem;                                  // Outputs - quotient and remainder 
        
        // Taking inputs
        System.out.print("Please enter an integer: ");
        num1 = reader.nextInt();
        System.out.print("Please enter another integer: ");
        num2 = reader.nextInt();
        
        // Determination & Calculation
        if (num1 >= num2){
            quo = num1 / num2;
            rem = num1 % num2;
        }else{
            quo = num2 / num1;
            rem = num2 % num1;
        }
        
        // Printing outputs
        System.out.print("The answer determined after dividing the integers is " + quo + "r. " + rem + ".");
    }
}
