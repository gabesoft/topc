package topc.easy;

import java.util.*;
import java.io.*;

// SRM 595 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12823&rd=15707
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+595
public class LittleElephantAndIntervalsDiv2 {
  public int getNumber(int M, int[] L, int[] R) {
    int B[] = new int[M];

    for (int i = 0; i < L.length; i++) {
      for (int j = L[i] - 1; j <= R[i] - 1; j++) {
        B[j] = i + 1;
      }
    }

    HashSet<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < B.length; i++) {
      if (B[i] != 0) {
        set.add(B[i]);
      }
    }

    return 1 << set.size();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
