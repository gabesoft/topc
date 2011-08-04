package topc.dp;

import java.util.*;

public class QuickSums {
  public int minSums(String numbers, int sum) {
    char[] chars = numbers.toCharArray();
    int n = chars.length;
    int[] nums = new int[n];
    
    for (int i = 0; i < chars.length; i++) {
      nums[i] = Character.getNumericValue(chars[i]);
    }

    return solve(nums, sum);
  }

  int solve(int[] nums, int sum) {
    int n = nums.length;

    if (n == 0) { return sum == 0 ? 0 : 1; }
    if (n == 1) { return nums[0] == sum ? 0 : -1; }

    if (sum == 0) { return arrsum(nums) == 0 ? 0 : -1; }
    if (sum < 0) { return -1; }

    int[] n1 = new int[n-1];
    int[] n2 = new int[n-1];
    
    for (int i = 0; i < n1.length; i++) {
      n1[i] = nums[i+1];
      n2[i] = nums[i+1];
    }

    n2[0] = nums[0] * 10 + n2[0];

    int a = solve(n1, sum - nums[0]);
    int b = solve(n2, sum);

    if (a == -1 || b == -1) {
      return a == -1 ? b : a + 1;
    }

    return Math.min(a + 1, b);
  }

  int arrsum(int[] nums) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      res += nums[i];
    }
    return res;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
