package Chapter4.Ch4Prog1;

/**
 * Determining whether three sides of a triangle are those of a right angle.
 *
 * @aj
 * @cs4.2
 */

import java.util.Scanner;

public class RightTriangle
{
    public static void main(String [] args){
     
        Scanner reader = new Scanner(System.in);
        double a, b, c;                                   // The inputs for the sides of the triangle
        int right = 0;                                    // Equals 1 if right angle
        
        // Taking Inputs
        System.out.print("Please enter the first side of the triangle: ");
        a = reader.nextDouble();
        while (a <= 0){
            System.out.print("ERROR: Measurement must be positive: ");
            a = reader.nextDouble();
        }
        System.out.print("Please enter the second side of the triangle: ");
        b = reader.nextDouble();
        while (b <= 0){
            System.out.print("ERROR: Measurement must be positive: ");
            b = reader.nextDouble();
        }
        System.out.print("Please enter the third side of the triangle: ");
        c = reader.nextDouble();
        while (c <= 0){
            System.out.print("ERROR: Measurement must be positive: ");
            c = reader.nextDouble();
        }
        
        // Determining Sides
        if (c*c == a*a + b*b){
            right = 1;
        }else{
            if (b*b == a*a + c*c){
                right = 1;
            }else{
                if (a*a == b*b + c*c){
                    right = 1;
                }
            }
        }
        
        // Displaying outputs
        if (right == 1){
            System.out.print("This is a right triangle.");
        }else{
            System.out.print("This is not a right triangle.");
        }
    }
}
