package topc.dp;

import java.util.*;

public class ShortPalindromes {
  String[][][] domes;
  Queue<int[]> queue;
  char[] chars;
  int n;

  public String shortest(String base) {
    chars = base.toCharArray();
    queue = new LinkedList<int[]>();
    n = chars.length;
    domes = new String[n][n][n];

    for (int i = 0; i < n; i++) {
      domes[i][i][i] = Character.toString(chars[i]);
      gen(i, i,i);
    }

    String[] res = new String[n];
    for (int i = 0; i < n; i++) {
      res[i] = domes[0][n-1][i];
    }

    Arrays.sort(res, new StringComparator());

    return res[0];
  }

  void gen(int i, int j, int k) {
    assert domes[i][j][k] != null: "null data found";
    String s = domes[i][j][k];

    if (i > 0 && j < n - 1 && chars[i-1] == chars[j+1]) {
      char c = chars[i-1];
      if (add(i - 1, j + 1, k, c + s + c)) {
        queue.add(new int[] { i - 1, j + 1, k });
      }
    } else {
      if (i > 0) {
        char c = chars[i-1];
        if (add(i - 1, j, k, make(s, c))) {
          queue.add(new int[] { i - 1, j, k });
        }
      }

      if (j < n - 1) {
        char c = chars[j+1];
        if (add(i, j + 1, k, make(s, c))) {
          queue.add(new int[] { i, j + 1, k });
        }
      }
    }

    int[] next = queue.poll();
    if (next != null) {
      gen(next[0], next[1], next[2]);
    }
  }

  String make(String s, char c) {
    String cs = Character.toString(c);
    return cs.equals(s) ? s + cs : cs + s + cs;
  }

  boolean add(int i, int j, int k, String str) {
    String curr = domes[i][j][k];
    String next = curr;

    if (curr == null) {
      next = str;
    } 
    else if (curr.length() > str.length()) {
      next = str;
    }
    else if (curr.length() == str.length() && curr.compareTo(str) > 0) {
      next = str;
    }

    domes[i][j][k] = next;
    return curr != next;
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
