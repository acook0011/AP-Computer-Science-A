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
        System.out.println(reverse("Happy", 0));         // Tests normal reversal
        System.out.println(reverse("Happy", 2));         // Tests index greater than 0
        System.out.println(reverse("January", 0));       // Tests normal reversal
        System.out.println(reverse("Cook", 0));          // Tests normal reversal
        System.out.println(reverse("vocabulary", 5));    // Tests index greater than 0
        System.out.println(reverse("racecar", 0));       // Tests if racecar doesn't change
        System.out.println(reverse("failure", -2));      // Tests index less than 0
        System.out.println(reverse("cool beans", 99));   // Tests when index too big
        System.out.println(reverse("I'm sorry Jim", 3)); // Tests index greater than 0
        System.out.println(reverse("Avery", 5));         // Tests when index too big
    }
    
    static String reverse(String str, int index){
        if (index < 0) { // Error message when index is less than 0
            return "Index must be greater than or equal to 0.";
        }
        if (index >= str.length()) { // Constant to end recursion/When index too large
            return "";
        }
        else{ // Reversal 
            return reverse(str, index+1) + str.substring(index,index+1);
        }
        // The instructions were confusing, so I assumed the index
        // is where it wants to start reversing the string
        // and ignores all the characters before it.
        // This also means that if the initial index is greater than 
        // str.length(), nothing will be printed.
    }
}
