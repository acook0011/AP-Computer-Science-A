package Chapter12.Labwork;


/**
 * Write a description of class ArrayList here.
 *
 * @aj
 * @12.1
 */
public class ArrayList
{
    // 12.1
    private Object[] array;
    private int logicalSize = 0;
    
    // Without arguments
    public ArrayList(){
        array = new Object[5];
        logicalSize = 0;
    }
    
    // With int arguments
    public ArrayList(int size){
        array = new Object[size];
        logicalSize = 0;
    }
    
    // With array of object argument
    public ArrayList(ArrayList[] a){
        array = new Object[a.length];
        for (int i = 0; i < a.length; i++){
            Object ar = a[i];
            if (ar != null){
                array[i] = ar;
                logicalSize++;
            } else{
                break;
            }
        }
    }
    
    public String toString(){
        String rep = "";
        for (int i = 0; i < array.length; i++){
           rep += "array[" + i + "]: " + array[i] + "\n";
        }
        return rep;
    }  
    
    // 12.2
    public int size(){
        return logicalSize;  
    }
    
    public Object get(int x) throws IndexOutOfBoundsException {
        if(x < 0 || x > logicalSize-1) throw new IndexOutOfBoundsException();
            return array[x];
    }
    
    // 12.3
    public Boolean add(int x, Object a){
        Boolean poss = false;
        if (array.length == logicalSize){
            return poss;
        }
        if (x < 0){
            x = 0;
        }
        if (x >= logicalSize){
            x = logicalSize;
        }
        for (int i = logicalSize; i > x; i--){
            array[i] = array[i - 1];
        }
        array[x] = a;
        logicalSize++;
        poss = true;
        return poss;
    }
    
    public Object remove(int x) throws IndexOutOfBoundsException {
        Object rem = null;
        if(x < 0 || x > logicalSize-1) throw new IndexOutOfBoundsException();
        rem = array[x];
        for (int i = x; i < logicalSize-1; i++){
            array[i] = array[i+1];
        }
        array[logicalSize-1] = null;
        logicalSize--;
        return rem;
    }
}
