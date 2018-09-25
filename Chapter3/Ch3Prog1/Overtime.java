package Chapter3.Ch3Prog1;


/**
 * Write a description of class Overtime here.
 *
 * @aj
 * @Project3.5
 */

import java.util.Scanner;

public class Overtime
{
    public static void main(String [] args){
    
    Scanner reader = new Scanner(System.in);
    
    double hourlyWage;                          // An employee's hourly wage (input)
    double regularHours;                        // An employee's regular hours (input)
    double regularTotal;                        // Adds up all of an employee's regular hours
    double overtimeHours;                       // An employee's overtime hours (input)
    double overtimeTotal;                       // Adds up all of an employee's overtime hours
    double overtimePay;                         // An employee's overtime pay (output)
    double totalPay;                            // An employee's total weekly pay (output)
    int day;                                    // To help the program loop and track days
    
    // Initializing variables
    regularTotal = 0;
    overtimeTotal = 0;
    regularHours = 0;
    overtimeHours = 0;
    day = 0;
    
    // Get the user inputs
    System.out.print ("Enter the employee's hourly wage: ");
    hourlyWage = reader.nextDouble();
    
    // Loop for 5 Days
    while (day < 5){
    day = day + 1;
    System.out.println("Day " + day);
    System.out.println("Enter the employee's regular hours: ");
    regularHours = reader.nextDouble();
    regularTotal = regularTotal + regularHours;
    System.out.println("Enter the employee's overtime hours: ");
    overtimeHours = reader.nextDouble();
    overtimeTotal = overtimeTotal + overtimeHours;
}
    
    // Perform calculations
    overtimePay = overtimeTotal * 1.5 * hourlyWage;
    totalPay = hourlyWage * regularTotal + overtimePay;
    
    // Print results
    System.out.print ("The employee's total weekly pay is $" + totalPay);
    }
}
