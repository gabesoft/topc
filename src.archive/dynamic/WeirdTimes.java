package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 465 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10429&rd=14182
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class WeirdTimes {
    int[] mins;
    int[] hours; 
    int[][] next;
    long[][] count;
    int[][] memo;
    int K;
    int N;
    int H = 24;

    public int[] hourValues(int[] minuteValues, int K) {
        this.mins  = minuteValues;
        this.N     = minuteValues.length;
        this.K     = K;
        this.hours = new int[N];

        this.next  = new int[H][N];
        this.count = new long[H][N];
        this.memo  = new int[H][N];

        initNext();
        initCount();
        assign(0, 0);

        return hours;
    }

    void assign(int v, int i) {
        if (i == N - 1) { 
            if (K > H) {
                hours = new int[] { -1 };
            } else {
                hours[i] = v + K - 1;
            }
            return;
        }

        for (int j = v; j < H; j++) {
            int n  = next[j][i];
            long c = n < H ? count[n][i + 1] : 0;

            if (K <= c) {
                hours[i] = j;
                assign(n, i + 1);
                return;
            } else {
                K = K - (int)c;
            }
        }

        hours = new int[] { -1 };
    }

    void initCount() {
        for (int h = 0; h < H; h++) {
            count[h][N - 1] = H - h;
        }

        for (int i = N - 2; i > -1; i--) {
            for (int h = 0; h < H; h++) {
                for (int v = h; v < H; v++) {
                    int n = next[v][i];
                    if (n < H) {
                        count[h][i] += count[n][i + 1];
                    }
                }
            }
        }
    }

    void initNext() {
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N - 1; i++) {
                next[h][i] = getNext(h, i);
            }
        }
    }

    int getNext(int h, int i) {
        return (mins[i] >= mins[i + 1]) ? h + 1 : h;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
