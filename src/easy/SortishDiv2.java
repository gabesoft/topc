package topc.easy;

import java.util.*;
import java.io.*;

// SRM 636 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13500&rd=16079
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+636
public class SortishDiv2 {
  int nums[] = null;
  int indx[] = null;
  int seq[] = null;
  int count = 0;
  int sortedness = 0;

  public int ways(int sortedness, int[] seq) {
    int n = seq.length;
    int k = 0;
    int j = 0;

    this.seq = seq;
    this.sortedness = sortedness;

    boolean[] used = new boolean[n + 1];
    for (int x : seq) {
      if (x == 0) {
        k++;
      } else {
        used[x] = true;
      }
    }

    nums = new int[k];
    indx = new int[k];
    j = 0;
    for (int i = 1; i <= n; i++) {
      if (!used[i]) {
        nums[j++] = i;
      }
    }

    indx = new int[k];
    j = 0;
    for (int i = 0; i < n; i++) {
      if (seq[i] == 0) {
        indx[j++] = i;
      }
    }


    count = 0;
    perm(k == 0 ? k - 1 : 0);

    return count;
  }

  private void verify() {
    for (int i = 0; i < nums.length; i++) {
      seq[indx[i]] = nums[i];
    }

    int s = 0;
    int n = seq.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (seq[i] < seq[j]) {
          s++;
        }
      }
    }

    if (s == sortedness) {
      count++;
    }
  }

  private void perm(int i) {
    if (i == nums.length - 1) {
      verify();
    } else {
      for (int j = i; j < nums.length; j++) {
        swap(nums, i, j);
        perm(i + 1);
        swap(nums, i, j);
      }
    }
  }

  private void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
