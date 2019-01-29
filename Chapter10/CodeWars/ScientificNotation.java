package Chapter10.CodeWars;


/**
 * Reads in a scientific number as a base number
 * and a power of 10 and calculate the equivalent
 * decimal value.
 *
 * @aj
 * @codewars.3
 */

import java.util.Scanner;
import java.io.*;
import java.text.*;
public class ScientificNotation
{
    public static void main(String [] args) throws IOException {
        Scanner reader = new Scanner(new File("science.txt"));
        double base = 0;       // Base value
        double expPower = 0;   // The power that 10 will be set to
        double exp = 0;        // Value of 10 to the 'expPower'th
        double notation = 0;   // Value in Scientific Notation 
        DecimalFormat f = new DecimalFormat("#0.00");   // Gives desired formatting
        
        while(reader.hasNext()){
            base = reader.nextDouble();
            expPower = reader.nextDouble();
            // Checks if either value is 0 (Sentinel value)
            if (base != 0 && expPower != 0){
                exp = Math.pow(10.0, expPower); // Finds value for SN
                notation = base*exp; // Gives value without rounding
                String formattedValue = f.format(notation);  // Applies formatting
                System.out.println(formattedValue);
                // Values with large negative expPower values will return 0.00
                // because that's how rounding works.
            }else{
                break;
            }
        }
    }
    
}
