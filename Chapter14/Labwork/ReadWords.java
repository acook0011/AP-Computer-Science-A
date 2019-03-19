package Chapter14.Labwork;

import java.util.*;
import java.io.*;

/**
 * Program reads a file and displays the words of that file as a list.
 *
 * @aj
 * @lab1
 */

public class ReadWords
{
    public static void main(String [] args) throws IOException { 
        Scanner reader = new Scanner(new File("readtext.txt"));
        ArrayList<String> words = new ArrayList<String>();
        
        // Sets ArrayList
        while (reader.hasNext()){
            words.add(reader.nextLine());
        }
        
        System.out.println("~Unsorted ArrayList~");
        for (String w : words){
            System.out.println(w);
        }
        
        // Sorts in backwards alphabetical order
        Collections.reverse(words);
        System.out.println("~ArrayList sorted in reverse alphabetical order~");
        // Prints
        for (String w : words){
            System.out.println(w);
        }
        
        // Sets first letter in plural words capital
        for (int i = 0; i < words.size(); i++){
            String w = words.get(i);
            String end = w.substring(w.length()-1, w.length());
            if (end.equals("s") || end.equals("S")){
                String beg = w.substring(0, 1).toUpperCase();
                String capital = beg + w.substring(1, w.length());
                words.set(i, capital);
            }
        }
        // Prints
        System.out.println("~ArrayList where plural words are capitalized~");
        for (String w : words){
            System.out.println(w);
        }
        
        // Removes plural words from the ArrayList
        for (int i = 0; i < words.size(); i++){
            String w = words.get(i);
            String end = w.substring(w.length()-1, w.length());
            if (end.equals("s") || end.equals("S")){
                words.remove(i);
                i--;
            }
        }
        // Prints
        System.out.println("~ArrayList without plural words~");
        for (String w: words){
            System.out.println(w);
        }
    }
}
