package Chapter13.Labwork;


/**
 * Return the string with the characters in reverse order.
 *
 * @aj
 * @13.2
 */
public class ReverseWords
{
    public static void main(String [] args){
        System.out.println(reverse("Happy", 0));
        System.out.println(reverse("Happy", 2));
        System.out.println(reverse("January", 0));
        System.out.println(reverse("Cook", 0));
        System.out.println(reverse("vocabulary", 5));
        System.out.println(reverse("racecar", 0));
        System.out.println(reverse("failure", -2));
        System.out.println(reverse("cool beans", 99));
        System.out.println(reverse("I'm sorry Jim", 3));
    }
    
    static String reverse(String str, int index){
        if (index < 0){
            return "Index must be greater than 0.";
        }
        if (index >= str.length()){
            return "";
        }
        else{
            return reverse(str, index+1) + str.substring(index,index+1);
        }
        // The instructions were confusing, so I assumed the index
        // is where it wants to start reversing the string
        // and ignores all the characters before it.
    }
}
