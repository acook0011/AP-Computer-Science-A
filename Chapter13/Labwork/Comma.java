package Chapter13.Labwork;


/**
 * Insert commas into an integer
 *
 * @aj
 * @13.3
 */
public class Comma
{
    public static void main(String [] args){
        // Too many different tests to identify them all.
        // Main point is that for all these various situations, the method works.
        System.out.println(insertComma(1000)); 
        System.out.println(insertComma(10000));
        System.out.println(insertComma(100000));
        System.out.println(insertComma(1000000));
        System.out.println(insertComma(10000000));
        System.out.println(insertComma(100000000));
        System.out.println(insertComma(1000000000)); // Any bigger than this and Java overflows
        System.out.println(insertComma(10020));      
        System.out.println(insertComma(100020));    
        System.out.println(insertComma(1000320));   
        System.out.println(insertComma(999));        
        System.out.println(insertComma(700));
        System.out.println(insertComma(-654643));
        System.out.println(insertComma(2));          
        System.out.println(insertComma(2222222));
        System.out.println(insertComma(7773453));
        System.out.println(insertComma(436789));
        System.out.println(insertComma(436789321));
        System.out.println(insertComma(400300700));
        System.out.println(insertComma(555100234));
        System.out.println(insertComma(00000003));
        System.out.println(insertComma(220000000));
        System.out.println(insertComma(-4356));
    }
    
    static String insertComma(int n){
        if (n < 0) { // Problem says it expects positive integers.
            return "Negative numbers don't have rights.";
        }
        if (n < 1000) { // Constant/Prints numbers less than 1000 without commas.
            return Integer.toString(n);
        }
        if (n % 1000 == 0) { // Prints when three 0s fill slot.
            return insertComma(n/1000) + ",000";
        }
        if ((n/10) % 100 == 0) { // Prints when two 0s at beginning of slot.
            return insertComma(n/1000) + ",00" + Integer.toString(n%10);
        }
        if ((n/100) % 10 == 0) { // Prints when one 0 at beginning of slot.
            return insertComma(n/1000) + ",0" + Integer.toString(n%100);
        }
        // Natural print w/o 0s at beginning of slot
        return insertComma(n/1000) + "," + Integer.toString(n%1000);
    }
}
