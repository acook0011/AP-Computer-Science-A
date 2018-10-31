package Chapter8.Ch8Prog1;


/**
 * Find out the amount of funds there will be from an investment plan.
 *
 * @aj
 * @cs8.3
 */

import java.util.Scanner;

public class Invest
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        
        // Initializing Variables
        double intinvest,            // (Input) The initial principal
               intrate,              // (Input) The percent interest
               balance1 = 0,         // Beginning balance in year
               balance2 = 0,         // Ending balance in year
               interest = 0,         // Amount of interest
               intyear = 0;          // Amount of interest per year
        int    year;                 // (Input) The amount years money is in fund
               
        
        // Taking Inputs
        System.out.println("Please input the money you'll be investing: ");
        intinvest = reader.nextDouble();
        balance1 = intinvest;
        balance2 = balance1;
        System.out.println("Please input the percent interest of your plan: ");
        intrate = reader.nextDouble();
        System.out.println("Please input the amount of time you will wait: ");
        year = reader.nextInt();
        
        // Calculations
        for (int yr = 1; yr <= year; yr++){
            balance1 = balance2;
            System.out.println(yr + " " + balance1 + " ");
            balance2 = balance1 * Math.pow((1 + intrate/400),4);
            interest = balance2 - balance1;
            
            System.out.println(balance2); 
        }
    }
}
