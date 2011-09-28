package topc.greedy;

import java.util.*;
import java.io.*;

// TCO04 Round 4 Division I Level Two - 500
// greedy
// http://community.topcoder.com/stat?c=problem_statement&pm=2982&rd=5881
public class HeatDeath {
  public int maxTime(int[] energy) {
    int n = energy.length;
    int time = 0;
    boolean done = false;

    while (!done) {
      int a = -1;
      int b = -1;
      int min = 999;

      Arrays.sort(energy);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int dx = Math.abs(energy[i] - energy[j]);
          if (i != j && dx > 1) {
            if (min >= dx) {
              min = dx;
              a = i;
              b = j;
            }
          }
        }
      }

      if (a > -1 && b > -1) {
        time += 1;
        energy[a] += energy[a] > energy[b] ? -1 : 1;
        energy[b] += energy[b] > energy[a] ? -1 : 1;
        a = -1;
        b = -1;
        min = 999;
      } else {
        done = true;
      }
    }

    return time;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
