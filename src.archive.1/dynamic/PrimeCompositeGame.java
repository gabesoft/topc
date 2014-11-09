package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 526 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11506&rd=14551
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526
public class PrimeCompositeGame {
  boolean[] primes;

  public int theOutcome(int N, int K) {
    primes = getPrimes(N);
    return solve (N, K);
  }

  int solve(int N, int K) {
    int[][] dp = new int[2][N + 1];
    PairTreeSet[] primePos = new PairTreeSet[] { new PairTreeSet(new PairComparator()),    new PairTreeSet(new PairComparator()) };
    PairTreeSet[] primeNeg = new PairTreeSet[] { new PairTreeSet(new PairComparator()),    new PairTreeSet(new PairComparator()) };
    PairTreeSet[] compoPos = new PairTreeSet[] { new PairTreeSet(new PairComparatorInv()), new PairTreeSet(new PairComparatorInv()) };
    PairTreeSet[] compoNeg = new PairTreeSet[] { new PairTreeSet(new PairComparatorInv()), new PairTreeSet(new PairComparatorInv()) };

    for (int n = 1; n < N + 1; n++) {
      for (int player = 0; player < 2; player++) {
        int best = (player == 0) 
          ? pickBest(n - K, primePos[1], primeNeg[1]) 
          : pickBest(n - K, compoNeg[0], compoPos[0]);

        if (best == 0) {
          dp[player][n] = (player == 0) ? -1 : 1;
        } else {
          dp[player][n] = (best > 0) ? best + 1 : best - 1;
        }
      }

      for (int player = 0; player < 2; player++) {
        if (n == 1) { break; }
        if (primes[n]) {
          if (dp[player][n] > 0) {
            primePos[player].add(pair(dp[player][n], n));
          } else {
            primeNeg[player].add(pair(dp[player][n], n));
          }
        } else {
          if (dp[player][n] > 0) {
            compoPos[player].add(pair(dp[player][n], n));
          } else {
            compoNeg[player].add(pair(dp[player][n], n));
          }
        }
      }
    }

    return dp[0][N] > 0 ? dp[0][N] - 1 : dp[0][N] + 1;
  }

  int pickBest(int lim, TreeSet<Pair> good, TreeSet<Pair> bad) {
    Pair p = getFirst(lim, good);
    p = (p != null) ? p : getFirst(lim, bad);
    return p != null ? p.turns : 0;
  }

  Pair getFirst(int lim, TreeSet<Pair> set) {
    while (!set.isEmpty() && set.first().n < lim) {
      set.remove(set.first());
    }
    return set.isEmpty() ? null : set.first();
  }

  int pickBest(int best, int player, int value) {
    if (best == 0) { return value; }
    if (value == 0) { return best; }

    if (player == 0) {
      if (value > 0) { return best > 0 ? Math.min(value, best) : value; }
      if (value < 0) { return best < 0 ? Math.min(value, best) : best;  } 
    } else {
      if (value > 0) { return best > 0 ? Math.max(value, best) : best;  }
      if (value < 0) { return best < 0 ? Math.max(value, best) : value; } 
    }

    assert false : "malfunction: " + value + ", " + best;
    return 0;
  }

  Pair pair(int turns, int n) {
    return new Pair(turns, n);
  }

  boolean[] getPrimes(int n) {
    boolean[] primes = new boolean[n + 1];

    if (n < 2) { return primes; }

    Arrays.fill(primes, true);
    primes[0] = false;
    primes[1] = false;

    for (int i = 2; i < Math.sqrt(primes.length) + 1; i++) {
      if (primes[i]) {
        for (int j = i * i; j < primes.length; j += i) {
          primes[j] = false;
        }
      }
    }

    return primes;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Pair {
    public final int turns;
    public final int n;

    public Pair(int turns, int n) {
      this.turns = turns;
      this.n = n;
    }

    public String toString() {
      return String.format("%s:%s", n, turns);
    }
  }

  class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
      if (p1.turns == p2.turns) {
        return Integer.valueOf(p1.n).compareTo(p2.n);
      } else {
        return Integer.valueOf(p1.turns).compareTo(p2.turns);
      }
    }
  }

  class PairComparatorInv implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
      if (p1.turns == p2.turns) {
        return Integer.valueOf(p1.n).compareTo(p2.n);
      } else {
        return Integer.valueOf(p2.turns).compareTo(p1.turns);
      }
    }
  }

  @SuppressWarnings("serial")
  class PairTreeSet extends TreeSet<Pair> {
    public PairTreeSet(Comparator<Pair> comparator) {
      super(comparator);
    }
  }
}
