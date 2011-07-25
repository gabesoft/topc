package topc.dp;

import java.util.*;

// 2004 TCCC Round 1 : 500 (dynamic programming)
public class FlowerGarden {
  int n;
  int[] h;
  int[] b;
  int[] w;

  public int[] getOrdering(int[] height, int[] bloom, int[] wilt) {
    n = height.length;
    h = height;
    b = bloom;
    w = wilt;

    sort();

    List<Integer> o = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      int k = -1;
      for (int j = 0; j < i; j++) {
        if (blocks(i,j)) {
          k = o.indexOf(h[j]);
          debug(h[i], "blocks", h[j], "k", k);
          //k = j > 0 ? j - 1 : 0;
          break;
        }
      }
      if (k > -1) {
        o.add(k, h[i]);
      } else {
        o.add(h[i]);
      }
    }

    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      res[i] = o.get(i).intValue();
    }

    debug("h", h);
    debug("b", b);
    debug("w", w);
    debug("res", res);
    System.out.println("");

    reverse(res);
    return res;
  }

  void sort() {
    int[] hcopy = new int[n];
    int[] bcopy = new int[n];
    int[] wcopy = new int[n];

    for (int i = 0; i < n; i++) {
      hcopy[i] = h[i];
      bcopy[i] = b[i];
      wcopy[i] = w[i];
    }

    Arrays.sort(h);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (hcopy[i] == h[j]) {
          b[i] = bcopy[j];
          w[i] = wcopy[j];
        }
      }
    }
  }

  boolean blocks(int i, int j) {
    assert h[i] > h[j];
    return b[i] <= w[j] && b[j] <= w[i];
  }

  void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
