package topc.dp;

import java.util.*;

// SRM 150 Div 1 : 500 (dynamic programming)
public class StripePainter {
  int[] colors;
  
  public int minStrokes(String stripes) {
    colors = new int[stripes.length()];
    char[] chars = stripes.toCharArray();
    int n = 0;
    for (int i = 0; i < chars.length;) {
      char c = chars[i];
      colors[n++] = Character.getNumericValue(c);
      i++;
      while (i < chars.length && chars[i] == c) { i++; }
    }

    debug("colors", colors);
    return count(0, n);
  }

  int count(int s, int e) {
    debug(">>", colors);
    debug(">>", colors[s], s, "-", e);

    int total = 0;
    for (int i = s; i < e; i++) {
      int c = colors[i];
      int l = last(i, e);
      if (c == -1) { continue; }
      if (l == -1) {
        total++;
      } else {
        total++;
        total += count(i+1, l);
        i = l;
      }
    }

    debug("<<", colors[s], s, "-", e, "total", total);
    return total;
  }

  int last(int i, int e) {
    int index = -1;
    for (int j = i+1; j < e; j++) {
      if (colors[j] == colors[i]) {
        index = j;
        colors[j] = -1;
      }
    }
    colors[i] = -1;
    return index;
    //for (int j = e-1; j > i; j--) {
      //if (colors[j] == colors[i]) {
        //return j;
      //}
    //}
    //return -1;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
