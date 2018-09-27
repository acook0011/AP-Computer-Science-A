package Chapter6.Ch6Prog1;


/**
 * Tester for "Dice"
 *         
 * @aj
 * @cs6.4 tester
 */

public class DiceTester
{
    public static void main(String[] args)
    {
        Dice rndm = new Dice();
    
        for(int i = 0; i < 10; i++){
            System.out.println("The output for roll " + (i+1) + " is " + rndm.getNumDots());
            rndm.roll();
        }
    }
}
