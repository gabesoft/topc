package topc.dp;

import java.util.*;

public class ShortPalindromes {
  String[][] domes;
  char[] chars;
  int n;

  public String shortest(String base) {
    chars = base.toCharArray();
    n = chars.length;
    domes = new String[n][n];

    for (int i = 0; i < n; i++) {
      domes[i][i] = Character.toString(chars[i]);
      gen(i,i);
    }

    return domes[0][n-1];
  }

  void gen(int i, int j) {
    assert domes[i][j] != null: "null data found";
    String s = domes[i][j];

    if (i > 0 && j < n - 1 && chars[i-1] == chars[j+1]) {
      char c = chars[i-1];
      add(i - 1, j + 1, c + s + c);
      gen(i - 1, j + 1);
    } else {
      if (i > 0) {
        char c = chars[i-1];
        add(i - 1, j, c + s + c);
        gen(i - 1, j);
      }

      if (j < n - 1) {
        char c = chars[j+1];
        add(i, j + 1, c + s + c);
        gen(i, j + 1);
      }
    }
  }

  void add(int i, int j, String str) {
    if (domes[i][j] == null) {
      domes[i][j] = str;
    } 
    else if (domes[i][j].length() > str.length()) {
      domes[i][j] = str;
    }
    else if (domes[i][j].compareTo(str) == 1) {
      domes[i][j] = str;
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
