package Chapter7.Ch7Prog2;


/**
 * Find the length of a sentence, 
 * the amount of words in it,
 * and the average length of those words.
 *
 * @aj
 * @cs7.8
 */
import java.util.Scanner;

public class StringLengths
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        
        String sentence = "";        // The sentence to be checked (input)
        
        System.out.println("Please write out a sentence: ");
        sentence = reader.nextLine();
        
        int length = 0,                          // Amount of letters in the sentence (output)
            amount = 0,                          // Amount of words in the sentence (output)
            average = 0,                         // Average length of words in the sentence (output)
            beginPosition = 0,
            endPosition = sentence.indexOf(' ');
        // First calculation    
        while (endPosition != -1){
            if (endPosition > beginPosition){
                amount++;
                String word = sentence.substring(beginPosition, endPosition);
                length += word.length();
            }
            
            beginPosition = endPosition + 1;
            endPosition = sentence.indexOf(' ', beginPosition);
        }
        
        if (beginPosition < sentence.length()){
            amount++;
            String word = sentence.substring(beginPosition, sentence.length());
            length += word.length();
        }
        
        // Restarts if input is invalid
        while (amount == 0){
            System.out.println("No words found. Please enter an actual sentence: ");
            sentence = reader.nextLine();
            
            // Resets variables
            length = 0;
            amount = 0;              
            average = 0;                        
            beginPosition = 0;
            endPosition = sentence.indexOf(' ');
            
            while (endPosition != -1){
            if (endPosition > beginPosition){
                amount++;
                String word = sentence.substring(beginPosition, endPosition);
                length += word.length();
            }
            
            beginPosition = endPosition + 1;
            endPosition = sentence.indexOf(' ', beginPosition);
        }
        
        if (beginPosition < sentence.length()){
            amount++;
            String word = sentence.substring(beginPosition, sentence.length());
            length += word.length();
        }
        }
        
        // Printing results
        average = length / amount;
        System.out.println("Length of sentence: " + length);
        System.out.println("Amount of words: " + amount);
        System.out.println("Average length of words: " + average);
    }
}
