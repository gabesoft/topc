package topc.easy;

import java.util.*;
import java.io.*;

// SRM 596 Division II Level Two - 500
// brute force, dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12837&rd=15708
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+596
public class ColorfulRoad {
  public static final int INF = 1000000;
  String R;
  char[] nextColor;
  
  public int getMin(String road) {
    R = road;
    nextColor = new char[26];
    nextColor['R' - 'A'] = 'G';
    nextColor['G' - 'A'] = 'B';
    nextColor['B' - 'A'] = 'R';
    int r = rec(0);
    return r == INF ? -1 : r;
  }

  private int rec(int pos) {
    if (pos == R.length() - 1) { return 0; }

    char next = nextColor[R.charAt(pos) - 'A'];
    int best  = INF;

    for (int i = pos + 1; i < R.length(); i++) {
      if (R.charAt(i) == next) {
        best = Math.min(best, (i - pos) * (i - pos) + rec(i));
      }
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
