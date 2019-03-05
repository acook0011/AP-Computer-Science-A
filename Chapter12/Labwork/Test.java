package Chapter12.Labwork;


/**
 * Tester for ArrayList
 *
 * @aj
 * @12.1
 */
public class Test{
   public static void main(String[]args){
      ArrayList list = new ArrayList();

      System.out.print("Adding: ");
      for (int i = 0; i < 6; i++){
         if (list.add(i, "String" + i))
            System.out.println("added " + list);
         else
            System.out.println("did not add: String" + i);
        }
      System.out.println("List size: " + list.size());
      System.out.println("List objects:\n" + list);
      System.out.println("Removing: " + list.remove(2));
      System.out.println("List objects:\n" + list);
      System.out.println("Adding: " + list.add(2, "String2"));
      System.out.println("List objects:\n" + list);
      int i = 0;
      while (list.size() > 0)
          System.out.println("Removing: " + list.remove(i));
      System.out.println(list.remove(0));
    }
}
