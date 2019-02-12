package Chapter11;

import TurtleGraphics.Pen;

public interface Shape {
   public double area();
   public double perimeter();
   public void   draw (Pen p);
   public double getXPos();
   public double getYPos();
   public void   move (double xLoc, double yLoc);
   public void   stretchBy (double factor);
   public String toString();
}

