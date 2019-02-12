package Chapter11;

import TurtleGraphics.Pen;
/**
 * This class extends AbstractShape and in the process implements
 * the Shape interface.
 *
 * *Incomplete / Not-working*
 *
 * @aj
 * @11.4
 */
public class Triangle extends AbstractShape
{
    private double height, width;

   public Triangle() {
      super();
      height = 1;
      width = 1;
   }

   public Triangle(double xLoc, double yLoc, double w, double h) {
      super(xLoc, yLoc);
      height = h;
      width = w;
   }
 
   public double area() {
      return 1/2 * height * width;
   }
   
   public double perimeter() {
       return width + height + Math.sqrt(width*width + height*height);
   }

   public void draw (Pen p) {
      p.up();
      p.move (xPos, yPos);
      p.down();
      p.setDirection (0); p.move (width);
      p.turn (-90); p.move (height);
      p.turn (-90); p.move (width);
      p.turn (-90); p.move (height);
   }

   public void stretchBy (double factor) {
      height *= factor;
      width *= factor;
   }

   public String toString() {
      String str = "TRIANGLE\n"
                 + "Base & Height: " + width + " & " + height +"\n"
                 + super.toString();
      return str;
   }
}
