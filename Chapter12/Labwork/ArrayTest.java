package Chapter12.Labwork;


/**
 * Write a description of class ArrayTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTest
{
    public static void main(String[] args){
        ArrayList AL1 = new ArrayList();
        ArrayList AL2 = new ArrayList(7);
        Object a = new Object();
        a = 54;
        
        AL1.add(3, 54);
        System.out.println(AL1 + " " + AL2);
    }
}
