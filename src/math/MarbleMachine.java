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

    return 0L;
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

      debug(i, "\t", moves);
      System.out.println("");
      matrices[i] = buildMatrix(moves, r, c);
      for (int j = 0; j < moves.length; j++) {
        debug(i, j, "\t", matrices[i][j]);
      }
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
                  if (i + r < n) {
                    matrix[i + r][i] = 1;
                  }
                  break;
        case 'N': 
                  if (i - r > 0) {
                    matrix[i - r][i] = 1;
                  }
                  break;
        case 'E': 
                  if (i % r != 0) {
                    matrix[i + 1][i] = 1;
                  }
                  break;
        case 'W': 
                  if ((i - 1) % r != 0) {
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

      debug(i, actions[i].length(), actions[i]);
    }

    return actions;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
