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
            reader = new Scanner(new File("letters1.txt"));
        } else  {
            System.out.println("! ERROR IN LETTERS CHOICE !");
        }
        
        
    }
}
