package topc.dp;

import java.util.*;

public class ShortPalindromes {
  ArrayList<String>[][] domes;
  char[] chars;
  int n;

  public String shortest(String base) {
    chars = base.toCharArray();
    n = chars.length;
    domes = new ArrayList[n][n];

    for (int i = 0; i < n; i++) {
      ArrayList<String> strs = new ArrayList<String>();
      strs.add(Character.toString(chars[i]));
      domes[i][i] = strs;
      gen(i,i);
    }

    Collections.sort(domes[0][n-1]);
    debug("domes[0][n-1].size()", domes[0][n-1].size());
    debug("domes[0][n-1]", domes[0][n-1]);
    return domes[0][n-1].get(0);
  }

  void gen(int i, int j) {
    debug(i, j);

    assert domes[i][j] != null: "null data found";

    if (i > 0 && j < n - 1 && chars[i-1] == chars[j+1]) {
      ArrayList<String> strs = domes[i-1][j+1] != null ? domes[i-1][j+1] : new ArrayList<String>();
      char c = chars[i-1];
      debug("same", i, j, c);
      for (String s : domes[i][j]) {
        String next = c + s + c;
        if (!strs.contains(next)) {
          strs.add(next);
        }
      }
      domes[i-1][j+1] = strs;
      return;
    }

    if (i > 0 && i-1 != j) {
      //assert domes[i-1][j] == null : "existing data found -1";

      ArrayList<String> strs = domes[i-1][j] != null ? domes[i-1][j] : new ArrayList<String>();
      char c = chars[i-1];
      for (String s : domes[i][j]) {
        String next = c + s + c;
        if (!strs.contains(next)) {
          strs.add(next);
        }
      }
      domes[i-1][j] = strs;

      gen(i-1, j);
    }

    if (j < n - 1 && i != j + 1) {
      //assert domes[i][j+1] == null : "existing data found +1";

      ArrayList<String> strs = domes[i][j+1] != null ? domes[i][j+1] : new ArrayList<String>();
      char c = chars[j + 1];
      for (String s : domes[i][j]) {
        String next = c + s + c;
        if (!strs.contains(next)) {
          strs.add(next);
        }
      }
      domes[i][j+1] = strs;

      gen(i, j+1);
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Dome {
    int min = Integer.MAX_VALUE;
    ArrayList<String> items = new ArrayList<String>();

    public void add(String s) {
      if (s.length() <= min && !items.contains(s)) {
        items.add(s);
      }
      min = Math.min(min, s.length());
    }

    public ArrayList<String> best() {
      ArrayList<String> shortest = new ArrayList<String>();
      for (String s : items) {
        if (s.length() == min) {
          shortest.add(s);
        }
      }
      items = shortest;
      return items;
    }
  }
}
