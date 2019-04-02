package CodeWars;

/**
 * Calculates the temperature of a sensor using two calibration values and current sensor value
 *
 * @aj
 * @codewars.5
 */

import java.util.*;
import java.io.*;
public class TempSense
{
    public static void main(String [] args) throws IOException{
        Scanner reader = new Scanner(new File("sensors.txt"));
        int count = reader.nextInt(); // Total calculations to go through
        
        while (count != 0){
            double t  = reader.nextInt();     // Current Sensor's Temperature Value
            double t0 = reader.nextInt();     // Sensor Calibration that corresponds with C0
            double t1 = reader.nextInt();     // Sensor Calibration that corresponds with C1
            double c0 = reader.nextInt()/8.0; // Calibration Temperature
            double c1 = reader.nextInt()/8.0; // Calibration Temperature
            double m = (c1-c0)/(t1-t0); // Slope
            // Equation (point-slope formula): c - c0 = m(t - t0)
            double c = m*(t-t0) + c0;
            System.out.println(c); // Answer
            count--;
        }
    }
}
