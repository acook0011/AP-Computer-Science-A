package Chapter4.Ch4Prog2;

/**
 * The salaries of teachers over a period of time
 *
 * @aj
 * @cs4.10
 */

import java.util.Scanner;
public class TeacherSalary
{
    public static void main(String [] args){
     Scanner reader = new Scanner(System.in);
     
     double percentIncrease;                  // (Input) The percent increase of salary every year
     int    salary,                           // (Input) The initial salary 
            year,                             // (Input) The amount of years with salary
            yearOverflow,                     // The amount of years over 10
            yearSub,                          // The subsitution of years if over 10
            yearCount;                        // The count of how many years have passed

            
     // Request inputs
     System.out.print("The salary of the teacher: ");
     salary = reader.nextInt();
     while (salary <= 0){
        System.out.print("ERROR: The initial salary must be a positive integer: ");
        salary = reader.nextInt();
    }
     System.out.print("The percent increase of the salary every year (as a decimal): ");
     percentIncrease = reader.nextDouble();
     while (percentIncrease < 0){
        System.out.print("ERROR: The percent increase cannot be a negative integer: ");
        percentIncrease = reader.nextDouble();
    }
     System.out.print("The total amount of years the salary will be evaluated: ");
     year = reader.nextInt();
     while (year <= 0){
         System.out.print("ERROR: The year must be a positive integer: ");
         year = reader.nextInt();
    }
    
    
    // Calculations
     
    System.out.println("Year 1 - $" + salary);
    yearOverflow = year - 10;
    year -= 1;
    yearCount = 1;
    yearSub = 9;
    while (yearSub > 0){
            yearSub -= 1;
            yearCount += 1;
            salary += Math.round(salary * percentIncrease);
            System.out.println("Year " + yearCount + " - $" + salary);
    }if (yearOverflow > 0){                 // Testing to see if the amount of years is over 10
      while (yearOverflow > 0){            // Teacher receives no more raise after year 10. 
         yearOverflow -= 1;
         yearCount +=1;
         System.out.println("Year " + yearCount + " - $" + salary);
       }
    }
    }
    
}
