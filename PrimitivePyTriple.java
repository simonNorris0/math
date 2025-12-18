/** @author Simon Norris
 *  A "Pythagorean Triple" is a set of positive integers a, b, and c that 
 *  fits the following rule:
 *  a*a + b*b = c*c
 *  
 *  A primitive Pythagorean Triple has the additional property that 
 *  a, b, and c share no common factors.  
 *
 *  If all three integers share no GCD greater than 1, then they have 
 *  no common factors. 
 *
 *  Tests three positive integers, a, b, and c entered as command-line 
 *  arguments to see if they form a primitive Pythagorean Triple.
 */
public class PrimitivePyTriple {
  private static int a;
  private static int b;
  private static int c;

  /** protected static int gcd(int x, int y)
   *  Euclid's Algorithm.
   *  Determines the gcd of x and y by division. 
   */
  protected static int gcd(int x, int y) {
    int remainder = 0;
    while(y != 0) {
	  remainder = x % y;
	  x = y;
      y = remainder;
    }
    return x;
  }
  
  public static void main(String[] args) {
	if(args.length != 3) {
	  System.out.println("enter exactly 3 args, a, b, c to test if " +
		"they form a primitive Pythagorean Triple.");
	  return;
	}
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	c = Integer.parseInt(args[2]);
	if(a*a + b*b == c*c &&
	  gcd(a, b) < 2 &&
	  gcd(a, c) < 2 && 
	  gcd(b, c) < 2 ) {
	  System.out.format("(%d, %d, %d) is a primitive Pythagorean triple.%n", 
		a, b, c);
	} else {
	  System.out.format("(%d, %d, %d) is not a primitive Pythagorean triple.%n", 
		a, b, c);
	}
  }
}
