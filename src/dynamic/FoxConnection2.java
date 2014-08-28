package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 604 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12951&rd=15837
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+604
public class FoxConnection2 {
  public static final int MOD = 1000000007;
  public static final int MAX = 50;
  int n;
  int degree[];
  int g[][];
  int mem[][][];

  public int ways(int[] A, int[] B, int k) {
    n = A.length + 1;
    degree = new int[n];
    g = new int[MAX][MAX];
    dfsMakeTree(0, -1, A, B);

    mem = new int[MAX][MAX + 1][MAX];
    for (int i = 0; i < mem.length; i++) {
      for (int j = 0; j < mem[i].length; j++) {
        Arrays.fill(mem[i][j], -1);
      }
    }


    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += rootedWays(i, k, 0);
    }

    return (int)(sum % MOD);
  }

  private long rootedWays(int x, int k, int e) {
    if (mem[x][k][e] > -1) { return mem[x][k][e]; }

    long res = 0;
    if (k == 0) {
      res = 1;
    } else if (e == degree[x]) {
      res = (k == 1) ? 1 : 0;
    } else {
      for (int i = 0; i < k; i++) {
        long p = rootedWays(g[x][e], i, 0);
        long q = rootedWays(x, k - i, e + 1);
        res += (p * q) % MOD;
      }
    }

    res %= MOD;
    mem[x][k][e] = (int)res;

    return res;
  }

  private void dfsMakeTree(int x, int parent, int[] A, int[] B) {
    degree[x] = 0;
    for (int i = 0; i < n - 1; i++) {
      if (A[i] - 1 == x && parent != B[i] - 1) {
        g[x][degree[x]++] = B[i] - 1;
        dfsMakeTree(B[i] - 1, x, A, B);
      }
      if (B[i] - 1 == x && parent != A[i] - 1) {
        g[x][degree[x]++] = A[i] - 1;
        dfsMakeTree(A[i] - 1, x, A, B);
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
