package Chapter6.Ch6Prog1;

/**
 * Tester for 'Fraction'
 *
 * @aj
 * @cs6.3 tester
 */

public class FractionBTester
{
   public static void main (String[] args){
       FractionB oneHalf, oneFourth, oneTenth;
       String fct, result;
       
       oneHalf = new FractionB(2, 4);
       oneFourth = new FractionB(1, 4);

       
       System.out.println(oneHalf.add(oneFourth)); 
    }
}

