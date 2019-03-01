package Chapter13.Ch13Ex;


/**
 * Write a description of class RecursionTest1 here.
 *
 * @aj
 * @version (a version number or a date)
 */
public class RecursionTest1
{
    public static void main(String []args){
        countDown(10);
    }
    
    public static void countDown(int n){
        if (n <= 0){
            System.out.println("Blastoff!");   
        } else {
            System.out.println(n);
            countDown(n-1);
        }
    }
}
