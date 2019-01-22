package Chapter10.CodeWars;


/**
 * Find words with two letters next to each other
 * to figure out Queen Ann's favorite things.
 *
 * @aj
 * @codewars.2
 */

import java.util.Scanner;
import java.io.*;
public class QueenAnn
{
    public static void main(String []args) throws IOException{
        Scanner reader = new Scanner(new File("queenthings.txt"));
        int loops = reader.nextInt();
        reader.nextLine();    // Clears line for reading
        
        System.out.println("What does Queen Ann like and hate?\nWell, she...");
        for (int i = 0; i < loops; i++){
            Boolean likes = false;
            String word = reader.nextLine();
            for (int x = 0; x < word.length()-1; x++){
                if (word.charAt(x) == word.charAt(x+1)){
                    likes = true;
                }
            }
            if (likes){
             System.out.println("likes " + word);
            }else{
             System.out.println("hates " + word);
            }
    }
}
}
