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
        System.out.println(insertCommas(1000));
        System.out.println(insertCommas(999));
        System.out.println(insertCommas(2));
        System.out.println(insertCommas(2222222));
        System.out.println(insertCommas(436789));
        System.out.println(insertCommas(436789321));
        System.out.println(insertCommas(555000234));
    }
    
    static String insertCommas(int n){
        String x = Integer.toString(n); // Casts n to a string
        if (n < 0) { // Assures is not negative value
            return "Negative numbers don't have rights.";
        }
        if (n == 0) { // 
            return "000";
        } 
        else if (n < 1000) {
            return x;
        }
        // n%1000 (n/10)%10 (n/100)%10
        if (x.length() % 3 == 1){
            return x.substring(0, 1) + "," + insertCommas(Integer.valueOf(x.substring(1)));
        }
        else if (x.length() % 3 == 2){
            return x.substring(0, 2) + "," + insertCommas(Integer.valueOf(x.substring(2)));
        }
        else {
            return x.substring(0, 3) + "," + insertCommas(Integer.valueOf(x.substring(3)));
        }
    }
}
