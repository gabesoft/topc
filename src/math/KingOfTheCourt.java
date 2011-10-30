package topc.math;

import java.util.*;
import java.io.*;

// SRM 222 Division I Level Three - 1000
// advanced math, simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3440&rd=5868
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm222
public class KingOfTheCourt {
  static public final int LIM = 105;
  int N;
  int[] skill;
  double[][] memo;

  public double chancesOfWinning(int[] ability) {
    N = ability.length;
    skill = ability;
    memo = new double[fact(N)][LIM + 1];

    for (int i = 0; i < memo.length; i++) {
      Arrays.fill(memo[i], -1.0);
    }

    int[] pos = new int[N];
    for (int i = 0; i < N; i++) { pos[i] = i; }

    return win(permToIndex(pos), 0);
  }

  double win(int state, int lim) {
    if (lim > LIM - 1) { return 0.0; }
    if (memo[state][lim] > -1.0) { return memo[state][lim]; }

    int[] pos = indexToPerm(state, N);
    int king = pos[0];

    double pking = 1.0;
    double prob = 0.0;
    for (int i = 1; i < N; i++) {
      int player = pos[1];
      double pplayer = (double)skill[player] / (skill[player] + skill[king]);
      pplayer *= pplayer;

      prob += pking * pplayer * win(permToIndex(rotate(pos, 0)), lim + 1);
      pking *= (1.0 - pplayer);

      pos = rotate(pos, 1);
    }

    prob += king == 0 ? pking : 0.0;

    memo[state][lim] = prob;
    return prob;
  }

  int[] rotate(int[] input, int index) {
    int[] arr = input.clone();
    int last = arr[index];
    for (int i = index; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[input.length - 1] = last;
    return arr;
  }

  int[] indexToPerm(int j, int d) {
    if (d == 1) { return new int[]{0}; }

    int f = 1;
    for (int i = 2; i < d; i++) { f *= i; }

    int[] r = new int[d];
    r[0] = j / f;

    int[] t = indexToPerm(j % f, d - 1);
    for (int i = 0; i < t.length; i++) {
      if (t[i] >= r[0]) { t[i]++; }
    }

    System.arraycopy(t, 0, r, 1, t.length);
    return r;
  }

  int permToIndex(int[] p) {
    if (p.length == 2) { return p[0]; }

    int f = 1;
    for (int i = 1; i < p.length; i++) { f *= i; }

    int[] r = new int[p.length - 1];
    System.arraycopy(p, 1, r, 0, p.length - 1);

    for (int i = 0; i < r.length; i++) {
      if (r[i] > p[0]) { r[i]--; }
    }

    return f * p[0] + permToIndex(r);
  }

  int fact(int n) {
    if (n == 0) { return 1; }
    return n * fact(n - 1);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
