package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 572 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12386&rd=15492
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+572
public class NewArenaPassword {
    public int minChange(String oldPassword, int K) {
        int n = oldPassword.length(); 

        if (K == n) { return 0; }

        if (K < n / 2) {
            int count = 0;
            for (int i = 0; i < K; i++) {
                if (oldPassword.charAt(i) != oldPassword.charAt(n - K + i)) {
                    count++;
                }
            }
            return count;
        } else {
            int count = 0;
            int p = n - K;

            for (int i = 0; i < p; i++) {
                int chars[] = new int[26];
                int all = 0;
                for (int j = i; j < n; j += p) {
                    char c = oldPassword.charAt(j);
                    chars[(int)(c - 'a')]++;
                    all++;
                }

                Arrays.sort(chars);
                count += (all - chars[25]);
            }

            return count;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
