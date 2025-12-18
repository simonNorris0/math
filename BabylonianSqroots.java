/** Babylonian Square Root Procedure
*   From A History of Mathematics by Uta C Merzbach and Carl B Boyer (3rd ed).
*   @author Simon Norris
*   "This procedure is often ascribed to later men. It is sometimes attributed 
*    to the Greek scholar Archytas (428 - 365 BCE) or to Heron of Alexandria 
*    (ca. 100 CE); ocassionaly, one finds it called Newton's algorithm. This 
*    Babylonian procedure is as simple as it is effective.
*    Let x = sqroot(a) be the root desired, and let a1 be a first 
*    approximation to this root; let a second approximation be found from 
*    b1 = a / a1. If a1 is too small, then b1 is too large, and vice versa. 
*    Hence, the arithmetic mean, a2 = (0.5)(a1 + b1), is a plausible next 
*    approximation."
*    This procedure can be repeated indefinitely, moving between too small
*    and too large approximations to an ever closer approximation. 
*
*    TO-DO: 
*     increase printed precision of estimate
*/
public class BabylonianSqroots {
	
  public static void main(String[] args) {
	int i = 0;		 // number of iterations to run
    double x = 0.0;  // number to estimate square root of
	double a = 0.0;  // arithmetic estimate
	double g = 0.0;  // geometric estimate
	double r = 0.0;  // result
	if(args.length!=3) {
      System.out.println("enter exactly 3 command line args: ");
	  System.out.println("1st: a number to estimate the square root of (x)");
	  System.out.println("2nd: the initial estimate (a1)");
	  System.out.println("3rd: the number of iterations to run for estimate");
	  return;
    } else {
      x = Double.parseDouble(args[0]);
	  a = Double.parseDouble(args[1]);
	  i = Integer.parseInt(args[2]);
    }
	for (int j = 0; j < i; j++) {
	  g = x / a;          // b = a / a1
      a = 0.5 * (a + g);  // a2 = (0.5)(a1 + b)
	  r = a;
	}
	System.out.format("the Babylonian approximation of sqrt(%f) " +
      "after %d iterations is: %f%n", x, i, r);
    return;
  }
}
