package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 404 Division II Level Three - 1000
// dynamic programming, geometry, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9755&rd=12176
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm404
public class GetToTheTop {
    int K;
    int n;
    int [] memo;
    Stair [] stairs;

    public int collectSweets(int K, int[] sweets, int[] x, int[] y, int[] stairLength) {
        this.K      = K;
        this.n      = sweets.length;
        this.memo   = new int[n];
        this.stairs = new Stair[n];

        Arrays.fill(memo, -1);

        for (int i = 0; i < n; i++) {
            stairs[i] = new Stair(x[i], y[i], stairLength[i], sweets[i]);
        }

        Arrays.sort(stairs);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (stairs[i].y <= K) {
                res = Math.max(rec(i), res);
            }
        }

        return res;
    }

    boolean reachable(int idx1, int idx2) {
        int s1x = stairs[idx1].x;
        int s1y = stairs[idx1].y;
        int s1l = stairs[idx1].len;
        int s2x = stairs[idx2].x;
        int s2y = stairs[idx2].y;
        int s2l = stairs[idx2].len;

        if ((s1x <= s2x && s2x <= s1x + s1l) || (s2x <= s1x && s1x <= s2x + s2l)) {
            return Math.abs(s1y - s2y) <= K;
        } else {
            return 
                (sq(s2x - s1x - s1l) + sq(s2y - s1y) <= sq(K)) ||
                (sq(s1x - s2x - s2l) + sq(s1y - s2y) <= sq(K));

        }
    }

    int rec(int idx) {
        if (memo[idx] != -1) { return memo[idx]; }

        int sum = stairs[idx].sw;
        int i;

        for (i = idx - 1; i > -1; i--) {
            if ((stairs[i].y == stairs[i + 1].y) && reachable(i, i + 1)) {
                sum += stairs[i].sw;
            } else {
                break;
            }
        }

        int st1 = i + 1;

        for (i = idx + 1; i < n; i++) {
            if ((stairs[i].y == stairs[i - 1].y) && reachable(i, i - 1)) {
                sum += stairs[i].sw;
            } else {
                break;
            }
        }

        int st2 = i - 1;

        memo[idx] = 0;

        for (int j = 0; j < n; j++) {
            if (j != idx && stairs[j].y >= stairs[idx].y && reachable(j, idx)) {
                if (stairs[j].y == stairs[idx].y) {
                    memo[idx] = Math.max(memo[idx], rec(j));
                } else {
                    memo[idx] = Math.max(memo[idx], rec(j) + sum);
                }
            }
        }

        for (i = st1; i <= st2; i++) {
            if (memo[i] == -1) { 
                rec(i);
            }
            memo[i] = Math.max(memo[i], memo[idx]);
        }

        memo[idx] = Math.max(memo[idx], sum);

        return memo[idx];
    }

    int sq(int x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Stair implements Comparable<Stair> {
        int x;
        int y;
        int len;
        int sw;

        public Stair(int x, int y, int len, int sw) {
            this.x   = x;
            this.y   = y;
            this.len = len;
            this.sw  = sw;
        }

        public int compareTo(Stair other) {
            if (y != other.y) {
                return Integer.valueOf(y).compareTo(other.y);
            } else {
                return Integer.valueOf(x).compareTo(other.x);
            }
        }
    }
}
