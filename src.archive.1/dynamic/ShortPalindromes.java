package topc.dynamic;

import java.util.*;

// SRM 165 Round 1 Div 2 : 1150 (dynamic programming)
public class ShortPalindromes {
  String[][][] domes;
  Queue<int[]> queue;
  char[] chars;
  int n;

  public String shortest(String base) {
    chars = base.toCharArray();
    n = chars.length;

    queue = new LinkedList<int[]>();
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
    String s = domes[i][j][k];

    if (i > 0 && j < n - 1 && chars[i-1] == chars[j+1]) {
      add(i - 1, j + 1, k, chars[i-1] + s + chars[i-1]);
    } else {
      if (i > 0) {
        add(i - 1, j, k, make(s, chars[i-1]));
      }
      if (j < n - 1) {
        add(i, j + 1, k, make(s, chars[j+1]));
      }
    }

    int[] next = queue.poll();
    if (next != null) {
      gen(next[0], next[1], next[2]);
    }
  }

  void add(int i, int j, int k, String str) {
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
    if (curr != next) {
      queue.add(new int[] { i, j, k });
    }
  }

  String make(String s, char c) {
    boolean addone = s.length() % 2 != 0;
    if (addone) {
      char[] chars = s.toCharArray();
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] != c) { 
          addone = false;
          break;
        }
      }
    }
    return addone ? s + c : c + s + c;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class StringComparator implements Comparator<String> {
    public int compare(String a, String b) {
      if (a.length() != b.length()) {
        return Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length()));
      } else {
        return a.compareTo(b);
      }
    }
  }
}
