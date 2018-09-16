package Chapter4.Ch4Prog3;

/**
 * Displaying user-input powers of 2 V.1
 *
 * @aj
 * @cs4.7
 */

import java.util.Scanner;
public class Power2V1
{
    public static void main(String [] args){
    Scanner reader = new Scanner(System.in);
    double power = 0,                   // (Input) Exponent power on base of 2
           result = 0;                  // (Output) Result of exponent power on base of 2

// Calculations
while (power != -1){
    System.out.println("Enter the exponent which you would like to raise the power of 2 (-1 to stop): ");
    power = reader.nextDouble();
    
    // Checks if need to leave
    if (power == -1){
            System.out.print("The power is gone. Viva la revolución.");
        }else{
    while (power < 0){
     
            System.out.println("Please enter a positive integer: ");
            power = reader.nextDouble();
        }
      
  
    result = Math.pow(2.0, power); 
    System.out.println("2 to the power of " + power + " is " + result);
    }
   } 
}
 }


