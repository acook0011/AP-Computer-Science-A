package Chapter6.Ch6Prog1;


/**
 * Manage two fractions and how they interact with each other
 *
 * @aj
 * @cs6.3
 */
public class Fraction
{
    //Instance variables
   private int numerator1;              //Numerator in first fraction
   private int numerator2;              //Numerator in second fraction
   private int denominator1;            //Denominator in first fraction
   private int denominator2;            //Denominator in second fraction
 
   
    //Default Constructor
    
    public Fraction(){
       numerator1 = 0;
       numerator2 = 0;
       denominator1 = 0;
       denominator2 = 0;
    }
    
    //Additional Constructor to values provided
    public Fraction(int n1, int n2, int d1, int d2){
      numerator1 = n1;
      numerator2 = n2;
      denominator1 = d1;
      denominator2 = d2;
   }
   
   //Additional Constructor to match parameters
   public Fraction(Fraction f){
      numerator1 = f.numerator1;
      numerator2 = f.numerator2;
      denominator1 = f.denominator1;
      denominator2 = f.denominator2;
   }
   
   //Fraction Arithmetics
   
   //Establishing Fraction 1
   public String firstFraction(){
     int Num, Dem;
     String first;
     Num = numerator1;
     Dem = denominator1;
     first = (Num + "/" + Dem);
     return first;
    }
    
   //Establishing Fraction 2
   public String secondFraction(){
     int Num, Dem;
     String second;
     Num = numerator2;
     Dem = denominator2;
     second = (Num + "/" + Dem);
     return second;
    }
   
   //Addition
   public String addFraction(){
       int addNum, addDen;
       String addition;
       addNum = numerator1 * denominator2 + numerator2 * denominator1;
       addDen = denominator1 * denominator2;
       addition = (addNum + "/" + addDen);
       return addition;
    }
    
   //Subtraction
   public String subFraction(){
       int subNum, subDen;
       String subtraction;
       subNum = numerator1 * denominator2 - numerator2 * denominator1;
       subDen = denominator1 * denominator2;
       subtraction = (subNum + "/" + subDen);
       return subtraction;
    }
    
   //Multiplication
   public String multFraction(){
       int multNum, multDen;
       String multiplication;
       multNum = numerator1 * numerator2;
       multDen = denominator1 * denominator2;
       multiplication = (multNum + "/" + multDen);
       return multiplication;
    }
   
   //Division
   public String diviFraction(){
       int diviNum, diviDen;
       String division;
       diviNum = numerator1 * denominator2;
       diviDen = denominator1 * numerator2;
       division = (diviNum + "/" + diviDen);
       return division;
    }
    
   //Return String Representation
   public String toString(){
       String fct;
       fct = "Fraction #1:    " + firstFraction()  + "\n" + 
             "Fraction #2:    " + secondFraction() + "\n" +
             firstFraction() + " + " + secondFraction() + " = " + addFraction() + "\n" +  //Addition
             firstFraction() + " - " + secondFraction() + " = " + subFraction() + "\n" +  //Substraction
             firstFraction() + " * " + secondFraction() + " = " + multFraction() + "\n" + //Multiplication
             firstFraction() + " / " + secondFraction() + " = " + diviFraction();         //Division
      return fct;
    }
}
