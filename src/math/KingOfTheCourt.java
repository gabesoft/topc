package topc.math;

import java.util.*;
import java.io.*;

// SRM 222 Division I Level Three - 1000
// advanced math, simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3440&rd=5868
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm222
public class KingOfTheCourt {
  static public final int LIM = 100;
  int N;
  int[] skill;
  HashMap<String, Double> cache;

  public double chancesOfWinning(int[] ability) {
    N = ability.length;
    skill = ability;
    cache = new HashMap<String, Double>();

    int[] pos = new int[N];
    for (int i = 0; i < N; i++) { pos[i] = i; }

    return win(pos, 0);
  }


  double win(int[] pos, int lim) {
    if (lim > LIM) { return 0.0; }

    String key = Arrays.toString(pos) + lim;
    if (cache.containsKey(key)) { return cache.get(key); }

    int king = pos[0];
    int[] work = pos;

    double pking = 1.0;
    double prob = 0.0;
    for (int i = 1; i < N; i++) {
      int player = work[1];
      double pplayer = (double)skill[player] / (skill[player] + skill[king]);
      pplayer *= pplayer;

      prob += pking * pplayer * win(rotate(work, 0), lim + 1);
      pking *= (1.0 - pplayer);

      work = rotate(work, 1);
    }

    prob += king == 0 ? pking : 0.0;

    cache.put(key, prob);
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

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
