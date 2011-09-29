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

    int avg = 0;
    for (int i = 0; i < n; i++) {
      avg += energy[i];
    }
    avg /= n;
    debug("avg", avg);

    while (!done) {
      int a = -1;
      int b = -1;
      int v = avg;
      int u = avg;
      //int min = 999;
      //

      debug("energy", energy);

      //Arrays.sort(energy);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int dx = (energy[i] + energy[j]) / 2;
          int dy = Math.abs(energy[i] - energy[j]);
          //debug(i, j, dy, dx);
          if (i != j && dy > 1) {
            if (a == -1 && b == -1) {
              a = i;
              b = j;
              v = energy[a] + (energy[a] > energy[b] ? -1 : 1);
              u = energy[b] + (energy[b] > energy[a] ? -1 : 1);
            }

            int p = dx;
            int q = (energy[i] + energy[j]) % 2 == 0 ? dx : dx + 1;
            int cur = Math.abs((avg - p) + (avg - q));
            int old = Math.abs((avg - v) + (avg - u));
            //int cur = Math.abs(avg - p) + Math.abs(avg - q);
            //int old = Math.abs(avg - v) + Math.abs(avg - u);
            if (cur > old) {
              debug("dx", dx, energy[i], energy[j], cur, old, p, q);
              a = i;
              b = j;
              v = p;
              u = q;
            }
          }
        }
      }


      if (a > -1 && b > -1) {
        debug(time, a, b, energy[a], "->", v, energy[b], "->", u, energy);
        time += Math.min(u, v) - Math.min(energy[a], energy[b]);
        energy[a] = v;
        energy[b] = u;
        //time += 1;
        //energy[a] += energy[a] > energy[b] ? -1 : 1;
        //energy[b] += energy[b] > energy[a] ? -1 : 1;
        a = -1;
        b = -1;
        //min = 999;
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
