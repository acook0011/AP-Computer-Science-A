package Chapter4.Ch4Prog3;


/**
 * Displaying user-input powers of a specified base V.3
 *
 * @aj
 * @cs4.9
 */

import java.io.*;         
import java.util.Scanner;
public class Power2V3
{
    public static void main(String [] args) throws IOException {
    Scanner reader = new Scanner(new File("powers.txt"));
    double power = 0,                   // (Input) Exponent power on base
           base = 0,                    // (Input) Number of base 
           result = 0;                  // (Output) Result of exponent power on base 

// Calculations
while (reader.hasNext()){
    base = reader.nextDouble();
    power = reader.nextDouble();
    
    // Checks if need to leave
    if (power == -1){
            System.out.print("The power is gone. Viva la revolución.");
        }else{
    while (power < 0){
     
            System.out.print("Please enter a positive integer for the exponent: ");
            power = reader.nextDouble();
        }
      
  
    result = Math.pow(base, power); 
    System.out.println(base + " to the power of " + power + " is " + result);
    }
   } 
}
 }
