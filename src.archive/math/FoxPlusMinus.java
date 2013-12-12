package topc.math;

import java.util.*;
import java.io.*;

// SRM 552 Division II Level Three - 1000
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12147&rd=15174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+552
public class FoxPlusMinus {
    public int[] maximize(int[] first, int N) {
        int K = first.length;
        if (K % 2 != 0) {
            debug("CASE 1");
            long[] CC = new long[K];
            if ((N % (K + 1)) == K) {
                for (int i = 0; i < K; i++) {
                    CC[i] = (i % 2 == 0) ? 1 : -1;
                }
            } else {
                CC[N % (K + 1)] = 1;
            }

            return call(CC, first);
        } 

        if (N < K) {
            debug("CASE 2");
            long[] C = new long[K];
            C[N] = 1;
            return call(C, first);
        }

        if (N < 2 * K) {
            debug("CASE 3");
            long[] C = new long[K];
            for (int i = 1; i <= N - K + 1; i++) {
                C[i] = i;
            }
            for (int i = N - K + 1; i <= K - (N - K + 1); i++) {
                C[i] = N - K + 1;
            }

            if (N % 2 != 0) {
                for (int i = 0; i < K; i++) {
                    if (i % 2 == 0) {
                        C[i] = -C[i];
                    }
                }
            } else {
                for (int i = 0; i < K; i++) {
                    if (i % 2 != 0) {
                        C[i] = -C[i];
                    }
                }
            }

            return call(C, first);
        }

        debug("CASE 4");
        long[] CC = new long[K];
        for (int i = 0; i < K; i++) {
            CC[i] = i + 1;
        }
        if (N % 2 == 0) {
            for (int i = 0; i < K; i++) {
                if (i % 2 != 0) {
                    CC[i] = -CC[i];
                }
            }
        } else {
            for (int i = 0; i < K; i++) {
                if (i % 2 == 0) {
                    CC[i] = -CC[i];
                }
            }
        }

        return call(CC, first);
    }

    int[] call(long[] C, int[] first) {
        int K      = first.length;
        int[] used = new int[100];
        int[] res  = new int[K];

        Arrays.sort(first);

        for (int i = 0; i < K; i++) {
            int pos = -1;
            for (int j = 0; j < K; j++) {
                if (used[j] == 0 && (pos == -1 || C[j] < C[pos])) {
                    pos = j;
                }
            }
            res[pos]  = first[i];
            used[pos] = 1;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
