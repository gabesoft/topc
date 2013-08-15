package topc.easy;

import java.util.*;
import java.io.*;

// TCO13 Round 3B Division I Level One - 250
// brute force, sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12615&rd=15693
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class SimilarSequences {
    int MOD = 1000000009;

    public int count(int[] seq, int bound) {
        HashSet<String> set   = new HashSet<String>();
        HashSet<Integer> nums = new HashSet<Integer>();

        int n = seq.length;

        for (int i = 0; i < n; i++) {
            nums.add(seq[i]);
        }

        int t = nums.size();
        int total = 0;

        nums.add(-1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int x : nums) {
                    int seq2[] = seq.clone();

                    if (i < j) {
                        for (int k = i + 1; k < j + 1; k++) {
                            seq2[k - 1] = seq2[k];
                        }
                    }
                    else if (i > j) {
                        for (int k = i; k > j; k--) {
                            seq2[k] = seq2[k - 1];
                        }
                    }
                    seq2[j] = x;

                    String key = Arrays.toString(seq2);
                    if (!set.contains(key)) {
                        if (x == -1) {
                            total += bound - t;
                        } else {
                            total++;
                        }
                        total %= MOD;
                        set.add(key);
                    }
                }
            }
        }

        return total;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
