/**
   Simon Norris
   
   Calculates the Nth harmonic number.
 **/
#include <stdio.h>
#include <stdlib.h> // for atoi(String arg) which converts a string
                    // to an integer. 

double nthHarmonic(int N)
{
  double hn = 0.0;
  for (int k = 1; k <= N; k++) {
    hn += 1 / (double)k;  // cast k for floating point division
  }
  return hn;
}

int main(int argc, char *argv[])
{
  if (argc != 2) {
    printf("usage: harm n\n");
    return 1;
  }
  else {
    int N = atoi(argv[1]);  // argv[0] is the program name
    double hn = nthHarmonic(N);
    printf("%f\n", hn);
    return 0;
  }
}
