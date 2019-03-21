package Chapter14.Labwork;

import java.util.*;

/**
 * Add stars to an ArrayList with strings.
 *
 * @aj
 * @lab4 & lab5
 */

public class FullOfStars
{
    public static void main(String [] args){
        ArrayList<String> swift = new ArrayList<String>();
        swift.add("the");
        swift.add("quick");
        swift.add("brown");
        swift.add("fox");
        System.out.println(addStars(swift));
        System.out.println(removeStars(swift));
        ArrayList<String> sky = new ArrayList<String>();
        sky.add("cause");
        sky.add("you're");
        sky.add("a");
        sky.add("sky");
        sky.add("full");
        sky.add("of");
        sky.add("stars");
        System.out.println(addStars(sky));
        System.out.println(removeStars(sky));
        System.out.println(removeStars(sky)); // Tests it just removes *
    }
    
    public static ArrayList<String> addStars(ArrayList<String> a1){
        // Adds stars
        for (int i = 0; i < a1.size(); i+=2){
            a1.add(i+1, "*");
        }
        return a1;
    }
    
    public static ArrayList<String> removeStars(ArrayList<String> a1){
        // Removes stars
        for (int i = 0; i < a1.size(); i++){
            if (a1.get(i).equals("*")){
                a1.remove(i);
                i--;
            }
        }
        return a1;
    }
}
