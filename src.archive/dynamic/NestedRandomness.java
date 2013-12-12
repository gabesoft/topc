package topc.dynamic;

import java.util.*;
import java.io.*;

// TCCC05 Qual 5 Division I Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3510&rd=6527
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tccc05_qual_5
public class NestedRandomness {
  int T;
  double[][] data;

  public double probability(int N, int nestings, int target) {
    T = target;
    data = new double[N + 1][nestings + 1];
    return prob(N, nestings);
  }

  double prob(int N, int nestings) {
    assert nestings > 0 : "0 nestings";
    if (nestings == 1) { return 1.0 / N; }
    if (data[N][nestings] > 0.0) { return data[N][nestings]; }

    double sum = 0.0;
    for (int i = T + 1; i < N; i++) {
      sum += prob(i, nestings - 1);
    }

    data[N][nestings] = (1.0 / N) * sum;
    return data[N][nestings];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
