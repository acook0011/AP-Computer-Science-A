package Chapter2.Ch2Prog1;


/**
 * @aj
 * @project2.3
 * Spitting on the land measurements so we can turn it into sea measurements
 */

import java.util.Scanner;

public class Project2_3
{
  public static void main(String [] args){
      Scanner reader = new Scanner(System.in);
      double km;
      double NM;
      
      System.out.print("Enter the distance in kilometers: ");
      km = reader.nextDouble();
      
      NM = (5400.0/10000.0)*km;
      
      System.out.print("The distance in nautical miles: ");
      System.out.print(NM);
      
    }
}
