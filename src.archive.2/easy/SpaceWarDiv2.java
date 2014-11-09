package topc.easy;

import java.util.*;
import java.io.*;

// SRM 582 Division II Level Two - 500
// brute force, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12605&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class SpaceWarDiv2 {
  public static final int INF = 1 << 30;
  public int minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, int[] enemyCount) {
    int n = magicalGirlStrength.length;
    int ec = 0;
    for (int i = 0; i < enemyCount.length; i++) {
      ec += enemyCount[i];
    }

    int enemies[] = new int[ec];
    int k = 0;

    for (int i = 0; i < enemyStrength.length; i++) {
      for (int j = 0; j < enemyCount[i]; j++) {
        enemies[k++] = enemyStrength[i];
      }
    }

    Arrays.sort(magicalGirlStrength);
    Arrays.sort(enemies);

    if (magicalGirlStrength[n - 1] < enemies[ec - 1]) { return -1; }

    int F = 0;
    int e = 0;
    for (int g = 0; g < n; g++) {
      int f = 0;
      int max = getMax(ec - e, n - g);
      while ((f < max || g == n - 1) && e < ec) {
        if (enemies[e] <= magicalGirlStrength[g]) {
          e++;
          f++;
        } else {
          break;
        }
      }

      F = Math.max(F, f);
    }

    return F;
  }

  private int getMax(int e, int g) {
    return e / g + (e % g == 0 ? 0 : 1);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
