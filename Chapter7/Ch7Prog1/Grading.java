package Chapter7.Ch7Prog1;


/**
 * Determines the letter grade given a range.
 *
 * @aj
 * @cs7.3
 */

import java.util.Scanner;
public class Grading
{
    public static void main(String [] args){
    Scanner reader = new Scanner(System.in);
    String letterGrade = "";
    int numericGrade = 0;

    System.out.println("Enter the numeric grade: ");
    numericGrade = reader.nextInt();
    //Checks if in range
    while (0 > numericGrade || 100 < numericGrade){
       System.out.println("Please stay within the range of 0-100: ");
       numericGrade = reader.nextInt();
    }
        
    //Determines the letter grade
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
    System.out.println("The letter grade is " + letterGrade);
    }
}
