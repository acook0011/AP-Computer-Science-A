package Chapter3.Ch3Prog1;


/**
 * An income tax calculator
 *
 * @aj 
 * @cs3.1
 */
import java.util.Scanner;
public class IncomeTaxCalculator
{
    public static void main (String [] args){
     // Constants
     final double TAX_RATE = 0.20;
     final double STANDARD_DEDUCTION = 10000.0;
     final double DEPENDENT_DEDUCTION = 2000.0;
     
     Scanner reader = new Scanner(System.in);
     
     double grossIncome;                        // the gross income (input)
     int numDependents;                         // the number of dependents (input)
     double taxableIncome;                      // the taxable income (calculated)
     double incomeTax;                          // the income tax (calculated and output) 
     
     // Request the inputs
     System.out.print("Enter the gross income: ");
     grossIncome = reader.nextDouble();
     System.out.print("Enter the number of dependents: ");
     numDependents = reader.nextInt();
     
     // Compute the income tax
     taxableIncome = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;
     incomeTax = taxableIncome * TAX_RATE;
     
     // Display the income tax
     System.out.println("The income tax is $" + incomeTax);
     
     // Display the gross income, number of dependents, and taxable income
     System.out.println("The gross income is $" + grossIncome);
     System.out.println("The number of dependents is " + numDependents);
     System.out.println("The taxable income is $" + taxableIncome);
    }
}
