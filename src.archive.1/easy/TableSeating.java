package topc.easy;

import java.util.*;

// SRM 249 Div 1 : 350
public class TableSeating  {
  double[] probs;
  double[] seatings;
  int n;

  public double getExpected(int numTables, int[] probValues) {
    probs  = new double[probValues.length];
    for (int i = 0; i < probValues.length; i++) {
      probs[i] = (1.0 * probValues[i]) / 100;
    }
    n = numTables;
    seatings = new double[1 << n];
    Arrays.fill(seatings, -1.0);
    return solve(0);
  }

  double solve(int mask) {

    // return if the expected value for this seating has already been calculated
    if (seatings[mask] > -0.5) return seatings[mask]; 

    double ans = 0.0;

    // for all seatings with non-zero probability
    for (int i = 1; i <= probs.length; i++) {
      int umask = (1 << i) -  1;
      int count = 0;
      double expected = 0.0;

      // for all choices for the current party size
      for (int j = 0; j < n - i + 1; j++) {

        // only look at seatings that have tables occupied in different
        // positions than the current seating
        // and for the next seating to solve keep the tables of the original 
        // seating and add the tables of the current seating
        if ((mask & umask) == 0) {
          expected += solve(mask | umask);
          count++;
        }
        umask <<= 1;
      }
      if (count > 0) {
        ans += probs[i-1] * (i + expected / count);
      }
    }

    seatings[mask] = ans;
    return seatings[mask];
  }

  public int[] getBits(int n, int size) {
    int[] bits = new int[size];
    for (int i = 0; i < size; i++) {
      bits[size - i - 1] = n & 1;
      n >>= 1;
    }
    return bits;
  }
}
