package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 460 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10768&rd=14146
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+460
public class TheQuestionsAndAnswersDivOne {
    int n;
    int Q;
    int[] A;
    int[][][] memo;

    public int find(int questions, String[] answers) {
        n = answers.length;
        A = new int[n];
        Q = questions;

        for (int i = 0; i < n; i++) {
            A[i] = answers[i] == "Yes" ? 1 : 0;
        }

        memo = new int[1 << Q][1 << Q][n];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return count(0, 0, 0);
    }

    private int count(int ans, int used, int index) {
        if (index == n) { return used == (1 << Q) - 1 ? 1 : 0; }
        if (memo[ans][used][index] > -1) { return memo[ans][used][index]; }

            int c = 0;
            for (int i = 0; i < Q; i++) {
                if (bit(used, i) == 1 && bit(ans, i) != A[index]) {
                    continue;
                }
                c += count(ans | (A[index] << i), used | (1 << i), index + 1);
            }

            memo[ans][used][index] = c;
            return c;
        }

        private int bit(int mask, int k) {
            return (mask >> k) & 1;
        }

        private void debug(Object... os) {
            System.out.println(Arrays.deepToString(os));
        }
    }
