package topc.dp;

import java.util.*;

// 2004 TCCC Round 4 : 250 (dynamic programming)
public class BadNeighbors {
  public int maxDonations(int[] donations) {
    int n = donations.length;
    int[] max = new int[n+1];
    boolean[] yes = new boolean[n+1];
    boolean[] fst = new boolean[n+1];

    if (donations[n-1] > donations[0]) {
      reverse(donations);
    }

    max[0] = 0;
    yes[0] = true;
    fst[0] = false;

    max[1] = donations[0];
    yes[1] = true;
    fst[1] = true;

    for (int i = 2; i < n; i++) {
      int j = i - 1;
      if (!yes[i-1]) {
        max[i] = max[i-1] + donations[j];
        yes[i] = true;
        fst[i] = fst[i-1];
      } 
      else if ((max[i-2] + donations[j]) > max[i-1]) {
        max[i] = max[i-2] + donations[j];
        yes[i] = true;
        fst[i] = fst[i-2];
      }
      else {
        max[i] = max[i-1];
        yes[i] = false;
        fst[i] = fst[i-1];
      }
    }

    int k = 0;
    for (int i = n-2; i > 0; i--) {
      if (!fst[i]) {
        k = i;
        break;
      }
    }

    return Math.max(max[k] + donations[n-1], max[n-1]);
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
