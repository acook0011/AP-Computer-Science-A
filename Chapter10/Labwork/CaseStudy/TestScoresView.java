package Chapter10.Labwork.CaseStudy;

// Case Study 10.1: TestScoresView class

import java.util.Scanner;

public class TestScoresView{

   private TestScoresModel model;

   public TestScoresView(TestScoresModel m){
      model = m;
      run();
   }

   // Menu-driven command loop
   private void run(){
      while (true){
         System.out.println("Number of students: " + model.size());
         System.out.println("Index of current student: " +
                            model.currentPosition());
         displayMenu();
         int command = getCommand("Enter a number [1-11]: ", 1, 11);
         if (command == 11)
            break;
         runCommand(command);
      }
   }

   private void displayMenu(){
   System.out.println("MAIN MENU");
   // Exercise: List the menu options
   System.out.println( "1. Display the current student\n" +
                       "2. Display the class average\n" +
                       "3. Display the student with the highest grade\n" +
                       "4. Display all of the students\n" +
                       "5. Edit the current student\n" +
                       "6. Add a new student\n" +
                       "7. Move to the first student\n" +
                       "8. Move to the last student\n" +
                       "9. Move to the next student\n" +
                       "10. Move to the previous student\n" +
                       "11. Quit the program" );
   }

   // Prompts the user for a command number and runs until
   // the user enters a valid command number
   // Parameters: prompt is the string to display
   //             low is the smallest command number
   //             high is the largest command number
   // Returns: a valid command number
   private int getCommand(String prompt, int low, int high){
     // Exercise: recover from all input errors
     
      Scanner reader = new Scanner(System.in);
      System.out.print(prompt);
      return reader.nextInt();
   }

   // Selects a command to run based on a command number,
   // runs the command, and asks the user to continue by
   // pressing the Enter key
   private void runCommand(int command){
   // Exercise   
   
   }
}

