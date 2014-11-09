package topc.easy;

import java.util.*;
import java.io.*;

// SRM 603 Division II Level Three - 950
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12908&rd=15836
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+603
public class GraphWalkWithProbabilities {
  public static final int MAX_TURNS = 3000;

  public double findprob(String[] graph, int[] winprob, int[] looseprob, int start) {
    double[][] prob = new double[50][MAX_TURNS];
    int n = graph.length;

    for (int k = 1; k < MAX_TURNS; k++) {
      for (int i = 0; i < n; i++) {
        prob[i][k] = 0.0;

        for (int j = 0; j < n; j++) {
          if (graph[i].charAt(j) == '1') {
            double q = winprob[j] / 100.0 + prob[j][k - 1] * (100 - winprob[j] - looseprob[j]) / 100.0;
            prob[i][k] = Math.max(prob[i][k], q);
          }
        }
      }
    }

    return prob[start][MAX_TURNS - 1];
  }
}
