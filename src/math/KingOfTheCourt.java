package topc.math;

import java.util.*;
import java.io.*;

// SRM 222 Division I Level Three - 1000
// advanced math, simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3440&rd=5868
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm222
public class KingOfTheCourt {
  int N;
  int C;
  int[] skill;
  HashMap<String, Double> set;

  public double chancesOfWinning(int[] ability) {
    N = ability.length;
    C = 50;
    skill = ability;

    //System.out.println("");

    int[] def = new int[N];
    int[] pos = new int[N];
    for (int i = 0; i < N; i++) {
      pos[i] = i;
    }

    set = new HashMap<String, Double>();

    //return win(permToIndex(pos), 0, 0);
    return win(pos, 0, 0);
    //return winOld(pos, def, 1, 0);
  }


  double win(int[] pos, int def, int count) {

    //int[] pos = indexToPerm(posi, N);

    if (def == N - 1) { return pos[0] == 0 ? 1 : 0; }
    if (count > C) { return 0.0; }

    //String key = Arrays.toString(pos) + def + count;
    String key = Arrays.toString(pos) + def + count;
    //String key = Arrays.toString(pos) + (def > 0 ? count : def);

    if (set.containsKey(key)) { return set.get(key); }


    int k = pos[0];
    int p = pos[1];

    double pprob = (double)skill[p] / (skill[p] + skill[k]);
    pprob = pprob * pprob;
    double kprob = 1.0 - pprob;

    double prob = 0.0;
    prob += kprob * win(rot(pos, 1), def + 1, count);
    prob += pprob * win(rot(pos, 0), 0, count + 1);

    //prob += kprob * win(permToIndex(rot(pos, 1)), def + 1, count);
    //prob += pprob * win(permToIndex(rot(pos, 0)), 0, count + 1);

    //debug(pos, def, count, prob, key);

    if (count % 2 == 0) { set.put(key, prob); }
    return prob;
  }

  int[] indexToPerm(int j, int d) {
    if (d == 1)
      return new int[]{0};
    int f = 1;
    for (int i = 2; i < d; i++)
      f *= i;      
    int[] r = new int[d];
    r[0] = j / f;
    int[] t = indexToPerm(j % f, d - 1);
    for (int i = 0; i < t.length; i++)
      if (t[i] >= r[0]) t[i]++;
    System.arraycopy(t, 0, r, 1, t.length);
    return r;
  }

  int permToIndex(int[] p) {
    if (p.length == 2)
      return p[0];
    int f = 1;
    for (int i = 1; i < p.length; i++)
      f *= i;
    int[] r = new int[p.length - 1];
    System.arraycopy(p, 1, r, 0, p.length - 1);
    for (int i = 0; i < r.length; i++)
      if (r[i] > p[0]) r[i]--;
    return f * p[0] + permToIndex(r);
  }

  double winOld(int[] pos, int[] def, int wasKing, int count) {
    debug(pos, def, wasKing);

    if (def[0] == N - 1) { return 1.0; }

    for (int i = 1; i < N; i++) {
      if (def[i] == N - 1 && (wasKing >> i & 1) == 1) { 
        return 0.0; 
      }
    }

    if (count > 20) { return 0.0; }

    int k = pos[0];
    int p = pos[1];

    double pprob = (double)skill[p] / (skill[p] + skill[k]);
    pprob = pprob * pprob;

    double kprob = 1.0 - pprob;

    int[] pdef = def.clone();
    pdef[k] = 0;
    pdef[p] = wasKing >> p & 1;

    int[] kdef = def.clone();
    kdef[k]++;
    pdef[p] = 0;  // pdef[p] is always 0

    double prob = 0.0;
    prob += kprob * winOld(rot(pos, 1), kdef, wasKing, count + 1);
    prob += pprob * winOld(rot(pos, 0), pdef, wasKing | (1 << p), count + 1);

    return prob;
  }

  int[] rot(int[] input, int index) {
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
