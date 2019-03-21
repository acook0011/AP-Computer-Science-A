package Chapter14.Labwork;

import java.util.*;

/**
 * Look at two ArrayLists and makes a new list with the shared integers
 *
 * @aj
 * @lab3
 */

public class ShareNums
{
    public static void main(String [] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1); 
        list1.add(1);
        list1.add(4);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(11);
        list1.add(15);
        list1.add(17);
        list1.add(17);
        list1.add(28);
        list1.add(28);
        list1.add(41);
        list1.add(59);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(4);
        list2.add(7);
        list2.add(11);
        list2.add(17);
        list2.add(19);
        list2.add(20);
        list2.add(23);
        list2.add(28);
        list2.add(28);
        list2.add(37);
        list2.add(59);
        list2.add(59);
        list2.add(81);
        list2.add(81);
        
        System.out.println(intersect(list1, list2));
    }
    
    public static ArrayList<Integer> intersect(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        // Creates list3 array
        for (int i = 0; i < a1.size(); i++){
            for (int j = 0; j < a2.size(); j++){
                if (a1.get(i) == a2.get(j)){
                    list3.add(a1.get(i));
                }
            }
        }
        
        // Removes any duplicates in new ArrayList
        for (int i = 0; i < list3.size(); i++){
            for (int j = i+1; j < list3.size(); j++){
                if (list3.get(i) == list3.get(j)){
                    list3.remove(j);
                    j--;
                }
            }
        }
        return list3;
    }
}
