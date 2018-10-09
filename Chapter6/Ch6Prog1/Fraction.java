package Chapter6.Ch6Prog1;


/**
 * Fraction class that performs arithmetic operations between fractions.
 *
 * @aj
 * @cs6.3
 */
public class Fraction
{
    //Instance variables
   private int numerator;              //Numerator in first fraction
   private int denominator;            //Denominator in first fraction
 
   
    //Default Constructor
    
    public Fraction(){
       numerator = 1;
       denominator = 1;
    }
    
    //Additional Constructor to values provided
    public Fraction(int n1,int d1){
      numerator = n1;
      denominator = d1;
   }
   
   //Additional Constructor to match parameters
   public Fraction(Fraction f){
      numerator = f.numerator;
      denominator = f.denominator;
   }
   
   //Other Methods
   
   //Get Numerator
   public int getNum(){
       return numerator;
    }
   
   //Get Denominator
   public int getDen(){
       return denominator;  
    }
    
   public Fraction add(Fraction f){
       Fraction sum = new Fraction(numerator * f.denominator + f.numerator * denominator, denominator*f.denominator);
       return sum;
    }
    
   public Fraction subtract(Fraction f){
       Fraction diff = new Fraction (numerator * f.denominator - f.numerator * denominator, denominator * f. denominator);
       return diff;
    }
    
   public Fraction multiply(Fraction f){
       Fraction prod = new Fraction (numerator * f.numerator, denominator * f.denominator);
       return prod;
    }
   
   public Fraction divide(Fraction f){
       Fraction quot = new Fraction (numerator * f.denominator, denominator * f.numerator);
       return quot;
    }
    
    public String toString(){
     String str;
     str = numerator + "/" + denominator;
     return str;
    }
}
