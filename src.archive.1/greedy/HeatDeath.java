package topc.greedy;

import java.util.*;
import java.io.*;

// TCO04 Round 4 Division I Level Two - 500
// greedy
// http://community.topcoder.com/stat?c=problem_statement&pm=2982&rd=5881
public class HeatDeath {
  public int maxTime(int[] energy) {
    Arrays.sort(energy);

    int n = energy.length;
    int time = 0;
    boolean done = false;

    while (!done) {
      done = true;

      for (int i = 1; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
          int a = j;
          int b = j + i;
          int dx = energy[b] - energy[a];
          if (dx > 1) {
            int amt = dx / 2;

            time += amt;
            energy[a] += amt;
            energy[b] -= amt;

            done = false;
            i = n;
            j = n;
          }
        }
      }
    }

    return time;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
