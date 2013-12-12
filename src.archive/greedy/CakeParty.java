package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 338 Division I Level Three - 1000
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7424&rd=10662
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm338
public class CakeParty {
  public String makeMove(int[] pieces) {
    String[] moves = getMoves(pieces);
    Arrays.sort(moves);
    return moves[0];
  }

  String[] getMoves(int[] pieces) {
    List<String> moves = new LinkedList<String>();

    int fcnt = 0;
    int scnt = 0;
    int fst = pieces[0];
    int snd = 0;

    for (int i = 0; i < pieces.length; i++) {
      if (fst < pieces[i]) {
        fst = pieces[i];
        fcnt = 1;
      } 
      else if (pieces[i] == fst) {
        fcnt++;
      }
    }

    for (int i = 0; i < pieces.length; i++) {
      if (pieces[i] < fst && pieces[i] > snd) {
        snd = pieces[i];
        scnt = 1;
      } 
      else if (pieces[i] == snd) {
        scnt++;
      }
    }

    if (fcnt == 1) {
      for (int i = 0; i < pieces.length; i++) {
        int cake = i;
        int piece = 0;

        if (pieces[i] == fst) {
          if (snd == 0) {
            piece = pieces[i];
          }
          else if (scnt % 2 == 1) {
            piece = pieces[i] - snd;
          }
          else {
            int r = round(pieces[i] - snd + 1);
            piece = (pieces[i] >= r) ? r : pieces[i] - snd + 1;
          }

          moves.add(String.format("CAKE %s PIECES %s", cake, piece));
        }
      }
    } else {
      for (int i = 0; i < pieces.length; i++) {
        if (pieces[i] == fst) {
          moves.add(String.format("CAKE %s PIECES 1", i));
        }
      }
    }

    return moves.toArray(new String[] {});
  }

  int round(int num) {
    int n = num;
    int r = 1;
    while (n > 0) {
      r *= 10;
      n = n / 10;
    }
    return (r < num || r == num * 10) ? num : r;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
