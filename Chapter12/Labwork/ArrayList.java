package Chapter12.Labwork;


/**
 * Write a description of class ArrayList here.
 *
 * @aj
 * @12.1
 */
public class ArrayList
{
    private Object[] array;
    private int logicalSize;
    
    public ArrayList(){
        array = new Object[5];
        logicalSize = 5;
    }
    
    public ArrayList(int size){
        array = new Object[size];
        logicalSize = size;
    }
    
    public ArrayList(Object[] a){
        array = a; //need to make new object to refer to new
        int i;
        for (i = 0; i < a.length; i++){
            array[i] = a[i];
        }
        logicalSize = i;
    }
}
