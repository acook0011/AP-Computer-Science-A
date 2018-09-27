package Chapter6.Ch6Prog1;

/**
 * Tester for 'Fraction'
 *
 * @aj
 * @cs6.3 tester
 */

public class FractionTester
{
   public static void main (String[] args){
        Fraction oneHalf = new Fraction(1,2);
        Fraction oneFourth = new Fraction(1,4);
        Fraction twoTenths = new Fraction(2,10);
        Fraction one = new Fraction();
        
        System.out.println("This is the denominator of 1/4: " + oneFourth.getDen());
        System.out.println("This is the numerator of 2/10: " + twoTenths.getNum());
        System.out.println("This is the numerator of an uninstantiated fraction: " + one.getNum());
        System.out.println("This is the sum of 2/10 and 1/4: " + twoTenths.add(oneFourth));
        System.out.println("This is the difference of 2/10 and 1/4: " + twoTenths.subtract(oneFourth));
        System.out.println("This is the product of 2/10 and 1/2: " + twoTenths.multiply(oneHalf));
        System.out.println("This is the quotient of 2/10 and 1/2: " + twoTenths.divide(oneHalf));
        System.out.println("This should just print 1/1: " + one);
    }
}

