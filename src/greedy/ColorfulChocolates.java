package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 551 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12137&rd=15173
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+551
public class ColorfulChocolates {
  public int maximumSpread(String chocolates, int maxSwaps) {
    char[] chars = chocolates.toCharArray();
    int best = 0;

    for (int i = 0; i < chars.length; i++) {
      for (int j = 0; j < chars.length; j++) {
        char color = chars[i];
        int cost   = 0;
        int spread = 0;
        int k      = i;
        int l      = j;

        while (k < chars.length && l < chars.length) {
          if (cost + Math.abs(k - l) > maxSwaps) {
            break;
          }

          spread++;
          cost += Math.abs(k - l);
          k += 1;
          while (k < chars.length && chars[k] != color) {
            k++;
          }
          l += 1;
        }

        best = Math.max(best, spread);
      }
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
