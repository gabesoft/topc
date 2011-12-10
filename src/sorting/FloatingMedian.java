package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 310 Division I Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6551&rd=9990
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm310
public class FloatingMedian {
  int M = 65536;

  public long sumOfMedians(int seed, int mul, int add, int N, int K) {
    long[] nums = new long[N + 1];

    nums[0] = (int)seed;
    for (int i = 1; i < N + 1; i++) {
      nums[i] = (nums[i - 1] * mul + add) % M;
    }

    long[] sorted = Arrays.copyOfRange(nums, 0, K);
    Arrays.sort(sorted);

    long sum = median(sorted);
    for (int i = K; i < N; i++) {
      resort(sorted, nums[i - K], nums[i]);
      sum += median(sorted);
    }

    return sum;
  }

  void resort(long[] input, long rem, long add) {
    if (add == rem) { return; }

    int k = Arrays.binarySearch(input, 0, input.length, rem);

    if (add < rem) {
      for (int i = k; i > -1; i--) {
        if (i == 0 || input[i - 1] < add) {
          input[i] = add;
          break;
        } else { input[i] = input[i - 1]; }
      }
    } else {
      for (int i = k; i < input.length; i++) {
        if (i == input.length - 1 || input[i + 1] > add) {
          input[i] = add;
          break;
        } else { input[i] = input[i + 1]; }
      }
    }
  }

  long median(long[] input) {
    int l = input.length;
    int k = (l + 1) / 2;
    return input[k - 1];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
