package topc.search;

import java.util.*;
import java.io.*;

// SRM 515 Division II Level Three - 1000
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11510&rd=14540
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+515
public class NewItemShopTwo {
    int H = 24;
    int C = 20;
    int[][] time;
    int[][] cost;
    double[][] prob;

  public double getMaximum(String[] customers) {
    time = new int[2][C];
    cost = new int[2][C];
    prob = new double[2][C];

    for (int i = 0; i < customers.length; i++) {
      Arrays.fill(prob[i], -1);
      String[] customer = customers[i].split("\\s+");
      for (int j = 0; j < customer.length; j++) {
        String[] parts = customer[j].split(",");
        time[i][j] = Integer.parseInt(parts[0]);
        cost[i][j] = Integer.parseInt(parts[1]);
        prob[i][j] = Integer.parseInt(parts[2]) / 100.0;
      }
    }

    double exp  = 0.0;
    double[] p  = new double[2];
    int[] t     = new int[2];

    Arrays.fill(p, 1.0);

    for (int h = 0; h < H; h++) {
      for (int c = 0; c < customers.length; c++) {
        int o = (c + 1) & 1;
        if (time[c][t[c]] == h) {
          exp += (prob[c][t[c]] / p[c]) * p[c] * p[o] * Math.max(cost[c][t[c]], getExpected(o, t[o]));
          p[c] -= prob[c][t[c]];
          t[c] += 1;
        }
      }
    }

    return exp;
  }

  double getExpected(int customer, int index) {
    double p = 1.0;
    for (int i = 0; i < index; i++) {
      p -= prob[customer][i];
    }
    double exp = 0.0;
    for (int i = index; prob[customer][i] > -1; i++) {
      exp += (prob[customer][i] / p) * cost[customer][i];
    }
    return exp;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
