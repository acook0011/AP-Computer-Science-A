package Chapter13.Labwork;


/**
 * Compute the greatest common divisor of two integers.
 *
 * @aj
 * @13.1
 */
public class GCD
{
    public static void main(String [] args){
        System.out.println("gcd(3,6)   =  " + gcd(3,6));
        System.out.println("gcd(6,3)   =  " + gcd(6,3));
        System.out.println("gcd(24,30) =  " + gcd(24,30));
    }
    
    static int gcd(int a, int b){
       if (a == 0){
           return b;
       }
       else if (b == 0){
           return a;
       }
       else{
           return gcd(b, a % b);
       } 
    }
}
