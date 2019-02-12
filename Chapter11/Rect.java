package Chapter11;

// No additional comments are needed in this class. All the important
// points have already been made.

import TurtleGraphics.Pen;

public class Rect extends AbstractShape {

   private double height, width;

   public Rect() {
      super();
      height = 1;
      width = 1;
   }

   public Rect (double xLoc, double yLoc, double h, double w) {
      super (xLoc, yLoc);
      height = h;
      width = w;
   }
 
   public double area() {
      return width * height;
   }
   
   public double perimeter() {
       return (width * 2) + (height * 2); 
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
      String str = "RECTANGLE\n"
                 + "Width & Height: " + width + " & " + height +"\n"
                 + super.toString();
      return str;
   }
}

