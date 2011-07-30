package topc.dp;

import java.util.*;

// SRM 150 Div 1 : 500 (dynamic programming)
public class StripePainter {
  int[] colors;
  //int[] counts;
  
  public int minStrokes(String stripes) {
    colors = new int[stripes.length()];
    char[] chars = stripes.toCharArray();
    int n = 0;
    for (int i = 0; i < colors.length; i++) {
      colors[i] = -1;
    }
    for (int i = 0; i < chars.length;) {
      char c = chars[i];
      int v = Character.getNumericValue(c);
      //counts[v-10]++;
      colors[n++] = v;
      i++;
      while (i < chars.length && chars[i] == c) { i++; }
    }

    boolean cont = true;
    int min = 0;
    while (true) {
      int index = longest();
      debug("colors", colors);
      debug("index", index);
      debug("min", min);
      if (index == -1) {
        break;
      }
      int c = colors[index];
      for (int i = index; i < colors.length; i++) {
        if (colors[i] == -1) {
          break;
        }
        if (colors[i] == c) {
          colors[i] = -1;
        }
      }
      min++;
    }

    return min;



    //debug("Character.getNumericValue('A')", Character.getNumericValue('A'));
    //debug("Character.getNumericValue('Z')", Character.getNumericValue('Z'));
    //debug("counts", counts);
    //debug("colors", colors);
    //return count(0, n);
  }

  int longest() {
    int cmax = 0;
    int tmax = 0;
    int idx = -1;
    int color = 0;

    int[][] work = new int[36][2];
    for (int i = 0; i < colors.length; i++) {
      if (colors[i] == -1) {
        if (cmax > tmax) {
          tmax = cmax;
          idx = work[color][1];
        }
        work = new int[36][2];
      }
      while (i < colors.length && colors[i] == -1) { i++; }
      if (i >= colors.length) {
        break;
      }

      int c = colors[i];
      int l = i;
      for (int j = i+1; j < colors.length && colors[j] > -1; j++) {
        if (colors[j] == c && (j == colors.length - 1 || colors[j+1] == -1)) {
          l = j;
        }
      }
      if (l > i) {
        return i;
      }

      work[c][0]++;
      if (work[c][0] == 1) {
        work[c][1] = i;
      }
      if (work[c][0] > cmax) {
        cmax = work[c][0];
        color = c;
      }
    }

    if (cmax > tmax) {
      idx = work[color][1];
    }

    return idx;
  }

  int count(int s, int e) {
    debug(">>", colors);
    debug(">>", colors[s], s, "-", e);
    debug("longest()", longest());

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
