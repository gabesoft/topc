package topc.dp;

import java.util.*;

// SRM 150 Div 1 : 500 (dynamic programming)
public class StripePainter {
  static public final int FST_CHAR = (int)'A';
  static public final int LST_CHAR = (int)'Z';
  static public final int NIL_CHAR = 0;
  HashMap<String, Integer> cache;

  public int minStrokes(String stripes) {
    cache = new HashMap<String, Integer>();
    //debug("FST_CHAR", FST_CHAR);
    //debug("LST_CHAR", LST_CHAR);
    //debug("(char)'A'", (char)'A');
    //debug("(char)'Z'", (char)'Z');
    //debug("Character.valueOf('A')", Character.valueOf('A'));
    //debug("Character.valueOf('A')", Character.valueOf('A').charValue());

    return solve(stripes);

    //debug("remdups('ABBCDC')", remdups("ABBCDC"));
    //debug("remdups('BBCDC')", remdups("BBCDC"));
    //debug("remdups('BB')", remdups("BB"));
    //return 0;
  }

  int solve(String stripes) {
    String input = remdups(stripes);
    debug("input", input, cache.containsKey(input) ? cache.get(input) : 0);

    if (input.length() == 0) {
      return 0; 
    } 
    else if (input.length() == 1) {
      return 1;
    }
    else if (input.length() == 2) {
      return 2;
    }
    else if (cache.containsKey(input)) {
      return cache.get(input);
    }

    char[] chars = input.toCharArray();
    assert chars.length > 2;

    if (chars.length == 3) {
      return (chars[0] == chars[2]) ? 2 : 3;
    }
    if (chars.length == 4) {
      return (chars[0] == chars[3] || chars[0] == chars[2] || chars[1] == chars[3]) ? 3 : 4;
    }

    int[] counts = new int[LST_CHAR + 1]; 
    for (int i = 0; i < chars.length; i++) {
      int c = (int)chars[i];
      counts[c]++;
    }

    boolean hasOnes = false;
    for (int i = 1; i < counts.length; i++) {
      if (counts[i] == 1) {
        hasOnes = true;
        break;
      }
    }

    int total = 0;
    if (hasOnes) {
      for (int i = 1; i < counts.length; i++) {
        if (counts[i] == 1) {
          char c = (char)i;
          for (int j = 0; j < chars.length; j++) {
            if (chars[j] == c) {
              chars[j] = (char)NIL_CHAR;
              total++;
            }
          }
        }
      }
      total += solve(new String(chars));
    } else {
      int min = Integer.MAX_VALUE - 1;
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == NIL_CHAR) { continue; }
        char[] next = chars.clone();
        next[i] = NIL_CHAR;
        int t = solve(new String(next));
        if (t < min) { min = t; }
      }
      total = 1 + min;
    }

    cache.put(input, total);
    return total;
  }

  String remdups(String input) {
    if (input.length() == 0) { return input; }

    char[] chars = input.toCharArray();
    StringBuilder str = new StringBuilder();
    str.append(chars[0]);
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == NIL_CHAR) { continue; }
      char p = str.charAt(str.length() - 1);
      char c = chars[i];
      if (c != p) { str.append(c); }
    }

    return str.toString();
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
