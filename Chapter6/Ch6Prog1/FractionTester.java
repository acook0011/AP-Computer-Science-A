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
       String fct, result;
       
       oneHalf = new Fraction(2, 4);
       oneFourth = new Fraction(1, 4);

       
       System.out.println(oneHalf.add(oneFourth)); 
    }
}

