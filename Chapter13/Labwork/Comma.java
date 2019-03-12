package Chapter13.Labwork;


/**
 * Insert commas into an integer
 *
 * @aj
 * @13.3
 */
public class Comma
{
    public static void main(String [] args){
        System.out.println(insertComma(1000));
        System.out.println(insertComma(10020));
        System.out.println(insertComma(100020));
        System.out.println(insertComma(1000020));
        System.out.println(insertComma(999));
        System.out.println(insertComma(2));
        System.out.println(insertComma(2222222));
        System.out.println(insertComma(7773453));
        System.out.println(insertComma(436789));
        System.out.println(insertComma(436789321));
        System.out.println(insertComma(400009700));
        System.out.println(insertComma(555100234));
    }
    
    static String insertComma(int n){
        String x = Integer.toString(n);
        if (n < 0) {
            return "Negative numbers don't have rights.";
        }
        if (n < 1000) {
            return Integer.toString(n);
        }
        if (n % 1000 == 0) {
            return insertComma(n/1000) + ",000";
        }
        if ((n/10) % 10 == 0) {
            return insertComma(n/1000) + ",00" + Integer.toString(n%10);
        }
        if ((n/100) % 10 == 0) {
            return insertComma(n/1000) + ",0" + Integer.toString(n%100);
        }
        return insertComma(n/1000) + "," + Integer.toString(n%1000);
    }
}
