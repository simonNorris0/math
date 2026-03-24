/**
 *
 */
public class UnitCircle {

  protected class Point {
    protected double x; 
    protected double y;
    protected double angle; // radians
    protected String tupleString = "(cos(a): %f, sin(a): %f)  angle a: %f";

    public Point(double angle) {
      this.angle = angle;
      this.x = xCalc();
      this.y = yCalc();
    }

    public Point() {
      this.angle = 0;
      this.x = xCalc();
      this.y = yCalc();      
    }

    /**
     * cosine of the angle of the point drawn from origin
     */
    protected double xCalc() {
      return Math.cos(this.angle);
    }

    /**
     * sine of the angle of the point drawn from origin
     */
    protected double yCalc() {
      return Math.sin(this.angle);
    }

    @Override
    public String toString() {
      return String.format(tupleString, x, y, angle);
    }
  }

  private static final double PI = Math.PI;
  private static final double r = 1.0;

  public void standardAngles() {
    Point zeroDegrees = new Point(0);
    Point thirtyDegrees = new Point(PI/6);
    Point fortyfiveDegrees = new Point(PI/4);
    Point sixtyDegrees = new Point(PI/3);
    Point ninetyDegrees = new Point(PI/2);

    System.out.println("   0: " + zeroDegrees);
    System.out.println("PI/6: " + thirtyDegrees);
    System.out.println("PI/4: " + fortyfiveDegrees);
    System.out.println("PI/3: " + sixtyDegrees);
    System.out.println("PI/2: " + ninetyDegrees);
  }
}
