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
       Fraction oneHalf, oneFourth, oneTenth;
       String fct;
       
       //Order: n1, n2, d1, d2
       oneHalf = new Fraction(1, 1, 1, 2);
          System.out.println("\nHere is the first fraction pair\n" + oneHalf);
       
       oneFourth = new Fraction(1, 1, 1, 4);
          System.out.println("\nHere is the second fraction pair\n" + oneFourth);
          
       oneTenth = new Fraction(1, 1, 1, 10);
          System.out.println("\nHere is the third fraction pair\n" + oneTenth);
    }
}
