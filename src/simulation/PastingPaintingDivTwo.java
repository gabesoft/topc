package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 562 Division II Level Two - 500
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12318&rd=15184
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+562
public class PastingPaintingDivTwo {
  public long countColors(String[] clipboard, int T) {
    int n = clipboard.length;
    int m = clipboard[0].length();
    char[][] clip = new char[n][];

    for (int i = 0; i < n; i++) {
      clip[i] = clipboard[i].toCharArray();
    }

    int l = Math.min(T, Math.max(n, m) + 1);

    long sum = 0;
    for (int i = 0; i < l - 1; i++) {
      sum += count(clip);
      clip = paste(clip, clipboard);
    }

    if (l - 1 < T) {
      long cnt = count(clip);
      sum += cnt * (T - l);
    }

    sum += countAll(clip);

    return sum;
  }

  private char[][] paste(char[][] clip, String[] clipboard) {
    int n = clip.length;
    int m = clip[0].length;
    char[][] copy = new char[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        copy[i][j] = clipboard[i].charAt(j);
        if (i < n - 1 && j < m - 1 && clip[i + 1][j + 1] == 'B') {
          copy[i][j] = 'B';
        }
      }
    }

    return copy;
  }

  private long count(char[][] clip) {
    long sum = clip[0][0] == 'B' ? 1 : 0;
    for (int i = 1; i < clip.length; i++) {
      if (clip[i][0] == 'B') {
        sum++;
      }
    }
    for (int i = 1; i < clip[0].length; i++) {
      if (clip[0][i] == 'B') {
        sum++;
      }
    }
    return sum;
  }

  private long countAll(char[][] clip) {
    long sum = 0;
    for (int i = 0; i < clip.length; i++) {
      for (int j = 0; j < clip[i].length; j++) {
        if (clip[i][j] == 'B') {
          sum++;
        }
      }
    }
    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
