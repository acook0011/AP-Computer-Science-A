package Chapter6.Ch6Prog1;


/**
 * Write a description of class FractionB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FractionB
{
    //Instance variables
   private int numerator;              //Numerator in first fraction
   private int denominator;            //Denominator in first fraction
 
   
    //Default Constructor
    
    public FractionB(){
       numerator = 1;
       denominator = 1;
    }
    
    //Additional Constructor to values provided
    public FractionB(int n1,int d1){
      numerator = n1;
      denominator = d1;
   }
   
   //Additional Constructor to match parameters
   public FractionB(FractionB f){
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
    
   public int add(FractionB f){
       int sum = (numerator * f.denominator + f.numerator * denominator);
       return sum;
    }
    
   public int subtract(FractionB f){
       return 0;
    }
    
   public int multiply(FractionB f){
       return 0;
    }
   
   public int divide(FractionB f){
       return 0;
    }
}
