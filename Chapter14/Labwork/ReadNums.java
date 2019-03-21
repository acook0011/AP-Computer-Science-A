package Chapter14.Labwork;

import java.util.*;
import java.io.*;

/**
 * Program reads a file and displays the numbers of that file as a list.
 *
 * @aj
 * @lab2
 */

public class ReadNums
{
    public static void main(String [] args) throws IOException{
        Scanner reader = new Scanner(new File("readnumb.txt"));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // Sets ArrayList
        while (reader.hasNext()){
            nums.add(reader.nextInt());
        }
        
        // Finds the average
        Integer sum = 0;
        Integer count = 0;
        for (int i : nums){
            sum += i;
            count++;
        }
        System.out.println("ArrayList:    " + nums);
        Integer average = sum/count;
        System.out.println("Average:       " + average);
        
        // Finds the lowest and highest
        Collections.sort(nums);
        System.out.println("Highest #:     " + nums.get(nums.size()-1));
        System.out.println("Lowest #:      " + nums.get(0));
        
        // Filters out even numbers
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) % 2 == 0){
                nums.remove(i);
                i--;
            }
        }
        System.out.println("Odd numbers:  " + nums);
    }
}
