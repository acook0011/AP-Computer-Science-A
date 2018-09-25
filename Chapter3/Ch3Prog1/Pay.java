package Chapter3.Ch3Prog1;


/**
 * Find an employee's total weekly pay
 *
 * @aj
 * @Project3.4
 */

import java.util.Scanner;

public class Pay
{
    public static void main(String [] args){
    
    Scanner reader = new Scanner(System.in);
    
    double hourlyWage;                          // An employee's hourly wage (input)
    double regularHours;                        // An employee's regular hours (input)
    double overtimeHours;                       // An employee's overtime hours (input)
    double overtimePay;                         // An employee's overtime pay (output)
    double totalPay;                            // An employee's total weekly pay (output)
    
    // Get the user inputs
    System.out.print ("Enter the employee's hourly wage: ");
    hourlyWage = reader.nextDouble();
    System.out.print ("Enter the employee's regular hours: ");
    regularHours = reader.nextDouble();
    System.out.print ("Enter the employee's overtime hours: ");
    overtimeHours = reader.nextDouble();
    
    // Perform calculations
    overtimePay = overtimeHours * 1.5 * hourlyWage;
    totalPay = hourlyWage * regularHours + overtimePay;
    
    // Print results
    System.out.print ("The employee's total weekly pay is $" + totalPay);
   }
}
