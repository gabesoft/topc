package topc.dp;

import java.util.*;

public class ShortPalindromes {
  Dome[][] domes;
  char[] chars;
  int n;

  public String shortest(String base) {
    chars = base.toCharArray();
    n = chars.length;
    domes = new Dome[n][n];

    for (int i = 0; i < n; i++) {
      Dome dome = new Dome();
      dome.add(Character.toString(chars[i]));
      domes[i][i] = dome;
      gen(i,i);
    }

    Set<String> best = domes[0][n-1].best();

    debug("best.size()", best.size());
    debug("best", best);

    return Collections.min(best);
  }

  void gen(int i, int j) {
    assert domes[i][j] != null: "null data found";

    Set<String> best = domes[i][j].best();

    if (i > 0 && j < n - 1 && chars[i-1] == chars[j+1]) {
      Dome dome = domes[i-1][j+1] != null ? domes[i-1][j+1] : new Dome();
      char c = chars[i-1];
      for (String s : best) { dome.add(c + s + c); }
      domes[i-1][j+1] = dome;
      gen(i-1, j+1);
    } else {
      if (i > 0 && i-1 != j) {
        Dome dome = domes[i-1][j] != null ? domes[i-1][j] : new Dome();
        char c = chars[i-1];
        for (String s : best) { dome.add(c + s + c); }
        domes[i-1][j] = dome;
        gen(i-1, j);
      }

      if (j < n - 1 && i != j + 1) {
        Dome dome = domes[i][j+1] != null ? domes[i][j+1] : new Dome();
        char c = chars[j+1];
        for (String s : best) { dome.add(c + s + c); }
        domes[i][j+1] = dome;
        gen(i, j+1);
      }
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Dome {
    int min = Integer.MAX_VALUE;
    int len = min;
    Set<String> items = new HashSet<String>();

    public void add(String s) {
      if (s.length() <= min && !items.contains(s)) {
        items.add(s);
      }
      min = Math.min(min, s.length());
    }

    public Set<String> best() {
      if (len > min) {
        Set<String> shortest = new HashSet<String>();
        for (String s : items) {
          if (s.length() == min) {
            shortest.add(s);
          }
        }

        String str = Collections.min(shortest);
        shortest.clear();
        shortest.add(str);

        items = shortest;
        len = min;
      }
      return items;
    }

    public String toString() {
      return items.toString();
    }
  }
}
