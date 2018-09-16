package Ch3Prog1;


/**
 * The surface area of a cube
 * Formula = 6 * Edge^2
 * 
 * @aj
 * @Project3.1
 */

import java.util.Scanner;
public class Cube
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        
        int length;                              // Length of one side of a cube
        int surfaceArea;                         // Surface area of the cube
        
        // Get user inputs
        System.out.print ("Enter the length of the cube's edge: ");
        length = reader.nextInt();
        
        // Perform calculations
        surfaceArea = 6 * length * length;
        
        // Print results
        System.out.print("The surface area of the cube is " + surfaceArea);
}
}

