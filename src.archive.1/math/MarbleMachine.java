package topc.math;

import java.util.*;
import java.io.*;

// SRM 376 Division I Level Two - 500
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8045&rd=10796
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm376
public class MarbleMachine {
  static public final int G = 60; // action group size 

  public long maxMarbles(String[] layout, String[] actions, int t) {
    actions = extendActions(actions);

    long[][][] matrices = buildMatrices(layout, actions);

    int n  = matrices[0].length;
    int n1 = t / G;
    int n2 = t % G;

    long[][] composite = MMMatrix.unit(n);
    for (int i = 0; i < G; i++) {
      composite = MMMatrix.mul(matrices[i], composite);
    }

    long[][] m = MMMatrix.pow(composite, n1);
    for (int i = 0; i < n2; i++) {
      m = MMMatrix.mul(matrices[i], m);
    }

    long[][] v = new long[n][1];
    v[0][0] = 1;

    long[][] r = MMMatrix.mul(m, v);
    long max = 0;
    for (int i = 1; i < n; i++) {
      max = Math.max(max, r[i][0]);
    }

    return max;
  }

  long[][][] buildMatrices(String[] layout, String[] actions) {
    int r = layout.length;
    int c = layout[0].length();
    long[][][] matrices = new long[G][][];

    for (int i = 0; i < G; i++) {
      char[] moves = new char[1 + r * c];
      int count = 1;
      for (int j = 0; j < layout.length; j++) {
        String row = layout[j];
        for (int k = 0; k < row.length(); k++) {
          int pos = row.charAt(k) - '0';
          moves[count++] = actions[pos].charAt(i);
        }
      }

      matrices[i] = buildMatrix(moves, r, c);
    }

    return matrices;
  }

  long[][] buildMatrix(char[] moves, int r, int c) {
    int n = moves.length;
    long[][] matrix = new long[n][n];
    matrix[0][0] = 1;

    for (int i = 1; i < n; i++) {
      switch (moves[i]) {
        case 'D': break;
        case 'S': 
                  if (i + c < n) {
                    matrix[i + c][i] = 1;
                  }
                  break;
        case 'N': 
                  if (i - c > 0) {
                    matrix[i - c][i] = 1;
                  }
                  break;
        case 'E': 
                  if (i % c != 0) {
                    matrix[i + 1][i] = 1;
                  }
                  break;
        case 'W': 
                  if ((i - 1) % c != 0) {
                    matrix[i - 1][i] = 1;
                  }
                  break;
        default:
                  matrix[i][0] = moves[i] - '0';
                  matrix[i][i] = 1;
                  break;
      }
    }

    return matrix;
  }

  String[] extendActions(String[] actions) {
    for (int i = 0; i < actions.length; i++) {
      int len = actions[i].length();
      String action = actions[i];
      for (int j = 1; j < (G / len); j++) {
        actions[i] = actions[i] + action;
      }
    }
    return actions;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

class MMMatrix {
  public static long[][] pow(long[][] m, long k) {
    if (k == 0) { return unit(m.length); }
    if (k % 2 == 0) {
      return pow(mul(m, m), k / 2);
    } else {
      return mul(m, pow(m, k - 1));
    }
  }

  public static long[][] mul(long[][] a, long[][] b) {
    assert a[0].length == b.length : "invalid matrix dimensions";

    int n = a.length;
    int m = b[0].length;
    int u = b.length;
    long[][] c = new long[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        long sum = 0;
        for (int k = 0; k < u; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    return c;
  }

  public static long[][] unit(int n) {
    long[][] u = new long[n][n];
    for (int i = 0; i < n; i++) { u[i][i] = 1; }
    return u;
  }
}
