package topc.dp;

import java.util.*;

public class ShortPalindromes {
  String[][][] domes;
  char[] chars;
  int n;

  public String shortest(String base) {
    chars = base.toCharArray();
    n = chars.length;
    domes = new String[n][n][n];

    //for (int i = 0; i < n; i++) {
    for (int i = 12; i < 13; i++) {
      domes[i][i][i] = Character.toString(chars[i]);
      gen(i, i,i);
    }

    String[] res = new String[n];
    for (int i = 0; i < n; i++) {
      res[i] = domes[0][n-1][i];
    }

    debug("res", res);
    return domes[0][n-1][12]; 

    //Arrays.sort(res, new StringComparator());

    //return res[0];
    //return domes[0][n-1];
  }

  void fill(int i, int j, int k, char c) {
    if (i < 0 || j > n - 1) { return; }

    String s = domes[i][j][k] != null ? c + domes[i][j][k] + c : Character.toString(c);
    add(i, j, k, s);

    

  }

  void gen(int i, int j, int k) {
    assert domes[i][j][k] != null: "null data found";
    String s = domes[i][j][k];

    if (i > 0 && j < n - 1 && chars[i-1] == chars[j+1]) {
      char c = chars[i-1];
      add(i - 1, j + 1, k, c + s + c);
      gen(i - 1, j + 1, k);
    } else {
      if (i > 0) {
        char c = chars[i-1];
        add(i - 1, j, k, c + s + c);
        gen(i - 1, j, k);
      }

      if (j < n - 1) {
        char c = chars[j+1];
        add(i, j + 1, k, c + s + c);
        gen(i, j + 1, k);
      }
    }
  }

  void add(int i, int j, int k, String str) {
    //if (5 < i && j < 20) {
      //debug(">>", i, j, domes[i][j][k], str);
    //}

    if (domes[i][j][k] == null) {
      domes[i][j][k] = str;
    } 
    else if (domes[i][j][k].length() > str.length()) {
      domes[i][j][k] = str;
    }
    else if (domes[i][j][k].compareTo(str) > 0) {
      domes[i][j][k] = str;
    }

    if (5 < i && j < 20) {
      debug("<<", i, j, domes[i][j][k], str, domes[i][j][k].compareTo(str));
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class StringComparator implements Comparator {
    public int compare(Object x, Object y) {
      String a = (String) x;
      String b = (String) y;
      if (a.length() != b.length()) {
        return Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length()));
      } else {
        return a.compareTo(b);
      }
    }
  }
}
