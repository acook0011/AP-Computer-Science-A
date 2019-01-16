package Chapter10.Labwork.CaseStudy;

// Case Study 10.1: TestScoresView class

import java.util.Scanner;

public class TestScoresView{

   private TestScoresModel model;
   private Student students;

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
   System.out.println("~~~ MAIN MENU ~~~");
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
    int choice = 0;
    while (true){
       try{
       System.out.print(prompt);
       choice = reader.nextInt();
       while (choice > high || choice < low){
         System.out.print("Please enter within [" + low + "-" + high + "]: ");
         choice = reader.nextInt();
        }
       break;
     }catch(Exception e){
       System.out.println("Error in formatting!");
       reader.nextLine();
     }
    }
    return choice;
   }

   // Selects a command to run based on a command number,
   // runs the command, and asks the user to continue by
   // pressing the Enter key
   private void runCommand(int command){
     switch (command)
	{
	   case 1:
	       printStudent();
	       continuePress();
	       break;
	   case 2:
	       System.out.println("Average Score: " + model.getClassAverage());
	       continuePress();
	       break;
	   case 3:
	       printHighScore();
	       continuePress();
	       break;
	   case 4:
	       System.out.println(model);
	       continuePress();
	       break;
	   case 5:
	       editStudent();
	       continuePress();
	       break;
	   case 6:
	       addStudent();
	       continuePress();
	       break;
	   case 7:
	       model.first();
	       continuePress();
	       break;
	   case 8:
	       model.last();
	       continuePress();
	       break;
	   case 9:
	       model.next();
	       continuePress();
	       break;
	   case 10:
	       model.previous();
	       continuePress();
	       break;
     }
   } 
   
   private void printStudent(){
     Student student = model.currentStudent();
     if (student == null){
	System.out.println("No student is currently selected.");
     }else{
	System.out.println(student);
     }
   }
   
   private void printHighScore(){
     Student student = model.getHighScore();
     if (student == null){
	System.out.println("No students have been added yet.");
     }else{	
        System.out.println(student);
     }
   }
   
   private void addStudent(){
       final Student student = new Student();

       setName(student);
       setAllScores(student);

       String error = student.validateData();
       if (error != null){
	System.out.println(error);
	return;
       }
       error = model.add(student);
       if (error != null){
	System.out.println(error);
	return;
       }

       System.out.println("Student added.");
   }

   private void editStudent(){
       Student student = model.currentStudent();
       if (student == null){
	System.out.println("No student is currently selected.");
	return;
       }
       Student temp = student.Clone();
       String menu = "~~~ EDIT MENU ~~~\n" +
		     "1. Change the name.\n" +
		     "2. Change all scores.\n" +
		     "3. Change individual score.\n" +
		     "4. View the student.\n" +
		     "5. Quit this menu.\n";		
       Boolean cont = true;
       while (cont){
	System.out.print(menu);

	int command = getCommand("Enter a number [1-5]: ", 1, 5);
	switch (command){
	    case 1:
		setName(student);
		break;
		
	    case 2:
		setAllScores(student);
		break;

	    case 3:
		setIndividualScore(student);
		break;

	    case 4:
		displayStudent(student);
		break;

	    case 5:
	       cont = false;
	       break;
	}
       }

       String message = temp.validateData();
       if (message != null){
	    System.out.println(message);
        }else{
	    model.replace(temp);
        }
   }
	
   private void setName(final Student student){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the name of the student: ");
      String nm = reader.nextLine();
      student.setName(nm);
   }
	
   private void setAllScores(final Student student){
      Scanner reader = new Scanner(System.in);
      for (int i = 1; i <= student.getNumberOfTests(); i++){
	System.out.printf("Score on test %d: ", i);
		
	int score = reader.nextInt();
			
	student.setScore(i, Math.max(0, Math.min(score, 100)));
      }
   }
   
   private void setIndividualScore(final Student student){
      int testCount = student.getNumberOfTests();
      if (testCount < 1)
      {
	System.out.println("This student has no test scores.");
	return;
      }
      
      int testIndex = 0;
      Scanner reader = new Scanner(System.in);
      
      Boolean cont = true;
      while (cont){
	System.out.printf("Test score to change [1-%d]: ", testCount);
	testIndex = reader.nextInt(); // Read the test number
	if (testIndex < 1 || testIndex > testCount){
	    // Test number is invalid.  Loop again.
	    System.out.println("That test does not exist.");
	}else{
	    cont = false;
	    break;
	}
      }
		
      System.out.printf("Score on test %d: ", testIndex);
      
      int score = reader.nextInt();
      student.setScore(testIndex, Math.max(0, Math.min(score, 100)));
   }
   
   private void displayStudent(final Student student){
	System.out.println(student);
   }
   
   private void continuePress(){
     Scanner reader = new Scanner(System.in);
     System.out.println("\nPlease enter anything to continue.");
     reader.nextLine();
    }
 }


