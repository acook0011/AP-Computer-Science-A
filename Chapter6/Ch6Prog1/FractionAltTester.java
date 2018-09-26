package Chapter6.Ch6Prog1;


/**
 * Tester for 'FractionAlt'
 *
 * @aj
 * @cs6.3 tester
 */
public class FractionAltTester
{
   public static void main (String[] args){
       FractionAlt f1, f2, f3;
       String fct, result;
       
       //Order: n1, n2, d1, d2
       f1 = new FractionAlt(3, 4, 4, 2);
      result = f1.validateData();
      if (result == null)
      //   <print the fraction is valid>
         System.out.println("\nThe fraction is defined\n" + f1);
      else
         System.out.println(result);
       
       f2 = new FractionAlt(2, 1, 3, 5);
      result = f2.validateData();
      if (result == null)
      //   <print the fraction is valid>
         System.out.println("\nThe fraction is defined\n" + f2);
      else
         System.out.println(result);
         
       f3 = new FractionAlt(1, 1, 0, 4);
      result = f3.validateData();
      if (result == null)
      //   <print the fraction is valid>
         System.out.println("\nThe fraction is defined\n" + f3);
      else
         System.out.println(result);
    }
}
