package Ch4Prog2;

/**
 * A prediction for population growth without deaths.
 *
 * @aj
 * @cs4.6
 */

import java.util.Scanner;
public class Population
{
    public static void main(String [] args){
    Scanner reader = new Scanner(System.in);
     
    int popInitial,                // (Input) The starting population of organisms
        rateGrowth,                // (Input) The rate of growth (a real number greater than 0)
        rateTime,                  // (Input) The number of hours it takes to achieve the rate of growth
        timeGrowing,               // (Input) The number of hours in which a population grows
        popPredict;                // (Output) The predicted population of organisms after time
         
    // Request the inputs
    System.out.print("The initial population of the organisms: ");
    popInitial = reader.nextInt();
    while (popInitial <= 0){
        System.out.print("ERROR: Initial population must be a positive integer: ");
        popInitial = reader.nextInt();
    }
    System.out.print("The rate of growth of the population: ");
    rateGrowth = reader.nextInt();
    while (rateGrowth <= 0){
        System.out.print("ERROR: Rate of growth must be a positive integer: ");
        rateGrowth = reader.nextInt();
    }
    System.out.print("The number of hours it takes to achieve the rate of growth: ");
    rateTime = reader.nextInt();
    while (rateTime <= 0){
        System.out.print("ERROR: Time for rate of growth must be a positive integer: ");
        rateTime = reader.nextInt();
    }
    System.out.print("The number of hours in which a population will grow: ");
    timeGrowing = reader.nextInt();
    while (timeGrowing <= 0){
        System.out.print("ERROR: Time in which a population will grow must be a positive integer: ");
        timeGrowing = reader.nextInt();
    }
    
    // Calculations
    // NOTE: USE RATE OF POPULATION GROWTH FORMULA
}
}
