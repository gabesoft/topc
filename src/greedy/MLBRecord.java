package topc.greedy;

import java.util.*;
import java.io.*;

// TCO04 Round 2 Division I Level Three - 900
// brute force, greedy, simple search, iteration
// http://community.topcoder.com/stat?c=problem_statement&pm=2236&rd=5879
public class MLBRecord {
  int n;
  int k;
  int games;
  Team[] teams;

  public String teamStatus(int[] wins, int gamesLeft, int N) {
    n = wins.length;
    k = N;
    games = gamesLeft;
    //games = Math.min(n - 1, gamesLeft);

    int[] status = new int[n];
    buildTeams(wins);
    //sortDesc(teams);
    //debug("wins", teams);

    //populateEliminated(status);
    populateClinched(status);

    //debug("status", status);

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      switch (status[i]) {
        case -1: 
          builder.append('E');
          break;
        case 0:
          builder.append('.');
          break;
        case 1:
          builder.append('C');
          break;
      }
    }

    return builder.toString();
  }

  void buildTeams(int[] wins) {
    int available = n * games / 2;
    teams = new Team[n];

    for (int i = 0; i < n; i++) {
      teams[i] = new Team(i, wins[i]);
    }

    sortDesc(teams);

    for (int i = n - 1; i > -1; i--) {
      teams[i].hi = teams[i].lo + Math.min(games, available);
      available = Math.max(0, available - games);
    }
  }

  void populateClinched(int[] status) {
    for (int i = 0; i < n; i++) {
      int better = 0;
      int worse = 0;

      int available = n * games / 2;
      for (int j = i + 1; j < n; j++) {
        int dx = Math.min(available, Math.min(games, teams[i].lo - teams[j].lo));
        int hi = teams[j].lo + dx;
        available = Math.max(0, available - dx);
        //debug("for", hi, teams[i].lo, dx, available);
        //if (teams[j].hi >= teams[i].lo) {
        if (hi >= teams[i].lo) {
          better++;
        }
      }

      //available = n * games / 2;
      int remaining = Math.max(0, (n * games / 2) - (n - i) * games);
      int hi = teams[i].lo + games;
      //remaining = Math.max(0, remaining - games);
      //for (int j = 0; j < i; j++) {
      for (int j = i - 1; j > -1; j--) {
        int dx = Math.min(remaining, Math.min(games, Math.abs(hi - teams[j].lo)));
        dx = Math.max(dx, remaining - j * games);
        //int dx = Math.min(available, Math.min(games, teams[i].lo - teams[j].lo));
        //int hi = teams[j].lo + dx;
        //int dx = Math.min(remaining, games);
        remaining = Math.max(0, remaining - dx);
        //int hi = teams[i].lo + Math.min(games, n - 1);
        //if (teams[i].hi < teams[j].lo) {
        //debug("for", hi, dx, teams[j].lo, teams[j].lo + dx, remaining);
        if (hi < teams[j].lo + dx) {
          worse++;
        }
      }

      //debug("better", i, better, teams[i].hi, teams[i].lo, k);
      //debug("worse", i, worse, teams[i].hi, teams[i].lo, k);
      if (better < k - i) {
        status[teams[i].index] = 1;
      }
      if (worse > k - 1) {
        status[teams[i].index] = -1;
      }
    }
  }

  void sortDesc(Team[] arr) {
    Arrays.sort(arr);
    for(int i = 0; i < arr.length / 2; i++) {
      Team temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Team implements Comparable<Team> {
    public final int index;
    public final int lo;
    public int hi;

    public Team(int index, int lo) {
      this.index = index;
      this.lo = lo;
    }

    public int compareTo(Team other) {
      return Integer.valueOf(lo).compareTo(Integer.valueOf(other.lo));
    }
  }
}
