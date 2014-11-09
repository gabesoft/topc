package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 511 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11484&rd=14536
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+511
public class FiveHundredEleven {
  int[] cards;
  int[][] memo;

  public String theWinner(int[] cards) {
    this.cards = cards;
    this.memo  = new int[512][51];
    if (win(new boolean[cards.length], 0, cards.length)) {
      return "Fox Ciel";
    } else {
      return "Toastman";
    }
  }

  boolean win(boolean[] used, int memory, int remaining) {
    if (memory == 511) { return true; }
    if (remaining == 0) { return false; }
    if (memo[memory][remaining] > 0) {
      return memo[memory][remaining] == 1 ? true : false;
    }

    boolean[] next = used.clone();
    for (int i = 0; i < used.length; i++) {
      if (used[i]) { continue; }

      next[i] = true;
      if (!win(next, memory | cards[i], remaining - 1)) {
        memo[memory][remaining] = 1;
        return true;
      }

      next[i] = false;
    }

    memo[memory][remaining] = 2;
    return false;
  }

  int countOnes(int mask) {
    int n = 0;
    while (mask != 0) {
      n++;
      mask = mask & (mask - 1);
    }
    return n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
