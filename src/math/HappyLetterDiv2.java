package topc.math;

import java.util.*;
import java.io.*;

// SRM 627 Division II Level Two - 500
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13245&rd=16008
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+627
public class HappyLetterDiv2 {
  public char getHappyLetter(String letters) {
    int[] counts = new int[26];
    int n = letters.length();
    int m = 0;
    int j = -1;

    for (int i = 0; i < n; i++) {
      int c = letters.charAt(i) - 'a';
      counts[c]++;

      if (counts[c] > m) {
        m = counts[c];
        j = c;
      }
    }

    return m > (n - m) ? (char)(j + 'a') : '.';
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
