package topc.math;

import java.util.*;
import java.io.*;

// SRM 330 Division I Level Three - 1000
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6856&rd=10010
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm330
public class LongLongNim {
  public int numberOfWins(int maxN, int[] moves) {
    int n = maxN;
    int maxm = moves[moves.length - 1];
    boolean[] game = new boolean[1000];
    HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

    int rindex = 0;
    int rcount = 0;
    int period = 0;
    for (int i = 0; i < game.length; i++) {

      for (int j = 0; j < moves.length; j++) {
        int move = moves[j];
        if (i == move) {
          game[i] = true;
          break;
        }
        if (i < move) { break; }
        if (!game[i - move]) {
          game[i] = true;
          break;
        }
      }

      if (i < maxm) { continue; }

      int mask = 0;
      for (int j = i - maxm; j < i; j++) {
        mask <<= 1;
        mask |=  game[j] ? 1 : 0;
      }
      if (seen.containsKey(mask)) {
        rindex = seen.get(mask);
        period = i - rindex;
        for (int j = rindex; j < i; j++) {
          rcount += (game[j] ? 0 : 1);
        }
        break;
      } else {
        seen.put(mask, i);
      }
    }

    int count = -1;

    if (maxN <= maxm) {
      for (int i = 0; i < maxN + 1; i++) {
        count += (game[i] ? 0 : 1);
      }
    } else {
      int restn = maxN - rindex;

      for (int i = 0; i < rindex; i++) {
        count += (game[i] ? 0 : 1);
      }

      for (int i = rindex; i < rindex + (restn % period) + 1; i++) {
        count += (game[i] ? 0 : 1);
      }

      count += (restn / period) * rcount;
    }

    return count;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
