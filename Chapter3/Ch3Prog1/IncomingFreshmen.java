package Chapter3.Ch3Prog1;


/**
 * Tracking information for the next school year's freshmen
 *
 * @aj
 * @ct3
 */

import java.util.Scanner;

public class IncomingFreshmen
{
    public static void main(String [] args){
     Scanner reader = new Scanner(System.in);
     // Variables
     String nameLast;                        // last name of the student
     String nameFirst;                       // first name of the student
     int classYear;                          // graduating year of the student
     String campusPhone;                     // phone number of student's campus phone
     
     // Get user inputs
     System.out.println("The student's last name: ");
     nameLast = reader.nextLine();
     System.out.println("The student's first name: ");
     nameFirst = reader.nextLine();
     System.out.println("The student's class year: ");
     classYear = reader.nextInt();
     reader.nextLine();                      // consume the newline character
     System.out.println("The student's campus phone number: ");
     campusPhone = reader.nextLine();
     
     // Gives user outputs
     System.out.println("Student: " + nameFirst + " " + nameLast);
     System.out.println("Class Year: " + classYear);
     System.out.println("Campus Phone: " + campusPhone);
     
    }
}
