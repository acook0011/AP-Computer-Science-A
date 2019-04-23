package CodeWars;


/**
 * Write a description of class ShareLetters here.
 *
 * @aj
 * @codewars.6
 */

import java.util.*;
import java.io.*;

public class ShareLetters
{
    public static void main(String [] args) throws IOException{
        Scanner reader = new Scanner(System.in);
        int choice = -1;
        System.out.println("Select test: \n" +
                           "1) letters1.txt\n" + 
                           "2) letters2.txt");
        Boolean valid = false;
        while (!valid){
            choice = reader.nextInt();
            if (choice != 1 && choice != 2){
                System.out.println("Please enter 1 or 2.");
            } else{
                valid = true;
            }   
        }
        
        if (choice == 1){
            reader = new Scanner(new File("letters1.txt"));
        } else if (choice == 2){
            reader = new Scanner(new File("letters2.txt"));
        } else  {
            System.out.println("! ERROR IN LETTERS CHOICE !");
        }
        
        int count = reader.nextInt(); reader.nextLine();
        
        for (int i = count; i > 0; i--){
            String letters = "";
            String words = reader.nextLine();
            // First Word
            String temp = words.substring(0, words.indexOf(" "));
            String a = sortString(temp) + " ";
            // Second Word
            temp = words.substring(words.indexOf(" ")).trim();
            String b = sortString(temp.substring(0, temp.indexOf(" "))) + " ";
            // Third Word
            temp = temp.substring(temp.indexOf(" ")).trim();
            String c = sortString(temp) + " ";
            for (int  x = 0; x < a.length(); x++){ // Picks first letter
                String compa = a.substring(x, x+1); // Takes letter to compare
                for (int y = 0; y < b.length(); y++){ // Checks if second word has letter
                    String compb = b.substring(y, y+1); // Takes letter to compare
                    if (compb.equals(compa)){
                        int tempy = y; // To use y later
                        y = b.length(); // Stop for loop
                        for (int z = 0; z < c.length(); z++){ // Checks if third word does too
                            String compc = c.substring(z, z+1); // Takes letter to compare
                            if (compc.equals(compa)){
                                int tempz = z; // To use z later
                                z = c.length(); // Stop for loop
                                letters += compa; // Adds to result to print
                                // Cuts out of original b for next check
                                if (b.length() == tempy){
                                    b = b.substring(0, tempy);
                                } else {
                                    b = b.substring(0, tempy) + b.substring(tempy+1);
                                }
                                // Cuts out of original c for next check
                                if (c.length() == tempz){
                                    c = c.substring(0, tempz);
                                } else {
                                    c = c.substring(0, tempz) + c.substring(tempz+1);
                                }
                            }
                        }
                    }
                }
                
            }
            System.out.println(letters);
        }
    }
    
    public static String sortString(String inputString) { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
}
