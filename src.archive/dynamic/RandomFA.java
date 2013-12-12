package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division I Level Two - 500
// dynamic programming, graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2287&rd=4710
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm178
public class RandomFA {
  int N;      // state count
  int F;      // final state
  int L;      // max length
  int count;
  double total;
  double[][][] prob;

  public double getProbability(String[] rulesa, String[] rulesb, String[] rulesc, int finalState, int maxLength) {
    N = rulesa.length;
    F = finalState == 999 ? N : finalState;
    L = maxLength;
    prob = new double[3][N + 1][N + 1];
    total = 0;
    count = 0;

    for (int i = 0; i < N; i++) {
      read(prob[0][i], rulesa[i]);
      read(prob[1][i], rulesb[i]);
      read(prob[2][i], rulesc[i]);
    }

    double[] work = new double[N + 1];
    work[0] = 1.0;
    rec(0, work);

    return total / count;
  }

  void rec(int length, double[] work) {
    count++;
    total += work[F];

    if (length == L) { return; }

    for (int i = 0; i < 3; i++) {
      double[] curr = new double[N + 1];
      curr[N] = work[N];

      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N + 1; k++) {
          curr[k] += work[j] * prob[i][j][k];
        }
      }

      rec(length + 1, curr);
    }
  }

  void read(double[] prob, String rules) {
    String[] tokens = rules.split("\\s+");
    double plast = 1.0;
    for (int i = 0; i < tokens.length; i++) {
      if (tokens[i].length() == 0) { continue; }
      String[] split = tokens[i].split(":");
      int state = Integer.parseInt(split[0]);
      double p = Double.parseDouble(split[1]) / 100.0;
      plast -= p;
      prob[state] = p;
    }
    prob[prob.length - 1] = plast;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
