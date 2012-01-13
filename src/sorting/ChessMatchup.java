package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 371 Division I Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7726&rd=10787
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm371
public class ChessMatchup {
  int[] us;
  int[] them;
  int[][] memo;

  public int maximumScore(int[] us, int[] them) {
    Arrays.sort(us);
    Arrays.sort(them);

    int n = us.length;
    this.us = us;
    this.them = them;
    this.memo = new int[n][n];

    for (int i = 0; i < n; i++) {
      Arrays.fill(memo[i], -1);
    }

    int s1 = getScoreByWeightMatch();
    int s2 = getScore(n - 1, n - 1);

    assert s1 == s2 : "score mismatch";
    return s2;
  }

  int getScore(int i, int j) {
    if (i < 0 || j < 0) { return 0; }
    if (memo[i][j] > -1) { return memo[i][j]; }

    if (us[i] < them[j]) {
      memo[i][j] = getScore(i, j - 1);
    }
    else if (us[i] == them[j]) {
      memo[i][j] = Math.max(getScore(i - 1, j - 1) + 1, getScore(i, j - 1));
    } else {
      memo[i][j] = getScore(i - 1, j - 1) + 2;
    }

    return memo[i][j];
  }

  int getScoreByWeightMatch() {
    int n = us.length;
    int[][] cost = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (us[i] == them[j]) { cost[i][j] = 1; }
        if (us[i] > them[j]) { cost[i][j] = 2; }
      }
    }

    Hungarian algo = new Hungarian(cost);
    return algo.maxWeightMatch();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

class Hungarian {
  int n;
  int[][] cost;
  int[] lx;       // x labels
  int[] ly;       // y labels
  int[] xmatch;   // xmatch[x] = vertex matched with x
  int[] ymatch;   // ymatch[y] = vertex matched with y
  int[] parent;   // used for storing alternating paths
  int[] slack ;
  int[] slackx;   // l(slackx[y]) + l(y) - w(slackx[y], y) = slack[y]
  boolean[] S;
  boolean[] T;
  int maxMatch;

  public Hungarian(int[][] cost) {
    this.n = cost.length;
    this.cost = cost;
  }

  public int maxWeightMatch() {
    initMatch();
    initLabels();
    augment();

    int match = 0;
    for (int i = 0; i < n; i++) {
      match += cost[i][xmatch[i]];
    }
    
    return match;
  }

  void augment() {
    if (maxMatch == n) { return; }

    int root  = -1;
    int[] q   = new int[n];
    int qw    = 0;   // queue write
    int qr    = 0;   // queue read

    S      = new boolean[n];
    T      = new boolean[n];
    parent = new int[n];

    Arrays.fill(parent, -1);

    for (int x = 0; x < n; x++) {
      if (xmatch[x] == -1) {
        root      = x;
        q[qw++]   = x;
        parent[x] = -2;
        S[x]      = true;
        break;
      }
    }

    initSlack(root);

    int x = -1;
    int y = -1;
    while (true) {
      while (qr < qw) {
        x = q[qr++];

        for(y = 0; y < n; y++) {
          if (cost[x][y] == lx[x] + ly[y] && !T[y]) {
            if (ymatch[y] == -1) { break; }
            T[y] = true;
            q[qw++] = ymatch[y];
            addToTree(ymatch[y], x);
          }
        }

        if (y < n) { break; }
      }

      if (y < n) { break; }

      updateLabels();
      qw = 0;
      qr = 0;

      for(y = 0; y < n; y++) {
        if (!T[y] && slack[y] == 0) {
          if (ymatch[y] == -1) {
            x = slackx[y];
            break;
          } else {
            T[y] = true;
            if (!S[ymatch[y]]) {
              q[qw++] = ymatch[y];
              addToTree(ymatch[y], slackx[y]);
            }
          }
        }
      }

      if (y < n) { break; }
    }

    if (y < n) {
      maxMatch++;
      for (int cx = x, cy = y, ty = 0; cx != -2; cx = parent[cx], cy = ty) {
        ty = xmatch[cx];
        ymatch[cy] = cx;
        xmatch[cx] = cy;
      }
      augment();
    }
  }

  void addToTree(int x, int parentx) {
    S[x] = true;
    parent[x] = parentx;
    for (int y = 0; y < n; y++) {
      if (lx[x] + ly[y] - cost[x][y] < slack[y]) {
        slack[y]  = lx[x] + ly[y] - cost[x][y];
        slackx[y] = x;
      }
    }
  }

  void updateLabels() {
    int delta = Integer.MAX_VALUE;
    for (int y = 0; y < n; y++) {
      if (!T[y]) { delta = Math.min(delta, slack[y]); }
    }
    for (int x = 0; x < n; x++) {
      if (S[x]) { lx[x] -= delta; }
    }
    for (int y = 0; y < n; y++) {
      if (T[y]) { ly[y] += delta; }
    }
    for (int y = 0; y < n; y++) {
      if (!T[y]) { slack[y] -= delta; }
    }
  }

  void initSlack(int root) {
    slack  = new int[n];
    slackx = new int[n];

    for (int y = 0; y < n; y++) {
      slack[y]  = lx[root] + ly[y] - cost[root][y];
      slackx[y] = root;
    }
  }

  void initLabels() {
    lx = new int[n];
    ly = new int[n];

    // initial labeling:
    // l(x) = max(w(x, y))
    // l(y) = 0
    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {
        lx[x] = Math.max(lx[x], cost[x][y]);
      }
    }
  }

  void initMatch() {
    xmatch = new int[n];
    ymatch = new int[n];
    maxMatch = 0;

    Arrays.fill(xmatch, -1);
    Arrays.fill(ymatch, -1);
  }

  void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
