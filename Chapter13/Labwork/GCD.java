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
        // Requested tests below
        System.out.println("gcd(3,6)   =  " + gcd(3,6));
        System.out.println("gcd(6,3)   =  " + gcd(6,3));
        System.out.println("gcd(24,30) =  " + gcd(24,30));
        System.out.println("gcd(35,5)  =  " + gcd(35,5));
        System.out.println("gcd(84,93) =  " + gcd(84,93));
        System.out.println("gcd(3,943) =  " + gcd(2,943));
        System.out.println("gcd(0,0)   =  " + gcd(0,0));
    }
    
    static int gcd(int a, int b){
       // When a or b is 0, the non-zero integer is the GCD
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
