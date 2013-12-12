package topc.easy;

import java.util.*;
import java.io.*;

// SRM 221 Division I Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2970&rd=5867
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm221
public class NumberChanger {
    int INF = 1 << 30;
    int n;
    int F[];
    HashMap<String, Integer> map;

    public int transform(String start, String finish) {
        n       = start.length();
        map     = new HashMap<String, Integer>();
        F       = new int[n];
        int S[] = new int[n];

        for (int i = 0; i < n; i++) {
            F[i] = finish.charAt(i) - '0';
            S[i] = start.charAt(i) - '0';
        }

        return find(S);
    }

    private int find(int num[]) {
        String key = Arrays.toString(num);
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int best = 0;
        for (int i = 0; i < n; i++) {
            int v = num[i];

            if (num[i] != F[i]) {

                int a   = Math.abs(num[i] - F[i]);
                num[i]  = F[i];
                a      += find(num);
                num[i]  = v;

                best = a;

                for (int j = 0; j < n; j++) {
                    int u = num[j];

                    if (i != j) {
                        int d1 = Math.abs(num[i] - F[i]) + Math.abs(num[j] - F[j]);
                        int d2 = 1 + Math.abs(num[j] - F[i]) + Math.abs(num[i] - F[j]);

                        if (d2 < d1) {
                            int b = 1;
                            num[j] = num[i];
                            num[i] = u;

                            b += find(num);
                            num[j] = u;
                            num[i] = v;

                            best = Math.min(best, b);
                        }
                    }
                }
            }
        }

        map.put(key, best);
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
