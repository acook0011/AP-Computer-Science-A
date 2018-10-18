package Chapter7.Ch7Prog1;


/**
 * Using methods to find the letter grade along with the average, maximum, and minimum
 *
 * @aj
 * @cs7.4
 */

import java.util.Scanner;
public class GradingV2
{
  public static void main (String [] args){
    Scanner reader = new Scanner(System.in);
    String letterGrade = "";
    int numericGrade = 0;
    int totalNum = 0;
    int avgCount = 0;
    int max = 0;
    int min = 100;
    
    //First Input
    System.out.println("Please input the numeric grade: ");
    numericGrade = reader.nextInt();
    //Checks if in range
    while (100 < numericGrade || 0 > numericGrade){
        System.out.println("Please stay within the range of 0 - 100: ");
        numericGrade = reader.nextInt();
    }
    
    //Following Inputs
    while (numericGrade != -1){
      
      //Checks if highest score
      if (numericGrade > max){
          max = numericGrade;
      }
      //Checks if lowest score
      if (numericGrade < min){
          min = numericGrade;
      }
      //Adjusts values for average
      totalNum += numericGrade;
      avgCount++;
      
      //Next input
      System.out.println("Please input the numeric grade (-1 to stop): ");
      numericGrade = reader.nextInt();
      //Checks if -1 was entered
      if (numericGrade == -1){
          break;
      }
      //Checks if in range
      while (100 < numericGrade || 0 > numericGrade){
        System.out.println("Please stay within the range of 0 - 100: ");
        numericGrade = reader.nextInt();
        
        //Checks if -1 was entered
        if (numericGrade == -1){
          break;
        }
      }
    }
    //Debugger
    System.out.println("T:" + totalNum + " A:" + avgCount + " Max:" + max + " Min:" + min);
    int average = totalNum/avgCount;
    
    //Displays Results
    System.out.println("The class average: " + getLetterGrade(average));
    System.out.println("The best in class: " + getLetterGrade(max));
    System.out.println("The worst in class: " + getLetterGrade(min));
  }

  //Determines the letter grade
    public static String getLetterGrade(int numericGrade){
    String letterGrade = "";
        if (96 <= numericGrade && 100 >= numericGrade){
        letterGrade = "A+";
    }
    if (92 <= numericGrade && 95 >= numericGrade){
        letterGrade = "A";
    }
    if (90 <= numericGrade && 91 >= numericGrade){
        letterGrade = "-A";
    }
    if (86 <= numericGrade && 89 >= numericGrade){
        letterGrade = "B+";
    }
    if (82 <= numericGrade && 85 >= numericGrade){
        letterGrade = "B";
    }
    if (80 <= numericGrade && 81 >= numericGrade){
        letterGrade = "B-";
    }
    if (76 <= numericGrade && 79 >= numericGrade){
        letterGrade = "C+";
    }
    if (72 <= numericGrade && 75 >= numericGrade){
        letterGrade = "C";
    }
    if (70 <= numericGrade && 71 >= numericGrade){
        letterGrade = "C-";
    }
    if (66 <= numericGrade && 69 >= numericGrade){
        letterGrade = "D+";
    }
    if (62 <= numericGrade && 65 >= numericGrade){
        letterGrade = "D";
    }
    if (60 <= numericGrade && 61 >= numericGrade){
        letterGrade = "D-";
    }
    if (0 <= numericGrade && 59 >= numericGrade){
        letterGrade = "F";
    }
    return letterGrade;
  }
   
}
