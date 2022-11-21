package geometry;

/**
 * Simple class representing a circle
 */
public class Circle {

   /** Radius */
   private double radius;
   /** Center coordinates */
   private Position center;

   /**
    * Initialize a circle with the specified radius and center coordinates
    * 
    * @param radius Initial radius
    * @param pos    Initial center specified as a position, is shared
    */
   public Circle(double radius, Position pos) {
        if (radius <=0) {
            String anomaly = "(" + radius + ", " + pos + ") is not valid : radius is negative or null";
            throw new IllegalArgumentException(anomaly);
        }
        if (pos == null) {
            String anomaly  = pos + " is not valid : center is null";
            throw new IllegalArgumentException(anomaly);
        }
      this.radius = radius;
      this.center = pos; // center shared
      // this.center = new Position(pos); // center duplicated
   }

   /**
    * Sets current circle center to the specified coordinates
    * 
    * @param xc Target center abscissa
    * @param yc Target center ordinate
    */
   public void moveTo(double xc, double yc) {
      this.center.moveTo(xc, yc); // delegate to Position's moveTo()
   }

   /**
    * Sets current circle center to the specified coordinates
    * 
    * @param pos Target center coordinates specified as a position
    */
   public void moveTo(Position pos) {
      this.center.moveTo(pos);
      // delegate to Position's moveTo() using current center
   }

   @Override
   public String toString() {
      return "radius = " + this.radius + " center = " + this.center.toString();
   }
}