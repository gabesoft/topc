package topc.dynamic;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 179 Division I Level Three - 850
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1358&rd=4715
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm179
public class AntiMatter {
  public String unstable(int[] xform) {
    //double[][] a = new double[10000][10000];

    boolean[] dist = new boolean[20001];

    dist[0] = true;

    boolean change = true;
    while (change) {
      change = false;
    //for( int l = 0; l < 200; l++) {
      for (int k = 0; k < 20001; k++) {
        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
            int delta = Math.abs(xform[i] - xform[j]);
            if (dist[k] && (k + delta) < 20001) {
              change |= !dist[k + delta];
              dist[k + delta] = true;
            }
            if (dist[k] && (k - delta) > -1) {
              change |= !dist[k - delta];
              dist[k - delta] = true;
            }
          }
        }
      }
    //}
    }

    //for (int i = 0; i < 10000; i++) {
      //if(dist[i]) { debug(i); }
    //}

    long res = 0;
    for (int i = -4999; i < 5001; i++) {
      for (int j = -4999; j < 5001; j++) {
        if (dist[Math.abs(i - j)]) { res++; } 
      }
    }

    debug(res);
    DecimalFormat formatter = new DecimalFormat("#.00000000");
    double val = res / 100000000.0;
    //String ans = String.format("%.8g", val);
    return formatter.format(val);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
