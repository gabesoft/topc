package topc.dynamic;

import java.util.*;

// SRM 150 Div 1 : 500 (dynamic programming)
public class StripePainter {
  int[][][] data;

  public int minStrokes(String stripes) {
    int n = stripes.length();
    data = new int[n][n][256];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        Arrays.fill(data[i][j], -1);
      }
    }

    int res = solve(stripes, 0, n-1, '.');
    //debug("data", data);

    return res;
  }

  int solve(String input, int left, int right, char c) {
    debug("input", input, left, right, c, input.substring(left, right < left ? left : right));

    if (left > right) { return 0; }
    if (left == right) { return c == input.charAt(left) ? 0 : 1; }

    if (data[left][right][c] != -1) { 
      return data[left][right][c]; 
    }
    if (input.charAt(left) == c) {
      data[left][right][c] = solve(input, left + 1, right, c);
      return data[left][right][c]; 
    }

    int min = Integer.MAX_VALUE;
    for (int i = left; i < right + 1; i++) {
      min = Math.min(min, 1 + solve(input, left + 1, i, input.charAt(left)) + solve(input, i + 1, right, c));
    }
    data[left][right][c] = min;

    return data[left][right][c];
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
