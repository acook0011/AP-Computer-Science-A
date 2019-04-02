package CodeWars;


/**
 * Eliminate the letters that don't belong.
 *
 * @aj
 * @codewars.4
 */

import java.util.Scanner;
import java.io.*;
public class LetterTax{
   public static void main(String []args) throws IOException{
       Scanner reader = new Scanner(new File("lettertax.txt"));
       while(reader.hasNext()){
           // Establishes variables
           int cut = reader.nextInt();
           String word = reader.nextLine();
           String fixed = word; // Sets 'word' to new variable meant to be altered
           
           
           for (int x = 1; x < word.length();){
               // Replace all characters meant to be removed with "@" to be later replaced
               fixed = fixed.substring(0,x) + "@" + fixed.substring(x+1);
               x += cut; // Moves 'x' up by 'nth' 
           }
           
           fixed = fixed.replaceAll("@", ""); // Removes "@" from the word
           word = fixed.trim(); // Removes extra space at beginning of word 
                                // for correct length. Can't trim earlier or 'x' count is wrong.
           int length = word.length();
           
           // Checks whether or not the word is blank before printing
           if (length != 0){
           System.out.println(word + " " + length);
           }
       }
   }
}
