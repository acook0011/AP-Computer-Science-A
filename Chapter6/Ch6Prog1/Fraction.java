package Chapter6.Ch6Prog1;


/**
 * Write a description of class FractionB here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    
   public int add(Fraction f){
       int sum = (numerator * f.denominator + f.numerator * denominator);
       return sum;
    }
    
   public int subtract(Fraction f){
       return 0;
    }
    
   public int multiply(Fraction f){
       return 0;
    }
   
   public int divide(Fraction f){
       return 0;
    }
}
