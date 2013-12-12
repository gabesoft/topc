package topc.greedy;

import java.util.*;
import java.io.*;

// TCO04 Round 2 Division I Level Three - 900
// brute force, greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2236&rd=5879
// editorial: http://community.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco04_online_rd_2
public class MLBRecord {
  int n;
  int k;
  int games;

  public String teamStatus(int[] wins, int gamesLeft, int N) {
    n = wins.length;
    k = N;
    games = gamesLeft;

    Team[] teams = new Team[n];
    for (int i = 0; i < n; i++) {
      teams[i] = new Team(i, wins[i]);
    }
    Arrays.sort(teams);

    char[] status = new char[n];
    Arrays.fill(status, '.');
    computeStatus(teams, status);

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      builder.append(status[i]);
    }

    return builder.toString();
  }

  void computeStatus(Team[] teams, char[] status) {
    for (int i = 0; i < n; i++) {
      int better = 0;
      int worse = 0;

      int available = n * games / 2;
      int lo = teams[i].lo;
      for (int j = i + 1; j < n; j++) {
        int dx = Math.min(available, Math.min(games, Math.max(0, lo - teams[j].lo)));
        available = Math.max(0, available - dx);
        if (lo <= teams[j].lo + dx) { better++; }
      }

      int remaining = Math.max(0, (n * games / 2) - (n - i) * games);
      int hi = teams[i].lo + games;
      for (int j = i - 1; j > -1; j--) {
        int dx = Math.min(remaining, Math.min(games, Math.max(0, hi - teams[j].lo)));
        dx = Math.max(dx, remaining - j * games);
        remaining = Math.max(0, remaining - dx);
        if (hi < teams[j].lo + dx) { worse++; }
      }

      if (better < k - i) {
        status[teams[i].index] = 'C';
      }
      if (worse > k - 1) {
        status[teams[i].index] = 'E';
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Team implements Comparable<Team> {
    public final int index;
    public final int lo;

    public Team(int index, int lo) {
      this.index = index;
      this.lo = lo;
    }

    public int compareTo(Team other) {
      return Integer.valueOf(other.lo).compareTo(Integer.valueOf(lo));
    }
  }
}
