/** @author Simon Norris
 *  A "Pythagorean Triple" is a set of positive integers a, b, and c that 
 *  fits the following rule:
 *  a*a + b*b = c*c
 *  
 *  Tests three positive integers, a, b, and c entered as command-line 
 *  arguments to see if they form a Pythagorean Triple.
 */
public class PythagoreanTriple {
  private static int a;
  private static int b;
  private static int c;

  public static void main(String[] args) {
	if(args.length != 3) {
	  System.out.println("enter exactly 3 args, a, b, c to test if " +
		"they form a Pythagorean Triple.");
	  return;
	}
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	c = Integer.parseInt(args[2]);
	if(a*a + b*b == c*c) {
	  System.out.format("(%d, %d, %d) is a Pythagorean triple.%n", a, b, c);
	} else {
	  System.out.format("(%d, %d, %d) is not a Pythagorean triple.%n", a, b, c);
	}
  }
}
