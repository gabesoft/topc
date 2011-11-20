package topc.dynamic;

import java.util.*;
import java.io.*;

// TCHS SRM 8 Division I Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/tc?module=HSProblemStatement&pm=6066&rd=10060
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class PendingTasks {
  public int latestProcess(int[] supertasks) {
    int n = supertasks.length;
    int[] maxt = new int[n];
    int[] rest = new int[n];

    for (int i = 1; i < n; i++) {
      int c1 = -1;
      int c2 = -1;
      int b1 =  0;
      int b2 =  0;

      for (int j = i - 1; j > -1; j--) {
        if (supertasks[j] != i) { continue; }
        int curr = maxt[j] + rest[j] + 1;
        if (b1 < curr) {
          b1 = curr;
          c1 = j;
        }
      }

      for (int j = i - 1; j > -1; j--) {
        if (supertasks[j] != i) { continue; }
        int curr = maxt[j] + 1;
        if (b2 < curr && j != c1) {
          b2 = curr;
          c2 = j;
        }
      }

      maxt[i] = b1 + b2;

      if (c2 == -1) { continue; }

      rest[i] = rest[c2];

      for (int j = i - 1; j > -1; j--) {
        if (supertasks[j] != i) { continue; }
        if (j != c1 && j != c2) {
          rest[i] += maxt[j] + rest[j] + 1;
        }
      }
    }

    //debug("n", n);
    //debug("maxt", maxt);
    //debug("rest", rest);

    //return maxt[n - 1];

    int[] T = new int[n]; // max tasks that can be run before task i
    int[] I = new int[n]; // max tasks that can be run before task i without activating i
    int[] A = new int[n]; // all tasks below i

    for (int i = 0; i < n; i++) {
      int[] sons = new int[n];
      int l = 0;
      int s = 0;

      for (int j = 0; j < i; j++) {
        if (supertasks[j] == i) { 
          sons[l++] = j;
          s += I[j];
          A[i] += A[j] + 1;
        }
      }

      if (l == 0) { continue; }
      if (l == 1) {
        T[i] = A[sons[0]] + 1;
        I[i] = A[sons[0]] + 1;
      } else {
        int c1 = -1;
        int c2 = -1;
        int best = 0;

        int bt = 0;
        int bi = 0;

        for (int j = 0; j < l; j++) {
          for (int k = j + 1; k < l; k++) {
            int s1 = sons[j];
            int s2 = sons[k];
            int r1  = A[s1] + 1 + T[s2] + 1 + (s - I[s1] - I[s2]);
            int r2  = A[s2] + 1 + T[s1] + 1 + (s - I[s1] - I[s2]);
            if (r1 > best) {
              best = r1;
              c1 = s1;
              c2 = s2;
            }
            if (r2 > best) {
              best = r2;
              c1 = s2;
              c2 = s1;
            }
          }
        }

        //debug(i, c1, c2, best);

        T[i] = best;

        best = 0;
        c1 = -1;
        c2 = -1;
        for (int j = 0; j < l; j++) {
          for (int k = j + 1; k < l; k++) {
            int s1 = sons[j];
            int s2 = sons[k];
            int r1  = A[s1] + 1 + I[s2] + (s - I[s1] - I[s2]);
            int r2  = A[s2] + 1 + I[s1] + (s - I[s1] - I[s2]);
            if (r1 > best) {
              best = r1;
              c1 = s1;
              c2 = s2;
            }
            if (r2 > best) {
              best = r2;
              c1 = s2;
              c2 = s1;
            }
          }
        }

        //I[i] = A[c1] + 1 + I[c2] + (s - I[c1] - I[c2]);
        I[i] = best;
      }



      // ----------------------------------------- OLD ALGO
      //int c1 = -1;
      //int c2 = -1;
      //int si =  0;

      //for (int j = i - 1; j > -1; j--) {
        //if (supertasks[j] == i && (c1 == -1 || A[c1] < A[j])) {
          //c1 = j;
        //}
      //}

      //for (int j = i - 1; j > -1; j--) {
        //if (supertasks[j] == i && c1 != j && (c2 == -1 || T[c2] < T[j])) {
          //c2 = j;
        //}
      //}

      //for (int j = i - 1; j > -1; j--) {
        //if (supertasks[j] == i) {
          //A[i] += A[j] + 1;
          //if (c1 != j && c2 != j) {
            //si += I[j];
          //}
        //}
      //}

      //debug(i, c1, c2, si);
      //if (c1 > -1) { debug(A[c1]); }
      //if (c2 > -1) { debug(T[c2]); }

      //T[i] = (c1 == -1 ? 0 : A[c1] + 1) + (c2 == -1 ? 0 : T[c2] + 1) + si;
      //I[i] = (c1 == -1 ? 0 : A[c1] + 1) + (c2 == -1 ? 0 : I[c2]) + si;
    }

    debug("T", T);
    debug("A", A);
    debug("I", I);

    return T[n - 1];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
