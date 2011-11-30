package topc.math;

import java.util.*;
import java.io.*;

// SRM 309 Division I Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6239&rd=9989
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm309
public class StoneGameStrategist {
  public String play(int[] piles) {
    if (!win(piles)) { return "YOU LOSE"; }

    ArrayList<Move> moves = new ArrayList<Move>();
    for (int i = 0; i < piles.length; i++) {
      int v = piles[i];
      for (int j = piles[i] - 1; j >= (i > 0 ? piles[i - 1] : 0); j--) {
        piles[i] = j;
        if (!win(piles)) {
          moves.add(new Move(i, v - j));
        }
      }
      piles[i] = v;
    }

    Collections.sort(moves);
    return String.format("TAKE %s STONES FROM PILE %s", moves.get(0).stones, moves.get(0).pile);
  }

  boolean win(int[] piles) {
    int n = piles.length;
    int[] d = new int[n];

    d[0] = piles[0];
    for (int i = 1; i < n; i++) {
      d[i] = piles[i] - piles[i - 1];
    }

    int res = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        res ^= d[j];
      }
    }

    return res != 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Move implements Comparable<Move> {
    public final int pile;
    public final int stones;

    public Move(int pile, int stones) {
      this.pile = pile;
      this.stones = stones;
    }

    public int compareTo(Move other) {
      if (stones != other.stones) {
        return Integer.valueOf(stones).compareTo(other.stones);
      } else {
        return Integer.valueOf(pile).compareTo(other.pile);
      }
    }
  }
}
