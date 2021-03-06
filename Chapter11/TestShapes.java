package Chapter11;

// Example 11.5: Making one shape from another

public class TestShapes {

   public static void main (String[] args){
      Rect rect;
      Shape shape1, shape2, shape3, shape4;
      
      rect = new Rect (1,1,4,6);
      shape1 = makeOneShapeFromAnother (rect, "circle");
      shape2 = makeOneShapeFromAnother (rect, "rectangle");
      shape3 = makeOneShapeFromAnother (rect, "wheel");
      shape4 = makeOneShapeFromAnother (rect, "triangle");
       
      System.out.println ("\nRectangle Area: " + rect.area() +
                          "\nCircle    Area: " + shape1.area() +
                          "\nRectangle Area: " + shape2.area() +
                          "\nWheel     Area: " + shape3.area() +
                          "\nTriangle  Area: " + shape4.area());
      System.out.println ("\nRectangle Perimeter:     " + rect.perimeter() +
                          "\nCircle    Circumference: " + shape1.perimeter() +
                          "\nRectangle Perimeter:     " + shape2.perimeter() +
                          "\nWheel     Circumference: " + shape3.perimeter());
   }
   
   static private Shape makeOneShapeFromAnother (Shape inShape, String type){
   Shape outShape;                                  // declare outShape
   double area, radius, width, height;
   double x = inShape.getXPos();
   double y = inShape.getYPos();

   area = inShape.area();
   if (type.equals ("circle")){
      radius = Math.sqrt (area / Math.PI);
      outShape = new Circle (x, y, radius);         // assign a circle
   }
   else if (type.equals ("rectangle")){
      width = height = Math.sqrt (area);
      outShape = new Rect (x, y, width, height);    // assign a rectangle
   }
   else if (type.equals ("triangle")){
       width = height = Math.sqrt (area);
       outShape = new Triangle (x, y, width, height); // assign a triangle
   }
   else{ // it is a wheel
      radius = Math.sqrt (area / Math.PI);
      outShape = new Wheel (x, y, radius, 6);       // assign a wheel
   }
   return outShape;
}

}
