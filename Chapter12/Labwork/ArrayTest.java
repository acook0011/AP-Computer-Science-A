package Chapter12.Labwork;


/**
 * Tester for ArrayList
 *
 * @aj
 * @12.1
 */
public class ArrayTest
{
    public static void main(String[] args){
        ArrayList AL1 = new ArrayList();
        ArrayList AL2 = new ArrayList(7);
        
        Object a = new Object();
        a = 54; 
        Object b = new Object();
        b = "yes";
        Object c = new Object();
        c = "no"; 
        Object d = new Object();
        d = 42;
        Object e = new Object();
        e = "This is " + "it";
        
        
        AL1.add(5, b);
        AL1.add(1, e);
        AL1.remove(1);
        AL1.add(1, "seven");
        AL1.add(-2, "public static void main(String[] args){");
        System.out.println("ArrayList AL1\nLogical Size: " + AL1.size() + "\n" + AL1);   
        System.out.println("AL1[1] = " + AL1.get(1) + "\n");
        
        AL2.add(0, d);
        AL2.add(1, 5);
        AL2.add(2, "help");
        AL2.add(3, "me");
        AL2.add(3, "don't");
        AL2.remove(3);
        System.out.println("ArrayList AL2\nLogical Size: " + AL2.size() + "\n" + AL2);
        System.out.println("AL2[3] = " + AL2.get(3));
        
        // sos I can't get array of object constructor to work???
        // or I can't figure out the proper code to let me test it
    }
}
