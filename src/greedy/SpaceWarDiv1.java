package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 582 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12604&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class SpaceWarDiv1 {
  public long minimalFatigue(int[] strength, int[] enemyStrength, long[] enemyCount) {
    Enemy[] enemies = new Enemy[enemyStrength.length];
    for (int i = 0; i < enemyStrength.length; i++) {
      enemies[i] = new Enemy(enemyStrength[i], enemyCount[i]);
    }

    Arrays.sort(enemies);
    Arrays.sort(strength);

    reverse(enemies);
    reverse(strength);

    if (strength[0] < enemies[0].strength) {
      return -1;
    }

    long lo = 0;
    long hi = (long)1e18;

    while (hi - lo > 1) {
      long mid = (lo + hi) / 2;

      if (!possible(mid, strength, enemies)) {
        lo = mid;
      } else {
        hi = mid;
      }
    }

    return lo + 1;
  }

  void reverse(Enemy[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      Enemy temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  private boolean possible(long maxB, int[] strength, Enemy[] enemies) {
    int gi = 0;
    int ei = 0;
    long b = maxB;
    long nleft = enemies[0].count;

    while (gi < strength.length && ei < enemies.length) {
      if (nleft == 0) {
        ei++;
        if (ei < enemies.length) {
          nleft = enemies[ei].count;
        }
        continue;
      }
      if (strength[gi] < enemies[ei].strength || b == 0) {
        gi++;
        b = maxB;
        continue;
      }
      long batt = Math.min(nleft, b);
      nleft -= batt;
      b -= batt;
    }

    return (ei == enemies.length);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  public class Enemy implements Comparable<Enemy>  {
    public int strength;
    public long count;

    public Enemy (int strength, long count) {
      this.strength = strength;
      this.count = count;
    }

    public int compareTo(Enemy o) {
      if (strength != o.strength) {
        return strength - o.strength;
      }
      return Long.valueOf(count).compareTo(o.count);
    }
  }
}
