package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 360 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8026&rd=10772
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm360
public class TakeSubstringGame {
    int [][] memo;
    int [] powerof10;

    public int winningMove(int n) {
        memo = new int[2][n + 1];
        Arrays.fill(memo[0], -2);
        Arrays.fill(memo[1], -2);

        powerof10 = new int[9];
        powerof10[0] = 1;
        for (int i = 1; i < powerof10.length; i++) {
            powerof10[i] = powerof10[i - 1] * 10;
        }

        return rec(n, true);
    }

    int rec(int n, boolean turn) {
        int res = turn ? -1 : 0;

        if (n < 10) { return res; }
        if (memo[turn ? 0 : 1][n] > -2) { return memo[turn ? 0 : 1][n]; }

        int [] nums = subs(n, turn);
        for (int i = 0; i < nums.length; i++) {
            int next = rec(n - nums[i], !turn);
            if (turn && next > -1) {
                res = nums[i];
                break;
            }
            if (!turn && next == -1) {
                res = -1;
                break; 
            }
        }

        memo[turn ? 0 : 1][n] = res;
        return res;
    }

    int[] subs(int n, boolean asc) {
        ArrayList<Integer> ints = new ArrayList<Integer>();

        int m = n;
        int d = 0;

        while (m > 0) {
            m /= 10;
            d++;
        }

        for (int d1 = 0; d1 < d; d1++) {
            for (int d2 = 1; d2 + d1 < d + 1; d2++) {
                int x = (n / powerof10[d1]) % powerof10[d2];
                if (x > 0 && x < n) {
                    ints.add(x);
                }
            }
        }

        int [] res = new int[ints.size()];
        int idx    = 0;

        for (int x : ints) {
            res[idx++] = x;
        }

        Arrays.sort(res);

        if (!asc) {
            reverse(res);
        }

        return res;
    }

    void reverse(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
