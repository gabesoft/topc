package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 578 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12533&rd=15498
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+578
public class WolfInZooDivTwo {
    long MOD = 1000000007L;

    int N;
    int M;
    Interval I[];
    long memo[][];

    public int count(int N, String[] L, String[] R) {
        String left  = join(L);
        String right = join(R);

        String lparts[] = left.split("\\s+");
        String rparts[] = right.split("\\s+");

        this.N = N;
        this.M = lparts.length;
        this.I = new Interval[M];

        for (int i = 0; i < M; i++) {
            int l = Integer.parseInt(lparts[i]);
            int r = Integer.parseInt(rparts[i]);
            I[i] = new Interval(l, r);
        }

        Arrays.sort(I);

        memo = new long[N][M + 1];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return (int)count(0, 0);
    }

    private long count(int index, int interval) {
        if (index == N) { return interval == M ? 1 : 0; }
        if (memo[index][interval] > -1) { return memo[index][interval]; }

        int next = interval - 1;
        for (int i = interval; i < M; i++) {
            if (!I[i].satisfied(index)) { break; }
            next = i;
        }

        long a = count(index + 1, interval);
        long b = count(index + 1, next + 1);

        memo[index][interval] = (a + b) % MOD;
        return memo[index][interval];
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Interval implements Comparable<Interval> {
        public final int l;
        public final int r;

        public Interval(int l, int r) {
            this.l = l;
            this.r = r;
        }

        public int compareTo(Interval o) {
            return r == o.r ? l - o.l : r - o.r;
        }

        public boolean satisfied(int k) {
            return l <= k && k <= r;
        }

        public String toString() {
            return String.format("%s-%s", l, r);
        }
    }
}
