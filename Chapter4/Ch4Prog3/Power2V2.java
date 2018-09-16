package Chapter4.Ch4Prog3;

/**
 * Displaying user-input powers of a specified base V.2
 *
 * @aj
 * @cs4.8
 */

import java.util.Scanner;
public class Power2V2
{
    public static void main(String [] args){
    Scanner reader = new Scanner(System.in);
    double power = 0,                   // (Input) Exponent power on base
           base = 0,                    // (Input) Number of base 
           result = 0;                  // (Output) Result of exponent power on base 

// Calculations
while (power != -1){
    System.out.println("Enter the base: ");
    base = reader.nextDouble();
    System.out.println("Enter the exponent (-1 to stop): ");
    power = reader.nextDouble();
    
    // Checks if need to leave
    if (power == -1){
            System.out.print("The power is gone. Viva la revolución.");
        }else{
    while (power < 0){
     
            System.out.println("Please enter a positive integer: ");
            power = reader.nextDouble();
        }
      
  
    result = Math.pow(base, power); 
    System.out.println(base + " to the power of " + power + " is " + result);
    }
   } 
}
 }