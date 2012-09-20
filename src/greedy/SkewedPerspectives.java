package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 538 Division II Level Three - 1050
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11404&rd=14729
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+538
public class SkewedPerspectives {
    int[] cubes;
    int W;
    int B;

    public String[] areTheyPossible(int[] cubes, int B, int w, String[] views) {
        this.cubes = cubes;
        this.B = B;
        this.W = w;

        String[] res = new String[views.length];
        for (int i = 0; i < views.length; i++) {
            int n = views[i].length();
            int[] view = new int[n];

            for (int j = 0; j < n; j++) {
                view[j] = views[i].charAt(j) - '0';
            }

            res[i] = valid(view) ? "valid" : "invalid";
        }

        return res;
    }

    boolean valid(int[] view) {
        int[] c = cubes.clone();
        int[] w = new int[W];
        int[] h = new int[W];
        int b   = B;
        int n   = view.length;

        int j = 0;
        for (int i = 0; i < n; i++) {
            int block = view[i];
            if (block < 3) {
                if (c[block] > 0) {
                    c[block]--;
                    h[j]++;
                } else {
                    return false;
                }
            } else {
                if (b > 0) {
                    int blocklen = 0;
                    for (int k = i; k < n; k++) {
                        if (view[k] < 3) {
                            break;
                        } else {
                            blocklen++;
                        }
                    }

                    if (i == n - 1 || view[i + 1] != block) {
                        if (h[j] == 0) { return false; }
                        if (j == w.length - 1) { return false; }
                        b--;
                        j++;
                        w[j] = h[j - 1] - 1;
                        h[j] = h[j - 1] + 1;
                    } else if (h[j] > 0 && blocklen % 2 == 1) {
                        if (j == w.length - 1) { return false; }
                        b -= (blocklen + 1) / 2;
                        j++;
                        w[j] = h[j - 1] - 1;
                        h[j] = h[j - 1] + blocklen;
                        i += blocklen - 1;
                    } else {
                        b--;
                        h[j] += 2;
                        i++;
                    }
                } else {
                    return false;
                }
            }
        }

        if (b < 0) {
            return false;
        }

        for (int i = 0; i < w.length; i++) {
            while (w[i] > 1 && b > 0) {
                b--;
                w[i] -= 2;
            }
            for (int k = 0; k < 3; k++) {
                while (w[i] > 0 && c[k] > 0) {
                    w[i]--;
                    c[k]--;
                }
            }
        }

        for (int i = 0; i < w.length; i++) {
            if (w[i] > 0) {
                return false;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
